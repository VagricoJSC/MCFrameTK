package mcframe.clientMSBB.MSBBP1380;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMSUC.MSUCP0060.MSUCP_ArUtil;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMSUC.MSUCP0080.MSUCP_SlsUtil;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.beans.list.*;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.LotNoCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsDscntReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsDscntReg_MC extends MSBBP_SlsDscntReg_MC_A implements IfOpePanel, IfRowMoveBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsDscntReg_MC() {
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
	public MSBBP_SlsDscntReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1380_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Srch01Caller<P extends MSBBP_SlsDscntReg, B extends MS_MSBBL1380_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1380_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			// 計上日を取消計上日にコピー
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());
			
			for (DtlR dtlR : bridge.down1()) {
				if (!isNull(dtlR.ref_sls_act_no())) {
					// 売上実績を引き継いだ際に、為替レートを取り直さないため、参照ＮＯを設定する。
					bridge.down0().ref_no(dtlR.ref_sls_act_no());
					break;
				}
			}
			setDest(bridge.down0(), bridge.down1());
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		@Override
		protected void show() {
			super.show();
			setHdrAmt();
			setHdrIncTaxAmt();
		}
	}
	/**
	 * 仕向先１～３設定
	 * 
	 * @param hdrR ヘッダレコード
	 * @param dtlL 明細リスト
	 */
	protected void setDest(HdrR hdrR, MCList<DtlR> dtlL) {
		DtlR dest01R = getCopyR(dtlL, DtlR.$dest_cd1, DtlR.$dest_nm1);
		if (!isNull(dest01R)) {
			hdrR.dest_cd1(dest01R.dest_cd1());
			hdrR.dest_nm1(dest01R.dest_nm1());
		}

		DtlR dest02R = getCopyR(dtlL, DtlR.$dest_cd2, DtlR.$dest_nm2);
		if (!isNull(dest02R) && !isNull(hdrR.dest_cd1())) {
			hdrR.dest_cd2(dest02R.dest_cd2());
			hdrR.dest_nm2(dest02R.dest_nm2());
		}

		DtlR dest03R = getCopyR(dtlL, DtlR.$dest_cd3, DtlR.$dest_nm3);
		if (!isNull(dest03R) && !isNull(hdrR.dest_cd2())) {
			hdrR.dest_cd3(dest03R.dest_cd3());
			hdrR.dest_nm3(dest03R.dest_nm3());
		}
	}

	/**
	 * コピー行取得
	 * 
	 * @param srcL 明細リスト
	 * @param tgtColNm 対象項目名
	 * @return コピー文字列
	 */
	protected DtlR getCopyR(MCList<DtlR> srcL, String... tgtColNm) {
		DtlR result = null;

		MCList<DtlR> grpL = srcL.groupBy(tgtColNm);
		if (grpL.size() == 1) {
			result = grpL.get(0);
		}

		return result;
	}

	/**
	 * [MS_MSBBL1380_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Srch02Caller<P extends MSBBP_SlsDscntReg, B extends MS_MSBBL1380_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1380_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setINS_REFStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down1().setStatus(Status.CREATE);
			
			for (DtlR dtlR : bridge.down1()) {
				if (!isNull(dtlR.ref_sls_act_no())) {
					// 売上実績を引き継いだ際に、為替レートを取り直さないため、参照ＮＯを設定する。
					bridge.down0().ref_no(dtlR.ref_sls_act_no());
					break;
				}
			}
			setDest(bridge.down0(), bridge.down1());
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}
		@Override
		protected void show() {
			super.show();
			setHdrAmt();
			setHdrIncTaxAmt();
		}
	}

	/**
	 * [MS_MSBBL1380_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Ins01Caller<P extends MSBBP_SlsDscntReg, B extends MS_MSBBL1380_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1380_Ins01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBBL1380_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Upd01Caller<P extends MSBBP_SlsDscntReg, B extends MS_MSBBL1380_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL1380_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
	}

	/**
	 * [MS_MSBBL1380_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Del01Caller<P extends MSBBP_SlsDscntReg, B extends MS_MSBBL1380_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL1380_Del01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(true);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}

	/**
	 * [MS_MSBBL1380_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Prnt01Caller<P extends MSBBP_SlsDscntReg, B extends MS_MSBBL1380_Prnt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1380_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_sls_dscnt]の押下時の処理
	 */
	@Override
	public void doCnd_srch_sls_dscnt(MCEventInfo info) {
		callMS_MSBBL1380_Srch01();
	}

	/**
	 * Panel[Cnd]のボタン[srch_sls]の押下時の処理
	 */
	@Override
	public void doCnd_srch_sls(MCEventInfo info) {
		callMS_MSBBL1380_Srch02();
	}

	/**
	 * Panel[Btn]のボタン[prnt01]の押下時の処理
	 */
	@Override
	public void doBtn_prnt01(MCEventInfo info) {
		callMS_MSBBL1380_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
		setHdrAmt();
		setHdrIncTaxAmt();
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
		setHdrAmt();
		setHdrIncTaxAmt();
	}

	/**
	 * Panel[Btn]のボタン[ins01]の押下時の処理
	 */
	@Override
	public void doBtn_ins01(MCEventInfo info) {
		callMS_MSBBL1380_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd01]の押下時の処理
	 */
	@Override
	public void doBtn_upd01(MCEventInfo info) {
		callMS_MSBBL1380_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del01]の押下時の処理
	 */
	@Override
	public void doBtn_del01(MCEventInfo info) {
		callMS_MSBBL1380_Del01();
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_sls_dt);
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_sls_dt, true, null, Hdr_ref_no);
		Hdr_ptax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd, Hdr_xrate_cd, Hdr_sls_dt, true, null, Hdr_ref_no);
		Hdr_cred_bal_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		
		// 明細		
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg, columnDtl_stk_mng_typ);
		
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2,columnDtl_itm_sub3, columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ, 
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty,
				columnDtl_base_unit_cd);
		
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		
		Dtl_trd_cur_upri_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_cst_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, 
				columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place, 
				Hdr_sls_amt_rnd_typ, Hdr_sls_tax_rnd_typ, null, null, columnDtl_dscnt_itm_flg);
		Dtl_trd_cur_upri_amt_p_PPanel.setAmtToUpri(true);
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_xrate);
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_inc_tax_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt, Hdr_ptax_xrate);
		
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_sno1_mng_typ,
				columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1,
				columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_lot_mng_typ, columnDtl_sublot_mng_typ);
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Dtl_ref_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_ref_trd_unit_dec_place);
		Dtl_ref_trd_cur_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd,
				Hdr_trd_cur_upri_dec_place);
		Dtl_ref_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd,
				Hdr_trd_cur_amt_dec_place);
		Dtl_ref_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_upri_dec_place);
		Dtl_ref_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,
				Hdr_base_cur_amt_dec_place);
		Dtl_ref_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_upri_dec_place);
		Dtl_ref_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,
				Hdr_ptax_cur_amt_dec_place);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setDefaultSrcTgtTyp();
		insInit();

	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {

		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl_cst_itm_cd) {
			// 入力補助画面の参照項目を一時カラムとして追加する
			// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
			bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			bind.setDateNE(CstItmCols.$i_dt, getHdrR().sls_dt());
		}

		return row;
	}

	@Override
	public void openISPanel(MCLinkBeans beans, int i) {
		if (columnDtl_cst_itm_cd == beans) {
			ISPanelLinker ret = getISPanelLinkerNE(beans);
			if (ret != null && ret.isEnable()) {
				MCMessageList msgList = new MCMessageList();
				chkOpenMSUAP1140Req(msgList);

				if (!msgList.isEmpty()) {

					message(msgList);
					return;
				}
				super.openISPanel(beans, i);
			}
		}
		else {
			super.openISPanel(beans, i);
		}
	}

	/**
	 * 得意先品目入力補助画面の必須チェックを行う。
	 * @param msgList メッセージリスト
	 * @param i 対象行のインデックス
	 */
	protected void chkOpenMSUAP1140Req(MCMessageList msgList) {
		msgList.addAll(checkReq(Hdr_cst_cd));
		msgList.addAll(checkReq(Hdr_sls_dt));
	}

	protected class CstItmListPutter extends MCListPutter {

		public CstItmListPutter(MCLinkBeans compo, String[] columns) {
			super(compo, columns);
		}

		public MCMessageList setValues(int index, MCRow row) {
			MCLinkBeans compo = getLinkBeans();

			MCRow setRow = createPanelRow(compo, index,
					isNull(row) ? MCRow.create() : row);
			DtlR selectRow = DtlTable.getRow(index);

			if (!isNull(setRow.getStringNE("itm_cd"))) {
				return compo.setValues(index, setRow);
			}

			setRow.setStringNE("itm_cd", selectRow.itm_cd());
			setRow.setStringNE("itm_sub1", selectRow.itm_sub1());
			setRow.setStringNE("itm_sub2", selectRow.itm_sub2());
			setRow.setStringNE("itm_sub3", selectRow.itm_sub3());

			return compo.setValues(index, setRow);
		}
	}

	@Override
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo,
			String... columns) {
		MCListPutter lp = new CstItmListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}

	@Override
	protected void listInit() {
		super.listInit();
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
	}
	
	@Override
	protected void opePanelFillSpace() {
		
		if (!isAprv()) {
			super.opePanelFillSpace();
		}
	}

		@Override
		public MCBeans getAcDtBeans(MCRootPanel panel) {
			return Hdr_ac_dt;
		}

		@Override
		public MCBeans getScreenOpeBeans(MCRootPanel panel) {
			return Cnd_ope_Group;
		}

		@Override
		public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
			if (Cnd_ope_UPD.isSelected() || (Cnd_ope_DEL.isSelected())) {
				return true;
			}
			return false;
		}

		@Override
		public MCBeans getCheckBeans(MCRootPanel panel) {
			return null;
		}
	// 検索種別リストロジックの作成

	public MSC_SLS_SRCH_TGT_TYP[] getDispSlsSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.REF_SLS_ACT_NO
			};

		}
		else {
			return new MSC_SLS_SRCH_TGT_TYP[] {
				MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO
			};
		}
	}

	@Override
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(row, getDispSlsSrchTgtTyp());
		}
		else {
			addListLogicCnd(row, getDispSlsSrchTgtTyp());
		}
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	protected void setDefaultSrcTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.REF_SLS_ACT_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.REF_SLS_ACT_NO.name());
		}
		else {
			getCndR().srch_tgt_typ(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SLS_ACT_NO.name());
			if (!Cnd_ope_REF.isSelected()) {
				Cnd_latest_flg.setMode(MCMode.READ_ONLY);
				Cnd_srch_tgt_rev.setMode(MCMode.READ_ONLY);
			}
		}
	}
	
	@Override
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		row.setDateNE(CstItmCols.$i_dt, getHdrR().sls_dt());

		return super.getDtl_cst_itm_cd(row, info);
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		setDefaultSrcTgtTyp();
	}
	
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する	
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().srch_tgt_no(getHdrR().sls_act_no());
		}
	}
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		if (!super.doCnd_ope_VC(info)) {
			return false;
		}
		
		String beforeOpe = (String)info.getOldValue();
		String afterOpe = (String)info.getNewValue();
		String beforMode = getStatus();
		
		if ((isREFOpe(beforeOpe) && isREFStatus(beforMode)) && (isUPDOpe(afterOpe) || isDELOpe(afterOpe))) {
			if (!Hdr_latest_flg.getValue()) {
				dialog(msgPastRevisionCannotChanged());
				return false;
			}
		}
		
		return true;
	}

	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getHdrR());
		ret.add(getDtlL());

		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getCndR());

		return ret;
	}

	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	public MCRowBeans getCndRevNo() {
		return Cnd_srch_tgt_rev;
	}

	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setRevNoMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		setPrntBtnMode();
		setIvItmNmDispCtrl();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		
		setIvItmNmDispCtrl();
		setAprvRetFlgMode();
		setBtnMode();
		setPrntOutFlg();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setIvItmNmDispCtrl();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setIvItmNmDispCtrl();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		insInit();
		setXrateCtrl();
		setCstIvFlgCtrl();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		setIvItmNmDispCtrl();
		setDestCdMode();
		setPrntOutFlg();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setINS_REFStatus() {
		super.setINS_REFStatus();
		insInit();
		setCstIvFlgCtrl();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		setIvItmNmDispCtrl();
		setDestCdMode();
		setPrntOutFlg();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setIvItmNmDispCtrl();
		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		setDefaultSrcTgtTyp();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		setXrateCtrl();
		setCstIvFlgCtrl();
		setModeRcvSchdDt();
		setModeBillBasisDt();
		setIvItmNmDispCtrl();
		lockForAprvSts();
		setAprvRetFlgMode();
		setBtnMode();
		setDestCdMode();
		setPrntOutFlg();
		HdrPanel.focusFirstComponent();
	}

	/**
	 * 	インボイス取引ＦＬＧによる入力制御
	 * 	<p>
	 * 	I/V No, 対応 I/V No, 自動ＦＬＧは得意先インボイス取引ＦＬＧがオンの場合のみ入力可とする
	 * 	</p>
	 */
	protected void setCstIvFlgCtrl() {

		if (!isNull(getHdrR().cst_cd()) && getHdrR().cst_iv_flg()) {
			
			Hdr_num_flg.setMode(MCMode.ENABLE);
			Hdr_ref_iv_no.setMode(MCMode.ENABLE);
			
			if (getHdrR().num_flg()) {
				Hdr_iv_no.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_iv_no.setMode(MCMode.REQUIRED);
			}
		}
		else {
			
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_ref_iv_no.setMode(MCMode.READ_ONLY);
			Hdr_num_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 入金予定日のモードを設定する。
	 */
	protected void setModeRcvSchdDt() {
		
		if (getHdrR().cst_iv_flg() && MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			setDefaultMode(Hdr_rcv_schd_dt);
		}
		else {
			Hdr_rcv_schd_dt.setMode(MCMode.READ_ONLY);
		}
	}
	
	/**
	 * 請求起算日のモードを設定する。
	 */
	protected void setModeBillBasisDt() {
		
		if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			Hdr_bill_basis_dt.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_bill_basis_dt);
		}
	}
	
	/**
	 * 請求締処理区分が売上都度請求の場合に、請求起算日をクリアする。
	 */
	protected void setBillBasisDt() {
		
		if (MAC_BILL_CL_TYP.isEACH_SLS(getHdrR().bill_cl_typ())) {
			Hdr_bill_basis_dt.clear();
		}
		else {
			if (isNull(getHdrR().bill_basis_dt())) {
				getHdrR().bill_basis_dt(getToday());
			}
		}
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_dt, Hdr_sls_dt);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_cst_cd);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_cst_nm);
	}
	
	@Override
	protected void openISPanelSub(MCRootPanel inputSupportPanel, MCRow bind, MCListPutter putter, int idx) {
		
		if (columnDtl_lot_no == putter.getLinkBeans()) {
			setDtlLotNoBind(bind, idx);
		}
		super.openISPanelSub(inputSupportPanel, bind, putter, idx);
	}
	
	/**
	 * 明細枠のロットＮＯの引数設定
	 * 
	 * @param bind
	 * @param idx
	 */
	protected void setDtlLotNoBind(MCRow bind, int idx) {
		
		bind.addBooleanColumn(LotNoCols.$i_srch_no_stk_and_io_flg, true);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		Hdr_sls_dpt_cd.addLCListener(this);
		Hdr_ac_dt.addLCListener(this);

		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_trd_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addLCListener(this);
		columnDtl_trd_unit_qty.addLCListener(this);
		columnDtl_base_cur_amt.addLCListener(this);
		
		setListListener(DtlTable, getDtlRowListener());
	}
	
	protected DtlRowListener getDtlRowListener() {
		return new DtlRowListener();
	}

	protected class DtlRowListener implements MCRowListener, MCRowStatusListener {
		// valueChangeメソッドはLCイベント前に呼び出されるため、基準単位数などが変更前の値でコピーされてしまうので
		@Override
		@Deprecated
		public void valueChanged(MCRowEvent event) {
			
		}
		
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR r = (DtlR) event.getSourceRow();
				copyHdrToDtl(r);
			}
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_sls_dpt_cd) {
			doHdr_sls_dpt_cd_LC(info);
		}
		if (lc == Hdr_ac_dt) {
			doHdr_ac_dt_LC(info);
		}
		if (Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_LC(info);
		}
		if (lc == columnDtl_trd_cur_amt) {
			doDtl_trd_cur_amt_LC(info);
		}
		if (lc == columnDtl_base_cur_amt) {
			doDtl_base_cur_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_tax_amt) {
			doDtl_trd_cur_tax_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_inc_tax_amt) {
			doDtl_trd_cur_inc_tax_amt_LC(info);
		}
		if (lc == columnDtl_trd_unit_qty) {
			doDtl_trd_unit_qty_LC(info);
		}
	}

	
	/**
	 * 参照売上実績情報をクリアする
	 * @param index
	 */
	protected void clearRefSlsActInfo(int index) {
		
		setValueEx(columnDtl_ref_sls_act_no, index, null);
		setValueEx(columnDtl_ref_sls_act_seq, index, null);
		setValueEx(columnDtl_ref_sls_act_rev, index, null);
		setValueEx(columnDtl_ref_sls_act_d_no, index, null);
		setValueEx(columnDtl_ref_sls_act_d_seq, index, null);
		setValueEx(columnDtl_ref_ac_dt, index, null);
		setValueEx(columnDtl_ref_trd_unit_qty, index, null);
		setValueEx(columnDtl_ref_trd_unit_cd, index, null);
		setValueEx(columnDtl_ref_trd_unit_nm, index, null);
		setValueEx(columnDtl_ref_trd_cur_upri, index, null);
		setValueEx(columnDtl_ref_trd_cur_amt, index, null);
		setValueEx(columnDtl_ref_trd_cur_inc_tax_amt, index, null);
		setValueEx(columnDtl_ref_tax_cd, index, null);
		setValueEx(columnDtl_ref_tax_nm, index, null);
		setValueEx(columnDtl_ref_tax_rate, index, null);
		setValueEx(columnDtl_ref_trd_cur_tax_amt, index, null);
		setValueEx(columnDtl_ref_base_cur_upri, index, null);
		setValueEx(columnDtl_ref_base_cur_amt, index, null);
		setValueEx(columnDtl_ref_base_cur_inc_tax_amt, index, null);
		setValueEx(columnDtl_ref_base_cur_tax_amt, index, null);
		setValueEx(columnDtl_ref_ptax_cur_upri, index, null);
		setValueEx(columnDtl_ref_ptax_cur_amt, index, null);
		setValueEx(columnDtl_ref_ptax_cur_inc_tax_amt, index, null);
		setValueEx(columnDtl_ref_ptax_cur_tax_amt, index, null);
	}

	@Override
	public void doHdr_aprv_ret_flg_NC(MCEventInfo info) {
		super.doHdr_aprv_ret_flg_NC(info);
		
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
	}
	
	/**
	 * 承認引戻しの表示モードを設定する。
	 */
	protected void setAprvRetFlgMode() {
		
		if (isAprv() 
				&& ((Cnd_ope_UPD.isSelected() && getHdrR().aprv_upd_flg())
						|| (Cnd_ope_DEL.isSelected() && getHdrR().aprv_can_flg()))) {
			
			Hdr_aprv_ret_flg.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Hdr_aprv_ret_flg);
		}
	}
	
	/**
	 * 承認済みかどうか。
	 * @return 一次承認済または最終承認済 かつ 承認引戻がオフの場合はtrue
	 */
	protected boolean isAprv() {
		
		return !getHdrR().aprv_ret_flg() && 
				(MAC_APRV_STS_TYP.isFIX(getHdrR().aprv_sts_typ()) 
						|| MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ()));
	}
	
	/**
	 * 最終承認済みかどうか。
	 * @return 最終承認済 かつ 承認引戻がオフの場合はtrue
	 */
	protected boolean isAcptAprv() {
		
		return !getHdrR().aprv_flg() || MAC_APRV_STS_TYP.isACPT(getHdrR().aprv_sts_typ());
	}

	/**
	 * 為替レート、納税為替レートの入力制御
	 * <p>
	 * 	為替レートは取引通貨と基準通貨が異なる場合のみ入力可<br>
	 * 	納税為替レートは取引通貨と納税通貨が異なる場合のみ入力可
	 * </p>
	 */
	protected void setXrateCtrl() {

	}

	/**
	 * 	インボイス表記品名の表示制御
	 * 	<p>
	 * 	一覧のＩ／Ｖ表記品名はインボイス取引対象の得意先の場合のみ表示
	 * 	</p>
	 */
	protected void setIvItmNmDispCtrl() {

		if (!isNull(getHdrR().cst_cd()) && getHdrR().cst_iv_flg()) {
			setDefaultMode(columnDtl_iv_itm_nm);
		}
		else {
			columnDtl_iv_itm_nm.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 承認状況による画面項目制御
	 * 	<p>
	 * 	承認状況が一次承認済もしくは最終承認済の場合は、備考項目のみが入力可能となり<br>
	 * 	（承認対象の判断となる項目の変更は不可）、行追加・行削除ボタンは押下できない。		
	 * 	</p>
	 */
	protected void lockForAprvSts() {

		if (isAprv()) {

			setFix(HdrPanel, DtlPanel);
			Dtl_itm_p_PPanel.setREAD_ONLYStatus();
			Dtl_sno_wrk_no_p_PPanel.setREAD_ONLYStatus();
			Dtl_lot_no_p_PPanel.setREAD_ONLYStatus();

			setDefaultMode(Hdr_intr_rmrks);
			setDefaultMode(Hdr_sub_char1);
			setDefaultMode(Hdr_sub_char2);
			setDefaultMode(Hdr_sub_char3);

			setDefaultMode(columnDtl_sub_char1);
			setDefaultMode(columnDtl_sub_char2);
			setDefaultMode(columnDtl_sub_char3);

			Btn_radd.setMode(MCMode.DISABLE);
			Btn_rcopy.setMode(MCMode.DISABLE);
			Btn_rdel.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 更新系ボタンのモードを設定する。
	 */
	protected void setBtnMode() {
		
		if (isAprv()) {
			
			Btn_radd.setMode(MCMode.DISABLE);
			Btn_rdel.setMode(MCMode.DISABLE);
			Btn_rcopy.setMode(MCMode.DISABLE);
			Btn_del01.setMode(MCMode.DISABLE);
		} 
		else {
			setDefaultMode(Btn_radd);
			setDefaultMode(Btn_rdel);
			setDefaultMode(Btn_rcopy);
			setDefaultMode(Btn_del01);
		}
	}
	
	/**
	 * 売上伝票発行ボタンの制御を行う。
	 */
	protected void setPrntBtnMode() {

		if (isAcptAprv() && !getHdrR().cst_iv_flg()) {
			setDefaultMode(Btn_prnt01);
		} 
		else {
			Btn_prnt01.setMode(MCMode.DISABLE);
		}
	}
	
	protected void setPrntOutFlg() {
		if (getHdrR().cst_iv_flg()) {
			Hdr_sls_slip_out_flg.setValue(false);
			Hdr_sls_slip_out_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			getHdrR().sls_slip_out_flg(true);
		}
	}

	/**
	 * 新規種別の初期値を設定
	 */
	protected void insInit() {

		// デフォルト日付の設定
		Hdr_sls_dt.setValue(getToday());
		
		setBillBasisDt();
		setPrntOutFlg();

		Hdr_can_ac_dt.setValue(null);
		Hdr_xrate_cd.setValue(getCo().sls_xrate_cd());
		
		getHdrR().base_cur_cd(getBaseCur().cur_cd());
		getHdrR().base_cur_nm(getBaseCur().cur_nm());
		getHdrR().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
		getHdrR().base_cur_upri_dec_place(getBaseCur().upri_dec_place());

		getHdrR().ptax_cur_cd(getPtaxCur().cur_cd());
		getHdrR().ptax_cur_nm(getPtaxCur().cur_nm());
		getHdrR().ptax_cur_amt_dec_place(getPtaxCur().amt_dec_place());
		getHdrR().ptax_cur_upri_dec_place(getPtaxCur().upri_dec_place());

	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getHdrR()) {
			list.add(HdrR.$sls_act_no);
			list.add(HdrR.$sls_act_rev);
			list.add(HdrR.$sls_act_seq);
			list.add(HdrR.$dlv_slip_no);
			list.add(HdrR.$sls_act_no);
			list.add(HdrR.$sls_act_rev);
			list.add(HdrR.$dlv_slip_no);
			list.add(HdrR.$sls_dt);
			list.add(HdrR.$ac_dt);
			list.add(HdrR.$bill_basis_dt);
			list.add(HdrR.$can_ac_dt);
			list.add(HdrR.$can_ac_dt_for_input);
			list.add(HdrR.$ac_dt_after_srch);
			list.add(HdrR.$sls_slip_prnted_flg);
			list.add(HdrR.$sls_slip_out_flg);
			list.add(HdrR.$aprv_flg);
			list.add(HdrR.$aprv_ret_flg);
			list.add(HdrR.$aprv_no);
			list.add(HdrR.$aprv_sts_typ);
			list.add(HdrR.$aprv_sts_typ_nm);
			list.add(HdrR.$aprv_upd_flg);
			list.add(HdrR.$aprv_can_flg);
			list.add(HdrR.$rcv_schd_dt);
			list.add(HdrR.$ref_no);
		}
		else if (cont == getDtlL()) {
			
			list.add(DtlR.$sls_act_d_no);
			list.add(DtlR.$sls_act_d_seq);
			list.add(DtlR.$sls_act_no);
			list.add(DtlR.$sls_act_seq);
			list.add(DtlR.$ref_sls_act_no);
			list.add(DtlR.$ref_sls_act_rev);
			list.add(DtlR.$ref_sls_act_seq);
			list.add(DtlR.$ref_sls_act_d_no);
			list.add(DtlR.$ref_sls_act_d_seq);
			list.add(DtlR.$ref_ac_dt);
			list.add(DtlR.$ref_trd_unit_qty);
			list.add(DtlR.$ref_trd_unit_cd);
			list.add(DtlR.$ref_trd_unit_nm);
			list.add(DtlR.$ref_trd_cur_upri);
			list.add(DtlR.$ref_trd_cur_amt);
			list.add(DtlR.$ref_trd_cur_inc_tax_amt);
			list.add(DtlR.$ref_tax_cd);
			list.add(DtlR.$ref_tax_nm);
			list.add(DtlR.$ref_tax_rate);
			list.add(DtlR.$ref_trd_cur_tax_amt);
			list.add(DtlR.$ref_base_cur_upri);
			list.add(DtlR.$ref_base_cur_amt);
			list.add(DtlR.$ref_base_cur_inc_tax_amt);
			list.add(DtlR.$ref_base_cur_tax_amt);
			list.add(DtlR.$ref_ptax_cur_upri);
			list.add(DtlR.$ref_ptax_cur_amt);
			list.add(DtlR.$ref_ptax_cur_inc_tax_amt);
			list.add(DtlR.$ref_ptax_cur_tax_amt);
			list.add(DtlR.$disp_seq);
		}

		return list;
	}
	
	/**
	 * 源泉税額の計算
	 * 
	 * @param dtlR
	 */
	protected void setWtaxAmt(DtlR dtlR) {
		
		MCNumber decPlace = getHdrR().trd_cur_amt_dec_place();
		String taxRndTyp = getCo().wtax_rnd_typ();
		
		if (isNullOr(dtlR.trd_cur_amt(), dtlR.wtax_rate())) {
			dtlR.wtax_amt(null);
		}
		else {
			dtlR.wtax_amt(dtlR.trd_cur_amt().multiply(dtlR.wtax_rate()).divide(100,
					decPlace.intValue(), MAC_RND_TYP.toMC(taxRndTyp)));
		}
	}

	@Override
	public void doHdr_trd_cur_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cur_cd_LC(info);
		
		setCredBal();
		
		setXrateCtrl();
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex(), true);
		}
	}
	
	/**
	 * 与信枠残高を設定する。
	 */
	protected void setCredBal() {
		
		if (!isNull(getHdrR().cst_cd()) && !isNull(getHdrR().trd_cur_cd())) {
			// 与信枠残高取得
			getHdrR().cred_bal(MSUCP_ArUtil.getCredBal(getHdrR().cst_cd(), getHdrR().trd_cur_cd(), this));
		}
		else {
			getHdrR().cred_bal(null);
		}
	}

	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);
		setXrateCtrl();
	}

	public void doHdr_sls_dpt_cd_LC(MCEventInfo info) {
		if (MAC_AR_DPT_TYP.isSLS(getHdrR().ar_dpt_typ())){
			// 売上部門を債権部門に設定できないケースがあるため、setValueExを使わない
			Hdr_ar_dpt_cd.setValue(getHdrR().sls_dpt_cd()); 
		}
	}

	@Override
	public void doHdr_sls_dt_LC(MCEventInfo info) {
		super.doHdr_sls_dt_LC(info);
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (isNull(r.ref_sls_act_no())) {
				setDefaultTaxCd(r.getGUIIndex());
			}
		}
	}

	/**
	 * 計上日のListChangedイベント
	 * @param info MCEventInfo
	 */
	protected void doHdr_ac_dt_LC(MCEventInfo info) {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			
			setDefaultWatxRate(dtlR.getGUIIndex(), true);
		}
		setCstItm(true);
	}

	protected void doDtl_itm_LC(MCEventInfo info) {
		int index = info.getEventIndex();
		DtlR r = getDtlL().get(info.getEventIndex());
		clearRefSlsActInfo(index);
		setIvItmNm(r);
		setCstItm(r);
		setDefaultBillCrryovrTimes(index);
		setDefaultTaxCd(index);
		setDefaultWatxRate(index, false);
		
		if (Dtl_itm_p_PPanel.isItmFix(index)) {
			setColByDscntItm(r);
			copyHdrToDtl(r);
		}
	}
	
	/**
	 * 源泉税率の初期値を設定する。
	 * @param index インデックス
	 * @param light 品目のイベントから呼ばれる場合はfalse、そうでない場合はtrue
	 */
	protected void setDefaultWatxRate(int index, boolean light) {
		
		if ((MAC_TRD_PTN_TYP.isSLS_DSCNT(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSLS_XTRA(getHdrR().trd_ptn_typ()))
				&& isWatxRateEditable()
				&& light ? Dtl_itm_p_PPanel.isItmFixLight(index) : Dtl_itm_p_PPanel.isItmFix(index)
				&& !isNull(getHdrR().ac_dt())) {
			
			DtlR r = getDtlL().get(index);
			MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().ac_dt(),
					this);
			setValueEx(columnDtl_wtax_rate, index, wtaxRate);
		}
		else {
			setValueEx(columnDtl_wtax_rate, index, null);
		}
	}
	
	/**
	 * 源泉税率が入力可能かどうか。
	 * @return 入力可能場合はtrue
	 */
	protected boolean isWatxRateEditable() {
		
		if (!isNull(getHdrR().trd_cur_cd()) 
				&& isSame(getHdrR().trd_cur_cd(), getHdrR().base_cur_cd()) 
				&& (isSame(getHdrR().trd_cur_cd(), getHdrR().ptax_cur_cd()) || isNull(getHdrR().ptax_cur_cd()))) {
			return true;
		}
		
		return false;
	}
	
	protected void copyHdrToDtl(DtlR r) {
		HdrR h = getHdrR();
		if (isEditable(columnDtl_dest_cd1, r.getGUIIndex()) && isNull(r.dest_cd1())) {
			r.dest_cd1(h.dest_cd1()); //仕向先ＣＤ１
			r.dest_nm1(h.dest_nm1()); //仕向先名１
		}
		if (isEditable(columnDtl_dest_cd2, r.getGUIIndex())) {
			r.dest_cd2(h.dest_cd2()); //仕向先ＣＤ２
			r.dest_nm2(h.dest_nm2()); //仕向先名２
		}
		if (isEditable(columnDtl_dest_cd3, r.getGUIIndex())) {
			r.dest_cd3(h.dest_cd3()); //仕向先ＣＤ３
			r.dest_nm3(h.dest_nm3()); //仕向先名３
		}
	}
	
	/**
	 * ＩＶ表記品名を設定します。
	 * @param dtlR　受注明細
	 */
	protected void setIvItmNm(DtlR dtlR) {
		if (!getHdrR().cst_iv_flg()){
			setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(getHdrR().prnt_lcl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
			} else {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), row.getStringNE("itm_nm"));
			}
		}
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setCstItm(DtlR dtlR) {
		
		MCRow row = MAUCP_ItmUtil.getBpItm(getHdrR().cst_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), getHdrR().sls_dt(), this);

		if (isNull(row)) {
			row = MCRow.create();
			row.addStringColumn("bp_itm_cd");
		}
		// イベント発火順の都合上設定したsetIgnoreListBeans(...)によって
		// 品目、枝番にnullを渡すとsetValuesメソッドでnullに上書きされる。
		// これらを防止するため、メソッド呼び出し元の品目関連の情報をRowにすべて設定する。
		row.addStringColumn("itm_cd", dtlR.itm_cd());
		row.addStringColumn("itm_sub1", dtlR.itm_sub1());
		row.addStringColumn("itm_sub2", dtlR.itm_sub2());
		row.addStringColumn("itm_sub3", dtlR.itm_sub3());
		columnDtl_cst_itm_cd.setValues(dtlR.getGUIIndex(), row);
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 */
	protected void setCstItm(boolean dtFlg) {
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if(!dtFlg || (dtFlg && isNull(dtlR.ref_sls_act_no()))) {
				setCstItm(dtlR);
			}
		}
	}
	
	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 */
	protected void setColByDscntItm(DtlR dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnDtl_trd_unit_cd, dtlR.getGUIIndex(), dtlR.base_unit_cd());
			setValueEx(columnDtl_trd_unit_qty, dtlR.getGUIIndex(), MCNumber.ONE);
		}
	}

	@Override
	public void doHdr_cst_cd_LC(MCEventInfo info) {
		super.doHdr_cst_cd_LC(info);

		if (isNull(getHdrR().cst_cd())) {
			// 得意先ＣＤクリア時は、「売掛先」「債権部門」「取引条件１～３」「取引条件備考１～３」をクリアする。
			Hdr_acst_cd.setValue(null);
			Hdr_tterm_cd1.setValue(null);
			Hdr_tterm_cd2.setValue(null);
			Hdr_tterm_cd3.setValue(null);
			// 「売上担当者」は入力変更不可にする。
			Hdr_sls_usr_cd.setMode(MCMode.READ_ONLY);
			Hdr_sls_slip_out_flg.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Hdr_sls_usr_cd);
			if(getHdrR().cst_iv_flg()) {
				Hdr_sls_slip_out_flg.setValue(false);
				Hdr_sls_slip_out_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_sls_slip_out_flg.setMode(MCMode.ENABLE);
			}
		}
		
		// 得意先ＣＤ変更時は、「売上部門」「売上担当者」をクリアする。
		Hdr_sls_dpt_cd.setValue(null);
		Hdr_sls_usr_cd.setValue(null); // 債権部門もイベントでクリア
		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_sls_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_sls_dpt_cd, getHdrR().cst_dpt_cd());
		}
		if (!getHdrR().cst_iv_flg()) {
			getHdrR().clear(HdrR.$iv_no, HdrR.$ref_iv_no, HdrR.$num_flg);
		}

		for (DtlR r : getDtlL()) {
			// 全明細の「参照売上実績ＮＯ」「参照改訂番号」「参照売上実績明細ＮＯ」をクリアする。
			clearRefSlsActInfo(r.getGUIIndex());

			// インボイス表記品名のクリアしておく
			if (!getHdrR().cst_iv_flg()) {
				setValueEx(columnDtl_iv_itm_nm, null);
			}
			
			if (r.isStatusCreate() || r.isStatusModify()
					|| (r.isStatusNone() && !isNull(r.itm_cd()))) {
				int index = r.getGUIIndex();
				setDefaultBillCrryovrTimes(index);
				setDefaultTaxCd(index);
				setIvItmNm(r);
			}
		}

		setCstIvFlgCtrl();
		setIvItmNmDispCtrl();
		setCstItm(false);
		setModeRcvSchdDt();
		setModeBillBasisDt();
		setBillBasisDt();
		
		setCredBal();
	}
	
	protected void setDefaultBillCrryovrTimes(int index) {
		if (!isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			setValueEx(columnDtl_bill_crryovr_times, index, nvl(r.itm_bill_crryovr_times(), getHdrR().cst_bill_crryovr_times()));
		}
	}
	
	protected void setDefaultTaxCd(int index) {
		
		if (!isNull(getHdrR().cst_cd())) {
			DtlR r = getDtlL().get(index);
			String tax_cd = MSUCP_SlsUtil.getSlsTaxCd(
					r.itm_cd(),
					r.itm_sub1(),
					r.itm_sub2(),
					r.itm_sub3(),
					getHdrR().cst_cd(),
					getHdrR().sls_dt(),
					this);
			setValueEx(columnDtl_tax_cd, index, tax_cd);
		}
	}

	/**
	 * ヘッダの取引通貨金額の設定
	 */
	protected void setHdrAmt() {
		MCNumber trd_cur_amt = null;
		
		for (DtlR r : getDtlL()) {
			if (r.isStatusDelete() || r.isEmpty()) {
				continue;
			}
			if (isNull(r.trd_cur_amt())) {
				continue;
			}

			trd_cur_amt = nvl(trd_cur_amt, MCNumber.ZERO).add(r.trd_cur_amt());

		}
		getHdrR().trd_cur_amt(trd_cur_amt);
	}
	
	/**
	 * ヘッダの取引通貨税込金額の設定
	 */
	protected void setHdrIncTaxAmt() {
		MCNumber trd_cur_inc_tax_amt = null;
		
		for (DtlR r : getDtlL()) {
			if (r.isStatusDelete() || r.isEmpty()) {
				continue;
			}
			if (isNull(r.trd_cur_inc_tax_amt())) {
				continue;
			}

			trd_cur_inc_tax_amt = nvl(trd_cur_inc_tax_amt, MCNumber.ZERO).add(r.trd_cur_inc_tax_amt());

		}
		getHdrR().trd_cur_inc_tax_amt(trd_cur_inc_tax_amt);
	}
	@Override
	public void doHdr_dest_cd1_LC(MCEventInfo info) {
		super.doHdr_dest_cd1_LC(info);
		
		setDestCdMode();
		
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			setValueEx(columnDtl_dest_cd1, r.getGUIIndex(), getHdrR().dest_cd1());
		}
	}

	@Override
	public void doHdr_dest_cd2_NC(MCEventInfo info) {
		super.doHdr_dest_cd2_NC(info);
		
		setDestCdMode();
		
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (!isNull(r.dest_cd1())) {
				setValueEx(columnDtl_dest_cd2, r.getGUIIndex(), getHdrR().dest_cd2());
			}
		}
	}

	@Override
	public void doHdr_dest_cd3_LC(MCEventInfo info) {
		super.doHdr_dest_cd3_LC(info);

		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (!isNull(r.dest_cd2())) {
				setValueEx(columnDtl_dest_cd3, r.getGUIIndex(), getHdrR().dest_cd3());
			}
		}
	}
	
	@Override
	public void doHdr_tterm_cd1_LC(MCEventInfo info) {
		super.doHdr_tterm_cd1_LC(info);
	}

	@Override
	public void doHdr_tterm_cd2_LC(MCEventInfo info) {
		super.doHdr_tterm_cd2_LC(info);
	}

	@Override
	public void doHdr_tterm_cd3_LC(MCEventInfo info) {
		super.doHdr_tterm_cd3_LC(info);
	}

	@Override
	public void doHdr_num_flg_NC(MCEventInfo info) {
		super.doHdr_num_flg_NC(info);

		if (getHdrR().num_flg()) {
			
			setValueEx(Hdr_iv_no, null);
			Hdr_iv_no.setMode(MCMode.READ_ONLY);
		}
		else {

			Hdr_iv_no.setMode(MCMode.REQUIRED);
		}
	}
	
	/**
	 * 仕向先の表示モードを設定する。
	 */
	protected void setDestCdMode() {

		if (isNull(getHdrR().dest_cd1())) {
			
			Hdr_dest_cd2.clear();
			Hdr_dest_cd2.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_dest_cd2);
		}
		
		if (isNull(getHdrR().dest_cd2())) {
			
			Hdr_dest_cd3.clear();
			Hdr_dest_cd3.setMode(MCMode.READ_ONLY);
		}
		else{
			setDefaultMode(Hdr_dest_cd3);
		}
	}
	
	protected void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setWtaxAmt(r);
		setHdrAmt();
		setHdrIncTaxAmt();
	}

	protected void doDtl_base_cur_amt_LC(MCEventInfo info) {
		setHdrAmt();
		setHdrIncTaxAmt();
	}
	
	protected void doDtl_trd_cur_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}

	protected void doDtl_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setHdrIncTaxAmt();
	}

	protected void doDtl_trd_unit_qty_LC(MCEventInfo info) {
		setHdrAmt();
		setHdrIncTaxAmt();
	}
	
	@Override
	public void doDtl_wtax_rate_NC(MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		setWtaxAmt(r);
	}
	
	@Override
	public void doDtl_dest_cd1_LC(MCEventInfo info) {
		super.doDtl_dest_cd1_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.dest_cd1())) {
			setValueEx(columnDtl_dest_cd2, info.getEventIndex(), null);
		}
	}
	
	@Override
	public void doDtl_dest_cd2_LC(MCEventInfo info) {
		super.doDtl_dest_cd2_LC(info);
		
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isNull(r.dest_cd2())) {
			setValueEx(columnDtl_dest_cd3, info.getEventIndex(), null);
		}
	}
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlCellConfig());
	}
	
	protected MCCellConfig createDtlCellConfig() {
		return new DtlCellConfig();
	}

	/**
	 * DtlShipSchdTable用のセルコンフィグ
	 */
	public class DtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = getDtlL().get(index);
			
			if (isSame(getStatus(), UPD) 
					|| isSame(getStatus(), INS) 
					|| isSame(getStatus(), INS_REF)) {
				
				if (r.isStatusCreate() 
						|| r.isStatusModify() 
						|| r.isStatusGUICreate()
						|| (r.isStatusNone() && !isNull(r.itm_cd()))) {
					//仕向先ＣＤ１:入力時には、仕向先ＣＤ２を入力可能にする。クリアした場合は仕向先ＣＤ２、３をクリアし入力変更不可にする。
					if (isNull(r.dest_cd1())){
						if (column == columnDtl_dest_cd2 || column == columnDtl_dest_cd3){
							return MCMode.READ_ONLY;
						}
					}
					//仕向先ＣＤ２:入力時には、仕向先ＣＤ３を入力可能にする。クリアした場合は仕向先ＣＤ３をクリアし入力変更不可にする。
					if (isNull(r.dest_cd2())){
						if (column == columnDtl_dest_cd3){
							return MCMode.READ_ONLY;
						}
					}
					if (column == columnDtl_trd_unit_cd || column == columnDtl_trd_unit_qty ) {
						if (r.dscnt_itm_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				if (column == columnDtl_iv_itm_nm) {
					if (!getHdrR().cst_iv_flg() || (getHdrR().cst_iv_flg() && !r.sundry_itm_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 源泉税率
				if (column == columnDtl_wtax_rate) {
					if (!isWatxRateEditable()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}

}