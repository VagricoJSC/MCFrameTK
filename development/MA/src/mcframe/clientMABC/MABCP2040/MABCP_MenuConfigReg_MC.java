package mcframe.clientMABC.MABCP2040;

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

import mcframe.clientFSUB.FSUBP0100.*;
import mcframe.clientFSUB.FSUBP0110.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_MenuConfigReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_MenuConfigReg_MC extends MABCP_MenuConfigReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 登録明細枠の表示行サイズ */
	protected static int _fillSize = 12;
	/** メニュー配置番号の値の制限（最小値・最大値） */
	protected static int _minMenuNo = 1;
	protected static int _maxMenuNo = 24;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_MenuConfigReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_MenuConfigReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMA_MABCL2040_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL2040_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doDtlBtn_del(MCEventInfo info) {
		callMA_MABCL2040_Del01();
	}
	/**
	 * [MA_MABCL2040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2040_Srch01Caller<P extends MABCP_MenuConfigReg, B extends MA_MABCL2040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL2040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller(){
			super.initCaller();
			addDownContainer(getDtlL());
		}
		@Override
		protected boolean isDownParamEmpty() {
			// 第一下り電文にて判断
			return bridge.down0().isEmpty();
		}
		@Override
		protected void show() {
			getDtlL().setAll(createDtlLFromMenuL(bridge.down0()));
			copy(getDtl2R(), bridge.down0().get(0), createMap_Dtl2R_MenuR());
			super.show();
			setName(getDtlL());
		}

		/**
		 * モジュール名、画面名を設定する
		 */
		public void setName(MCList<DtlR> tar) {
			Dtl_module1_p_PPanel.setModuleName(tar, DtlR.$module_id1,
					DtlR.$module_id_nm1);
			Dtl_module2_p_PPanel.setModuleName(tar, DtlR.$module_id2,
					DtlR.$module_id_nm2);
			Dtl_scrn1_p_PPanel.setScreenName(tar, DtlR.$scrn_id1,
					DtlR.$scrn_name1);
			Dtl_scrn2_p_PPanel.setScreenName(tar, DtlR.$scrn_id2,
					DtlR.$scrn_name2);
		}

		@Override
		protected void clear() {
			super.clear();
			getDtlL().clear();
			getDtl2R().clear();
		}
	}

	/**
	 * [MA_MABCL2040_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2040_Upd01Caller<P extends MABCP_MenuConfigReg, B extends MA_MABCL2040_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL2040_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller(){
			super.initCaller();
			copy2Menu();
			addUpContainer(getDtlL());
			if (isUpdOpe()) {
				getHdrR().setStatus(Status.CREATE);
			}
			else{
				getHdrR().setStatus(Status.MODIFY);
			}
		}
		@Override
		protected void show(){
			super.show();
			copyHdrToCnd();
		}
	}

	/**
	 * [MA_MABCL2040_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2040_Del01Caller<P extends MABCP_MenuConfigReg, B extends MA_MABCL2040_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL2040_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected boolean checkCheckedRowSize() {
			// チェックしない
			return true;
		}
		@Override
		protected boolean isUpBlockStatusNone() {
			// チェックしない
			return false;
		}
		@Override
		protected MCList<? extends MCConstRow> getCheckedRowList() {
			return null;
		}
	}
	@Override
	protected void setCheckValue(mcframe.clientCore.container.MCRowEvent event,
			boolean boo) {
		// "選択"がないので、のチェック処理をしないように制御
	}
	
	// -- 通信処理(START)
	/**
	 * 登録用データを検索用データにコピーする
	 */
	protected void copyHdrToCnd() {
		getCndR().menu_cd(getHdrR().menu_cd());
		getCndR().menu_nm(getHdrR().menu_nm());
	}

	/**
	 * メニューのリストから表示用の新規リストを作成する。
	 */
	protected MCList<DtlR> createDtlLFromMenuL(MCList<MenuR> menuL){
		MCList<DtlR> dtlL = MCList.create(DtlR.class);
		for (int i=0; i<_fillSize; i++) {
			DtlR r = DtlR.create();
			dtlL.add(r);
		}
		
		for (MenuR menu : menuL) {
			MCNumber no = menu.menu_no();
			// メニュー配置番号の値の制限に合わないデータを無視する。
			if ((_minMenuNo <= no.intValue()) && (no.intValue() <= _maxMenuNo)) {
				DtlR dtl = dtlL.get(getDtlRowNo(no));
				dtl.setString(getDtlColOfModuleId(no), menu.module_id());
				dtl.setString(getDtlColOfscrnId(no), menu.scrn_id());
			}
		}
		
		return dtlL;
	}
	
	/**
	 * メニュー配置番号に対応する行番号を取得する
	 * @param menuNo
	 */
	protected int getDtlRowNo(MCNumber menuNo) {
		return (menuNo.intValue()-1) / 2;
	}
	/**
	 * メニュー配置番号に対応するモジュールＩＤのカラム名を取得する<br>
	 * @param menuNo
	 */
	protected String getDtlColOfModuleId(MCNumber menuNo) {
		if (menuNo.intValue() % 2 == 0){
			return DtlR.$module_id2;
		}
		else {
			return DtlR.$module_id1;
		}
	}
	/**
	 * メニュー配置番号に対応する画面ＩＤのカラム名を取得する<br>
	 * @param menuNo
	 */
	protected String getDtlColOfscrnId(MCNumber menuNo) {
		if (menuNo.intValue() % 2 == 0){
			return DtlR.$scrn_id2;
		}
		else {
			return DtlR.$scrn_id1;
		}
	}

	/**
	 * 表示用のリストからメニューの新規リストを作成する。
	 */
	protected MCList<MenuR> createMenuLFromDtlL() {
		MCList<MenuR> menuL = MCList.create(MenuR.class);
		for (DtlR row : getDtlL()) {
			if (!isNullOr(row.module_id1(), row.scrn_id1())){
				MenuR menu = MenuR.create();
				menu.menu_no(getMenuNo(row.getGUIIndex(), DtlR.$module_id1));
				menu.module_id(row.module_id1());
				menu.scrn_id(row.scrn_id1());
				menuL.add(menu);
			}
			if (!isNullOr(row.module_id2(), row.scrn_id2())){
				MenuR menu = MenuR.create();
				menu.menu_no(getMenuNo(row.getGUIIndex(), DtlR.$module_id2));
				menu.module_id(row.module_id2());
				menu.scrn_id(row.scrn_id2());
				menuL.add(menu);
			}
		}
		if (!getDtlL().isStatusNone()) {
			menuL.setStatus(Status.MODIFY);
		}
		return menuL;
	}
	
	/**
	 * 行番号とモジュールＩＤのカラム名から、メニュー配置番号を取得する
	 */
	protected MCNumber getMenuNo(int index, String col) {
		int menuNo = 2*index;
		if (isSame(DtlR.$module_id1, col)) {
			menuNo ++;
		}
		else if (isSame(DtlR.$module_id2, col)) {
			menuNo +=2;
		}
		return MCNumber.valueOf(menuNo);
	}
	
	/**
	 * 表示用のリストをメニューリストにコピーする。
	 */
	protected void copy2Menu(){
		getMenuL().setAll(createMenuLFromDtlL());
	}
	// -- 通信処理(END)
	// -- 画面起動時の処理(START)
	@Override
	protected void tableInit() {
		super.tableInit();
		DtlTable.setSortable(false);
	}
	@Override
	protected void fillSpaceForOpen() {
		getRLUtil().defFillSpaceForOpen();
		int cnt = getDtlL().size();
		if (cnt <= _fillSize) {
			MCList<DtlR> rackL = MCList.create(DtlR.class);
			for (int i=cnt; i<_fillSize; i++) {
				rackL.add(DtlR.create());
			}
			
			if (!rackL.isEmpty()) {
				getDtlL().addAll(rackL);
			}
		}

	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_MENU_CONFIG));
	}
	// -- 画面起動時の処理(END)
	// -- ステータス(START)
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		Cnd_ope_UPD.focusGained();
		if(isModOpe()){
			setFIX_MStatus();
		}
		if(isDelOpe()){
			setFIX_DStatus();
		}
	}

	@Override
	public void setMODStatus() {
		super.setMODStatus();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_MStatus() {
		super.setFIX_MStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
	}
	// -- ステータス(END)
	// -- ポップアップ関連（START）
	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
	 	if (beans == DtlTable) {
	 		conf.ignoreSortOrder(true);
	 	}
	 	return conf;
	}
	// -- ポップアップ関連（END）
	// -- 画面起動時の処理(START)
	@Override
	protected void partsInit() {
		super.partsInit();
		Dtl_scrn1_p_PPanel.putReqLinkParts(Dtl_module1_p_PPanel);
		Dtl_scrn2_p_PPanel.putReqLinkParts(Dtl_module2_p_PPanel);
		Dtl_module1_p_PPanel.putReqLinkParts(Dtl_scrn1_p_PPanel);
		Dtl_module2_p_PPanel.putReqLinkParts(Dtl_scrn2_p_PPanel);
	}
	@Override
	public void fillSpace() {
		int cnt = getDtlL().size();
		if (cnt <= _fillSize) {
			MCList<DtlR> rackL = MCList.create(DtlR.class);
			for (int i=cnt; i<_fillSize; i++) {
				rackL.add(DtlR.create());
			}
			
			if (!rackL.isEmpty()) {
				getDtlL().addAll(rackL);
			}
		}
	}
	
	// -- 画面起動時の処理(END)

	protected Map_Dtl2R_MenuR<Dtl2R,MenuR> createMap_Dtl2R_MenuR() {
		return new Map_Dtl2R_MenuR<Dtl2R, MenuR>();
	}
	public class Map_Dtl2R_MenuR<D extends Dtl2R, S extends MenuR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Dtl2R.$ins_usr_id, MenuR.$ins_usr_id);
			addColumnPathMap(Dtl2R.$ins_usr_nm, MenuR.$ins_usr_nm);
			addColumnPathMap(Dtl2R.$ins_ts, MenuR.$ins_ts);
			addColumnPathMap(Dtl2R.$ins_func_id, MenuR.$ins_func_id);
			addColumnPathMap(Dtl2R.$ins_func_nm, MenuR.$ins_func_nm);
			addColumnPathMap(Dtl2R.$upd_usr_id, MenuR.$upd_usr_id);
			addColumnPathMap(Dtl2R.$upd_usr_nm, MenuR.$upd_usr_nm);
			addColumnPathMap(Dtl2R.$upd_ts, MenuR.$upd_ts);
			addColumnPathMap(Dtl2R.$upd_func_id, MenuR.$upd_func_id);
			addColumnPathMap(Dtl2R.$upd_func_nm, MenuR.$upd_func_nm);
			addColumnPathMap(Dtl2R.$upd_srv_req_no, MenuR.$upd_srv_req_no);
		}
	}
	
	//------------------ ｾﾙｺﾝﾌｨｸﾞ Start ------------------//
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}
	
	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_RLBaseCellConfig {

		public DtlConf(MAUDP_RLBase _panel) {
			super(_panel);
		}
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column,
				MCTable table) {
			if (getStatus() == UPD || getStatus() == MOD) {
				DtlR r = (DtlR)table.getBaseTable().getRow(index);
				
				// モジュールＩＤ１が設定されている場合、画面ＩＤ１は入力必須、モジュールＩＤ１が設定されていない場合は入力可能
				if (column == columnDtl_scrn_id1) {
					if (!isNull(r.module_id1())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.ENABLE;
					}
				}
				// モジュールＩＤ２が設定されている場合、画面ＩＤ２は入力必須、モジュールＩＤ２が設定されていない場合は入力可能
				if (column == columnDtl_scrn_id2) {
					if (!isNull(r.module_id2())) {
						return MCMode.REQUIRED;
					}
					else {
						return MCMode.ENABLE;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		
	}

}