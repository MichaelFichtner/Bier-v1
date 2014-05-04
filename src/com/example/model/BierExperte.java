package com.example.model;

import java.util.*;

public class BierExperte
{
	public List getMarken(String farbe)
	{
		List marken = new ArrayList();
		if (farbe.equals("goldgelb"))
		{
			marken.add("GOLDIG");
			marken.add("Gelb");
		}
		else
		{
			marken.add("Alles");
			marken.add("andere ...");
		}
		return(marken);
	}
}
