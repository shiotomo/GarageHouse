package work.tomosse.garage_house.util;

import org.springframework.stereotype.Component;

import work.tomosse.garage_house.enums.ColumnType;

@Component
public class ColumnTypeUtils {

    /**
     * データが型と一致しているか判定する
     *
     * @param columnType
     * @param value
     */
    public void columnTypeValidation(final String columnType, final Object value) {
        if (columnType == ColumnType.INTEGER.getType()) {
            integerColumnValidation(value);
        } else if (columnType == ColumnType.STRING.getType()) {
            stringColumnValidation(value);
        } else if (columnType == ColumnType.BOOLEAN.getType()) {
            booleanColumnValidation(value);
        } else if (columnType == ColumnType.DATE.getType()) {
            dateColumnValidation(value);
        } else if (columnType == ColumnType.DOUBLE.getType()) {
            doubleColumnValidation(value);
        }
    }

    /**
     * Integer型かどうか判定する 違う場合 400エラー
     *
     * @param value
     */
    private void integerColumnValidation(final Object value) {
    }

    /**
     * String型かどうか判定する 違う場合 400エラー
     *
     * @param value
     */
    private void stringColumnValidation(final Object value) {
    }

    /**
     * Boolean型かどうか判定する 違う場合 400エラー
     *
     * @param value
     */
    private void booleanColumnValidation(final Object value) {
    }

    /**
     * Date型かどうか判定する 違う場合 400エラー
     *
     * @param value
     */
    private void dateColumnValidation(final Object value) {
    }

    /**
     * Double型かどうか判定する 違う場合 400エラー
     *
     * @param value
     */
    private void doubleColumnValidation(final Object value) {
    }
}
