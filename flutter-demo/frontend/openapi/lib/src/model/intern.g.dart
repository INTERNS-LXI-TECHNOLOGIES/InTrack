// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'intern.dart';

// **************************************************************************
// BuiltValueGenerator
// **************************************************************************

class _$Intern extends Intern {
  @override
  final int? id;
  @override
  final String? name;
  @override
  final int? age;

  factory _$Intern([void Function(InternBuilder)? updates]) =>
      (new InternBuilder()..update(updates))._build();

  _$Intern._({this.id, this.name, this.age}) : super._();

  @override
  Intern rebuild(void Function(InternBuilder) updates) =>
      (toBuilder()..update(updates)).build();

  @override
  InternBuilder toBuilder() => new InternBuilder()..replace(this);

  @override
  bool operator ==(Object other) {
    if (identical(other, this)) return true;
    return other is Intern &&
        id == other.id &&
        name == other.name &&
        age == other.age;
  }

  @override
  int get hashCode {
    var _$hash = 0;
    _$hash = $jc(_$hash, id.hashCode);
    _$hash = $jc(_$hash, name.hashCode);
    _$hash = $jc(_$hash, age.hashCode);
    _$hash = $jf(_$hash);
    return _$hash;
  }

  @override
  String toString() {
    return (newBuiltValueToStringHelper(r'Intern')
          ..add('id', id)
          ..add('name', name)
          ..add('age', age))
        .toString();
  }
}

class InternBuilder implements Builder<Intern, InternBuilder> {
  _$Intern? _$v;

  int? _id;
  int? get id => _$this._id;
  set id(int? id) => _$this._id = id;

  String? _name;
  String? get name => _$this._name;
  set name(String? name) => _$this._name = name;

  int? _age;
  int? get age => _$this._age;
  set age(int? age) => _$this._age = age;

  InternBuilder() {
    Intern._defaults(this);
  }

  InternBuilder get _$this {
    final $v = _$v;
    if ($v != null) {
      _id = $v.id;
      _name = $v.name;
      _age = $v.age;
      _$v = null;
    }
    return this;
  }

  @override
  void replace(Intern other) {
    ArgumentError.checkNotNull(other, 'other');
    _$v = other as _$Intern;
  }

  @override
  void update(void Function(InternBuilder)? updates) {
    if (updates != null) updates(this);
  }

  @override
  Intern build() => _build();

  _$Intern _build() {
    final _$result = _$v ?? new _$Intern._(id: id, name: name, age: age);
    replace(_$result);
    return _$result;
  }
}

// ignore_for_file: deprecated_member_use_from_same_package,type=lint
