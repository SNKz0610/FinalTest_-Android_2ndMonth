package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.snkz.secondmonth_test.DataBinderMapperImpl());
  }
}
