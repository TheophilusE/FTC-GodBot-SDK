package org.xii.sdk.foundation.common;

import java.lang.Exception;
import java.net.Inet4Address;

import kotlin.NotImplementedError;

final class VariantException extends Exception
{
  public VariantException(String message)
  {
    super(message);
  }
}

public final class Variant<Type>
{
  /*
   * Enum values that represent the type of variant data
   *
   * Note: Order is important through our use of Enum.ordinal()
   * */
  public enum VariantType
  {
    Invalid,

    Boolean,
    Byte,
    Character,
    Short,
    Integer,
    Long,
    Float,
    Double,

    String,

    EnumCount
  }

  private Type        m_Data;
  private VariantType m_Type;

  public Variant()
  {
    m_Data = null;
    m_Type = VariantType.Invalid;
  }

  public Variant(Boolean value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Boolean;
  }

  public Variant(Byte value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Byte;
  }

  public Variant(Character value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Character;
  }

  public Variant(Short value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Short;
  }

  public Variant(Integer value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Integer;
  }

  public Variant(Long value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Long;
  }

  public Variant(Float value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Float;
  }

  public Variant(Double value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.Double;
  }

  public Variant(String value)
  {
    m_Data = (Type) value;
    m_Type = VariantType.String;
  }

  public boolean isValid()
  {
    return m_Type != VariantType.Invalid;
  }

  public boolean canConvertTo(VariantType type)
  {
    if (m_Type == type)
    {
      return true;
    }

    if (!isValid())
    {
      return false;
    }

    if (IsNumber(type))
    {
      return m_Type.ordinal() > type.ordinal();
    }

    if (isString(type))
    {
      return true;
    }

    return false;
  }

  public Variant convertTo(VariantType type, Types.Result out_Result)
  {
    if (!canConvertTo(type))
    {
      if (out_Result != null)
      {
        out_Result.setResult(Types.ResultEnum.Failure);
      }
    }

    if (IsNumber(m_Type) && IsNumber(type))
    {
    }

    throw new NotImplementedError();
  }

  public void Clear()
  {
    m_Data = null;
    m_Type = VariantType.Invalid;
  }

  private static boolean IsNumber(VariantType type)
  {
    if (type == VariantType.Invalid)
    {
      return false;
    }

    switch (type)
    {
      case Boolean:
      case Byte:
      case Character:
      case Short:
      case Integer:
      case Long:
      case Float:
      case Double:
        return true;
    }

    return false;
  }

  private static boolean isString(VariantType type)
  {
    switch (type)
    {
      case Character:
      case String:
        return true;
    }

    return false;
  }
}
