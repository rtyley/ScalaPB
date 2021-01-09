// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.perf.protos

@SerialVersionUID(0L)
final case class SimpleMessage(
    i: _root_.scala.Int = 0,
    j: _root_.scala.Int = 0,
    k: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    color: scalapb.perf.protos.Color = scalapb.perf.protos.Color.UNKNOWN,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[SimpleMessage] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = i
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = j
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      
      {
        val __value = k
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(3, __value)
        }
      };
      
      {
        val __value = color.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = i
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = j
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = k
        if (!__v.isEmpty) {
          _output__.writeBytes(3, __v)
        }
      };
      {
        val __v = color.value
        if (__v != 0) {
          _output__.writeEnum(4, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withI(__v: _root_.scala.Int): SimpleMessage = copy(i = __v)
    def withJ(__v: _root_.scala.Int): SimpleMessage = copy(j = __v)
    def withK(__v: _root_.com.google.protobuf.ByteString): SimpleMessage = copy(k = __v)
    def withColor(__v: scalapb.perf.protos.Color): SimpleMessage = copy(color = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = i
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = j
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = k
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 4 => {
          val __t = color.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(i)
        case 2 => _root_.scalapb.descriptors.PInt(j)
        case 3 => _root_.scalapb.descriptors.PByteString(k)
        case 4 => _root_.scalapb.descriptors.PEnum(color.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.perf.protos.SimpleMessage
    // @@protoc_insertion_point(GeneratedMessage[scalapb.perf.SimpleMessage])
}

object SimpleMessage extends scalapb.GeneratedMessageCompanion[scalapb.perf.protos.SimpleMessage] with scalapb.HasBuilder[scalapb.perf.protos.SimpleMessage] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.perf.protos.SimpleMessage] with scalapb.HasBuilder[scalapb.perf.protos.SimpleMessage] = this
  def merge(`_message__`: scalapb.perf.protos.SimpleMessage, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.perf.protos.SimpleMessage = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.perf.protos.SimpleMessage] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.perf.protos.SimpleMessage(
        i = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        j = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        k = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        color = scalapb.perf.protos.Color.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(scalapb.perf.protos.Color.UNKNOWN.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ProtosProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ProtosProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4 => scalapb.perf.protos.Color
    }
  }
  lazy val defaultInstance = scalapb.perf.protos.SimpleMessage(
    i = 0,
    j = 0,
    k = _root_.com.google.protobuf.ByteString.EMPTY,
    color = scalapb.perf.protos.Color.UNKNOWN
  )
  final class Builder private (
    private var __i: _root_.scala.Int,
    private var __j: _root_.scala.Int,
    private var __k: _root_.com.google.protobuf.ByteString,
    private var __color: scalapb.perf.protos.Color,
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.perf.protos.SimpleMessage] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __i = _input__.readInt32()
          case 16 =>
            __j = _input__.readInt32()
          case 26 =>
            __k = _input__.readBytes()
          case 32 =>
            __color = scalapb.perf.protos.Color.fromValue(_input__.readEnum())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.perf.protos.SimpleMessage = {
      scalapb.perf.protos.SimpleMessage(
          i = __i,
          j = __j,
          k = __k,
          color = __color,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.perf.protos.SimpleMessage, scalapb.perf.protos.SimpleMessage.Builder] {
    def apply(): Builder = new Builder(
      __i = 0,
      __j = 0,
      __k = _root_.com.google.protobuf.ByteString.EMPTY,
      __color = scalapb.perf.protos.Color.UNKNOWN,
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.perf.protos.SimpleMessage): Builder = new Builder(
      __i = _message__.i,
      __j = _message__.j,
      __k = _message__.k,
      __color = _message__.color,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.perf.protos.SimpleMessage.Builder()
  def newBuilder(`_message__`: scalapb.perf.protos.SimpleMessage): Builder = scalapb.perf.protos.SimpleMessage.Builder(_message__)
  implicit class SimpleMessageLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.SimpleMessage]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.perf.protos.SimpleMessage](_l) {
    def i: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.i)((c_, f_) => c_.copy(i = f_))
    def j: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.j)((c_, f_) => c_.copy(j = f_))
    def k: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.k)((c_, f_) => c_.copy(k = f_))
    def color: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.Color] = field(_.color)((c_, f_) => c_.copy(color = f_))
  }
  final val I_FIELD_NUMBER = 1
  final val J_FIELD_NUMBER = 2
  final val K_FIELD_NUMBER = 3
  final val COLOR_FIELD_NUMBER = 4
  def of(
    i: _root_.scala.Int,
    j: _root_.scala.Int,
    k: _root_.com.google.protobuf.ByteString,
    color: scalapb.perf.protos.Color
  ): _root_.scalapb.perf.protos.SimpleMessage = _root_.scalapb.perf.protos.SimpleMessage(
    i,
    j,
    k,
    color
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.perf.SimpleMessage])
}
