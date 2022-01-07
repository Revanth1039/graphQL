package com.example.demo.config;
import graphql.schema.GraphQLScalarType;

import java.util.Date;

import org.jetbrains.annotations.NotNull;

import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;

public class GraphQLDate extends GraphQLScalarType{

	public GraphQLDate() {
		super("Date","date class",new Coercing<Date,String>(){
			@Override
			public String serialize(@NotNull Object dataFetcherResult) throws CoercingSerializeException{
				return null;
			}
			@Override
			public Date parseValue(@NotNull Object input)  throws CoercingParseValueException{
				return null;
			}
			@Override
			public Date  parseLiteral(@NotNull Object input) throws CoercingParseLiteralException{
				return null;
			}
			
			
		});
	}
	
  

}
