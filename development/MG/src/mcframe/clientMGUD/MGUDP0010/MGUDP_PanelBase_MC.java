package mcframe.clientMGUD.MGUDP0010;

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
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.math.RoundingMode;
import mcframe.clientMAUD.MAUDP0080.IfViewScale;
import mcframe.commonCore.resource.MCFormatConst.MCZeroType;
import mcframe.commonCore.util.MCCollectionUtil;
import static mcframe.commonFX.notice.FX_Msg.*;
import java.io.File;
import mcframe.clientCore.container.io.MCExcelReader;
import mcframe.clientCore.container.io.MCContainerIOConfig;
import mcframe.clientCore.container.io.MCCsvReader;
import mcframe.commonCore.container.io.MCContainerIOConfig.Delimiter;
import mcframe.commonCore.container.io.MCContainerIOConfig.Encode;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGUDP_PanelBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGUDP_PanelBase_MC extends MGUDP_PanelBase_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGUDP_PanelBase_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	@Override
	protected MGUDP_CellConfig createDefaultAppCellConfig() {
		return new MGUDP_CellConfig();
	}

	// ///////////////////////////////////////////////
	// データキャッシュ（ここから）
	// ///////////////////////////////////////////////

	/** 原価費目情報の格納用フィールド */
	protected MCList<ExpnsR> _expnsList;

	protected MCList<ExpnsR> getExpns() {
		if (isNull(_expnsList)) {
			_expnsList = getExpnsNoCache();
		}
		return _expnsList;
	}

	// ///////////////////////////////////////////////
	// データキャッシュ（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 見出し項目の表示桁（ここから）
	// ///////////////////////////////////////////////

	@Override
	protected void beansAttrInit() {
		super.beansAttrInit();
		setNumberFieldViewScale();
	}

	/**
	 * 数値フィールドに表示桁を設定します。
	 * <p>
	 * デフォルトでは、実装仕様書のコンテナの属性定義で属性 VIEW_SCALE
	 * に AMT UNIT STD INPUT のいずれかを設定した場合、それに応じた
	 * 表示桁を設定します。
	 * </p>
	 */
	protected void setNumberFieldViewScale() {
		MCNumberField[] nfs = MCBeansUtil.getAllComponents(MCNumberField.class, this);
		for (MCNumberField nf : nfs) {
			String vst = getViewScaleType(nf);
			RoundingMode rm = MAC_RND_TYP.RNDOFF.toMC();
			MCZeroType zt = MCZeroType.PADDING;
			int scale = -1;

			if (vst == null) {
				continue;
			}
			else if (isSame(IfViewScale.AMT, vst)) {
				scale = getCostAmtDispDigit((MGUDP_PanelBase)this);
			}
			else if (isSame(IfViewScale.UNIT, vst)) {
				scale = getCostUnitDispDigit((MGUDP_PanelBase)this);
			}
			else if (isSame(IfViewScale.STD, vst)) {
				scale = getCostStdDispDigit((MGUDP_PanelBase)this);
			}
			else if (isSame(IfViewScale.INPUT, vst)) {
				scale = nf.getScale();
			}

			nf.setViewRoundingMode(rm);
			nf.setViewZeroType(zt);
			nf.setViewScale(scale);
		}
	}

	/**
	 * 数値フィールドに設定すべき表示桁の種類を返します。
	 * 
	 * <P>
	 * セルコンフィグとは異なり、画面起動時に表示桁を設定するだけで、
	 * 動的な変更には対応していない。<br>
	 * 動的な変更を行う場合は、
	 * IfViewScale.INPUT とした場合も同様に起動時の値が
	 * セットされるだけで {@link MCNumberField#setScale(int)}した場合は
	 * {@link MCNumberField#setViewScale(int)}する必要がある。
	 * 
	 * @param nf 数値フィールド
	 * @return 精度の種類（IfViewScale.AMT IfViewScale.UNIT IfViewScale.STD IfViewScale.INPUT null のいづれか）
	 */
	protected String getViewScaleType(MCNumberField nf) {
		return getExt(nf.getBaseRow(), IfViewScale.EXT_KEY, nf.getBaseRowColumnName());
	}

	// ///////////////////////////////////////////////
	// 見出し項目の表示桁（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// 集計キー表示切替項目によるカラム表示（ここから）
	// ///////////////////////////////////////////////

	/**
	 * 条件に応じてカラムのモードをデフォルトまたは非表示にする。
	 * @param tbl モードを変更するテーブルのインスタンス。
	 * @param column モードを変更するカラムコンフィグ。
	 * モードを変更するカラムの項目属性文字列に、cndのカラム名を設定する。
	 * 設定するカラムは、boolean型であること。
	 * @param cnd  モードを変更する条件。trueの場合、デフォルト。falseの場合、非表示。
	 * @param atrr モードを変更するカラムの項目属性ＩＤ。
	 */
	protected void changeColumnMode(MCTable<?> tbl, MCRow cnd, String atrr) {
		MCConstRow r = tbl.getList().createRow();
		for (MCColumnConfig column : tbl.getColumnConfigs()) {
			changeColumnMode(r, column, cnd, atrr);
		}
	}

	/**
	 * 条件に応じてカラムのモードをデフォルトまたは非表示にする。
	 * @param proto モードを変更するテーブルのＲＯＷインスタンス。
	 * @param column モードを変更するカラムコンフィグ。
	 * 項目属性文字列に、cndのカラム名を設定する。
	 * 設定するカラムは、boolean型であること。
	 * @param cnd  モードを変更する条件。trueの場合、デフォルト。falseの場合、非表示。
	 * @param atrr モードを変更するカラムの項目属性ＩＤ。
	 */
	protected void changeColumnMode(MCConstRow proto, MCColumnConfig column, MCRow cnd,
			String atrr) {
		String fullColName = column.getBaseRowColumnName();
		String[] splitedColName = MCRow.splitColumnPath(fullColName);
		Map<String, String> map = proto.getExtMap(atrr);

		MCTable<?> parts = null;
		String checkBoxColumnName = null;
		for (int i = splitedColName.length; i > 0; i--) {
			String[] path = MCCollectionUtil.subArray(splitedColName, 0, i, String.class);
			String val = map.get(MCRow.createColumnPath(path));
			if (!isNull(val)) {
				checkBoxColumnName = val;
				break;
			}
			if (parts == null) {
				parts = column.getTable();
			}
			else {
				parts = parts.getUnderTable();
			}
		}
		if (checkBoxColumnName == null || !cnd.contains(checkBoxColumnName)) {
			return;
		}

		boolean isDefault = cnd.getBooleanNE(checkBoxColumnName);

		if (isDefault) {
			if (parts != null) {
				for (MCColumnConfig c : parts.getColumnConfigs()) {
					setDefaultMode(c);
				}
			}
			else {
				setDefaultMode(column);
			}
		}
		else {
			if (parts != null) {
				for (MCColumnConfig c : parts.getColumnConfigs()) {
					c.setMode(MCMode.INVISIBLE);
				}
			}
			else {
				column.setMode(MCMode.INVISIBLE);
			}
		}
	}

	// ///////////////////////////////////////////////
	// 集計キー表示切替項目によるカラム表示（ここまで）
	// ///////////////////////////////////////////////

	/**
	 * 条件に応じてキー項目を作成する</br>
	 * 項目属性（atrr）にcndのboolean型カラム名または"Key"と記述する。
	 * @param proto 項目属性が設定されたテーブルのインスタンス
	 * @param cnd キーとして含めるかを判定する条件。trueの場合含める
	 * @param atrr 項目属性ＩＤ
	 * @return atrr属性に"Key"と記述した項目およびatrr属性に記述したcndのフラグ項目がtrueとなる項目の配列
	 */
	protected List<String> getKeysByFlg(MCConstRow proto, String atrr, MCRow cnd) {
		Map<String, String> flgMap = proto.getExtMap(atrr);
		String[] keyList = proto.getKeys(atrr).toArray(new String[0]);
		List<String> keys = new ArrayList<String>();
		for (String key : keyList) {
			String flg = flgMap.get(key);
			if (isSame(flg, "Key")) {
				keys.add(key);
			}
			else if(cnd.getBooleanNE(flg)) {
				keys.add(key);
			}
		}
		return keys;
	}

	// ///////////////////////////////////////////////
	// 特殊なソート（ここから）
	// ///////////////////////////////////////////////

	/**
	 * 指定した行を除いてソートします。
	 *
	 * @param table ソート対象のテーブル
	 * @param policy ソートの優先順位
	 * @param row ソートから除外する行
	 */
	protected boolean sortWithoutRow(MCTable<?> table, MCSortPolicy policy, MCRow row) {
		MCRow selectedRow = null;
		MCColumnConfig selectedCol = null;
		int index = -1;

		MCList list = table.getList();

		if (!isNull(list) && list.size() > 0) {
			selectedRow = table.getSelectedMCRow();
			selectedCol = table.getSelectedColumnConfig();
			index = list.lastIndexOf(row);
		}

		if (index < 0) {
			return super.sort(table, policy);
		}

		list.remove(index);
		boolean boo = super.sort(table, policy);
		list.add(row);

		if (!isNull(selectedRow) && row.equals(selectedRow)) {
			if (selectedCol == null) {
				table.selectRowNoFocus(index);
			}
			else {
				table.focusCellAt(index, selectedCol);
			}
		}

		return boo;
	}

	/**
	 * 最下行を除いてソートします。
	 * 最下行に合計行がある場合などに使用します。
	 *
	 * @param table ソート対象のテーブル
	 * @param policy ソートの優先順位
	 */
	protected boolean sortWithoutBottom(MCTable<?> table, MCSortPolicy policy) {
		MCList list = table.getList();
		if(!isNull(list)) {
			return sortWithoutRow(table, policy, list.get(list.size() - 1));
		}
		return super.sort(table, policy);
	}

	// ///////////////////////////////////////////////
	// 特殊なソート（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// メッセージ関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 取消処理の実行を確認するメッセージを返す。
	 */
	@Override
	public MCMessage msgCancelConfirm() {
		if (useDelMsg()) {
			return new MCMessage(FXBAP0005);
		}
		return super.msgCancelConfirm();
	}

	/**
	 * 取消処理の実行終了時のメッセージを返す。
	 */
	@Override
	public MCMessage msgCanceled() {
		if (useDelMsg()) {
			return new MCMessage(FXBAP0022);
		}
		return super.msgCanceled();
	}

	/**
	 * 取消できなかったときのメッセージを返す。
	 */
	@Override
	public MCMessage msgCancelFailed() {
		if (useDelMsg()) {
			return new MCMessage(FXBAP0097);
		}
		return super.msgCancelFailed();
	}

	/**
	 * 削除用のメッセージを返すかどうか。
	 * 
	 * @return 削除用のメッセージを返す場合はtrue, 取消用のメッセージを返す場合はfalse（デフォルトtrue）
	 */
	protected boolean useDelMsg() {
		return true;
	}

	// ///////////////////////////////////////////////
	// メッセージ関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// ファイル取込関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * ファイル取込を行います
	 * <P>
	 * @param list 取り込んだ内容を格納するリスト
	 * @param table 取り込む際に項目等の情報を参照するためのテーブル
	 * @param panel 画面
	 * @return　取り込めたときTRUE
	 */
	protected boolean doMGFileInAction(MCList<? extends MCRow> list, MCTable<?> table, boolean excelFlg) {
		if (excelFlg) {
			return doMGExcelInAction(list, table);
		}
		else {
			return doMGCSVInAction(list, table);
		}
	}

	protected boolean doMGExcelInAction(MCList<? extends MCRow> list, MCTable<?> table) {
		File f = MCFileChooser.showXlsLoadDialog(null, this);
		if (f == null) {
			return false;
		}
		if (!f.exists()) {
			MCMessageBox.dialog(this, new MCMessage(MAUDP0004, f));
			return false;
		}

		list.clear();

		MCExcelReader reader = new MCExcelReader(getModuleID(), getScreenID(), list, f, table);

		MCContainerIOConfig config = new MCContainerIOConfig(getModuleID(), getScreenID());
		config.setReaderEncode(Encode.getEncode(getFileEncode(), config.getReaderEncode()));
		config.setReaderDelimiter(Delimiter.getDelimiter(getFileDelimiter(), config.getReaderDelimiter()));
		config.setReaderNameOut(isUsedNameLine());
		config.setReaderTitleOut(isUsedTitleLine());

		MCMessageList msgList;
		if (config.isReaderNameOut()) {
			// ファイルに項目行がある場合はファイルにある項目名で取り込む
			msgList = reader.read(config);
		}
		else {
			// ファイルに項目行がない場合は表示されているカラム順で取り込む
			MCColumnConfig[] columns = table.getViewColumnConfigs();
			List<String> names = new ArrayList<>();
			for (MCColumnConfig column : columns) {
				String name = column.getBaseRowColumnName();
				if (!isNull(name)) {
					names.add(name);
				}
			}
			msgList = reader.read(config, names.toArray(new String[0]));
		}
		// ファイル入力後の処理
		return doMGCustomFileInAction(table, list, msgList);
	}
	
	protected boolean doMGCSVInAction(MCList<? extends MCRow> list, MCTable<?> table) {
		File f = MCFileChooser.showCsvLoadDialog(null, this);
		if (f == null) {
			return false;
		}
		if (!f.exists()) {
			MCMessageBox.dialog(this, new MCMessage(MAUDP0004, f));
			return false;
		}

		list.clear();

		MCCsvReader reader = new MCCsvReader(getModuleID(), getScreenID(), list, f, table);

		MCContainerIOConfig config = new MCContainerIOConfig(getModuleID(), getScreenID());
		config.setReaderEncode(Encode.getEncode(getFileEncode(), config.getReaderEncode()));
		config.setReaderDelimiter(Delimiter.getDelimiter(getFileDelimiter(), config.getReaderDelimiter()));
		config.setReaderNameOut(isUsedNameLine());
		config.setReaderTitleOut(isUsedTitleLine());

		MCMessageList msgList;
		if (config.isReaderNameOut()) {
			// ファイルに項目行がある場合はファイルにある項目名で取り込む
			msgList = reader.read(config);
		}
		else {
			// ファイルに項目行がない場合は表示されているカラム順で取り込む
			MCColumnConfig[] columns = table.getViewColumnConfigs();
			List<String> names = new ArrayList<>();
			for (MCColumnConfig column : columns) {
				String name = column.getBaseRowColumnName();
				if (!isNull(name)) {
					names.add(name);
				}
			}
			msgList = reader.read(config, names.toArray(new String[0]));
		}
		// ファイル入力後の処理
		return doMGCustomFileInAction(table, list, msgList);
	}
	
	protected boolean doMGCustomFileInAction(MCTable<?> table, MCList<?> list, MCMessageList msgList) {
		if (msgList.isEmpty()) {
			for (MCRow r : list) {
				setFileInStatus(r);
			}
			return true;
		}
		else {
			doFileInErrorAction(table, msgList);
			return false;
		}
	}
	
	@Override
	protected void doCustomFileInAction(MCTable<?> table, MCList list, MCMessageList msgList) {
		checkCustomFileInAction(table, list, msgList);

		if (msgList.isEmpty()) {
			if (getCheckColumnConfig(table) != null) {
				// テーブルに格納する前にtrueにする（ロウリスナーの一括設定項目の連動を行わずファイル取り込みした内容を優先したいので）
				// ※ListRegRowListenerリスナーのstatusChangedでは、元の選択チェックがオンの場合は、
				// setDefaultValueWhenCheckedを呼ばないようにしている。
				for (Object r : list) {
					MCRow row = (MCRow)r;
					row.setBoolean(getCheckColumn(), true);
				}
			}
			for (Object r : list) {
				MCRow row = (MCRow)r;
				setFileInStatus(row);
			}
			table.getList().setAll(list);
			doFileInSuccessAction(table);
		}
		else {
			doFileInErrorAction(table, msgList);
		}
	}

	// ///////////////////////////////////////////////
	// ファイル取込関連（ここまで）
	// ///////////////////////////////////////////////
	
	// ///////////////////////////////////////////////
	// その他共通処理（ここから）
	// ///////////////////////////////////////////////
	/**
	 * ボタンのモードを変更する。
	 * @param btn 処理対象のボタン
	 * @param isEnabled trueの場合、画面ステータスのデフォルトのモード。falseの場合、DISABLEモード。
	 */
	protected void setBtnModeByFlg(MCButton btn, boolean isEnabled) {
		if (isEnabled) {
			setDefaultMode(btn);
		}
		else {
			btn.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * カラムのモードを変更する。
	 * @param col 処理対象のカラム
	 * @param isVisible trueの場合、画面ステータスのデフォルトのモード。falseの場合、INVISIBLEモード。
	 */
	protected void setColModeByFlg(MCColumnConfig col, boolean isVisible) {
		if (isVisible) {
			setDefaultMode(col);
		}
		else {
			col.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * カラムがキー項目（実装仕様書で「Key」を指定）のときTRUEを返します。
	 * @param cc カラム
	 * @param r 対象のRowコンテナ
	 * @return キー項目ならTRUE
	 */
	protected <R extends MCConstRow> boolean isKeyColumn(MCColumnConfig cc, R r) {
		for(String key : r.getKeys()) {
			if (isSame(cc.getBaseRowColumnName(), key)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 単価計算を行います。
	 * <p>
	 * @param amt 金額
	 * @param qty 数量
	 * @param decPlace 小数部有効桁数
	 * @return 単価
	 */
	protected MCNumber calcUpri(MCNumber amt, MCNumber qty, int decPlace) {
		return getUpri(amt, qty, MCNumber.valueOf(decPlace));
	}

	/**
	 * 率（％）の計算<br>
	 * 端数は四捨五入します。
	 * <p>
	 * @param denominator　分母
	 * @param numerator 分子
	 * @param scale スケール
	 * @return 率（％）
	 */
	protected MCNumber calcRate(MCNumber denominator, MCNumber numerator, int scale) {
		if (isNull(denominator) || isNull(numerator)) {
			return null;
		}
		return (denominator.isZero() ? MCNumber.ZERO
				: numerator.multiply(100).divide(denominator, scale, MAC_RND_TYP.RNDOFF.toMC()));
	}

	/**
	 * デフォルト計算カテゴリを設定します。</br>
	 * 原価会社パラメータからデフォルト計算カテゴリが取得できない場合や</br>
	 * すでに計算カテゴリが設定されている場合は何もしません。
	 * <p>
	 * @param beans デフォルト計算カテゴリを設定するコンボボックス
	 */
	protected void setDefCalcCtg(MCTextComboBox... beans) {
		String calcCtgCd = getCoParm().def_calc_ctg_cd();
		if(isNull(calcCtgCd)) {
			return;
		}
		for (MCTextComboBox b: beans) {
			if(isNull(b.getValue())) {
				if (b.checkValue(calcCtgCd).size() == 0) {
					setValueEx(b, calcCtgCd);
				}
			}
		}
	}

	// ///////////////////////////////////////////////
	// その他共通処理（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// チェック処理（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 年月の範囲が指定された期間内（月）かチェックします。
	 */
	public MCMessageList checkTermM(MCRowBeans dtFrom, MCRowBeans dtTo, int term) {
		MCMessageList msgList = new MCMessageList();

		if (dtFrom == null || dtTo == null) {
			return msgList;
		}
		Comparable<?> cFrom = dtFrom.getRowValue();
		Comparable<?> cTo = dtTo.getRowValue();
		if (cFrom == null || cTo == null) {
			return msgList;
		}

		if (isCalendarDate(cFrom, cTo)) {
			if (cFrom instanceof MCDate) {
				MCDate mcdtFrom = (MCDate) cFrom;
				MCDate mcdtTo = (MCDate) cTo;
				if (mcdtFrom.addMonth(term).lte(mcdtTo)) {
					MCMessage msg = new MCMessage(MGUDP0001, String.valueOf(term));
					msg.setCauseRow(dtFrom.getBaseRow(), dtFrom.getBaseRowColumnName());
					msgList.add(msg);
				}
			}
		}
		return msgList;
	}
	/**
	 * 期の範囲が指定された期間内（期）かチェックします。
	 */
	public MCMessageList checkTerm(MCRowBeans termFrom, MCRowBeans termTo, int term) {
		MCMessageList msgList = new MCMessageList();

		if (termFrom == null || termTo == null) {
			return msgList;
		}
		Comparable<?> cFrom = termFrom.getRowValue();
		Comparable<?> cTo = termTo.getRowValue();
		if (cFrom == null || cTo == null) {
			return msgList;
		}

		if (isCalendarDate(cFrom, cTo)) {
			if (cFrom instanceof MCDate) {
				MCDate mcdtFrom = (MCDate) cFrom;
				MCDate mcdtTo = (MCDate) cTo;
				int i = 0;
				for (mcframe.clientMAUC.MAUCP0020.TermR termR : getTermList()) {
					if (termR.term().gte(mcdtFrom) && termR.term().lte(mcdtTo)) {
						i++;
					}
				}
				if (i > term) {
					MCMessage msg = new MCMessage(MGUDP0002, String.valueOf(term));
					msg.setCauseRow(termFrom.getBaseRow(), termFrom.getBaseRowColumnName());
					msgList.add(msg);
				}
			}
		}
		return msgList;
	}
	// ///////////////////////////////////////////////
	// チェック処理（ここまで）
	// ///////////////////////////////////////////////

}