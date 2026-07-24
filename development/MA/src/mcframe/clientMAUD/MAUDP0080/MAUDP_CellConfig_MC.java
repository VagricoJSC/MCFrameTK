package mcframe.clientMAUD.MAUDP0080;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientMAUC.MAUCP0110.MAUCP_UnitUtil;
import mcframe.clientCore.beans.text.MCDateFormat;
import mcframe.clientCore.beans.text.MCTimestampFormat;
import mcframe.clientCore.beans.text.MCNumberFormat;
import mcframe.clientCore.beans.text.MCNumberPattern;
import mcframe.clientMAUD.MAUDP0080.IfFormat;

import java.util.*;
import java.math.RoundingMode;
import mcframe.clientFXBA.FXBAP0080.FXBAP_CellConfig;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.resource.MCFormatConst.MCZeroType;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_CellConfig"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_CellConfig_MC extends MAUDP_CellConfig_MC_A implements IfPriorCellConfig {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_CellConfig_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**
	 * 金額に対応する小数部有効桁数を返す<br>
	 * 金額の小数部有効桁数に応じて入力桁数を調整する場合にオーバーライドする
	 *
	 * @param index 設定対象の行インデックス
	 * @param column 設定対象のカラムコンフィグ
	 * @return 小数部有効桁数
	 */
	protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
		return null;
	}
	/**
	 * 金額カラムかどうかを判断する<br>
	 * 小数部有効桁数の調整をする金額カラムの場合にオーバーライドでtrueを返す<br>
	 * 使用される小数部有効桁数は getAmtDecPlace で決定される桁数
	 *
	 * @see getAmtDecPlace
	 * @param column 設定対象のカラムコンフィグ
	 * @return scaleやlengthの調整をする金額カラムの場合にtrueを返す
	 */
	protected boolean isAmtColumn(MCColumnConfig column) {
		return false;
	}

	/**
	 * 単価に対応する小数部有効桁数を返す<br>
	 * 単価の小数部有効桁数に応じて入力桁数を調整する場合にオーバーライドする
	 *
	 * @param index 設定対象の行インデックス
	 * @param column 設定対象のカラムコンフィグ
	 * @return 小数部有効桁数
	 */
	protected MCNumber getUpriDecPlace(int index, MCColumnConfig column) {
		return null;
	}
	/**
	 * 単価カラムかどうかを判断する<br>
	 * 小数部有効桁数の調整をする単価カラムの場合にオーバーライドでtrueを返す<br>
	 * 使用される小数部有効桁数は getUpriDecPlace で決定される桁数
	 *
	 * @see getUpriDecPlace
	 * @param column 設定対象のカラムコンフィグ
	 * @return scaleやlengthの調整をする単価カラムの場合にtrueを返す
	 */
	protected boolean isUpriColumn(MCColumnConfig column) {
		return false;
	}

	/**
	 * 数量に対応する小数部有効桁数を返す<br>
	 * 数量の小数部有効桁数に応じて入力桁数を調整する場合にオーバーライドする
	 *
	 * @param index 設定対象の行インデックス
	 * @param column 設定対象のカラムコンフィグ
	 * @return 小数部有効桁数
	 */
	protected MCNumber getUnitDecPlace(int index, MCColumnConfig column) {
		return null;
	}
	/**
	 * 数量カラムかどうかを判断する<br>
	 * 小数部有効桁数の調整をする数量カラムの場合にオーバーライドでtrueを返す<br>
	 * 使用される小数部有効桁数は getUnitDecPlace で決定される桁数
	 *
	 * @see getUnitDecPlace
	 * @param column 設定対象のカラムコンフィグ
	 * @return scaleやlengthの調整をする数量カラムの場合にtrueを返す
	 */
	protected boolean isQtyColumn(MCColumnConfig column) {
		return false;
	}

	/**
	 * パーセントに対応する小数部有効桁数を返す<br>
	 * パーセントの小数部有効桁数に応じて入力桁数を調整する場合にオーバーライドする
	 *
	 * @param index 設定対象の行インデックス
	 * @param column 設定対象のカラムコンフィグ
	 * @return 小数部有効桁数
	 */
	protected MCNumber getPercentDecPlace(int index, MCColumnConfig column) {
		return null;
	}

	/**
	 * パーセント（PERCENT）の数値フォーマット
	 * @see #getPercentFormat()
	 */
	protected MCNumberFormat _percentFormat;

	/**
	 * パーセントに対応する数値フォーマットを返す<br>
	 * パーセントの数値フォーマットを調整する場合にオーバーライドする
	 *
	 * @return 数値フォーマット
	 */
	protected MCNumberFormat getPercentFormat() {

		if (_percentFormat == null) {
			MCNumberPattern ptn = MCNumberPattern.create("PERCENT_PADDING");
			_percentFormat = new MCNumberFormat();
			_percentFormat.setNumberPattern(ptn);
		}

		return _percentFormat;
	}

	/**
	 * パーセントカラムかどうかを判断する<br>
	 * 小数部有効桁数の調整をするパーセントカラムの場合にオーバーライドでtrueを返す<br>
	 * 使用される小数部有効桁数は getPercentDecPlace で決定される桁数
	 *
	 * @see getPercentDecPlace
	 * @param index 設定対象の行インデックス
	 * @param column 設定対象のカラムコンフィグ
	 * @return scaleやlengthの調整をするパーセントカラムの場合にtrueを返す
	 */
	@SuppressWarnings("rawtypes")
	protected boolean isPercentColumn(int index, MCColumnConfig column, MCTable table) {
		return isSame(getPriorFormatType(index, column, table), IfFormat.PERCENT);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected int getCustomScale(int index, MCColumnConfig column, MCTable table) {

		// パーセントカラム
		if (isPercentColumn(index, column, table)) {
			MCNumber decPlace = getPercentDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return (decPlace == null) ? -1 : decPlace.intValue();
		}

		// 金額カラムのスケールは通貨の金額小数部有効桁数で決定する
		if (isAmtColumn(column)) {
			MCNumber decPlace = getAmtDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return MAUCP_AmtUtil.nullToZero(decPlace);
		}
		// 単価カラムのスケールは通貨の単価小数部有効桁数で決定する
		if (isUpriColumn(column)) {
			MCNumber decPlace = getUpriDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return MAUCP_AmtUtil.nullToZero(decPlace);
		}
		// 数量カラムのスケールは単位の小数部有効桁数で決定する
		if (isQtyColumn(column)) {
			MCNumber decPlace = getUnitDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return MAUCP_UnitUtil.nullToZero(decPlace);
		}
		return super.getCustomScale(index, column, table);

	}

	@SuppressWarnings("rawtypes")
	@Override
	protected int getCustomLength(int index, MCColumnConfig column, MCTable table) {

		// パーセントカラム
		if (isPercentColumn(index, column, table)) {
			MCNumber decPlace = getPercentDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			mcframe.commonCore.meta.MCMeta meta = column.getMeta();
			return (decPlace == null) ? -1 : meta.length() - meta.scale() + decPlace.intValue();
		}

		// 金額カラムのスケールは通貨の金額小数部有効桁数で決定する
		if (isAmtColumn(column)) {
			MCNumber decPlace = getAmtDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return MAUCP_AmtUtil.getAmtLength(column.getMeta(), decPlace);
		}
		// 単価カラムのスケールは通貨の単価小数部有効桁数で決定する
		if (isUpriColumn(column)) {
			MCNumber decPlace = getUpriDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return MAUCP_AmtUtil.getAmtLength(column.getMeta(), decPlace);
		}
		// 数量カラムのスケールは単位の小数部有効桁数で決定する
		if (isQtyColumn(column)) {
			MCNumber decPlace = getUnitDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return MAUCP_UnitUtil.getLength(column.getMeta(), decPlace);
		}
		return super.getCustomLength(index, column, table);

	}

	@SuppressWarnings("rawtypes")
	protected MCNumber getDecPlaceByCellMode(int index, MCColumnConfig column, MCTable table, MCNumber decPlace) {
		if (decPlace == null
				&& column.getModeInfo(isCellEditable(index,column,table)).getStatus() != MCMode.ENABLE_STATUS) {
			return MCNumber.ZERO;
		}
		return decPlace;
	}

	/**
	 * 編集可能なモードかどうかを判断する
	 *
	 * @param column カラム
	 * @return 編集可能な場合にtrue
	 */
	protected boolean isEditableMode(MCColumnConfig column) {

		return isEditableMode(column, column.getMode());
	}

	/**
	 * 編集可能なモードかどうかを判断する
	 *
 	 * @param column カラム
	 * @param mode モード
	 * @return 編集可能な場合にtrue
	 */
	protected boolean isEditableMode(MCColumnConfig column, MCMode mode) {

		return column.getModeInfo(mode).getStatus() == MCMode.ENABLE_STATUS;
	}

	

	// 色設定関連（ここから）
	/**
	 * カラム毎の文字色の設定を保持するマップ
	 */
	protected Map<MCColumnConfig, Color> _fgColMap = new HashMap<MCColumnConfig, Color>();

	/**
	 * カラム毎の背景色の設定を保持するマップ
	 */
	protected Map<MCColumnConfig, Color> _bgColMap = new HashMap<MCColumnConfig, Color>();

	/**
	 * モード毎・カラム毎の文字色の設定を保持するマップ
	 */
	protected Map<MCColumnConfig, Map<MCMode, Color>> _fgColModeMap = new HashMap<MCColumnConfig, Map<MCMode, Color>>();

	/**
	 * モード毎・カラム毎の背景色の設定を保持するマップ
	 */
	protected Map<MCColumnConfig, Map<MCMode, Color>> _bgColModeMap = new HashMap<MCColumnConfig, Map<MCMode, Color>>();

	/**
	 * カラム毎（含むモード毎・カラム毎）の設定をしているかどうかのフラグ。
	 * （設定をしている場合 true）
	 */
	protected boolean _columnColorFlg = false;

	/**
	 * カラム毎の文字色及び背景色を設定する。
	 * <p>
	 * 文字色及び背景色にnullを設定するとデフォルトの色になる。
	 * </p>
	 * 
	 * @param column 対象のカラム
	 * @param fgColor 文字色
	 * @param bgColor 背景色
	 */
	public void putColumnColor(MCColumnConfig column, Color fgColor, Color bgColor) {
		putColumnBG(column, bgColor);
		putColumnFG(column, fgColor);
	}

	/**
	 * カラム毎の文字色及び背景色を設定する。
	 * <p>
	 * 文字色及び背景色にnullを設定するとデフォルトの色になる。
	 * </p>
	 * 
	 * @param columns 対象のカラムの配列
	 * @param fgColor 文字色
	 * @param bgColor 背景色
	 */
	public void putColumnColor(MCColumnConfig[] columns, Color fgColor, Color bgColor) {
		putColumnBG(columns, bgColor);
		putColumnFG(columns, fgColor);
	}

	/**
	 * カラム毎の背景色を設定する。
	 * <p>
	 * 背景色にnullを設定するとデフォルトの色になる。
	 * </p>
	 * 
	 * @param columns 対象のカラム
	 * @param bgColor 背景色
	 */
	public void putColumnBG(MCColumnConfig column, Color color) {
		putColorByColumn(_bgColMap, column, color);
		adjustColumnColorFlg();
	}

	/**
	 * カラム毎の背景色を設定する。
	 * <p>
	 * 背景色にnullを設定するとデフォルトの色になる。
	 * </p>
	 * 
	 * @param columns 対象のカラムの配列
	 * @param bgColor 背景色
	 */
	public void putColumnBG(MCColumnConfig[] columns, Color color) {
		for (MCColumnConfig column : columns) {
			putColorByColumn(_bgColMap, column, color);
		}
		adjustColumnColorFlg();
	}

	/**
	 * カラム毎の文字色を設定する。
	 * <p>
	 * 文字色にnullを設定するとデフォルトの色になる。
	 * </p>
	 * 
	 * @param columns 対象のカラム
	 * @param fgColor 文字色
	 */
	public void putColumnFG(MCColumnConfig column, Color color) {
		putColorByColumn(_fgColMap, column, color);
		adjustColumnColorFlg();
	}

	/**
	 * カラム毎の文字色を設定する。
	 * <p>
	 * 文字色にnullを設定するとデフォルトの色になる。
	 * </p>
	 * 
	 * @param columns 対象のカラムの配列
	 * @param fgColor 文字色
	 */
	public void putColumnFG(MCColumnConfig[] columns, Color color) {
		for (MCColumnConfig column : columns) {
			putColorByColumn(_fgColMap, column, color);
		}
		adjustColumnColorFlg();
	}

	/**
	 * カラムと色のマッピングを保存する。
	 * 色がnullの場合はマップからキーであるカラムを除去する
	 * 
	 * @param map 保存対象のマップ
	 * @param column カラム
	 * @param color 色
	 */
	protected void putColorByColumn(Map<MCColumnConfig, Color> map,
			MCColumnConfig column, Color color) {
		if (color == null) {
			map.remove(column);
		}
		else {
			map.put(column, color);
		}
		adjustColumnColorFlg();
	}

	/**
	 * カラムとモードをキーに背景色を保存する。
	 * 色がnullの場合はマップからキーであるカラムを除去する
	 * 
	 * @param columns カラムの配列
	 * @param mode モード
	 * @param color 背景色
	 */
	public void putColumnBG(MCColumnConfig[] columns, MCMode mode, Color color) {
		for (MCColumnConfig column : columns) {
			putColumnBG(column, mode, color);
		}
	}

	/**
	 * カラムとモードをキーに背景色を保存する。
	 * 色がnullの場合はマップからキーであるカラムを除去する
	 * 
	 * @param columns カラム
	 * @param mode モード
	 * @param color 背景色
	 */
	public void putColumnBG(MCColumnConfig column, MCMode mode, Color color) {
		putColorByModeColumn(_bgColModeMap, column, mode, color);
	}
	
	/**
	 * カラムとモードをキーに文字色を保存する。
	 * 色がnullの場合はマップからキーであるカラムを除去する
	 * 
	 * @param columns カラムの配列
	 * @param mode モード
	 * @param color 文字色
	 */
	public void putColumnFG(MCColumnConfig[] columns, MCMode mode, Color color) {
		for (MCColumnConfig column : columns) {
			putColumnFG(column, mode, color);
		}
	}

	/**
	 * カラムとモードをキーに文字色を保存する。
	 * 色がnullの場合はマップからキーであるカラムを除去する
	 * 
	 * @param columns カラム
	 * @param mode モード
	 * @param color 文字色
	 */
	public void putColumnFG(MCColumnConfig column, MCMode mode, Color color) {
		putColorByModeColumn(_fgColModeMap, column, mode, color);
	}
	
	/**
	 * カラムとモードをキーに色を保存する。
	 * 色がnullの場合はマップからキーであるカラムを除去する
	 * 
	 * @param columns カラム
	 * @param mode モード
	 * @param color 色
	 */
	protected void putColorByModeColumn(Map<MCColumnConfig, Map<MCMode, Color>> map,
			MCColumnConfig column, MCMode mode, Color color) {
		Map<MCMode, Color> innerMap = map.get(column);
		if (innerMap == null) {
			if (color == null) {
				return;
			}
			innerMap = new HashMap<MCMode, Color>();
			map.put(column, innerMap);
		}
		if (color == null) {
			innerMap.remove(mode);
			if (innerMap.size() == 0) {
				map.remove(column);
			}
		}
		else {
			innerMap.put(mode, color);
		}
		adjustColumnColorFlg();
	}

	/**
	 * カラム毎（含むモード毎・カラム毎）の設定をしているかどうかのフラグを
	 * 調整する（設定をしている場合 true）。
	 */
	protected void adjustColumnColorFlg() {
		_columnColorFlg = false;
		if (_fgColMap.size() > 0) {
			_columnColorFlg = true;
		}
		else if (_bgColMap.size() > 0) {
			_columnColorFlg = true;
		}
		else if (_fgColModeMap.size() > 0) {
			_columnColorFlg = true;
		}
		else if (_bgColModeMap.size() > 0) {
			_columnColorFlg = true;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Color getPriorFG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
		if (_columnColorFlg) {
			Color c = getPriorColumnColor(_fgColModeMap, _fgColMap, index, column, table,
					mode);
			if (c != null) {
				return c;
			}
		}
		return super.getPriorFG(index, column, table, mode);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
		if (_columnColorFlg) {
			Color c = getPriorColumnColor(_bgColModeMap, _bgColMap, index, column, table,
					mode);
			if (c != null) {
				return c;
			}
		}
		return super.getPriorBG(index, column, table, mode);
	}

	/**
	 * 
	 * @param colModeMap カラムとモードがキーの色情報を保持するマップ
	 * @param colMap カラムがキーの色情報を保持するマップ
	 * @param index 色設定対象の行インデックス
	 * @param column 色設定対象のカラム
	 * @param table 色設定対象のテーブル
	 * @param mode 色設定時のモード
	 * @return 設定する色
	 */
	@SuppressWarnings("rawtypes")
	protected Color getPriorColumnColor(
			Map<MCColumnConfig, Map<MCMode, Color>> colModeMap,
			Map<MCColumnConfig, Color> colMap, int index, MCColumnConfig column,
			MCTable table, MCMode mode) {
		Map<MCMode, Color> mp = colModeMap.get(column);
		if (mp != null) {
			Color c = mp.get(mode);
			if (c != null) {
				return c;
			}
		}
		return colMap.get(column);
	}
	// 色設定関連（ここまで）
	// 表示桁関連（ここから）
	/**
	 * 数値を表示するときの精度の種類を返します。
	 * 特定の数値セルに対して、優先的に設定したい精度の種類を返します。<p>
	 * デフォルトの精度の種類を採用する場合は、super を返す実装をすること。
	 *
	 * @param index 行のインデックス値
	 * @param column テーブルカラム
	 * @param table テーブル
	 * @return 精度の種類（IfViewScale.AMT IfViewScale.UNIT IfViewScale.STD IfViewScale.RATE IfViewScale.INPUT null のいづれか）
	 */
	protected String getPriorViewScaleType(int index, MCColumnConfig column,
			MCTable<?> tbl) {
		return getPriorViewScaleType(column, tbl);
	}

	/**
	 * 数値を表示するときの精度の種類を返します。
	 * 特定の数値カラムに対して、優先的に設定したい精度の種類を返します。<p>
	 * デフォルトの精度の種類を採用する場合は、super を返す実装をすること。
	 *
	 * @param column テーブルカラム
	 * @param table テーブル
	 * @return 精度の種類（IfViewScale.AMT IfViewScale.UNIT IfViewScale.STD IfViewScale.RATE IfViewScale.INPUT null のいづれか）
	 */
	protected String getPriorViewScaleType(MCColumnConfig column, MCTable<?> tbl) {
		if (_columnViewScaleTyp == null) {
			_columnViewScaleTyp = new HashMap<MCColumnConfig, String>();
			MCTable<?> baseTable = column.getBaseTable();
			MCConstRow proto = baseTable.getList().createRow();
			for (MCColumnConfig c : baseTable.getColumnConfigs()) {
				String cp = c.getBaseRowColumnName();
				if(cp == null ){
					continue;
				}
				String extVal = getExt(proto, IfViewScale.EXT_KEY, cp);
				_columnViewScaleTyp.put(c, extVal);
			}
		}
		return _columnViewScaleTyp.get(column);
	}

	/**
	 * 数値を表示するときの精度の種類を返します。
	 * 特定の数値セルに対して、優先的に設定したい精度の種類を返します。<p>
	 * デフォルトの精度の種類を採用する場合は、super を返す実装をすること。
	 *
	 * @param index 行のインデックス値
	 * @param column テーブルカラム
	 * @param table テーブル
	 * @return 精度の種類（IfFormat.PERCENT null のいづれか）
	 */
	protected String getPriorFormatType(int index, MCColumnConfig column,
			MCTable<?> tbl) {
		return getPriorFormatType(column, tbl);
	}

	/**
	 * 数値を表示するときの精度の種類を返します。
	 * 特定の数値カラムに対して、優先的に設定したい精度の種類を返します。<p>
	 * デフォルトの精度の種類を採用する場合は、super を返す実装をすること。
	 *
	 * @param column テーブルカラム
	 * @param table テーブル
	 * @return 精度の種類（IfFormat.PERCENT null のいづれか）
	 */
	protected String getPriorFormatType(MCColumnConfig column, MCTable<?> tbl) {
		if (_columnFormatTyp == null) {
			_columnFormatTyp = new HashMap<MCColumnConfig, String>();
			MCTable<?> baseTable = column.getBaseTable();
			MCConstRow proto = baseTable.getList().createRow();
			for (MCColumnConfig c : baseTable.getColumnConfigs()) {
				String cp = c.getBaseRowColumnName();
				if (cp == null) {
					continue;
				}
				String extVal = getExt(proto, IfFormat.EXT_KEY, cp);
				_columnFormatTyp.put(c, extVal);
			}
		}
		return _columnFormatTyp.get(column);
	}

	/**
	 * カラムに対する表示桁数。
	 * <p>
	 * Map の value は、IfViewScale.AMT IfViewScale.UNIT IfViewScale.STD IfViewScale.RATE IfViewScale.INPUT
	 * のいづれか（またはnull）を想定。
	 * </p>
	 */
	protected Map<MCColumnConfig, String> _columnViewScaleTyp = null;

	/**
	 * カラムに対する表示桁数。
	 * <p>
	 * Map の value は、IfFormat.PERCENT
	 * のいづれか（またはnull）を想定。
	 * </p>
	 */
	protected Map<MCColumnConfig, String> _columnFormatTyp = null;

	/**
	 * Rowに定義されている属性情報を取得します。
	 * <p>
	 * 対象のカラムが InnerRow の場合で、取得対象の
	 * Rowに属性が定義されていない、あるいは属性値が
	 * 定義されていない場合は、そのInnerRowに対して、
	 * 再帰的に属性値取得処理を行います。
	 * </p>
	 * 
	 * @param row 属性情報を取得対象のRow
	 * @param extKey 属性のキー値
	 * @param columnPath 属性情報を所得するカラム
	 * @return 属性値
	 */
	protected String getExt(MCRow row, String extKey, String columnPath) {
		String[] splited = MCRow.splitColumnPath(columnPath);
		MCRow tar = row;
		for (int i = 0; i < splited.length; i++) {
			MCConstRow constTar = null;
			if (tar instanceof MCConstRow) {
				constTar = (MCConstRow) tar;
				Map<String, String> m = constTar.getExtMap(extKey);
				if (m != null) {
					String[] cPath = MCCollectionUtil.subArray(splited, i,
							splited.length, String.class);
					String ret = m.get(MCRow.createColumnPath(cPath));
					if (ret != null) {
						return ret;
					}
				}
			}
			if (i < splited.length - 1) {
				String[] rPath = MCCollectionUtil.subArray(splited, 0, i + 1,
						String.class);
				tar = row.getInnerRow(MCRow.createColumnPath(rPath));
			}
		}
		return null;
	}	
	
	@SuppressWarnings("deprecation")
	@Override
	public int getPriorViewScale(int index, MCColumnConfig column, MCTable<?> table) {

		if (isPercentColumn(index, column, table)) {
			MCNumber decPlace = getPercentDecPlace(index, column);
			decPlace = getDecPlaceByCellMode(index, column, table, decPlace);
			return (decPlace == null) ? -1 : decPlace.intValue();
		}

		String type = getPriorViewScaleType(index , column, table);
		if(type == null ){
			return super.getPriorViewScale(index, column, table);
		}
		else if(isSame(type,IfViewScale.AMT)){
			return -1;
		}
		else if(isSame(type,IfViewScale.STD)){
			return -1;
		}
		else if(isSame(type,IfViewScale.UNIT)){
			return -1;
		}
		else if(isSame(type,IfViewScale.RATE)){
			return -1;
		}
		else if(isSame(type,IfViewScale.INPUT)){
			MCCellConfig colCellConfig = column.getCellConfig();
			if(colCellConfig instanceof FXBAP_CellConfig){
				FXBAP_CellConfig xppCellConfig = (FXBAP_CellConfig)colCellConfig;
				return xppCellConfig.getCellScale(index, column, table);
			}
			return getCellScale(index, column, table);
		}
		return super.getPriorViewScale(index, column, table);
	}

	@Override
	public RoundingMode getPriorViewRoundingMode(int index, MCColumnConfig column,
			MCTable<?> table) {

		if (isPercentColumn(index, column, table)) {
			return MAC_RND_TYP.RNDOFF.toMC();
		}

		String type = getPriorViewScaleType(index, column, table);
		if (type == null) {
			return super.getPriorViewRoundingMode(index, column, table);
		}
		else if (isSame(type, IfViewScale.AMT)) {
			return MAC_RND_TYP.RNDOFF.toMC();
		}
		else if (isSame(type, IfViewScale.STD)) {
			return MAC_RND_TYP.RNDOFF.toMC();
		}
		else if (isSame(type, IfViewScale.UNIT)) {
			return MAC_RND_TYP.RNDOFF.toMC();
		}
		else if (isSame(type, IfViewScale.RATE)) {
			return MAC_RND_TYP.RNDOFF.toMC();
		}
		else if(isSame(type,IfViewScale.INPUT)){
			return MAC_RND_TYP.RNDOFF.toMC();
		}
		return super.getPriorViewRoundingMode(index, column, table);
	}

	@Override
	public MCZeroType getPriorViewZeroType(int index, MCColumnConfig column,
			MCTable<?> table) {

		if (isPercentColumn(index, column, table)) {
			return getPercentFormat().getNumberPattern().getZeroType();
		}

		String type = getPriorViewScaleType(index, column, table);
		if (type == null) {
			return super.getPriorViewZeroType(index, column, table);
		}
		else if (isSame(type, IfViewScale.AMT)) {
			return MCZeroType.PADDING;
		}
		else if (isSame(type, IfViewScale.STD)) {
			return MCZeroType.PADDING;
		}
		else if (isSame(type, IfViewScale.UNIT)) {
			return MCZeroType.PADDING;
		}
		else if (isSame(type, IfViewScale.RATE)) {
			return MCZeroType.PADDING;
		}
		else if(isSame(type,IfViewScale.INPUT)){
			return MCZeroType.PADDING;
		}
		return super.getPriorViewZeroType(index, column, table);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MCNumberFormat getPriorNumberFormat(int index, MCColumnConfig column,
			MCTable table, MCMode mode) {

		if (isPercentColumn(index, column, table)) {
			return getPercentFormat();
		}

		return super.getPriorNumberFormat(index, column, table, mode);
	}

	// 表示桁関連（ここまで）

}