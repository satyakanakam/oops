package inheritance;

public abstract class DesertItem {
	protected String name;

	public DesertItem()
	{
	name = "";
	}

	public DesertItem(String name1)
	{
	name = name1;
	}

	public String getName()
	{
	return name;
	}

	public void setName(String name1)
	{
	name = name1;
	}

	public abstract double getCost();
	}



