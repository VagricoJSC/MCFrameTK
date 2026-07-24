package mcframe.clientMAUD.MAUDP1010;

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
import mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil;
import mcframe.clientMAUC.MAUCP1010.MAUCP_StEndUtil;
import mcframe.clientCore.acl.MCACLManager;
import mcframe.clientCore.resource.MCConst;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonMA.meta.MA_META;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupMenu;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import java.util.HashMap;
import javax.swing.JComponent;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUDP_RLBase"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUDP_RLBase_MC extends MAUDP_RLBase_MC_A implements IfRLBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	private static final String _NM_LCL_SUFFIX = "_nm_lcl";
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUDP_RLBase_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	/**マスタ用RLUtilを使用する*/
	protected MAUDP_RLUtil _RLUtil;

	protected MAUDP_RLUtil getRLUtil() {
		if (_RLUtil == null) {
			_RLUtil = createInputSupportUtil();
		}
		return _RLUtil;
	}

	@Override
	protected MAUDP_RLUtil createInputSupportUtil() {
		MAUDP_RLUtil p = new MAUDP_RLUtil();
		p.setPanel(this);
		return p;
	}

	// IfRLBase 関連（ここから）
	public void setUPD_ADMINStatus() {
	};
	public void setREFStatus() {
	};
	public void setMODStatus() {
	};

	public boolean isUpdAdminOpe() {
		return getCndR().getString(getOpeColumn()).equals(getUpdAdminOpeValue());
	};
	public boolean isRefOpe() {
		return getCndR().getString(getOpeColumn()).equals(getRefOpeValue());
	};
	public boolean isModOpe() {
		return getCndR().getString(getOpeColumn()).equals(getModOpeValue());
	};

	@Override
	public String getUPD_ADMINStatus() {
		return getRLUtil().defGetUPD_ADMINStatus();
	}
	@Override
	public String getREFStatus() {
		return getRLUtil().defGetREFStatus();
	}
	@Override
	public String getMODStatus() {
		return getRLUtil().defGetMODStatus();
	}

	// IfRLBase 関連（ここまで）

	/**パネル内のRowと関連づいているBeansの値を削除します。*/
	protected void setNull(MCPanel...ps){
		MAUCP_BeansUtil.setNull(this, ps);
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		E newRow = super.copyRowSub(row);
		if (newRow == null) return null;

		String[] cols = newRow.getColumnPathArray();
		for (String col :cols) {
			if (newRow.getMeta(col).type() == MCDataType.STRING) {
				if (col.endsWith(_NM_LCL_SUFFIX)) {
					// ローカライズされた名称はコピーしない
					newRow.setStringNE(col, null);
				}
			}
		}
		if (getDtlL() != null) {
			// 行削除ボタンの制御
			if (getDtlL().contains(newRow) && getDtlRdelBtn() != null) {
				getDtlRdelBtn().setMode(this, getStatus());
			}
		}

		return newRow;

	}

	/**
	 * 開始日終了日の重複をチェックします。
	 *
	 * @param ml メッセージリスト
	 */
	protected void checkStEndDtValid(MCMessageList ml) {
		if (MAUCP_StEndUtil.isStEndDt((MAUDP_RLBase)this)) {
			String[] base_key = MAUCP_StEndUtil.getBaseKey((MAUDP_RLBase)this);
			MAUCP_StEndUtil.checkStEndDtValid(exceptDeleteAndEmpty(getDtlL()), base_key, ml);
		}
	}

	/**キー項目でソートします。*/
	@Override
	public void setSortColumn() {
		MCTable<?> t = getDtlTable();
		for (MCColumnConfig c : getColumnConfigs(t, getDtlRKeyColumns())) {
			t.addSortColumn(c, MCList.SortType.ASC);
		}
	}

	@Override
	public String[] toStringWithMsgLabel(int idx, MCColumnConfig... conf) {
		String[] tmp = super.toStringWithMsgLabel(idx, conf);
		// nullの要素は省く
		List<String> l = new ArrayList<String>();
		for (String m :tmp) {
			if (m != null) {
				l.add(m);
			}
		}
		return l.toArray(new String[0]);
	}

	@Override
	public String toStringWithMsgLabel(MCColumnConfig conf, int idx) {
		// 参照チェックについて：
		// 引数の項目にはＤＢ定義の項目名と同じ名前の画面の項目が渡される
		// マスタではＮＵＬＬ文字部品の表示項目のほうをＤＢ定義の項目名と合わせている

		if (conf == null) {
			return null;
		}

		// 非表示項目は見せない
		// （変更前カラムが渡ってきたときは、表示カラムを取得し、チェックする）
		MCColumnConfig viewConf = getViewConfig(conf);
		if (!viewConf.isVisible()) {
			return null;
		}

		return super.toStringWithMsgLabel(conf, idx);
	}

	protected MCColumnConfig getViewConfig(MCColumnConfig conf) {
		String[] c = getDtlRKeyColumns();
		String[] bc = getBeforeKeyColumns(c);
		MCColumnConfig[] cs = getColumnConfigs(getDtlTable(), c);
		MCColumnConfig[] bcs = getColumnConfigs(getDtlTable(), bc);
		
		// 変更前カラムコンフィグをループし、対応するキーカラムコンフィグを返す
		for (int i = 0; i < bcs.length; i++) {
			if (bcs[i] == conf) {
				return cs[i];
			}
		}
		// 変更前カラムコンフィグに存在しない場合は、そのままreturn
		return conf;
	}

	@Override
	public void setMode(String status) {
		super.setMode(status);

		setOpeMode();
	}

	/**
	 * 対応するボタンの権限がない操作種別は選択不可にする。
	 * 選択可能な種別のうち、一番左の種別を選択状態にする。
	 * （登録：upd、削除：del、登録（管理者）：upd_adminの順番）
	 */
	protected void setOpeMode() {
		for (MCRadioButton r : getRadioButtons(getCndOpeName())) {
			String v = r.getActionCommand();

			if (getUpdOpeValue().equals(v)) {
				// 登録：権限設定に関わらず常に選択可能
			}
			else if (getDelOpeValue().equals(v)) {
				// 削除：権限設定に関わらず常に選択可能
			}
			else if (getUpdAdminOpeValue().equals(v)) {
				// 登録（管理者）
				setOpeMode(r, getUpdAdminButton());
			}
			else if (getRefOpeValue().equals(v)) {
				// 参照
				setOpeMode(r, getSrchButton());
			}
			else if (getModOpeValue().equals(v)) {
				// 訂正：権限設定に関わらず常に選択可能
			}
		}
	}
	
	/**
	 * ボタンに対する権限が無い場合、ラジオボタンをdisableにする
	 */
	protected void setOpeMode(MCRadioButton r, MCButton b) {
		if (b == null || !MCACLManager.authorize(getModuleID(), getScreenID(), b.getACType(), null)) {
			r.setMode(MCMode.DISABLE);
		}
	}
	/**
	 * 指定されたグループのラジオボタンを返す
	 */
	protected List<MCRadioButton> getRadioButtons(String grp) {
		List<MCRadioButton> l = new ArrayList<MCRadioButton>();
		MCRadioButton[] a = MCBeansUtil.getAllComponents(MCRadioButton.class, this);
		for (MCRadioButton c : a) {
			if (c.getGroup().getName().equals(grp)) {
				l.add(c);
			}
		}
		return l;
	}
	/**
	 * 検索ボタンを返す
	 */
	protected MCButton getSrchButton() {
		List<MCButton> l = getButtons("srch");
		if (l.isEmpty()) {
			return null;
		}
		return l.get(0);
	}
	/**
	 * 更新ボタンを返す（権限文字列がupdのもののみ）
	 */
	protected MCButton getUpdButton() {
		List<MCButton> l = getButtons("upd");
		if (l.isEmpty()) {
			return null;
		}
		for (MCButton b : l) {
			if (!b.getACType().startsWith("upd_admin") && b.getACType().startsWith("upd")) {
				return b;
			}
		}
		return null;
	}
	/**
	 * 更新ボタンを返す（権限文字列がup_admindのもののみ）
	 */
	protected MCButton getUpdAdminButton() {
		List<MCButton> l = getButtons("upd");
		if (l.isEmpty()) {
			return null;
		}
		for (MCButton b : l) {
			if (b.getACType() != null && b.getACType().startsWith("upd_admin")) {
				return b;
			}
		}
		return null;
	}
	/**
	 * 削除ボタンを返す
	 */
	protected MCButton getDelButton() {
		List<MCButton> l = getButtons("del");
		if (l.isEmpty()) {
			return null;
		}
		return l.get(0);
	}
	/**
	 * 指定されたグループ（srch,upd,delなど）のボタンを返す
	 */
	protected List<MCButton> getButtons(String grp) {
		List<MCButton> l = new ArrayList<MCButton>();
		MCButton[] a = MCBeansUtil.getAllComponents(MCButton.class, this);
		for (MCButton c : a) {
			if (isSame(c.getGroup(),grp)) {
				l.add(c);
			}
		}
		return l;
	}

	/**
	 * 「更新カウンタ」のカラム名（デフォルトは"upd_cntr"。）
	 */
	public String getUpdCntrColumn() {
		return getRLUtil().getUpdCntrColumn();
	}

	/**
	 * ステータスによってステータスカラムの表示・非表示を制御する
	 */
	protected void setStatusColumnVisibleByStatus() {
		if (!isNull(getCndR()) && getCndR().contains(getOpeColumn())) {
			JComponent c = this.getComponent(getDtlL());
			if (!(c == null) && !(getDtlTable() == null)) {
				if (isUpdOpe() || isUpdAdminOpe() || isModOpe()) {
					getDtlTable().setStatusColumnVisible(true);
				}
				else if (isDelOpe() || isRefOpe()) {
					getDtlTable().setStatusColumnVisible(false);
				}
			}
		}
	}

	/**
	 * 操作種別によってステータスをセットし、ステータスカラムの表示・非表示を制御する
	 */
	protected void setStatusByOpe() {
		setStatusByOpeNotFillSpace();
		if (isUpdOpe()) {
			fillSpace();
		}
		else if (isUpdAdminOpe()) {
			fillSpace();
		}
		setStatusColumnVisibleByStatus();
	}

	/**
	 * 操作種別によってステータスをセットする
	 */
	protected void setStatusByOpeNotFillSpace() {
		if (isUpdOpe()) {
			setUPDStatus();
		}
		else if (isDelOpe()) {
			setDELStatus();
		}
		else if (isUpdAdminOpe()) {
			setUPD_ADMINStatus();
		}
		else if (isModOpe()) {
			setMODStatus();
		}
		else if (isRefOpe()) {
			setREFStatus();
		}
	}

	protected boolean isUpdSts() {
		return getStatus().equals(getUPDStatus()) || getStatus().equals(
				getUPD_ADMINStatus());
	}

	/**
	 * 操作種別：「登録（管理者）」の値（デフォルトは"2"）
	 */
	protected String getUpdAdminOpeValue() {
		return "2";
	}
	/**
	 * 操作種別：「参照」の値（デフォルトは"3"）
	 */
	protected String getRefOpeValue() {
		return "3";
	}
	/**
	 * 操作種別：「訂正」の値（デフォルトは"4"）
	 */
	protected String getModOpeValue() {
		return "4";
	}

	/**
	 * 適応開始日、　適応終了日を一覧へ設定する.
	 * 「選択」にチェックの入っているROWのみを設定対象とする.
	 * @param stDt 設定元の適用開始日
	 * @param endDt　設定元の適用終了日
	 * @param tbl　設定対象のテーブル
	 * @param stDtCol　設定対象の適用開始日カラム
	 * @param endDtCol　設定対象の適用終了日カラム
	 * 
	 */
	public void chkSetDtVal(MCRowBeans stDt, MCRowBeans endDt, MCTable<?> tbl, MCColumnConfig stDtCol, MCColumnConfig endDtCol) {
		if(tbl == null) return; 
		
		// 日付の逆転チェック
		MCMessageList msgList = checkBeforeAfter(stDt, endDt);
		if(msgList != null && !msgList.isEmpty()){
			message(msgList);
			return;
		}

		//設定
		for(int index=0 ;index < tbl.getList().size(); index++) {
			MCRow r = tbl.getList().get(index);
			if(r.getBoolean(getCheckColumnConfig(tbl).getRowColumnName())){
				if(stDt != null && !isNull(stDt.getRowValue()) && stDtCol != null){
					setValueEx(stDtCol, index, stDt.getRowValue());
				}
				if(endDt != null && !isNull(endDt.getRowValue()) && endDtCol != null){
					setValueEx(endDtCol, index, endDt.getRowValue());
				}
			}
		}
	}


	// ファイル出力NULL文字クリア関連（ここから）
	@Override
	protected void doExcelOutAction(MCTable<?> table, MCWriteType type) {
		table.setBeansWriter(createBeansWriter());
		super.doExcelOutAction(table, type);
	}

	@Override
	protected void doExcelOpenAction(MCTable<?> table, MCWriteType type) {
		table.setBeansWriter(createBeansWriter());
		super.doExcelOpenAction(table, type);
	}

	@Override
	protected void doCSVOutAction(MCTable<?> table, MCWriteType type) {
		table.setBeansWriter(createBeansWriter());
		super.doCSVOutAction(table, type);
	}

	protected MCBeansWriter createBeansWriter() {
		MCBeansWriter writer = new MCCustomBeansWriter();
		writer.setEncode(getFileEncode());
		writer.setDelimiter(getFileDelimiter());
		writer.setNameOut(isUsedNameLine());
		writer.setTitleOut(isUsedTitleLine());
		return writer;
	}

	public class MCCustomBeansWriter extends MCBeansWriter {

		protected boolean _chkFlg = false;

		@Override
		protected boolean checkBefore(MCTable table) {
			try {
				_chkFlg = true;
				return super.checkBefore(table);
			}
			finally {
				_chkFlg = false;
			}
		}

		@Override
		protected MCList getTableList(MCTable t) {
			if (_chkFlg) {
				return super.getTableList(t);
			}

			MCList<MCRow> l = super.getTableList(t).clone();
			String[] chkCols = getNullValChkCols(l.createRow());
			for (MCRow r : l) {
				for (String col : chkCols) {
					if (MAC_STR.isNULL_VAL(r.getString(col))) {
						r.setString(col, null);
					}
				}
			}
			return l;
		}

		protected String[] getNullValChkCols(MCRow r) {
			List<String> l = new ArrayList<String>();
			for (String col : r.getColumnPathArray()) {
				if (isSame(r.getDataType(col), MCDataType.STRING)
						&& !isItmSubMeta(r.getMeta(col))) {
					l.add(col);
				}
			}
			return l.toArray(new String[0]);
		}

		protected boolean isItmSubMeta(MCMeta meta) {
			if(meta == null) {
				return false;
			}
			return meta.metaEquals(MA_META.ITM_SUB1)
				|| meta.metaEquals(MA_META.ITM_SUB2)
				|| meta.metaEquals(MA_META.ITM_SUB3) ;
		}

	}

	/**
	 * ファイル入出力の文字コードを取得する。
	 */
	protected String getFileEncode() {
		String def = MCConst.beans.getString("beanswriter.encode");
		return getPgmSettingStringNE(this, def, "file_io.encode");
	}
	/**
	 * ファイル入出力の区切り文字を取得する。
	 */
	protected String getFileDelimiter() {
		String def = MCConst.beans.getString("beanswriter.delimiter");
		return getPgmSettingStringNE(this, def, "file_io.delimiter");
	}
	/**
	 * ファイル出力で項目行を出力する場合はtrue、出力しない場合はfalseを返す。
	 * ファイル入力で入力するファイルに項目行が存在する場合はtrue、存在しない場合はfalseを返す。
	 */
	protected boolean isUsedNameLine() {
		boolean def = MCConst.beans.getBoolean("beanswriter.nameOut");
		return getPgmSettingBooleanNE(this, def, "file_io.name_out");
	}
	/**
	 * ファイル出力でタイトル行を出力する場合はtrue、出力しない場合はfalseを返す。
	 * ファイル入力で入力するファイルにタイトル行が存在する場合はtrue、存在しない場合はfalseを返す。
	 */
	protected boolean isUsedTitleLine() {
		boolean def = MCConst.beans.getBoolean("beanswriter.titleOut");
		return getPgmSettingBooleanNE(this, def, "file_io.title_out");
	}
	// ファイル出力NULL文字クリア関連（ここまで）
	/** エクセル入力が有効な画面かどうか */
	protected Boolean _useExcelIn = null;
	/** ＣＳＶ入力が有効な画面かどうか */
	protected Boolean _useCsvIn = null;
	/** テーブルに紐づく行追加ボタン */
	protected HashMap<MCTable, MCButton> _raddBtnMap = new HashMap<>();

	/** 一番近くに配置されている行追加ボタンを返す */
	protected MCButton getRaddButton(Container p) {
		if(p == null) {
			return null;
		}
		MCButton[] a = MCBeansUtil.getAllComponents(MCButton.class, p);
		for (MCButton b : a) {
			if (b.getName().endsWith(".radd")) {
				return b;
			}
		}
		return getRaddButton(p.getParent());
	}

	/** テーブルから一番近くに配置されている行追加ボタンを返す */
	protected MCButton getRaddButton(MCTable table) {
		if (!_raddBtnMap.containsKey(table)) {
			_raddBtnMap.put(table, getRaddButton(table.getParent()));
		}
		return _raddBtnMap.get(table);
	}

	/** 
	 * ファイル入力を可能とするかどうか。
	 * 一番近くに配置されている行追加ボタンが押下可の場合にファイル入力可能とみなす。
	 */
	protected boolean useFileIn(MCTable table) {
		MCButton b = getRaddButton(table);
		return b != null && b.isEnabled();
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		return new FXBAP_PopupConfig() {
			@Override
			protected void customPopup(MCPopupMenu menu, MCTable table) {
				super.customPopup(menu, table);
				if (table == null) {
					return ;
				}

				if(_useExcelIn == null) {
					_useExcelIn = table.getExcelInMenuItem().isVisible();
				}
				if(_useCsvIn == null) {
					_useCsvIn = table.getCSVInMenuItem().isVisible();
				}

				if(_useExcelIn) {
					table.getExcelInMenuItem().setVisible(useFileIn(table));
				}
				if(_useCsvIn) {
					table.getCSVInMenuItem().setVisible(useFileIn(table));
				}
			}
		};
	}

}