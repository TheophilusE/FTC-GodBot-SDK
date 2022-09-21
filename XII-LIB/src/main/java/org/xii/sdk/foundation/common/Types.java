package org.xii.sdk.foundation.common;

import android.renderscript.Sampler;

import java.lang.Exception;
import java.lang.reflect.ParameterizedType;
import java.util.LinkedList;
import java.util.List;

import kotlin.NotImplementedError;

public final class Types
{
  /* Override Default Construct */
  private Types()
  {
  }

  /*
   * Enum values for success and failure. To be used by functions as return values
   * Instead of boolean.
   */
  enum ResultEnum
  {
    Success,
    Failure
  }

  final class ResultException extends Exception
  {
    public ResultException(String message)
    {
      super(message);
    }
  }

  /*
   * Class capture for returning failure or success, instead of using a boolean.
   */
  final class Result
  {
    private ResultEnum m_Result;

    private Result()
    {
      this.m_Result = ResultEnum.Failure;
    }

    public Result(ResultEnum result)
    {
      this.m_Result = result;
    }

    public void setResult(ResultEnum result)
    {
      this.m_Result = result;
    }

    public boolean isEqual(ResultEnum result)
    {
      return m_Result == result;
    }

    public boolean succeeded()
    {
      return m_Result == ResultEnum.Success;
    }

    public boolean failed()
    {
      return m_Result == ResultEnum.Failure;
    }

    /*
     * Asserts that the function succeeded. In case of failure, the program will throw an exception.
     */
    public void assertSuccess(String message) throws ResultException
    {
      if (failed())
      {
        throw new ResultException(message);
      }
    }
  }

  public static <Type, ValueType> Type CastTo(Class<Type> type, ValueType valueType)
  {
    throw new NotImplementedError("The function CastTo is not yet implemented.");
  }
}
