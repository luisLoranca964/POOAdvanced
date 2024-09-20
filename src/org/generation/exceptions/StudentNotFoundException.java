package org.generation.exceptions;

public class StudentNotFoundException
extends Exception
{

public StudentNotFoundException( )
{
    super( "Student not found!" );
}
}