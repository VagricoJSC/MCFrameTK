package mcframe.clientMABC.MABCP0390;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.Arrays;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import mcframe.commonCore.util.MCCollectionUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_ItmLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_ItmLst_MC extends MABCP_ItmLst_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected String _IMAGE_HEIGHT = "th_image_height";
	protected String _IMAGE_WIDTH = "th_image_width";
	protected int _DEFAULT_ROW_HEIGHT = 21;
	protected String _MST_SET_TYP;
	protected String _APP_USR_INFO_C = "APP_USR_INFO_C";
	protected String _APP_INPT_C = "APP_INPT_C";
	protected String _DISP_CTL = "DISP_CTL";
	protected String _INPT_CTL = "INPT_CTL";
	protected String _ITM_TYP_D_CD = "TYPD";
	protected String _PHANTOM = "PNTM";
	protected int _snoTyp = getSnoTyp(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmLst_MC() {
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
	public MABCP_ItmLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL0390_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0390_Srch01Caller<P extends MABCP_ItmLst, B extends MA_MABCL0390_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0390_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void adjustList() {
			columnDtl_th_image.setAdjustWidth(false);
			super.adjustList();
			
			if(bridge.up0().th_image_flg()) {
				Integer h = getImageWH(_IMAGE_HEIGHT);
				Integer w = getImageWH(_IMAGE_WIDTH);
				
				if (!isNull(h) && !isNull(w)) {
					DtlTable.setMCRowHeight(h + 10);
					columnDtl_th_image.setWidthForAdjustWidth(w + 10);
					columnDtl_th_image.setImageSize(w, h);
				}
			}
			else {
				int ratio = DtlTable.getRatio();
				DtlTable.setMCRowHeight(MCBeansUtil.adjust(_DEFAULT_ROW_HEIGHT, 100, ratio));
			}
		}

		/**サムネイル画像の高さ・横幅を取得します。*/
		protected Integer getImageWH(String _wh) {
			String key = getDispString(_wh);
			Integer imageWH = new Integer(key);
			return imageWH;
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackForSrch(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
			setThimageFlg();
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果から変更前項目にコピーする
			bridge.down0().setColumnValue(DtlR.$org_stk_mng_typ, bridge.down0(), DtlR.$stk_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_asset_mng_typ, bridge.down0(), DtlR.$asset_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_lot_mng_typ, bridge.down0(), DtlR.$lot_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_sublot_mng_typ, bridge.down0(), DtlR.$sublot_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_sno1_mng_typ, bridge.down0(), DtlR.$sno1_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_sno2_mng_typ, bridge.down0(), DtlR.$sno2_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_sno3_mng_typ, bridge.down0(), DtlR.$sno3_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_sno4_mng_typ, bridge.down0(), DtlR.$sno4_mng_typ);
			bridge.down0().setColumnValue(DtlR.$org_comp_spec_typ, bridge.down0(), DtlR.$comp_spec_typ);
		}
	}
	
	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(Cnd_own_co_flg_on, Cnd_own_co_flg_off));
		msgList.addAll(checkAtLeastOne(Cnd_release_flg_on, Cnd_release_flg_off));
		msgList.addAll(checkAtLeastOne(Cnd_sundry_itm_flg_on, Cnd_sundry_itm_flg_off));
	}

	/**
	 * [MA_MABCL0390_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0390_Upd01Caller<P extends MABCP_ItmLst, B extends MA_MABCL0390_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0390_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			
			if (MAC_MST_SET_TYP.isALL_COM(_MST_SET_TYP) && Cnd_tar_COM.isSelected()) {
				getCndR().upd_only_com_flg(true);
			}
			else {
				getCndR().upd_only_com_flg(false);
			}
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL0390_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0310]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0310(MCEventInfo info) {

		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0310");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0310CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0310.CndR crtOpenMABCP0310CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0310.MABCP_ItmReg p = (mcframe.clientMABC.MABCP0310.MABCP_ItmReg) aso.getPanel();
		mcframe.clientMABC.MABCP0310.CndR to = mcframe.clientMABC.MABCP0310.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1120]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1120(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1120");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1120CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1120.CndR crtOpenMABSP1120CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1120.CndR to = mcframe.clientMABS.MABSP1120.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1100]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1100(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1100");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1100CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1100.CndR crtOpenMABSP1100CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1100.CndR to = mcframe.clientMABS.MABSP1100.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1110]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1110(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1110");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1110CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1110.CndR crtOpenMABSP1110CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1110.CndR to = mcframe.clientMABS.MABSP1110.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABSP1130]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABSP1130(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABSP1130");
		aso.runValueInit();
		aso.putCnd(crtOpenMABSP1130CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABS.MABSP1130.CndR crtOpenMABSP1130CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABS.MABSP1130.CndR to = mcframe.clientMABS.MABSP1130.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0870]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0870(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0870");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0870CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0870.CndR crtOpenMABCP0870CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0870.CndR to = mcframe.clientMABC.MABCP0870.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0840]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0840(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0840");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0840CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0840.CndR crtOpenMABCP0840CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0840.CndR to = mcframe.clientMABC.MABCP0840.CndR.create();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[open_MABCP0400]の押下時の処理
	 */
	@Override
	public void doDtlBtn_open_MABCP0400(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0400");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP0400CndR(aso));
		aso.show();
	}
	protected mcframe.clientMABC.MABCP0400.CndR crtOpenMABCP0400CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMABC.MABCP0400.CndR to = mcframe.clientMABC.MABCP0400.CndR.create();
		mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg p = (mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg) aso.getPanel();

		DtlR r = DtlTable.getSelectedMCRow();
		if (r != null && !isNull(r.itm_cd())) {
			to.itm_cd(r.itm_cd());
			to.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
			to.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
			to.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
			
			if (r.release_flg()) {
				to.ope(p.Cnd_ope_DEL.getActionCommand());
			}
			else {
				to.ope(p.Cnd_ope_UPD.getActionCommand());
			}
			aso.putSearchAction();
		}
		return to;
	}
	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		DtlR dtlR = copyRow(DtlTable);
		if (dtlR != null) {
			dtlR.itm_nm(null);
			dtlR.ins_usr_id_c(null);
			dtlR.ins_usr_nm_c(null);
			dtlR.ins_ts_c(null);
			dtlR.ins_func_id_c(null);
			dtlR.ins_func_nm_c(null);
			dtlR.upd_cntr_c(null);
			dtlR.upd_usr_id_c(null);
			dtlR.upd_usr_nm_c(null);
			dtlR.upd_ts_c(null);
			dtlR.upd_func_id_c(null);
			dtlR.upd_func_nm_c(null);
			dtlR.upd_srv_req_no_c(null);

			setOpenButtonMode();
			setDtlBtnMode();
		}
	}
	/**
	 * Panel[DtlBtn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd(MCEventInfo info) {
		callMA_MABCL0390_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_admin]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_admin(MCEventInfo info) {
		callMA_MABCL0390_Upd01();
	}
	/**
	 * Panel[DtlBtn]のボタン[upd_cmn]の押下時の処理
	 */
	@Override
	public void doDtlBtn_upd_cmn(MCEventInfo info) {
		callMA_MABCL0390_Upd01();
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		
		E newRow = super.copyRowSub(row);
		if (newRow == null) return null;
		// コピー対象外
		newRow.setBooleanNE("sls_input_flg", false);
		newRow.setBooleanNE("mfg_input_flg", false);
		newRow.setBooleanNE("purc_input_flg", false);
		newRow.setBooleanNE("insp_input_flg", false);
		newRow.setBooleanNE("release_flg", false);
		newRow.setDateNE("release_tm", null);
		newRow.setStringNE("release_usr_cd", null);
		newRow.setStringNE("release_usr_nm", null);
		newRow.setStringNE("ext_sys_no_itm", null);
		newRow.setStringNE("chng_no", null);
		return newRow;
	}

	@Override
	protected void listInit() {
		super.listInit();

		columnDtl_itm_typ_d_cd.addIgnoreListBeans(columnDtl_slo_proc_typ, columnDtl_ship_inst_typ, columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		// 管理名と管理区分
		getMstR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.MAM_ITM));
		_MST_SET_TYP = getRLUtil().getMstSetTyp(MAC_MST_NM.MAM_ITM);
		setFlgInit();
		setCndTargetWk();
	}
	
	/** 初期値設定(検索フラグ) */
	protected void setFlgInit() {
		//諸口品.オフ、諸口品.オン
		setValueEx(Cnd_sundry_itm_flg_on, true);
		setValueEx(Cnd_sundry_itm_flg_off, true);
		// 自社.登録済
		setValueEx(Cnd_own_co_flg_on, true);
		// リリース
		setValueEx(Cnd_release_flg_off, true);
		setValueEx(Cnd_release_flg_on, true);
		// 論理削除
		setValueEx(Cnd_off_del_flg, true);
		setValueEx(Cnd_on_del_flg, true);
	}

	protected List<MCColumnConfig> getGroupCol(MCTable table, String grp, String key) {
		List<MCColumnConfig> l = new ArrayList<MCColumnConfig>();
		MCConstRow r = (MCConstRow) table.getList().createRow();
		Map<String, String> m = r.getExtMap(grp);
		if (m != null && !m.isEmpty()) {
			for (Map.Entry<String, String> e : m.entrySet()) {
				if (Arrays.asList(e.getValue().split(";")).contains(key)) {
					for (MCColumnConfig cc : table.getColumnConfigs()) {
						if (isSame(cc.getBaseRowColumnName(), e.getKey())) {
							l.add(cc);
						}
					}
				}
			}
		}
		return l;
	}

	protected void setDispCtlColMode(MCTable table, String key, MCMode mode) {
		for(MCColumnConfig c : getGroupCol(table, _DISP_CTL, key)) {
			c.setMode(mode);
		}
	}

	/** 対象枠設定 */
	protected void setCndTargetWk() {
		if (_MST_SET_TYP == null) {
			return ;
		}
		if (isComOnly()) {
			setValueEx(Cnd_tar_Group, Cnd_tar_COM.getActionCommand());
			Cnd_tar_Group.setMode(MCMode.READ_ONLY);
			// 会社別の場合は品目マスタ（共通）のユーザ情報等は表示しない
			setDispCtlColMode(DtlTable, _APP_USR_INFO_C, MCMode.INVISIBLE);
		}
		else if ((isUpdOpe() || isUpdAdminOpe()) && Cnd_tar_COM.isSelected()){
			if (columnDtl_th_image.getMode() == MCMode.ENABLE) {
				columnDtl_th_image.setMode(MCMode.READ_ONLY);
			}
			// 共通項目をまとめてREAD_ONLYに設定
			setDispCtlColMode(DtlTable, _APP_INPT_C, MCMode.READ_ONLY);
		}
	}

	/**
	 * 登録対象に会社項目のみしか選択できないときtrueを返します。
	 */
	protected boolean isComOnly() {
		return MAC_MST_SET_TYP.isCOM(_MST_SET_TYP) || !DtlBtn_upd_cmn.authorize();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setCndTargetWk();
		setOpenButtonMode();
		setDtlBtnMode();
	}

	@Override
	public void setUPD_ADMINStatus() {
		super.setUPD_ADMINStatus();
		setCndTargetWk();
		setOpenButtonMode();
		setDtlBtnMode();
	}

	@Override
	public void setFIXStatus() {
		super.setFIXStatus();
		setCndTargetWk();
		setThimageFlg();
		setOpenButtonMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndTargetWk();
		setOpenButtonMode();
	}

	protected void setOpenButtonMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		
		if (r == null || isNull(r.itm_cd())) {
			DtlBtn_open_MABCP0310.setMode(MCMode.DISABLE);
			DtlBtn_open_MABSP1120.setMode(MCMode.DISABLE);
			DtlBtn_open_MABSP1100.setMode(MCMode.DISABLE);
			DtlBtn_open_MABSP1110.setMode(MCMode.DISABLE);
			DtlBtn_open_MABSP1130.setMode(MCMode.DISABLE);
			DtlBtn_open_MABCP0870.setMode(MCMode.DISABLE);
			DtlBtn_open_MABCP0840.setMode(MCMode.DISABLE);
			DtlBtn_open_MABCP0400.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(DtlBtn_open_MABCP0310);
			setBtnModeByFlg(DtlBtn_open_MABSP1120, isEnableBtn_open_MABSP1120(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1100, isEnableBtn_open_MABSP1100(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1110, isEnableBtn_open_MABSP1110(r));
			setBtnModeByFlg(DtlBtn_open_MABSP1130, isEnableBtn_open_MABSP1130(r));
			setDefaultMode(DtlBtn_open_MABCP0870);
			setBtnModeByFlg(DtlBtn_open_MABCP0840, isEnableBtn_open_MABCP0840(r));
			setBtnModeByFlg(DtlBtn_open_MABCP0400, isEnableBtn_open_MABCP0400(r));
		}
	}
	
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

	protected void setDtlBtnMode() {
		if (isUpdSts()) {
			DtlR dtlR = DtlTable.getSelectedMCRow();

			if (isNull(dtlR)) {
				DtlBtn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				if (!isNull(dtlR.upd_cntr_c())) {
					DtlBtn_rdel.setMode(MCMode.DISABLE);
				}
				else {
					setDefaultMode(DtlBtn_rdel);
				}
			}
		}
	}

	/**
	 * 一覧にサムネイル画像のModeをセット。
	 */
	protected void setThimageFlg() {
		if (!getCndR().th_image_flg()) {
			columnDtl_th_image.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doDtl_DC(info);
	}

	/**
	 * ダブルクリック：品目マスタ登録へ画面遷移
	 */
	public void doDtl_DC(MCEventInfo info) {
		doDtlBtn_open_MABCP0310(info);
	}

	@Override
	public boolean doCnd_tar_VC(MCEventInfo info) {
		if (!checkAllTableClear()) {
			return false;
		}
		return super.doCnd_tar_VC(info);
	}

	@Override
	public void doCnd_tar_NC(MCEventInfo info) {
		super.doCnd_tar_NC(info);

		clearAll();
		setStatusByOpe();
		moveFocusCndPanel();
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		if (info.getEventIndex() < 0) {
			return;
		}

		setOpenButtonMode();
		setDtlBtnMode();
	}

	/**
	 * 販売品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1120(DtlR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.asset_mng_typ()) && !MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ()) && !r.del_flg();
	}

	/**
	 * 製造品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1100(DtlR r) {
		if (r == null) {
			return false;
		}
		return MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ()) && !r.del_flg();
	}

	/**
	 * 購買品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1110(DtlR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.asset_mng_typ()) && !MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ()) && !r.del_flg();
	}

	/**
	 * 検査品登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABSP1130(DtlR r) {
		if (r == null) {
			return false;
		}
		return MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) && !r.del_flg();
	}

	/**
	 * 品目付加情報登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABCP0840(DtlR r) {
		if (r == null) {
			return false;
		}
		return !isNull(r.asset_mng_typ()) && !MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ());
	}
	
	/**
	 * 品目リリース登録画面に遷移できるか
	 */
	protected boolean isEnableBtn_open_MABCP0400(DtlR r) {
		if (r == null) {
			return false;
		}
		return !r.del_flg();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		
		Dtl_rqmt_rstr_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
		Dtl_std_qty_p_PPanel.setRelateBeans(columnDtl_unit_cd, columnDtl_dec_place);
	}
	
	@Override
	public void doDtl_itm_cd_LC(MCEventInfo info) {
		super.doDtl_itm_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNullOrNullVal(r.itm_cd())) {
			setValueEx(columnDtl_itm_sub1, idx, null);
		}
	}
	
	@Override
	public void doDtl_itm_sub1_LC(MCEventInfo info) {
		super.doDtl_itm_sub1_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNullOrNullVal(r.itm_sub1())) {
			setValueEx(columnDtl_itm_sub2, idx, null);
		}
	}
	
	@Override
	public void doDtl_itm_sub2_LC(MCEventInfo info) {
		super.doDtl_itm_sub2_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (isNullOrNullVal(r.itm_sub2())) {
			setValueEx(columnDtl_itm_sub3, idx, null);
		}
	}

	@Override
	public void doDtl_stk_mng_typ_LC(MCEventInfo info) {
		super.doDtl_stk_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		setValueEx(columnDtl_sundry_itm_flg, idx, false);
		if (MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())){
			if (!(MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ()))){
				setValueEx(columnDtl_asset_mng_typ, idx, MAC_ASSET_MNG_TYP.PHANTOM.value());
			}
			if (!(MAC_ITM_TYP.isPHANTOM(r.itm_typ()))){
				setValueEx(columnDtl_itm_typ, idx, MAC_ITM_TYP.PHANTOM.value());
			}

			for (MCColumnConfig c : getPhantomGrpCols()) {
				if (c == columnDtl_sno1_mng_typ
						|| c == columnDtl_sno2_mng_typ
						|| c == columnDtl_sno3_mng_typ
						|| c == columnDtl_sno4_mng_typ) {
					setValueEx(c, idx, MAC_SNO_MNG_TYP.NOT_MNG.value());
				}
				else if (c == columnDtl_comp_spec_typ) {
					setValueEx(c, idx, MAC_COMP_SPEC_TYP.NO.value());
				}
				else {
					if (c.getDataType() == MCDataType.BOOLEAN) {
						setValueEx(c, idx, false);
					}
					else {
						setValueEx(c, idx, null);
					}
				}
			}
		}
		else {
			if (MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ())){
				setValueEx(columnDtl_asset_mng_typ, idx, null);
			}
			if (MAC_ITM_TYP.isPHANTOM(r.itm_typ())){
				setValueEx(columnDtl_itm_typ, idx, null);
			}
		}
		if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			if (MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
				setValueEx(columnDtl_ship_inst_typ, idx, null);
			}
		}
		else {
			setValueEx(columnDtl_minus_stk_flg, idx, false);
			setValueEx(columnDtl_gi_alloc_flg, idx, false);
			setValueEx(columnDtl_lot_mng_typ, idx, MAC_LOT_MNG_TYP.NOT_MNG.value());
			setValueEx(columnDtl_sublot_mng_typ, idx, MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
			setValueEx(columnDtl_stk_lst_flg, idx, false);
		}
		if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_slo_proc_typ, idx, null);
		}
		else {
			setValueEx(columnDtl_dscnt_itm_flg, idx, false);
			setValueEx(columnDtl_exim_xpns_typ, idx, null);
		}
		if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) || MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())){
			setValueEx(columnDtl_arr_skip_flg, idx, false);
			setValueEx(columnDtl_purc_dlv_slip_flg, idx, false);
		}
	}
	
	@Override
	public void doDtl_asset_mng_typ_LC(MCEventInfo info) {
		super.doDtl_asset_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ())){
			if (!(MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ()))){
				setValueEx(columnDtl_stk_mng_typ, idx, MAC_STK_MNG_TYP.PHANTOM.value());
			}
			if (!(MAC_ITM_TYP.isPHANTOM(r.itm_typ()))){
				setValueEx(columnDtl_itm_typ, idx, MAC_ITM_TYP.PHANTOM.value());
			}
		}
		else {
			if (MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())){
				setValueEx(columnDtl_stk_mng_typ, idx, null);
			}
			if (MAC_ITM_TYP.isPHANTOM(r.itm_typ())){
				setValueEx(columnDtl_itm_typ, idx, null);
			}
		}
		if (!MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())) {
			setValueEx(columnDtl_dscnt_itm_flg, idx, false);
		}
		if (!MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
			setValueEx(columnDtl_prov_upri_cng_flg, idx, false);
		}
	}


	@Override
	public void doDtl_dim_unit_cd_LC(MCEventInfo info) {
		super.doDtl_dim_unit_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.dim_unit_cd())) {
			setValueEx(columnDtl_dim, idx, null);
		}
	}

	@Override
	public void doDtl_wt_unit_cd_LC(MCEventInfo info) {
		super.doDtl_wt_unit_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.wt_unit_cd())) {
			setValueEx(columnDtl_wt, idx, null);
		}
	}

	@Override
	public void doDtl_conts_unit_cd_LC(MCEventInfo info) {
		super.doDtl_conts_unit_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.conts_unit_cd())) {
			setValueEx(columnDtl_conts_qty, idx, null);
		}
	}

	@Override
	public void doDtl_jan_typ_LC(MCEventInfo info) {
		super.doDtl_jan_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.jan_typ())) {
			setValueEx(columnDtl_jan_cd, idx, null);
		}
	}

	@Override
	public void doDtl_lot_mng_typ_LC(MCEventInfo info) {
		super.doDtl_lot_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 在庫管理区分「在庫管理する」以外で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(r.lot_mng_typ()) && !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_lot_mng_typ, idx, MAC_LOT_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(r.lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			setValueEx(columnDtl_lot_no_typ, idx, null);
			setValueEx(columnDtl_ver_flg, idx, false);
			setValueEx(columnDtl_lmt_ctl_flg, idx, false);

			if (isNull(r.lot_mng_typ())
					|| !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())
					&& !MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
				setValueEx(columnDtl_sublot_mng_typ, idx, null);
			}
			else if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
				setValueEx(columnDtl_not_new_lot_flg, idx, false);
			}
		}
		if (!MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ())) {
			setValueEx(columnDtl_insp_bind_typ, idx, null);
			setValueEx(columnDtl_mrkt_judg_flg, idx, false);
			setValueEx(columnDtl_cont_fctr_flg, idx, false);
		}
	}

	@Override
	public void doDtl_lot_no_typ_LC(MCEventInfo info) {
		super.doDtl_lot_no_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.lot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(r.lot_no_typ())) {
			setValueEx(columnDtl_lot_no_ptn_cd, idx, null);
		}
	}

	@Override
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info) {
		super.doDtl_sublot_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 在庫管理区分「在庫管理する」以外で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(r.sublot_mng_typ()) && !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_sublot_mng_typ, idx, MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(r.sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			setValueEx(columnDtl_sublot_no_typ, idx, null);
			
			if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
				setValueEx(columnDtl_not_new_lot_flg, idx, false);
			}
		}
		if (!MAC_LOT_MNG_TYP.isUNIQ(r.lot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isUNIQ(r.sublot_mng_typ())) {
			setValueEx(columnDtl_insp_bind_typ, idx, null);
			setValueEx(columnDtl_mrkt_judg_flg, idx, false);
			setValueEx(columnDtl_cont_fctr_flg, idx, false);
		}
	}

	@Override
	public void doDtl_sublot_no_typ_LC(MCEventInfo info) {
		super.doDtl_sublot_no_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.sublot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(r.sublot_no_typ())) {
			setValueEx(columnDtl_sublot_no_ptn_cd, idx, null);
		}
	}

	@Override
	public void doDtl_mrkt_judg_flg_NC(MCEventInfo info) {
		super.doDtl_mrkt_judg_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.mrkt_judg_flg()) {
			setValueEx(columnDtl_mrkt_judg_role_cd, idx, null);
			setValueEx(columnDtl_mrkt_judg_upd_role_cd, idx, null);
		}
	}

	@Override
	public void doDtl_lmt_ctl_flg_NC(MCEventInfo info) {
		super.doDtl_lmt_ctl_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.lmt_ctl_flg()) {
			setValueEx(columnDtl_lmt_ctl_categ, idx, null);
			setValueEx(columnDtl_ship_lot_back_stop_flg, idx, false);
			setValueEx(columnDtl_ship_valid_grp_cd, idx, null);
		}
	}

	@Override
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info) {
		super.doDtl_cont_fctr_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.cont_fctr_flg()) {
			setValueEx(columnDtl_std_cont_fctr, idx, null);
			setValueEx(columnDtl_cont_fctr_unit_cd, idx, null);
			setValueEx(columnDtl_cont_fctr_rnd_typ, idx, null);
			setValueEx(columnDtl_cont_fctr_dec_place, idx, null);
		}
	}

	@Override
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info) {
		super.doDtl_sno1_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(r.sno1_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())) {
			setValueEx(columnDtl_sno1_mng_typ, idx, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(r.sno1_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
			setValueEx(columnDtl_slo_sno1_flg, idx, false);
			setValueEx(columnDtl_rqmt_sno1_flg, idx, false);
			setValueEx(columnDtl_sno1_num_typ, idx, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
			setValueEx(columnDtl_slo_sno1_flg, idx, true);
			setValueEx(columnDtl_rqmt_sno1_flg, idx, true);
		}
	}

	@Override
	public void doDtl_sno1_num_typ_LC(MCEventInfo info) {
		super.doDtl_sno1_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.sno1_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.sno1_num_typ())) {
			setValueEx(columnDtl_sno1_ptn_cd, idx, null);
		}
	}

	@Override
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info) {
		super.doDtl_sno2_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(r.sno2_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())) {
			setValueEx(columnDtl_sno2_mng_typ, idx, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(r.sno2_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
			setValueEx(columnDtl_slo_sno2_flg, idx, false);
			setValueEx(columnDtl_rqmt_sno2_flg, idx, false);
			setValueEx(columnDtl_sno2_num_typ, idx, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
			setValueEx(columnDtl_slo_sno2_flg, idx, true);
			setValueEx(columnDtl_rqmt_sno2_flg, idx, true);
		}
	}

	@Override
	public void doDtl_sno2_num_typ_LC(MCEventInfo info) {
		super.doDtl_sno2_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.sno2_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.sno2_num_typ())) {
			setValueEx(columnDtl_sno2_ptn_cd, idx, null);
		}
	}

	@Override
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info) {
		super.doDtl_sno3_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(r.sno3_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())) {
			setValueEx(columnDtl_sno3_mng_typ, idx, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(r.sno3_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
			setValueEx(columnDtl_slo_sno3_flg, idx, false);
			setValueEx(columnDtl_rqmt_sno3_flg, idx, false);
			setValueEx(columnDtl_sno3_num_typ, idx, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
			setValueEx(columnDtl_slo_sno3_flg, idx, true);
			setValueEx(columnDtl_rqmt_sno3_flg, idx, true);
		}
	}

	@Override
	public void doDtl_sno3_num_typ_LC(MCEventInfo info) {
		super.doDtl_sno3_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.sno3_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.sno3_num_typ())) {
			setValueEx(columnDtl_sno3_ptn_cd, idx, null);
		}
	}

	@Override
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info) {
		super.doDtl_sno4_mng_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(r.sno4_mng_typ()) && MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())) {
			setValueEx(columnDtl_sno4_mng_typ, idx, MAC_SNO_MNG_TYP.NOT_MNG.value());
			return ;
		}

		if (isNull(r.sno4_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
			setValueEx(columnDtl_slo_sno4_flg, idx, false);
			setValueEx(columnDtl_rqmt_sno4_flg, idx, false);
			setValueEx(columnDtl_sno4_num_typ, idx, null);
		}
		else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
			setValueEx(columnDtl_slo_sno4_flg, idx, true);
			setValueEx(columnDtl_rqmt_sno4_flg, idx, true);
		}
	}

	@Override
	public void doDtl_sno4_num_typ_LC(MCEventInfo info) {
		super.doDtl_sno4_num_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.sno4_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(r.sno4_num_typ())) {
			setValueEx(columnDtl_sno4_ptn_cd, idx, null);
		}
	}

	@Override
	public void doDtl_rqmt_sno1_flg_NC(MCEventInfo info) {
		super.doDtl_rqmt_sno1_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.rqmt_sno1_flg() && MAC_SNO_NO_TYP.isMANUAL(r.sno1_num_typ())) {
			setValueEx(columnDtl_sno1_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_rqmt_sno2_flg_NC(MCEventInfo info) {
		super.doDtl_rqmt_sno2_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.rqmt_sno2_flg() && MAC_SNO_NO_TYP.isMANUAL(r.sno2_num_typ())) {
			setValueEx(columnDtl_sno2_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_rqmt_sno3_flg_NC(MCEventInfo info) {
		super.doDtl_rqmt_sno3_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.rqmt_sno3_flg() && MAC_SNO_NO_TYP.isMANUAL(r.sno3_num_typ())) {
			setValueEx(columnDtl_sno3_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_rqmt_sno4_flg_NC(MCEventInfo info) {
		super.doDtl_rqmt_sno4_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.rqmt_sno4_flg() && MAC_SNO_NO_TYP.isMANUAL(r.sno4_num_typ())) {
			setValueEx(columnDtl_sno4_num_typ, idx, null);
		}
	}

	@Override
	public void doDtl_comp_spec_typ_LC(MCEventInfo info) {
		super.doDtl_comp_spec_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 在庫管理区分「架空品」で固定値が設定された後で、品目区分詳細ＣＤのリストロジックで値がクリアされた場合の対応
		if (isNull(r.comp_spec_typ()) && MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())) {
			setValueEx(columnDtl_comp_spec_typ, idx, MAC_COMP_SPEC_TYP.NO.value());
			return ;
		}

		if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(r.comp_spec_typ())) {
			setValueEx(columnDtl_comp_rev_at_slo_flg, idx, false);
		}
	}

	@Override
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info) {
		super.doDtl_dscnt_itm_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (r.dscnt_itm_flg()) {
			setValueEx(columnDtl_sls_upri_cng_flg, idx, true);
			setValueEx(columnDtl_purc_upri_cng_flg, idx, true);
			setValueEx(columnDtl_exim_xpns_typ, idx, null);
		}
	}

	@Override
	public void doDtl_sls_upri_cng_flg_NC(MCEventInfo info) {
		super.doDtl_sls_upri_cng_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (r.dscnt_itm_flg()) {
			r.sls_upri_cng_flg(true);
		}
	}

	@Override
	public void doDtl_purc_upri_cng_flg_NC(MCEventInfo info) {
		super.doDtl_purc_upri_cng_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (r.dscnt_itm_flg()) {
			r.purc_upri_cng_flg(true);
		}
	}

	@Override
	public void doDtl_minus_stk_flg_NC(MCEventInfo info) {
		super.doDtl_minus_stk_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			r.minus_stk_flg(false);
		}
	}
	
	@Override
	public void doDtl_gi_alloc_flg_NC(MCEventInfo info) {
		super.doDtl_gi_alloc_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			r.gi_alloc_flg(false);
		}
	}
	
	@Override
	public void doDtl_stk_lst_flg_NC(MCEventInfo info) {
		super.doDtl_stk_lst_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			r.stk_lst_flg(false);
		}
	}
	
	@Override
	public void doDtl_prov_upri_cng_flg_NC(MCEventInfo info) {
		super.doDtl_prov_upri_cng_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 品目区分詳細ＣＤによって、間違ったデフォルト値が設定される場合の対応
		if (!MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
			r.prov_upri_cng_flg(false);
		}
	}

	@Override
	public void doDtl_itm_typ_LC(MCEventInfo info) {
		super.doDtl_itm_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		
		if (MAC_ITM_TYP.isPHANTOM(r.itm_typ())){
			if (!(MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ()))){
				setValueEx(columnDtl_stk_mng_typ, idx, MAC_STK_MNG_TYP.PHANTOM.value());
			}
			if (!(MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ()))){
				setValueEx(columnDtl_asset_mng_typ, idx, MAC_ASSET_MNG_TYP.PHANTOM.value());
			}
		}
		else {
			if (MAC_STK_MNG_TYP.isPHANTOM(r.stk_mng_typ())){
				setValueEx(columnDtl_stk_mng_typ, idx, null);
			}
			if (MAC_ASSET_MNG_TYP.isPHANTOM(r.asset_mng_typ())){
				setValueEx(columnDtl_asset_mng_typ, idx, null);
			}
		}
		setValueEx(columnDtl_itm_typ_d_cd, idx, null);
	}

	@Override
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info) {
		super.doDtl_itm_typ_d_cd_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		// 「addIgnoreListBeans」により区分値のみセットされた項目の名称設定
		if (isNull(r.slo_proc_typ())) {
			setValueEx(columnDtl_slo_proc_typ_nm, idx, null);
		}
		else {
			setValueEx(columnDtl_slo_proc_typ_nm, idx, MAC_SLO_PROC_TYP.get(r.slo_proc_typ()).name());
		}
		if (isNull(r.ship_inst_typ())) {
			setValueEx(columnDtl_ship_inst_typ_nm, idx, null);
		}
		else {
			setValueEx(columnDtl_ship_inst_typ_nm, idx, MAC_SHIP_INST_TYP.get(r.ship_inst_typ()).name());
		}
		if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_lot_mng_typ, idx, MAC_LOT_MNG_TYP.NOT_MNG.value());
			setValueEx(columnDtl_sublot_mng_typ, idx, MAC_SUBLOT_MNG_TYP.NOT_MNG.value());
		}
		if (isNull(r.sno1_mng_typ())) {
			setValueEx(columnDtl_sno1_mng_typ_nm, idx, null);
		}
		else {
			setValueEx(columnDtl_sno1_mng_typ_nm, idx,
					MAC_SNO_MNG_TYP.get(r.sno1_mng_typ()).name());
		}
		if (isNull(r.sno2_mng_typ())) {
			setValueEx(columnDtl_sno2_mng_typ_nm, idx, null);
		}
		else {
			setValueEx(columnDtl_sno2_mng_typ_nm, idx,
					MAC_SNO_MNG_TYP.get(r.sno2_mng_typ()).name());
		}
		if (isNull(r.sno3_mng_typ())) {
			setValueEx(columnDtl_sno3_mng_typ_nm, idx, null);
		}
		else {
			setValueEx(columnDtl_sno3_mng_typ_nm, idx,
					MAC_SNO_MNG_TYP.get(r.sno3_mng_typ()).name());
		}
		if (isNull(r.sno4_mng_typ())) {
			setValueEx(columnDtl_sno4_mng_typ_nm, idx, null);
		}
		else {
			setValueEx(columnDtl_sno4_mng_typ_nm, idx,
					MAC_SNO_MNG_TYP.get(r.sno4_mng_typ()).name());
		}
	}
	@Override
	public void doDtl_slo_proc_flg_NC(MCEventInfo info) {
		super.doDtl_slo_proc_flg_NC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.slo_proc_flg()) {
			setValueEx(columnDtl_slo_proc_typ, idx, null);
		}
	}

	@Override
	public void doDtl_slo_proc_typ_LC(MCEventInfo info) {
		super.doDtl_slo_proc_typ_LC(info);
		
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (MAC_SLO_PROC_TYP.isPURC_DDLV(r.slo_proc_typ())) {
			setValueEx(columnDtl_ship_inst_typ, idx, MAC_SHIP_INST_TYP.NON.value());
		}
	}

	@Override
	public void doDtl_arr_skip_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);
		super.doDtl_arr_skip_flg_NC(info);
		if (!r.arr_skip_flg()) {
			setValueEx(columnDtl_purc_dlv_slip_flg, idx, false);
		}
	}
	
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
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR row = (DtlR)table.getBaseTable().getRow(index);
//			if (row.release_flg()) {
//				return MCMode.READ_ONLY;
//			}
			
			if (row.isStatusCreate()) {
				if (column == columnDtl_itm_sub1) {
					if (isEditable(columnDtl_itm_cd,index) && !isNullOrNullVal(row.itm_cd())) {
						return MCMode.ENABLE;
					}
				}
				if (column == columnDtl_itm_sub2) {
					if (!isNullOrNullVal(row.itm_sub1())) {
						return MCMode.ENABLE;
					}
				}
				if (column == columnDtl_itm_sub3) {
					if (!isNullOrNullVal(row.itm_sub2())) {
						return MCMode.ENABLE;
					}
				}
			}
			else {
				if (column == columnDtl_itm_cd && !isNull(row.upd_cntr_c())) {
					return MCMode.READ_ONLY;
				}
			}
			if (isUpdSts()) {

				// 管理者以外は変更不可または条件付変更可能項目
				if (getStatus().equals(getUPDStatus()) && !isNull(row.upd_cntr())) {
					if (column == columnDtl_unit_cd
							|| column == columnDtl_dec_place
							|| column == columnDtl_rnd_typ
							|| column == columnDtl_dscnt_itm_flg
							|| column == columnDtl_pack_alloc_flg
							|| column == columnDtl_cont_fctr_flg
							|| column == columnDtl_cont_fctr_unit_cd
							|| column == columnDtl_cont_fctr_dec_place
							|| column == columnDtl_cont_fctr_rnd_typ) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_stk_mng_typ && (MAC_STK_MNG_TYP.isMNG(row.org_stk_mng_typ()) || row.dscnt_itm_flg())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_asset_mng_typ && (MAC_ASSET_MNG_TYP.isMNG(row.org_asset_mng_typ()) || row.dscnt_itm_flg())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_lot_mng_typ && !MAC_LOT_MNG_TYP.isNOT_MNG(row.org_lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_sublot_mng_typ && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(row.org_sublot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_sundry_itm_flg &&
						(((!((_snoTyp > 0 && MAC_SNO_MNG_TYP.isNOT_MNG(row.sno1_mng_typ()))
								|| (_snoTyp > 1 && MAC_SNO_MNG_TYP.isNOT_MNG(row.sno2_mng_typ()))
								|| (_snoTyp > 2 && MAC_SNO_MNG_TYP.isNOT_MNG(row.sno3_mng_typ()))
								|| (_snoTyp > 3 && MAC_SNO_MNG_TYP.isNOT_MNG(row.sno4_mng_typ())))
							&& !((_snoTyp > 0 && MAC_SNO_MNG_TYP.isMNG_REQ(row.sno1_mng_typ()))
								|| (_snoTyp > 1 && MAC_SNO_MNG_TYP.isMNG_REQ(row.sno2_mng_typ()))
								|| (_snoTyp > 2 && MAC_SNO_MNG_TYP.isMNG_REQ(row.sno3_mng_typ()))
								|| (_snoTyp > 3 && MAC_SNO_MNG_TYP.isMNG_REQ(row.sno4_mng_typ())))
							&& !((_snoTyp > 0 && isNull(row.sno1_mng_typ()))
								|| (_snoTyp > 1 && isNull(row.sno2_mng_typ()))
								|| (_snoTyp > 2 && isNull(row.sno3_mng_typ()))
								|| (_snoTyp > 3 && isNull(row.sno4_mng_typ()))))
							&& MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) && !row.sundry_itm_flg())) {
						return MCMode.READ_ONLY;
					}
					if ((column == columnDtl_itm_typ || column == columnDtl_itm_typ_d_cd) &&
							(!MAC_STK_MNG_TYP.isPHANTOM(row.org_stk_mng_typ()) && !MAC_STK_MNG_TYP.isPHANTOM(row.stk_mng_typ()))) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_sno1_mng_typ && !MAC_SNO_MNG_TYP.isNOT_MNG(row.org_sno1_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_sno2_mng_typ && !MAC_SNO_MNG_TYP.isNOT_MNG(row.org_sno2_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_sno3_mng_typ && !MAC_SNO_MNG_TYP.isNOT_MNG(row.org_sno3_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_sno4_mng_typ && !MAC_SNO_MNG_TYP.isNOT_MNG(row.org_sno4_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_comp_spec_typ && !MAC_COMP_SPEC_TYP.isNO(row.org_comp_spec_typ())) {
						return MCMode.READ_ONLY;
					}
				}


				if (column == columnDtl_sundry_itm_flg) {
					if (MAC_STK_MNG_TYP.isPHANTOM(row.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_dscnt_itm_flg) {
					if (!MAC_STK_MNG_TYP.isNOT_MNG(row.stk_mng_typ()) || !MAC_ASSET_MNG_TYP.isNOT_MNG(row.asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_dim) {
					if (isNull(row.dim_unit_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_wt) {
					if (isNull(row.wt_unit_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_conts_qty) {
					if (isNull(row.conts_unit_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_jan_cd) {
					if (isNull(row.jan_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_typ) {
					if (isNull(row.stk_mng_typ()) || isNull(row.asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_itm_typ_d_cd) {
					if (isNull(row.itm_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_minus_stk_flg 
					  || column == columnDtl_gi_alloc_flg
					  || column == columnDtl_lot_mng_typ
					  || column == columnDtl_sublot_mng_typ
					  || column == columnDtl_stk_lst_flg) {
					if (!MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					if (column == columnDtl_sublot_mng_typ) {
						if (isNull(row.lot_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				}
				else if (column == columnDtl_not_new_lot_flg) {
					if ((isNull(row.lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(row.lot_mng_typ()))
							&& (isNull(row.sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(row.sublot_mng_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ver_flg || column == columnDtl_lmt_ctl_flg) {
					if(isNull(row.lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(row.lot_mng_typ())) {
							return MCMode.READ_ONLY;
						}
					}
				else if (column == columnDtl_lot_no_typ) {
					if(isNull(row.lot_mng_typ()) || MAC_LOT_MNG_TYP.isNOT_MNG(row.lot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				else if (column == columnDtl_lot_no_ptn_cd) {
					if(isNull(row.lot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(row.lot_no_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sublot_no_typ) {
					if(isNull(row.sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isNOT_MNG(row.sublot_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				else if (column == columnDtl_sublot_no_ptn_cd) {
					if(isNull(row.sublot_no_typ()) || MAC_LOT_NO_TYP.isMANUAL(row.sublot_no_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_insp_bind_typ 
						|| column == columnDtl_mrkt_judg_flg
						|| column == columnDtl_cont_fctr_flg) {
					if ((isNull(row.lot_mng_typ()) || !MAC_LOT_MNG_TYP.isUNIQ(row.lot_mng_typ())) 
							&& (isNull(row.sublot_mng_typ()) || !MAC_SUBLOT_MNG_TYP.isUNIQ(row.sublot_mng_typ()))) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_mrkt_judg_role_cd 
					  || column == columnDtl_mrkt_judg_upd_role_cd) {
					if (!row.mrkt_judg_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_lmt_ctl_categ
					  || column == columnDtl_ship_lot_back_stop_flg
					  || column == columnDtl_ship_valid_grp_cd) {
					if (!row.lmt_ctl_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_std_cont_fctr 
					  || column == columnDtl_cont_fctr_unit_cd
					  || column == columnDtl_cont_fctr_rnd_typ 
					  || column == columnDtl_cont_fctr_dec_place) {
					if (!row.cont_fctr_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_slo_sno1_flg
						|| column == columnDtl_rqmt_sno1_flg) {
					if (isNull(row.sno1_mng_typ())
							|| MAC_SNO_MNG_TYP.isNOT_MNG(row.sno1_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(row.sno1_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno1_num_typ) {
					if (isNull(row.sno1_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(row.sno1_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				else if (column == columnDtl_sno1_ptn_cd) {
					if (isNull(row.sno1_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(row.sno1_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_slo_sno2_flg
						|| column == columnDtl_rqmt_sno2_flg) {
					if (isNull(row.sno2_mng_typ())
							|| MAC_SNO_MNG_TYP.isNOT_MNG(row.sno2_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(row.sno2_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno2_num_typ) {
					if (isNull(row.sno2_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(row.sno2_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				else if (column == columnDtl_sno2_ptn_cd) {
					if (isNull(row.sno2_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(row.sno2_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_slo_sno3_flg
						|| column == columnDtl_rqmt_sno3_flg) {
					if (isNull(row.sno3_mng_typ())
							|| MAC_SNO_MNG_TYP.isNOT_MNG(row.sno3_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(row.sno3_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno3_num_typ) {
					if (isNull(row.sno3_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(row.sno3_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				else if (column == columnDtl_sno3_ptn_cd) {
					if (isNull(row.sno3_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(row.sno3_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_slo_sno4_flg
						|| column == columnDtl_rqmt_sno4_flg) {
					if (isNull(row.sno4_mng_typ())
							|| MAC_SNO_MNG_TYP.isNOT_MNG(row.sno4_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_REQ(row.sno4_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sno4_num_typ) {
					if (isNull(row.sno4_mng_typ()) || MAC_SNO_MNG_TYP.isNOT_MNG(row.sno4_mng_typ())) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				else if (column == columnDtl_sno4_ptn_cd) {
					if (isNull(row.sno4_num_typ()) || MAC_SNO_NO_TYP.isMANUAL(row.sno4_num_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_comp_rev_at_slo_flg) {
					if (!MAC_COMP_SPEC_TYP.isCOMP_SPEC(row.comp_spec_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_arr_skip_flg) {
					if (MAC_STK_MNG_TYP.isMNG(row.stk_mng_typ()) && !row.arr_skip_flg()) {
						return MCMode.READ_ONLY;
					}
				}

				if (column == columnDtl_purc_dlv_slip_flg) {
					if (!row.arr_skip_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_exim_xpns_typ) {
					if (!MAC_STK_MNG_TYP.isNOT_MNG(row.stk_mng_typ()) || row.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_slo_proc_typ) {
					if (!row.slo_proc_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_ship_inst_typ) {
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(row.slo_proc_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_sls_upri_cng_flg 
					  || column == columnDtl_purc_upri_cng_flg) {
					if (row.dscnt_itm_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column == columnDtl_prov_upri_cng_flg) {
					if (!MAC_ASSET_MNG_TYP.isMNG(row.asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (getPhantomGrpCols().contains(column) && MAC_ITM_TYP.isPHANTOM(row.itm_typ())) {
					return MCMode.READ_ONLY;
				}
				if (getItmTypDGrpCols().contains(column) && isNull(row.itm_typ_d_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}
	protected List<MCColumnConfig> _itmTypDGrp;
	protected List<MCColumnConfig> getItmTypDGrpCols() {
		if (_itmTypDGrp == null) {
			_itmTypDGrp = getGroupCol(DtlTable, _INPT_CTL, _ITM_TYP_D_CD);
		}
		return _itmTypDGrp;
	}
	protected List<MCColumnConfig> _phantomGrp;
	protected List<MCColumnConfig> getPhantomGrpCols() {
		if (_phantomGrp == null) {
			_phantomGrp = getGroupCol(DtlTable, _INPT_CTL, _PHANTOM);
		}
		return _phantomGrp;
	}

	//--------------------リストロジック表示制御Start-----------------------
		@Override
		public MCList getDtl_asset_mng_typ(MCRow row, MCEventInfo info) {
			addListLogicCnd(row, getAssetMngTyp(info));
			return super.getDtl_asset_mng_typ(row, info);
		}
		/**
		 * 表示する資産管理区分を取得する
		 */
		protected MAC_ASSET_MNG_TYP[] getAssetMngTyp(MCEventInfo info) {
			DtlR dtlR = getDtlL().get(info.getEventIndex());
			if (MAC_STK_MNG_TYP.isPHANTOM(dtlR.stk_mng_typ())) {
				return new MAC_ASSET_MNG_TYP[] { MAC_ASSET_MNG_TYP.PHANTOM };
			}
			if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ()) || MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
				return new MAC_ASSET_MNG_TYP[] { MAC_ASSET_MNG_TYP.MNG,  MAC_ASSET_MNG_TYP.NOT_MNG};
			}
			return MAC_ASSET_MNG_TYP.array();
		}

		@Override
		public MCList getDtl_itm_typ(MCRow row, MCEventInfo info) {
			addListLogicCnd(row, getItmTyp(info));
			return super.getDtl_itm_typ(row, info);
		}
		/**
		 * 表示する品目区分を取得する
		 */
		protected MAC_ITM_TYP[] getItmTyp(MCEventInfo info) {
			DtlR dtlR = getDtlL().get(info.getEventIndex());
			if (MAC_STK_MNG_TYP.isPHANTOM(dtlR.stk_mng_typ())) {
				return new MAC_ITM_TYP[] { MAC_ITM_TYP.PHANTOM };
			}
			if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ()) || MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
				return MCCollectionUtil.remove(MAC_ITM_TYP.array(), new MAC_ITM_TYP[0], MAC_ITM_TYP.PHANTOM);
			}
			return MAC_ITM_TYP.array();
		}

	@Override
	public MCList getDtl_sublot_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSublotMngTyp(info));
		return super.getDtl_sublot_mng_typ(row, info);
	}
	/**
	 * 表示するサブロット管理区分を取得する
	 */
	protected MAC_SUBLOT_MNG_TYP[] getSublotMngTyp(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ())) {
			return new MAC_SUBLOT_MNG_TYP[] { MAC_SUBLOT_MNG_TYP.NOT_MNG, MAC_SUBLOT_MNG_TYP.STK };
		}
		return MAC_SUBLOT_MNG_TYP.array();
	}

	@Override
	public MCList getDtl_sno1_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$rqmt_sno1_flg));
		return super.getDtl_sno1_num_typ(row, info);
	}
	@Override
	public MCList getDtl_sno2_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$rqmt_sno2_flg));
		return super.getDtl_sno2_num_typ(row, info);
	}
	@Override
	public MCList getDtl_sno3_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$rqmt_sno3_flg));
		return super.getDtl_sno3_num_typ(row, info);
	}
	@Override
	public MCList getDtl_sno4_num_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoNumTyp(info, DtlR.$rqmt_sno4_flg));
		return super.getDtl_sno4_num_typ(row, info);
	}
	/**
	 * 表示する手配ＮＯ発番区分を取得する
	 */
	protected MAC_SNO_NO_TYP[] getSnoNumTyp(MCEventInfo info, String rqmtSnoFlgCol) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (dtlR.getBooleanNE(rqmtSnoFlgCol)) {
			return new MAC_SNO_NO_TYP[] { MAC_SNO_NO_TYP.AUTO, MAC_SNO_NO_TYP.AUTO_MANU };
		}
		return MAC_SNO_NO_TYP.array();
	}

	@Override
	public MCList getDtl_slo_proc_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSloProcTyp(info));
		return super.getDtl_slo_proc_typ(row, info);
	}
	/**
	 * 表示する受注手配区分を取得する
	 */
	protected MAC_SLO_PROC_TYP[] getSloProcTyp(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (MAC_STK_MNG_TYP.isNOT_MNG(dtlR.stk_mng_typ())) {
			return new MAC_SLO_PROC_TYP[] { MAC_SLO_PROC_TYP.PURC_DDLV };
		}
		return MAC_SLO_PROC_TYP.array();
	}

	@Override
	public MCList getDtl_ship_inst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getShipInstTyp(info));
		return super.getDtl_ship_inst_typ(row, info);
	}
	/**
	 * 表示する出荷指図区分を取得する
	 */
	protected MAC_SHIP_INST_TYP[] getShipInstTyp(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
			return new MAC_SHIP_INST_TYP[] { MAC_SHIP_INST_TYP.PICK, MAC_SHIP_INST_TYP.NON };
		}
		return MAC_SHIP_INST_TYP.array();
	}

	@Override
	public MCList getDtl_sno1_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getDtl_sno1_mng_typ(row, info);
	}
	@Override
	public MCList getDtl_sno2_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getDtl_sno2_mng_typ(row, info);
	}
	@Override
	public MCList getDtl_sno3_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getDtl_sno3_mng_typ(row, info);
	}
	@Override
	public MCList getDtl_sno4_mng_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getSnoMngTyp(info));
		return super.getDtl_sno4_mng_typ(row, info);
	}
	/**
	 * 表示する手配ＮＯ管理区分を取得する
	 */
	protected MAC_SNO_MNG_TYP[] getSnoMngTyp(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ()) && dtlR.sundry_itm_flg()) {
			return MCCollectionUtil.remove(MAC_SNO_MNG_TYP.array(),
					new MAC_SNO_MNG_TYP[0], MAC_SNO_MNG_TYP.MNG_NOT_STK);
		}
		return MAC_SNO_MNG_TYP.array();
	}

	//--------------------リストロジック表示制御End-----------------------

}