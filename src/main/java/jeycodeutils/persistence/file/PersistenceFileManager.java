package jeycodeutils.persistence.file;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jeycodeutils.exceptions.FilePersistenceException;

public final class PersistenceFileManager
{

						private static PersistenceFileManager instance;
						private static String filePath;

						private PersistenceFileManager()
						{}

						public static PersistenceFileManager getInstance()
						{
												instance = Objects.isNull(instance) ? new PersistenceFileManager() : instance;
												return instance;
						}

						public PersistenceFileManager file(String fPath)
						{
												filePath = fPath;
												return this;
						}

						public <T> void save(T object)
						{
												try (final var obj = (ObjectOutputStream)TypeOfObjectStream.OUTPUT.objectStream())
												{
																		try
																		{
																								obj.writeObject(object);
																		}
																		catch (IOException ex)
																		{

																								ex.printStackTrace();
																		}
												}
												catch (final IOException ex)
												{
																		throw new FilePersistenceException(FilePersistenceException.W_ERROR);
												}
						}

						public void saveThisByOverwriting(final List<?> list)
						{
												try (final var obj = new ObjectOutputStream(new FileOutputStream(filePath)))
												{
																		list.forEach(element->
																								{
																														try
																														{
																																				obj.writeObject(element);
																														}
																														catch (IOException ex)
																														{

																																				ex.printStackTrace();
																														}
																								});
												}
												catch (final IOException ex)
												{
																		throw new FilePersistenceException(FilePersistenceException.W_ERROR);
												}
						}

						public void saveThis(final List<?> list)
						{
												try (final var obj = (ObjectOutputStream)TypeOfObjectStream.OUTPUT.objectStream())
												{
																		list.forEach(element->
																								{
																														try
																														{
																																				obj.writeObject(element);
																														}
																														catch (IOException ex)
																														{

																																				ex.printStackTrace();
																														}
																								});
												}
												catch (final IOException ex)
												{
																		throw new FilePersistenceException(FilePersistenceException.W_ERROR);
												}
						}

						@SuppressWarnings("unchecked")
						public <T> List<T> loadData()
						{
												final var list = new ArrayList<T>();
												try (final var read = (ObjectInputStream)TypeOfObjectStream.INPUT.objectStream())
												{

																		while (true)
																		{
																								var readed = (T)read.readObject();
																								list.add(readed);
																		}

												}
												catch (IOException | ClassNotFoundException ex)
												{}
												return list;
						}

						private enum TypeOfObjectStream
						{

							INPUT
							{

													@Override
													public ObjectInputStream objectStream() throws FileNotFoundException,IOException
													{
																			return new ObjectInputStream(new FileInputStream(filePath));
													}
							},
							OUTPUT
							{

													@Override
													public ObjectOutputStream objectStream() throws FileNotFoundException,IOException
													{
																			return objectOutputStream();
													}
							};

												public abstract Closeable objectStream() throws FileNotFoundException,IOException;

												private static ObjectOutputStream objectOutputStream() throws FileNotFoundException,IOException
												{//@formatter:off
																		return new File(filePath).exists()?
														new AppendableObjectOutputStream(new FileOutputStream(filePath,true))
												: new ObjectOutputStream(new FileOutputStream(filePath));
												}//@formatter:on

						}

						private static class AppendableObjectOutputStream extends ObjectOutputStream
						{

												protected AppendableObjectOutputStream(OutputStream out) throws IOException
												{
																		super(out);
												}

												@Override
												protected void writeStreamHeader() throws IOException
												{}

						}

}
