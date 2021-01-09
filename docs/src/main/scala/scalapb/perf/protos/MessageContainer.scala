// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.perf.protos

/** @param rep
  *    [(scalapb.field).collection_type="List"];
  */
@SerialVersionUID(0L)
final case class MessageContainer(
    opt: _root_.scala.Option[scalapb.perf.protos.SimpleMessage] = _root_.scala.None,
    rep: _root_.scala.Seq[scalapb.perf.protos.SimpleMessage] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[MessageContainer] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (opt.isDefined) {
        val __value = opt.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      rep.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      opt.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      rep.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getOpt: scalapb.perf.protos.SimpleMessage = opt.getOrElse(scalapb.perf.protos.SimpleMessage.defaultInstance)
    def clearOpt: MessageContainer = copy(opt = _root_.scala.None)
    def withOpt(__v: scalapb.perf.protos.SimpleMessage): MessageContainer = copy(opt = Option(__v))
    def clearRep = copy(rep = _root_.scala.Seq.empty)
    def addRep(__vs: scalapb.perf.protos.SimpleMessage*): MessageContainer = addAllRep(__vs)
    def addAllRep(__vs: Iterable[scalapb.perf.protos.SimpleMessage]): MessageContainer = copy(rep = rep ++ __vs)
    def withRep(__v: _root_.scala.Seq[scalapb.perf.protos.SimpleMessage]): MessageContainer = copy(rep = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => opt.orNull
        case 2 => rep
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => opt.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(rep.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.perf.protos.MessageContainer
    // @@protoc_insertion_point(GeneratedMessage[scalapb.perf.MessageContainer])
}

object MessageContainer extends scalapb.GeneratedMessageCompanion[scalapb.perf.protos.MessageContainer] with scalapb.HasBuilder[scalapb.perf.protos.MessageContainer] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.perf.protos.MessageContainer] with scalapb.HasBuilder[scalapb.perf.protos.MessageContainer] = this
  def merge(`_message__`: scalapb.perf.protos.MessageContainer, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.perf.protos.MessageContainer = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.perf.protos.MessageContainer] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.perf.protos.MessageContainer(
        opt = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[scalapb.perf.protos.SimpleMessage]]),
        rep = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[scalapb.perf.protos.SimpleMessage]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ProtosProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ProtosProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = scalapb.perf.protos.SimpleMessage
      case 2 => __out = scalapb.perf.protos.SimpleMessage
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.perf.protos.MessageContainer(
    opt = _root_.scala.None,
    rep = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __opt: _root_.scala.Option[scalapb.perf.protos.SimpleMessage],
    private var __rep: _root_.scala.collection.mutable.Builder[scalapb.perf.protos.SimpleMessage, _root_.scala.Seq[scalapb.perf.protos.SimpleMessage]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.perf.protos.MessageContainer] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __opt = Option(__opt.fold(_root_.scalapb.LiteParser.readMessage[scalapb.perf.protos.SimpleMessage](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case 18 =>
            __rep += _root_.scalapb.LiteParser.readMessage[scalapb.perf.protos.SimpleMessage](_input__)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.perf.protos.MessageContainer = {
      scalapb.perf.protos.MessageContainer(
          opt = __opt,
          rep = __rep.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.perf.protos.MessageContainer, scalapb.perf.protos.MessageContainer.Builder] {
    def apply(): Builder = new Builder(
      __opt = _root_.scala.None,
      __rep = _root_.scala.collection.immutable.Vector.newBuilder[scalapb.perf.protos.SimpleMessage],
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.perf.protos.MessageContainer): Builder = new Builder(
      __opt = _message__.opt,
      __rep = _root_.scala.collection.immutable.Vector.newBuilder[scalapb.perf.protos.SimpleMessage] ++= _message__.rep,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.perf.protos.MessageContainer.Builder()
  def newBuilder(`_message__`: scalapb.perf.protos.MessageContainer): Builder = scalapb.perf.protos.MessageContainer.Builder(_message__)
  implicit class MessageContainerLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.MessageContainer]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.perf.protos.MessageContainer](_l) {
    def opt: _root_.scalapb.lenses.Lens[UpperPB, scalapb.perf.protos.SimpleMessage] = field(_.getOpt)((c_, f_) => c_.copy(opt = Option(f_)))
    def optionalOpt: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[scalapb.perf.protos.SimpleMessage]] = field(_.opt)((c_, f_) => c_.copy(opt = f_))
    def rep: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[scalapb.perf.protos.SimpleMessage]] = field(_.rep)((c_, f_) => c_.copy(rep = f_))
  }
  final val OPT_FIELD_NUMBER = 1
  final val REP_FIELD_NUMBER = 2
  def of(
    opt: _root_.scala.Option[scalapb.perf.protos.SimpleMessage],
    rep: _root_.scala.Seq[scalapb.perf.protos.SimpleMessage]
  ): _root_.scalapb.perf.protos.MessageContainer = _root_.scalapb.perf.protos.MessageContainer(
    opt,
    rep
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.perf.MessageContainer])
}
