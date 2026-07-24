package mcframe.serverMSBD.MSBDL0080;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBD.MSBDL0080.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBD.MSBDL0080.Query.*;
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR;
import mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR;
import mcframe.serverMSBD.MSBDL5100.*;
import mcframe.serverMSBD.MSBDL5200.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMAUC.MAUCL0010.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_PositiveValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_SmallLargeValidater;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoReg_MC extends MSBDL_PoReg_MC_A{
	//FMCB CUSTOM START
	//-----------------------------
	// Cache
	//-----------------------------
	/** 発注予定 */
	protected MCList<MST_PO_SCHD_R> _poSchdL = MCList.create(MST_PO_SCHD_R.class);	
	/** 発注 */
	protected MST_PO_R _poR = MST_PO_R.create();
	/** 発注明細 */
	protected MCList<MST_PO_D_R> _poDL = MCList.create(MST_PO_D_R.class);
	/**　入荷進捗 */
	protected MCList<MST_ARR_PR_R> _arrPrL = MCList.create(MST_ARR_PR_R.class);
	/**　承認 */
	protected MBT_APRV_R _aprvR = MBT_APRV_R.create();
	/** 品目製造指図 */
	protected MCList<MST_ITM_MFG_INST_R> _itmMnfctInstL = MCList.create(MST_ITM_MFG_INST_R.class);
	/** 受注明細 */
	protected MCList<MST_SLO_D_R> _sloDL = MCList.create(MST_SLO_D_R.class);
	/** 品目禁止 */
	protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopL = null;
	/** 案件手配紐付情報  */
	protected MCList<MST_WRK_SNO_R> _wrkSnoL = MCList.create(MST_WRK_SNO_R.class);

	//-----------------------------
	// Cache
	//-----------------------------
	/** 取引先禁止 */
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStopL = null;
	//-----------------------------
	// IndexKey
	//-----------------------------
	/** 発注予定 */
	MCIndexKey _idxPoSchdL = null;
	/** 発注明細 */
	MCIndexKey _idxPoDL = null;
	/** 入荷進捗 */
	MCIndexKey _idxArrPrL = null;
	/** 品目製造指図 */
	MCIndexKey _idxItmMnfctInstL = null;
	/** 受注明細 */
	MCIndexKey _idxSloDL = null;
	/** 案件手配紐付情報 */
	MCIndexKey _idxWrkSnoL = null;
	//-----------------------------
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発注情報を検索する<br>
	 */
	public class Srch01 extends MSBDL_PoReg_MC_A.Srch01 {
		
		protected MCNumber _latestRev; 
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchPo();
		
		}

		protected void setLatestFlg() {
			if (isSame(down0().po_rev(), _latestRev)) {
				down0().latest_flg(true);
			}

		}

		protected void setLatestRev() {
			MST_PO_R poR = MST_PO_R.create("T");
			MCQueryApiBuilder poR_bldr = MCQueryApiBuilder.create(poR);
			poR_bldr.setSelect(poR.po_rev);
			dbSelectKey("MSBDL0080_MST_PO_S01", poR, poR_bldr, up0().po_no());
			if (isNull(up0().rev_no())) {
				up0().rev_no(poR.po_rev());
			}
			_latestRev = poR.po_rev();
		}
		
		/**
		 * 発注情報の検索
		 */
		protected void srchPo() {
			setLatestRev();
			
			editCnd();
			
			selectPo();
		}
		
		protected void editCnd() {
			if (!isSame(OPE_REF, up0().screen_ope())) {
				up0().addStringColumn("tmp_can_flg", MCBooleanUtil.booleanToDBString(false));
			}
			else {
				up0().addStringColumn("tmp_can_flg", MCBooleanUtil.booleanToDBString(true));
			}
			if (isSame(_latestRev, up0().rev_no())) {
				up0().addStringColumn("tmp_latest_flg", MCBooleanUtil.booleanToDBString(true));
			}
			else {
				up0().addStringColumn("tmp_latest_flg", MCBooleanUtil.booleanToDBString(false));
			}
		}
		
		/**
		 * 発注情報を検索します
		 */
		protected void selectPo() {
			up0().addStringColumn("base_cur_cd", getCo().base_cur_cd());
			up0().addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			up0().addStringColumn("pod_del_flg");
			up0().addDateColumn("today", getToday());
			int cnt = executeQuery(down0(), MSBDL0080_MST_PO_S01(), up0());
			if (isSame(cnt, 0)) {
				return;
			}
			down0().addStringColumn("tmp_can_flg", up0().getStringNE("tmp_can_flg"));
			down0().addStringColumn("tmp_latest_flg", up0().getStringNE("tmp_latest_flg"));
			executeQuery(down1(), MSBDL0080_MST_PO_D_S01(), down0());
			
			setPegNo(Srch01_DtlR.$dtl_peg_no, down1());
		}
		
		/**
		 * 明細に対応する予定を紐付けます。
		 */
		protected void setDtl2() {
			MCList<MST_PO_SCHD_R> poSchdL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			poSchdL_bldr.setSelect(t.po_schd_no);
			poSchdL_bldr.addSelect(t.po_d_no);
			poSchdL_bldr.addSelect(t.upd_cntr);
			dbSelect("MSBDL0080_MST_PO_SCHD_S01", poSchdL, poSchdL_bldr, down1());
			
			editDtl2(poSchdL);
		}
		
		
		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().size() > 0) {	
				setHdr();
				setLatestFlg();
				setDtl();
				setRemAbortAbl();
				setDlvSlip();
				setDtl2();
			}
		}
		
		/**
		 * ヘッダ情報を設定します
		 * @return
		 */
		protected void setHdr() {
			
			MCList<Srch01_DtlR> tmpL = down1().subList(Srch01_DtlR.$arr_flg, true);
			tmpL.addAll(down1().subList(Srch01_DtlR.$purc_flg, true));
			tmpL.addAll(down1().subList(Srch01_DtlR.$rcpt_iv_flg, true));
			if (tmpL.size() > 0) {
				down0().next_opr_flg(true);
			}
			
			down0().base_cur_cd(getCo().base_cur_cd());
			down0().ptax_cur_cd(getCo().ptax_cur_cd());
			down0().xrate_rnd_typ(getCo().xrate_rnd_typ());
			down0().wtax_rnd_typ(getCo().wtax_rnd_typ());
			down0().purc_xrate_cd(getCo().purc_xrate_cd());

			if(isNull(down0().ap_dpt_cd()) && down0().ap_dpt_flg()){
				down0().ap_dpt_cd(down0().purc_dpt_cd());
			}
			
			for (Srch01_Dtl2R r : down2()) {
				if (!isNull(r.po_schd_no())) {
					down0().po_schd_no(r.po_schd_no());
					break;
				}
			}
		}
		
		/**
		 * 明細情報を設定します
		 * @return
		 */
		protected void setDtl() {
			MCList<Srch01_DtlR> tmpL = MCList.create(Srch01_DtlR.class);
			for (Srch01_DtlR r : down1()) {
				// 金額情報を設定する
				MSBDL_PurcUtil.setBaseCurInfo(down0(), r);
				MSBDL_PurcUtil.setPtaxCurInfo(down0(), r);
				
				// 基準単位数量を設定する。
				MCNumber baseUnitQty = MAUCL_MCDataUtil.convToBaseUnit(
						r.trd_unit_qty()
						, r.trd_unit_conv_base_qty()
						, r.trd_unit_conv_qty()
						, r.base_unit_dec_place()
						, r.base_unit_rnd_typ());
				r.base_unit_qty(baseUnitQty);
				
				// 有効成分を設定する
				if (r.cont_fctr_flg()) {
					MCNumber contQty =  MAUCL_MCDataUtil.convToContFctrUnit(
							  r.base_unit_qty()
							, r.std_cont_fctr()
							, r.cont_fctr_dec_place()
							, r.cont_fctr_rnd_typ());
					
					r.cont_qty(contQty);
				}
				// 買戻義務を設定
				if(r.outsrc_flg()) {
					r.repurc_obli_flg(down0().repurc_obli_flg());
					r.outsrc_upri_typ(down0().outsrc_upri_typ());
				}
				tmpL.add(r);
			}
			down1().setAll(tmpL);
		}
		protected void setRemAbortAbl() {
			
			MCList<Srch01_DtlR> rsltL = MCList.create(Srch01_DtlR.class);
			rsltL.addBooleanColumn("iv_abort_flg");
			executeQuery(rsltL, MSBDL0080_MST_ARR_PURC_SCHD_S01(), down1());
			
			MCIndexKey idxkey = rsltL.createIndex("po_d_no");
			
			for (Srch01_DtlR r : down1()) {
				
				Srch01_DtlR rsltR = rsltL.getFirst(idxkey, r.po_d_no());
				
				if (!isNull(rsltR)) {
					r.arr_rem_abort_flg(rsltR.arr_rem_abort_flg() && rsltR.getBooleanNE("iv_abort_flg"));
					r.purc_rem_abort_flg(rsltR.purc_rem_abort_flg() && rsltR.getBooleanNE("iv_abort_flg"));
				}
				else {
					r.arr_rem_abort_flg(false);
					r.purc_rem_abort_flg(false);
				}
			}
		}
		/**
		 * 納品書関連を設定する
		 */
		protected void setDlvSlip() {
			Srch01_HdrR bindR = down0().clone();
			bindR.addStringColumn("tmp_can_flg", toTrueStr(bindR.can_flg()));
			MCList<Srch01_DtlR> rsltL = MCList.create(Srch01_DtlR.class);
			rsltL.addBooleanColumn(Srch01_HdrR.$dlv_print_flg);
			rsltL.addBooleanColumn(Srch01_HdrR.$purc_ddlv_dlv_print_flg);
			executeQuery(rsltL, MSBDL0080_MST_PURC_DLV_SLIP_S01(), bindR);
			if (rsltL.isEmpty()) {
				return;
			}
			// 最新の分のみ抽出（SQLでは改訂番号ごとに取得される）
			rsltL = rsltL.distinctNE(Srch01_DtlR.$po_d_no);
			
			MCGroupByPolicy gp = new MCGroupByPolicy(Srch01_DtlR.$po_no);
			gp.max(Srch01_HdrR.$dlv_print_flg);
			gp.max(Srch01_HdrR.$purc_ddlv_dlv_print_flg);
			Srch01_DtlR gr = rsltL.groupBy(gp).get(0);
			down0().dlv_print_flg(gr.getBooleanNE(Srch01_HdrR.$dlv_print_flg));
			down0().purc_ddlv_dlv_print_flg(gr.getBooleanNE(Srch01_HdrR.$purc_ddlv_dlv_print_flg));
			
			MCIndexKey idx = down1().createIndex(Srch01_DtlR.$po_d_no);
			for (Srch01_DtlR glR : rsltL) {
				Srch01_DtlR downR = down1().getFirst(idx, glR.po_d_no());
				if (!isNull(downR)) {
					downR.dlv_slip_no(glR.dlv_slip_no());
					downR.dlv_slip_seq(glR.dlv_slip_seq());
					downR.dlv_slip_mng_no(glR.dlv_slip_mng_no());
					downR.dlv_slip_mng_seq(glR.dlv_slip_mng_seq());
					downR.purc_ddlv_dlv_slip_no(glR.purc_ddlv_dlv_slip_no());
				}
			}
		}
		
		/**
		 *  画面でＮ件の明細を１件にまとめられることを想定し、関連付けるためのリストを作成します。
		 * @param poSchdL
		 */
		protected void editDtl2(MCList<MST_PO_SCHD_R> poSchdL){
			MCIndexKey idx = poSchdL.createIndex(MST_PO_SCHD_R.$po_d_no);
			for (Srch01_DtlR r : down1()) {
				MCList<MST_PO_SCHD_R> subL = poSchdL.subList(idx, r.po_d_no());
				
				if (isNull(subL)) {
					Srch01_Dtl2R dtl2R = Srch01_Dtl2R.create();
					dtl2R.dtl_peg_no(r.dtl_peg_no());
					dtl2R.po_schd_no(null);
					dtl2R.po_d_no(r.po_d_no());
					dtl2R.po_schd_upd_cntr(null);
					dtl2R.arr_pr_upd_cntr(r.arr_pr_upd_cntr());
					down2().add(dtl2R);
				}
				else {
					r.po_schd_flg(true);
					for (MST_PO_SCHD_R poSchdR : subL) {
						Srch01_Dtl2R dtl2R = Srch01_Dtl2R.create();
						dtl2R.dtl_peg_no(r.dtl_peg_no());
						dtl2R.po_schd_no(poSchdR.po_schd_no());
						dtl2R.po_d_no(poSchdR.po_d_no());
						dtl2R.po_schd_upd_cntr(poSchdR.upd_cntr());
						dtl2R.arr_pr_upd_cntr(r.arr_pr_upd_cntr());
						down2().add(dtl2R);
					}
				}
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 発注予定を検索する<br>
	 */
	public class Srch02 extends MSBDL_PoReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			selectPoSchd();
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().size() > 0) {
				setHdr();
				setDtl();
				setDtl2();
			}
		}
		
		protected void selectPoSchd() {
			MCRow bind = MCRow.create();
			bind.addDateColumn("today", getToday());
			bind.addStringColumn("base_cur_cd", getCo().base_cur_cd());
			bind.addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			MCList<MST_PO_SCHD_R> wkL = MCList.create(MST_PO_SCHD_R.class);
			for (Srch02_CndR r : up0()) {
				MST_PO_SCHD_R wkR = MST_PO_SCHD_R.create();
				wkR.po_schd_no(r.po_schd_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_SCHD_R.create("T"));
			dbWkDelete("MSBDL0080_MSW_PO_SCHD_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL0080_MSW_PO_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
			executeQuery(down1(), MSBDL0080_MST_PO_SCHD_S01(), bind);
		}
		
		/**
		 * ヘッダ情報を設定します
		 * @return
		 */
		protected void setHdr() {
			Srch02_DtlR dtlR = down1().get(0);
			MCRow.copyall(down0(), dtlR.hdr());
						
			down0().base_cur_cd(getCo().base_cur_cd());
			down0().ptax_cur_cd(getCo().ptax_cur_cd());
			down0().xrate_rnd_typ(getCo().xrate_rnd_typ());
			down0().wtax_rnd_typ(getCo().wtax_rnd_typ());
			down0().purc_xrate_cd(getCo().purc_xrate_cd());
			down0().po_schd_no(dtlR.po_schd_no());

			if(isNull(down0().ap_dpt_cd()) && down0().ap_dpt_flg()){
				down0().ap_dpt_cd(down0().purc_dpt_cd());
			}

			if (isNull(down0().po_print_cd())) {
				down0().po_print_cd(getCo().po_print_cd());
				down0().po_print_nm(getCoPoPrintNm());
			}
		}
		/**
		 * 明細情報を設定します
		 * @return
		 */
		protected void setDtl() {
			setPegNo(Srch02_DtlR.$dtl_peg_no, down1());
			// 固定値の設定
			down0().setStringNE(Srch02_HdrR.$purc_xrate_cd, getCo().purc_xrate_cd());
			down0().setStringNE(Srch02_HdrR.$xrate_rnd_typ, getCo().xrate_rnd_typ());
			down0().setStringNE(Srch02_HdrR.$wtax_rnd_typ, getCo().wtax_rnd_typ());
			for (Srch02_DtlR r : down1()) {
				
				// 購買識別区分を設定する
				if (!isNull(r.dlv_cd())) {
					// 仕入直送の場合、通常購買とする
					r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
				}
				else if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
					// 非在庫品の場合、通常購買とする
					r.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
				}
				
				// 仕入計上区分
				setDefaultPurcBasisTyp(r);
				
				// 同時計上フラグ
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
					r.sync_flg(true);
					r.purc_schd_dt(r.dlv_rqst_dt().trunc(MCDateFieldType.DAY));
				}
				else if (MAC_PURC_BASIS_TYP.isIN_BASIS(r.purc_basis_typ())) {
					r.sync_flg(false);
				}
				
				if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
						|| MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
					clrValForVmiFfrRcv(r);
				}
				else {
					// 基準通貨金額を設定する
					MSBDL_PurcUtil.setBaseCurInfo(down0(), r);
					
					// 納税通貨金額を設定する
					MSBDL_PurcUtil.setPtaxCurInfo(down0(), r);
					
					// 源泉税額を設定する
					if (isSame(down0().trd_cur_cd(), down0().base_cur_cd())
							&& (isSame(down0().trd_cur_cd(), down0().ptax_cur_cd()) || isNull(down0().ptax_cur_cd()))) {
						MSBDL_PurcUtil.setWtaxInfo(down0(), r);
					}
					else {
						r.wtax_rate(null);
					}
				}
				
				// 基準単位数量を設定する。
				MCNumber baseUnitQty = MAUCL_MCDataUtil.convToBaseUnit(
						r.trd_unit_qty()
						, r.trd_unit_conv_base_qty()
						, r.trd_unit_conv_qty()
						, r.base_unit_dec_place()
						, r.base_unit_rnd_typ());
				r.base_unit_qty(baseUnitQty);
				
				// 有効成分を設定する
				if (r.cont_fctr_flg()) {
					MCNumber contQty =  MAUCL_MCDataUtil.convToContFctrUnit(
							  r.base_unit_qty()
							, r.std_cont_fctr()
							, r.cont_fctr_dec_place()
							, r.cont_fctr_rnd_typ());
					
					r.cont_qty(contQty);
				}
				if(r.outsrc_flg()) {
					r.repurc_obli_flg(r.hdr().repurc_obli_flg());
					r.outsrc_upri_typ(r.hdr().outsrc_upri_typ());
				}
				// 購買納品書対象外
				r.dlv_slip_invalid_flg(r.arr_skip_flg() && !r.purc_dlv_slip_flg());
			}
		}
		/**
		 *  画面でＮ件の明細を１件にまとめられることを想定し、関連付けるためのリストを作成します。
		 */
		protected void setDtl2(){
			for (Srch02_DtlR r : down1()) {
				Srch02_Dtl2R dtl2R = Srch02_Dtl2R.create();
				dtl2R.dtl_peg_no(r.dtl_peg_no());
				dtl2R.po_schd_no(r.po_schd_no());
				dtl2R.po_schd_upd_cntr(r.po_schd_upd_cntr());
				down2().add(dtl2R);
			}
		}
		
		/**
		 * 仕入計上区分の初期値を設定します。
		 */
		protected void setDefaultPurcBasisTyp(Srch02_DtlR r) {
			if (!isNull(r.dlv_cd())) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
			else if (r.arr_skip_flg()) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (down0().subcon_flg()) {
				r.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
		}
		
		/**
		 * 下り電文から金額項目等を除外します。
		 */
		protected void clrValForVmiFfrRcv(Srch02_DtlR row) {
			row.pay_crryovr_times(null);
			row.purc_schd_dt(null);
			row.upri_not_tgt_flg(false);
			row.purc_upri_req_typ(null);
			row.sync_flg(false);
			row.tax_cd(null);
			row.tax_nm(null);
			row.tax_rate(null);
			row.tax_typ(null);
			row.inc_tax_flg(false);
			row.trd_cur_upri(null);
			row.interim_flg(false);
			row.trd_cur_amt(null);
			row.trd_cur_tax_amt(null);
			row.trd_cur_inc_tax_amt(null);
			row.bd_dpt_cd(null);
			row.bd_dpt_nm(null);
			row.bd_itm_cd(null);
			row.bd_itm_sub1(null);
			row.bd_itm_sub2(null);
			row.bd_itm_sub3(null);
			row.bd_itm_nm(null);
			row.bd_lot_no(null);
			row.bd_sublot_no(null);
			row.bd_sno1(null);
			row.bd_sno2(null);
			row.bd_sno3(null);
			row.bd_sno4(null);
			row.bd_loc_cd(null);
			row.bd_loc_nm(null);
			row.bd_ctg_cd(null);
			row.bd_ctg_nm(null);
			row.bd_oper_cd(null);
			row.bd_oper_nm(null);
			row.bd_iv_no(null);
			row.bd_slo_no(null);
			row.bd_po_no(null);
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェックを行う<br>
	 */
	public class Chk01 extends MSBDL_PoReg_MC_A.Chk01 {
		/** up2(up1に対応するup2取得時に使用) */
		MCIndexKey _idxDtl2L = null;
		//-----------------------------

		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			preProc();
			super.doIt();

			if (!hasErr()) {
				callPoRegChk01(up0(), up1(), up2());
			}
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
			// ロック処理
			msgL.addAll(completion());
			return msgL;
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$po_dt);
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$po_dt);
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0(), up1(), up2())) {
				// 品目詳細存在チェック
				msgL.addAll(checkExistItmDtl(up0(), getChkList(up1())));
				// 負担項目の各種ＮＯ存在チェック
				msgL.addAll(existBdCheck(up1()));
				// 新規登録時特有のチェック
				msgL.addAll(checkSubWhenIns());
				// 新規登録・更新時共通のチェック
				msgL.addAll(checkSub(up0(), up1(), up2(), true));
			}
			return msgL;
		}
		/**
		 * チェック処理準備
		 */
		protected void preProc() {
			// IndexKey
			_idxDtl2L = up2().createIndex(Chk01_Dtl2R.$dtl_peg_no);
			_poSchdL.addBooleanColumn("mfg_inst_flg");
		}
		
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchd(up1(), up2());
			// 品目製造指図
			createCacheItmMnfctInst(_poSchdL);
			// 品目禁止
			createCacheItmStop(up1());
			// 取引先禁止
			createCacheBpStop(up0());
			// 受注明細
			createCacheSloD();
		}

		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定
			msgL = completionPoSchd();
			if (!msgL.isEmpty()) {
				return msgL;
			}
			// その他
			completionSub(up0(), up1());
			// 受注の手配ＮＯ補完後に実行するためこのタイミングにしている
			createCacheWrkSno();
			return msgL;
		}
		
		/**
		 * キャッシュ作成（案件手配紐付情報）
		 */
		protected void createCacheWrkSno() {
			_wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder wrkSnoL_bldr = MCQueryApiBuilder.create(t);
			wrkSnoL_bldr.setWhere(t.sno1.eq(bind("sno1")));
			dbSelect("MSBDL0080_MST_WRK_SNO_S01", _wrkSnoL, wrkSnoL_bldr, up1());
			_idxWrkSnoL = _wrkSnoL.createIndex(MST_WRK_SNO_R.$sno1);
		}
		
		/**
		 * 発注予定情報
		 */
		@SuppressWarnings("unchecked")
		protected MCMessageList completionPoSchd () {

			// 対応する製造指図があるかどうかを設定する。（まとめ不可チェック用）
			completionMfgInst();
			
			// 発注ヘッダ補完用
			MST_PO_SCHD_R srcHdrR = MST_PO_SCHD_R.create();
			
			boolean poSchdFlg = false;
			for (Chk01_DtlR r : up1()) {
				if (!poSchdFlg && !isNull(r.po_schd_no())) {
					poSchdFlg = true;
				}
				// 明細に対応する、まとめ対象行を取得する
				MST_PO_SCHD_R srcDtlR = MST_PO_SCHD_R.create();
				MCList<Chk01_Dtl2R> dtl2L = (MCList<Chk01_Dtl2R>) getRelatedBndlList(r, up2(), _idxDtl2L);
				
				// 受注が含まれるか否か
				boolean containSloFlg = false;
				
				// まとめ対象行に対し処理
				for (Chk01_Dtl2R dtl2R : dtl2L) {
					
					// 明細に対応する予定がなければ処理中断
					if (isNull(dtl2R.po_schd_no())) {
						continue;
					}
					
					// 対応する予定をキャッシュから取得する
					MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, dtl2R.po_schd_no());
					
					// 更新カウンタチェック
					MCMessageList tmpL = new MCMessageList();
					tmpL = checkUpdCntrNE(dtl2R, Chk01_Dtl2R.$po_schd_upd_cntr, poSchdR);
					if (!tmpL.isEmpty()) {
						return tmpL;
					}
					
					if (!isNull(poSchdR.slo_no())) {
						containSloFlg =true;
					}
					
					if (srcDtlR.isEmpty()) {
						/*
						 * 数量・金額以外の項目が同じで無いとまとめができない。
						 * つまりまとめ対象行の内容は、数量・金額以外同じであるため
						 * 明細に対応するまとめ対象行の中の１行を補完元として取得する。 
						 */
						srcDtlR = poSchdR;
					}
					
					if (srcHdrR == null || srcHdrR.isEmpty()) {
						// 発注ヘッダ項目の補完元として扱う
						srcHdrR = srcDtlR;
					}
					
					// まとめ対象行自身の補完をする
					dtl2R.base_unit_qty(poSchdR.base_unit_qty());
					dtl2R.mfg_inst_flg(poSchdR.getBooleanNE("mfg_inst_flg"));
				}
				
				if (srcDtlR == null || srcDtlR.isEmpty()) {
					// 計画外追加の場合
					continue;
				}
				
				
				// 発注予定から補完する
				r.itm_cd(srcDtlR.itm_cd());
				r.itm_sub1(srcDtlR.itm_sub1());
				r.itm_sub2(srcDtlR.itm_sub2());
				r.itm_sub3(srcDtlR.itm_sub3());
				r.mfg_loc_cd(srcDtlR.mfg_loc_cd());
				r.bom_ptn(srcDtlR.bom_ptn());
				r.outsrc_flg(srcDtlR.outsrc_flg());
				if (r.outsrc_flg()) {
					r.maker_cd(srcDtlR.maker_cd());
				}
				r.rqst_can_flg(srcDtlR.rqst_can_flg());
				
				if (!r.bndl_flg()) {
					/*
					 * まとめていない場合、明細：予定＝1:1になるため、明細にキー項目を保持する。
					 * (まとめ時はキーをクリアする（明細：予定＝1:Nとなるため、明細に紐付けられない）)
					 */
					r.slo_no(srcDtlR.slo_no());
					r.slo_d_no(srcDtlR.slo_d_no());
					r.io_schd_pr_no(srcDtlR.io_schd_pr_no());
					r.po_schd_no(srcDtlR.po_schd_no());
					r.outsrc_itm_ord_no(srcDtlR.outsrc_itm_ord_no());
				}
				if (containSloFlg) {
					// 依頼もとが受注である場合は、手配NOを引き継ぐ
					r.sno1(srcDtlR.sno1());
					r.sno2(srcDtlR.sno2());
					r.sno3(srcDtlR.sno3());
					r.sno4(srcDtlR.sno4());
				}
			}
			// ヘッダ内容を補完
			if (srcHdrR != null && !srcHdrR.isEmpty()) {
				// 計画外追加の場合
				up0().trd_cd(srcHdrR.trd_cd());
				up0().trd_ptn_typ(srcHdrR.trd_ptn_typ());
			}
			
			// 伝票内に外注品が含まれる場合、発注先は依頼元で定めた内容から変更できない
			if (poSchdFlg && up1().subList(Chk01_DtlR.$outsrc_flg, true).size() > 0) {
				up0().sppl_cd(srcHdrR.sppl_cd());
			}
			return new MCMessageList();
		}
		/**
		 * チェックのために、該当発注予定が製造指図済であるかどうかを設定します。
		 */
		protected void completionMfgInst () {
			// 対応する品目製造指図が存在する場合、まとめ不可チェックのために製造指図済である目印をつける
			for (MST_PO_SCHD_R r : _poSchdL) {
				MST_ITM_MFG_INST_R instR = _itmMnfctInstL.getFirst(_idxItmMnfctInstL, r.outsrc_itm_ord_no());
				if (!isNull(instR)) {
					_poSchdL.setBooleanNE("mfg_inst_flg", true);
				}
			}
		}
		
		/**
		 * 伝票登録時のチェック
		 */
		protected MCMessageList checkSubWhenIns() {
			return checkBpStop(up0());
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 訂正前チェックを行う<br>
	 */
	public class Chk02 extends MSBDL_PoReg_MC_A.Chk02 {
		//-----------------------------
		// IndexKey
		//-----------------------------
		/** up2(up1に対応するup2取得時に使用) */
		MCIndexKey _idxDtl2L = null;
		//-----------------------------
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			preProc();
			super.doIt();
			
			if (!hasErr()) {
				callPoRegChk01(up0(), up1(), up2());
			}
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// ロック処理
			msgL.addAll(completion());
			if (!msgL.isEmpty()) {
				return msgL;
			}
			//打切行の補完
			completionAbort();
			// 各負担項目ＮＯの存在チェック用のトランザクションデータを取得する
			getDataForExistChk(up1());
			return msgL;
		}
		/**
		 * 打切データの上り電文項目の補完
		 */
		@SuppressWarnings("unchecked")
		protected void completionAbort() {
			
			// 補完元
			
			for (Chk01_DtlR r : up1()) {
				// まとめ先（明細行）に対応するまとめ元を取得する
				MCList<Chk01_Dtl2R> bndlL = (MCList<Chk01_Dtl2R>) getRelatedBndlList(r, up2(), _idxDtl2L);
				
				// まとめ元行の中から、補完元となる発注明細ＮＯを取得する
				Chk01_Dtl2R srcDtl2R = Chk01_Dtl2R.create();
				for (Chk01_Dtl2R bndlR : bndlL) {
					if (!isNull(bndlR.po_d_no())) {
						srcDtl2R = bndlR;
						break;
					}
				}
				
				if (srcDtl2R.isEmpty()) {
					// 追加行の場合更新前の発注明細はないので中断
					continue;
				}
				MST_PO_D_R srcPoDR  = _poDL.getFirst(_idxPoDL, srcDtl2R.po_d_no());
				MST_ARR_PR_R arrPrR = _arrPrL.getFirst(_idxArrPrL, srcDtl2R.po_d_no());
				
				//打切変更の場合に元に戻す処理
				if (r.abort_flg() || arrPrR.abort_flg()) {
					getAbortCompCols().forEach(col -> r.setValue(col, srcPoDR.getValue(col)));
					r.str_ln_cd_none_flg(MAUCL_MCDataUtil.isNullOrNullVal(r.str_ln_cd()));
					r.arr_cnt_rmrks(arrPrR.arr_cnt_rmrks());
				}
			}
		}
		
		protected List<String> _abortCompCols = null;
		/**
		 * 打切時に発注明細トランザクションから取得する項目のリスト
		 */
		protected List<String> getAbortCompCols() {
			if (_abortCompCols == null) {
				MST_PO_D_R pr = MST_PO_D_R.create();
				
				_abortCompCols =  Arrays.asList(PDef.MS_MSBDL0080_Upd01_UP_BLOCK1().transItems())
						.stream().filter(i-> !i.isIgnore() && !i.isInnerRow()
								&& !isSame(i.id, Chk01_DtlR.$abort_flg)
								&& pr.contains(i.id)
								)
						.map(i-> i.id).collect(Collectors.toList());
			}
			return _abortCompCols;
		}
		
		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 債務部門
			ListLogicBind apDptBind = getListLogicBind(up1(), Chk01_DtlR.$ap_dpt_cd);
			apDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$po_dt);
			// 負担部門
			ListLogicBind bdDptBind = getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd);
			bdDptBind.putBind(MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$po_dt);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0(), up1(), up2())) {
				// 品目詳細存在チェック
				msgL.addAll(checkExistItmDtl(up0(), getChkList(up1())));
				// 負担項目の各種ＮＯ存在チェック
				msgL.addAll(existBdCheck(up1()));
				// 更新時特有のチェック
				msgL.addAll(checkSubWhenUpd());
				// 新規登録・更新時共通のチェック
				msgL.addAll(checkSub(up0(), up1(), up2(), false));
			}
			return msgL;
			
		}
		
		/**
		 * チェック処理準備
		 */
		protected void preProc() {
			// IndexKey
			_idxDtl2L = up2().createIndex(Chk01_Dtl2R.$dtl_peg_no);
			// チェック処理用に一時カラムを追加
			_poDL.addBooleanColumn("mfg_inst_flg");
			up1().addStringColumn("bef_sno1");
			up2().addBooleanColumn("bef_abort_flg");
			up2().addBooleanColumn("next_opr_flg");
		}
		
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchd(up1(), up2());
			// 発注
			createCachePo(up0());
			// 発注明細
			createCachePoD(up2());
			// 案件手配紐付情報
			createCacheWrkSno();
			// 品目製造指図
			createCacheItmMnfctInst(_poDL);
			// 入荷進捗
			createCacheArrPr(up1());
			// 承認ヘッダ
			createCacheAprvH(up0());
			// 受注明細
			createCacheSloD();
			// 取引先禁止
			createCacheBpStop(up0());
			// 品目禁止
			createCacheItmStop(up1());
		}
		/**
		 * キャッシュ作成（案件手配紐付情報）
		 */
		protected void createCacheWrkSno () {
			// 前回発注時の手配ＮＯを取得
			MCList<MST_WRK_SNO_R> tmpBefWrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			tmpBefWrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder tmpBefWrkSnoL_bldr = MCQueryApiBuilder.create(t);
			tmpBefWrkSnoL_bldr.setWhere(t.sno1.eq(bind("sno1")));
			dbSelect("MSBDL0080_MST_WRK_SNO_S02", tmpBefWrkSnoL, tmpBefWrkSnoL_bldr, _poDL);
			
			// 今回発注時の手配ＮＯを取得
			MCList<MST_WRK_SNO_R> tmpWrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MST_WRK_SNO_R t1 = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder tmpWrkSnoL_bldr = MCQueryApiBuilder.create(t1);
			tmpWrkSnoL_bldr.setWhere(t1.sno1.eq(bind("sno1")));
			dbSelect("MSBDL0080_MST_WRK_SNO_S03", tmpWrkSnoL, tmpWrkSnoL_bldr, up1());
			
			// キャッシュ作成
			_wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			_wrkSnoL.addAll(tmpBefWrkSnoL);
			_wrkSnoL.addAll(tmpWrkSnoL);
			_wrkSnoL.setAll(_wrkSnoL.groupBy(MST_WRK_SNO_R.$wrk_no, MST_WRK_SNO_R.$sno1));
			_idxWrkSnoL = _wrkSnoL.createIndex(MST_WRK_SNO_R.$sno1);
		}
		
		/**
		 * ロック及び補完処理
		 * @return
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定
			msgL = completionPoSchd();
			if(!msgL.isEmpty()){
				// 排他エラーでリターンするため
				return msgL;
			}
			// 発注
			msgL = completionPo();
			if(!msgL.isEmpty()){
				return msgL;
			}
			// 発注明細
			completionPoD();
			// 入荷予定
			msgL = completionArrPr();
			if(!msgL.isEmpty()){
				return msgL;
			}
			// その他
			completionSub(up0(), up1());
			return msgL;
		}
		/**
		 * 発注予定情報
		 */
		protected MCMessageList completionPoSchd () {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey dtl1Key = up1().createIndex(Chk01_DtlR.$po_d_no);
			for (Chk01_Dtl2R r : up2()) {
				MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
				if (isNull(poSchdR)) {
					continue;
				}
				// 更新カウンタチェック
				Chk01_DtlR dtl1R = up1().getFirst(dtl1Key, r.po_d_no());
				if(!isNull(dtl1R)){
					r.setAttributes(dtl1R);
				}
				msgL.addAll(checkUpdCntrNE(r, Chk01_Dtl2R.$po_schd_upd_cntr, poSchdR));
				if (msgL.size() == 0) {
					r.base_unit_qty(poSchdR.base_unit_qty());
					r.base_unit_qty(poSchdR.base_unit_qty());
				}
				else {
					return msgL;
				}
			}
			return msgL;
		}
		/**
		 * 発注情報
		 */
		protected MCMessageList completionPo () {
			MCMessageList msgL = new MCMessageList();
			// 更新カウンタチェック
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$po_upd_cntr, _poR));
			if(!msgL.isEmpty()){
				return msgL;
			}
			
			// 更新前の発注ヘッダから補完
			up0().trd_cd(_poR.trd_cd());
			up0().trd_ptn_typ(_poR.trd_ptn_typ());
			up0().sppl_cd(_poR.sppl_cd());
			up0().wrk_no(_poR.wrk_no());
			up0().aprv_no(_poR.aprv_no());
			return msgL;
		}
		/**
		 * 発注明細情報
		 */
		@SuppressWarnings("unchecked")
		protected void completionPoD () {
			
			// 対応する製造指図があるかどうかを設定する。（まとめ不可チェック用）
			completionMfgInst();
			
			// 補完元
			MST_PO_D_R srcPoDR = MST_PO_D_R.create();
			
			for (Chk01_DtlR r : up1()) {
				
				// まとめ先（明細行）に対応するまとめ元を取得する
				MCList<Chk01_Dtl2R> bndlL = (MCList<Chk01_Dtl2R>) getRelatedBndlList(r, up2(), _idxDtl2L);
				
				// まとめ元行の中から、補完元となる発注明細ＮＯを取得する
				Chk01_Dtl2R srcDtl2R = Chk01_Dtl2R.create();
				for (Chk01_Dtl2R bndlR : bndlL) {
					if (!isNull(bndlR.po_d_no())) {
						if (srcDtl2R.isEmpty()) {
							srcDtl2R = bndlR.clone();
						}
						// まとめ可能チェックのため、製造指図済ＦＬＧを設定しておく
						MST_PO_D_R poDR = _poDL.getFirst(_idxPoDL, srcDtl2R.po_d_no());
						bndlR.mfg_inst_flg(poDR.getBooleanNE("mfg_inst_flg"));
					}
				}
				
				if (srcDtl2R.isEmpty()) {
					// 追加行の場合更新前の発注明細はないので中断
					continue;
				}
				
				// まとめ元行の発注明細行から補完元となる発注明細を取得する。
				srcPoDR = _poDL.getFirst(_idxPoDL, srcDtl2R.po_d_no());
				
				// 補完処理
				r.itm_cd(srcPoDR.itm_cd());
				r.itm_sub1(srcPoDR.itm_sub1());
				r.itm_sub2(srcPoDR.itm_sub2());
				r.itm_sub3(srcPoDR.itm_sub3());
				if (srcPoDR.sundry_itm_flg()) {
					if (isNull(r.itm_nm())) {
						r.itm_nm(srcPoDR.itm_nm());
					}
					if (isNull(r.iv_itm_nm())) {
						r.iv_itm_nm(srcPoDR.iv_itm_nm());
					}
				}

				r.sundry_itm_flg(srcPoDR.sundry_itm_flg());
				r.bom_ptn(srcPoDR.bom_ptn());
				r.mfg_loc_cd(srcPoDR.mfg_loc_cd());
				r.outsrc_flg(srcPoDR.outsrc_flg());
				if (r.outsrc_flg()) {
					r.maker_cd(srcPoDR.maker_cd());
				}
				r.rqst_can_flg(srcPoDR.rqst_can_flg());
				if (!isNull(r.po_d_no())) {
					// まとめをしていない場合（まとめすると発注明細ＮＯをクリアする）
					r.slo_no(srcPoDR.slo_no());
					r.slo_d_no(srcPoDR.slo_d_no());
					r.io_schd_pr_no(srcPoDR.io_schd_pr_no());
					r.po_schd_no(srcPoDR.po_schd_no());
					r.po_no(srcPoDR.po_no());
					r.po_d_no(srcPoDR.po_d_no());
					r.outsrc_itm_ord_no(srcPoDR.outsrc_itm_ord_no());
				}
				if (!isNull(r.slo_no()) && !r.rqst_can_flg()) {
					// 依頼元が受注の場合手配ＮＯは変更不可である。
					r.sno1(srcPoDR.sno1());
					r.sno2(srcPoDR.sno2());
					r.sno3(srcPoDR.sno3());
					r.sno4(srcPoDR.sno4());
					r.setStringNE("bef_sno1", srcPoDR.sno1());
				}
			}
		}
		
		/**
		 * 入荷進捗情報
		 * @param dtlL
		 * @return
		 */
		@SuppressWarnings("unchecked")
		protected MCMessageList completionArrPr () {
			
			for (Chk01_DtlR dtlR : up1()) {
				// 明細に対応するまとめリストを取得
				MCList<Chk01_Dtl2R> dtl2L = (MCList<Chk01_Dtl2R>) getRelatedBndlList(dtlR, up2(), _idxDtl2L);
				for (Chk01_Dtl2R dtl2R : dtl2L) {
					// 排他チェック
					MST_ARR_PR_R arrPrR = _arrPrL.getFirst(_idxArrPrL, dtl2R.po_d_no());
					
					MCMessageList tmpL = new MCMessageList();
					tmpL.addAll(checkUpdCntrNE(dtl2R, Chk01_Dtl2R.$arr_pr_upd_cntr, arrPrR));
					if (tmpL.size() > 0) {
						return tmpL;
					}
					else {
						// チェック処理用に設定
						dtl2R.setBooleanNE("bef_abort_flg", arrPrR.abort_flg());
						if (!isNull(arrPrR) && MSBDL_PurcUtil.chkPoNotUpd(arrPrR, false)) {
							dtl2R.setBooleanNE("next_opr_flg", true);
						}
					}
				}
			}
			return new MCMessageList(); 
		}
		
		/**
		 * チェックのために、該当発注予定が製造指図済であるかどうかを設定します。
		 */
		protected void completionMfgInst () {
			// 対応する品目製造指図が存在する場合、まとめ不可チェックのために製造指図済である目印をつける
			for (MST_PO_D_R r : _poDL) {
				MST_ITM_MFG_INST_R instR = _itmMnfctInstL.getFirst(_idxItmMnfctInstL, r.outsrc_itm_ord_no());
				if (!isNull(instR)) {
					_poDL.setBooleanNE("mfg_inst_flg", true);
				}
			}
		}
		
		/**
		 * 伝票更新時のチェック
		 * @param r
		 */
		@SuppressWarnings("unchecked")
		protected MCMessageList checkSubWhenUpd() {
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(checkBpStop(up0()));
			
			if (!isNull(_aprvR) 
					&& (MAC_APRV_STS_TYP.isFIX(_aprvR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(_aprvR.aprv_sts_typ()))
					&& !_aprvR.aprv_upd_flg()) {
				// 承認中の場合更新できない
				msgL.add(new MCMessage(up0(), null , MSBDL0095));
			}
			
			// 入荷進捗
			for (Chk01_DtlR dtlR : up1()) {
				MST_ARR_PR_R arrPrR = _arrPrL.getFirst(_idxArrPrL, dtlR.po_d_no());
				if (!isNull(arrPrR)) {
					if (MSBDL_PurcUtil.chkPoNotUpd(arrPrR, false)) {
						if (dtlR.abort_flg()) {
							if (!dtlR.arr_rem_abort_flg() && !dtlR.purc_rem_abort_flg()) {
								// 入荷実績あるいは仕入実績が登録されているため、更新できません。
								msgL.add(new MCMessage(up0(), null, MSBDL0093, toDispGUIIndex(dtlR)));
							}
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							// 入荷実績あるいは仕入実績が登録されているため、取消できません。
							msgL.add(new MCMessage(up0(), null, MSBDL0098, toDispGUIIndex(dtlR)));
						}
					}
					else {
						if (MSBDL_PurcUtil.chkPoNotUpd(arrPrR, true)) {
							if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
								// 入荷実績あるいは仕入実績が登録されているため、取消できません。
								msgL.add(new MCMessage(up0(), null, MSBDL0098, toDispGUIIndex(dtlR)));
							}
						}
					}
				}
				// 更新時に手配ＮＯを変更することはできない
				String befSno1 = dtlR.getStringNE("bef_sno1");
				if (!isNullOr(befSno1, dtlR.sno1()) && !isSame(befSno1, dtlR.sno1())) {
					MST_WRK_SNO_R bef = _wrkSnoL.getFirst(_idxWrkSnoL, befSno1);
					MST_WRK_SNO_R now = _wrkSnoL.getFirst(_idxWrkSnoL, dtlR.sno1());
					if (!isSame(bef.wrk_no(), now.wrk_no())) {
						msgL.add(new MCMessage(up0(), null, MSBDL0096, bef.wrk_no(), dtlR.po_d_no(), dtlR.sno1(), now.wrk_no(), toDispGUIIndex(dtlR)));
					}
				}
			}
			// 訂正前ＤＡＣチェック
			msgL.addAll(chkDac(_poR));
			return msgL;
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 取消前チェックを行う<br>
	 */
	public class Chk03 extends MSBDL_PoReg_MC_A.Chk03 {
		//-----------------------------
		// IndexKey
		//-----------------------------
		/** up2(up1に対応するup2取得時に使用) */
		MCIndexKey _idxDtl2L = null;
		//-----------------------------
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			preProc();
			super.doIt();
			if (!hasErr()) {
				callPoRegChk01(up0(), up1(), up2());
			}
			setDown();
		}
		
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ作成
			createCache();
			// ロックおよび補完処理
			msgL.addAll(completion());
			return msgL;
		}

		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0(), up1(), up2())) {
				// 取消固有チェック処理
				msgL.addAll(checkSubWhenDel());
			}
			return msgL;
		}

		/**
		 * チェック処理準備
		 */
		protected void preProc() {
			// IndexKey
			_idxDtl2L = up2().createIndex(Chk03_Dtl2R.$dtl_peg_no);
		}
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			// 発注予定
			createCachePoSchd(up1(), up2());
			// 発注
			createCachePo(up0());
			// 発注明細
			createCachePoD(up1());
			//　入荷進捗
			createCacheArrPr(up1());
			// 承認ヘッダ
			createCacheAprvH(up0());
		}
		
		/**
		 * ロック及び補完処理
		 * @return
		 */
		protected MCMessageList completion() {
			MCMessageList msgL = new MCMessageList();
			// 発注予定
			msgL = completionPoSchd();
			if (!msgL.isEmpty()) {
				return msgL;
			}
			// 発注
			msgL = completionPo();
			if (!msgL.isEmpty()) {
				return msgL;
			}
			// 発注明細
			completionPoD();
			// 入荷進捗
			msgL = completionArrPr(up1());
			if (!msgL.isEmpty()) {
				return msgL;
			}
			
			return msgL;
		}
		/**
		 * 発注予定情報
		 */
		protected MCMessageList completionPoSchd() {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk03_Dtl2R r : up2()) {
				MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, r.po_schd_no());
				if (isNull(poSchdR)) {
					continue;
				}
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$po_schd_upd_cntr, poSchdR));
				if (!msgL.isEmpty()) {
					return msgL;
				}
			}
			return msgL;
		}
		/**
		 * 発注情報
		 */
		protected MCMessageList completionPo() {
			MCMessageList msgL = new MCMessageList();
			// 更新カウンタチェック
			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$po_upd_cntr, _poR));
			if (msgL.size() == 0) {
				up0().po_rev(_poR.po_rev());
				up0().trd_ptn_typ(_poR.trd_ptn_typ());
			}
			else {
				return msgL;
			}
			return msgL;
		}
		
		/**
		 * 発注明細情報
		 */
		protected void completionPoD () {
			for (Chk03_DtlR r : up1()) {
				MST_PO_D_R poDR = _poDL.getFirst(_idxPoDL, r.po_d_no());
				r.po_d_no(poDR.po_d_no());
				r.outsrc_flg(poDR.outsrc_flg());
				r.outsrc_itm_ord_no(poDR.outsrc_itm_ord_no());
				r.po_schd_no(poDR.po_schd_no());
				r.bndl_flg(poDR.bndl_flg());
			}
		}
		/**
		 * 入荷進捗情報
		 */
		@SuppressWarnings("unchecked")
		protected MCMessageList completionArrPr(MCList<Chk03_DtlR> dtlL) {
			for (Chk03_DtlR dtlR : dtlL) {
				MCList<Chk03_Dtl2R> dtl2L = (MCList<Chk03_Dtl2R>) getRelatedBndlList(dtlR, up2(), _idxDtl2L);
				MST_ARR_PR_R arrPrR = _arrPrL.getFirst(_idxArrPrL, dtlR.po_d_no());
				for (Chk03_Dtl2R dtl2R : dtl2L) {
					MCMessageList tmpL = new MCMessageList();
					tmpL = checkUpdCntrNE(dtl2R, Chk03_Dtl2R.$arr_pr_upd_cntr, arrPrR);
					if (!tmpL.isEmpty()) {
						return tmpL;
					}
				}
			}
			return new MCMessageList();
		}
		
		/**
		 * 伝票削除時のチェック
		 * @param r
		 */
		@SuppressWarnings("unchecked")
		protected MCMessageList checkSubWhenDel() {
			MCMessageList msgL = new MCMessageList();
			if (!isNull(_aprvR) 
					&& (MAC_APRV_STS_TYP.isFIX(_aprvR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(_aprvR.aprv_sts_typ()))
					&& !_aprvR.aprv_can_flg()) {
				msgL.add(new MCMessage(up0(), null , MSBDL0095));
			}
			// 入荷進捗
			for (Chk03_DtlR dtlR : up1()) {
				MST_ARR_PR_R arrPrR = _arrPrL.getFirst(_idxArrPrL, dtlR.po_d_no());
				if (MSBDL_PurcUtil.chkPoNotUpd(arrPrR, false)) {
					// 入荷実績あるいは仕入実績が登録されているため、取消できません。
					msgL.add(new MCMessage(up0(), null, MSBDL0098, toDispGUIIndex(dtlR)));
				}
			}
			// 削除前ＤＡＣチェック
			msgL.addAll(chkDac(_poR));
			return msgL;
		}
		/**
		 * 発注登録サービスのChk01を呼び出す。
		 */
		protected void callPoRegChk01(Chk03_HdrR hdrR, MCList<Chk03_DtlR> dtlL, MCList<Chk03_Dtl2R> dtl2L){
			MSBDL_PoRegService.Po_Chk01 poChk01 = MSBDL_PoRegService.crtPo_Chk01();
			
			MCIndexKey dtl2Key = dtl2L.createIndex(Chk03_Dtl2R.$dtl_peg_no);
			int dtl2PegNo = 0;
			
			Po_Ins01_HdrR ins01HdrR = Po_Ins01_HdrR.create();
			copy(ins01HdrR, hdrR, createMap_Po_Ins01_HdrR_Chk03_HdrR());
			poChk01.up0().add(ins01HdrR);
			
			for (Chk03_DtlR r : dtlL) {
				Po_Ins01_DtlR ins01DtlR = Po_Ins01_DtlR.create();
				copy(ins01DtlR, r, createMap_Po_Ins01_DtlR_Chk03_DtlR());
				poChk01.up1().add(ins01DtlR);
				
				
				MCList<Chk03_Dtl2R> dtl2SubL = dtl2L.subList(dtl2Key, r.dtl_peg_no());
				for (Chk03_Dtl2R dtl2R : dtl2SubL) {
					MST_PO_D_R poDR = _poDL.getFirst(_idxPoDL, dtl2R.po_d_no());
					Po_Ins01_Bndl_DtlR up2R = Po_Ins01_Bndl_DtlR.create();
					up2R.peg_no(dtl2PegNo++);
					up2R.dtl_peg_no(dtl2R.dtl_peg_no());
					up2R.po_schd_no(dtl2R.po_schd_no());
					up2R.outsrc_itm_ord_no(poDR.outsrc_itm_ord_no());
					up2R.po_d_no(dtl2R.po_d_no());
					poChk01.up2().add(up2R);
				}
			}
			
			poChk01.exec();
			
			copyErrFlg(hdrR, poChk01.down0().get(0));
			copyErrFlg(dtlL, poChk01.down1());
		}
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	
	
	/**
	 * 発注情報
	 */
	protected void createCachePo (MCRow hdrR) {
		_poR = MST_PO_R.create();
		MST_PO_R t = MST_PO_R.create("T");
		MCQueryApiBuilder poR_bldr = MCQueryApiBuilder.create(t);
		poR_bldr.setOrderByAsc(t.po_no);
		dbSelectKeyForUpdateNoWait("MSBDL0080_MST_PO_S02", _poR, poR_bldr, hdrR);
	}
	
	/**
	 * 入荷進捗情報
	 * @param dtlL
	 */
	protected void createCacheArrPr (MCList<?> dtlL) {
		_arrPrL = MCList.create(MST_ARR_PR_R.class);
		MCList<MCRow> bindL = MCList.create(MCRow.class); 
		for (MCRow r : dtlL) {
			if (!isNull(r.getStringNE("po_d_no"))){
				bindL.add(r);
			}
		}
		if (!bindL.isEmpty()) {
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setOrderByAsc(t.po_d_no);
			arrPrL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			dbSelectForUpdateNoWait("MSBDL0080_MST_ARR_PR_S01", _arrPrL, arrPrL_bldr, bindL);
		}
		_idxArrPrL = _arrPrL.createIndex(MST_ARR_PR_R.$po_d_no);
	}	
	/**
	 * 発注予定情報
	 * @param dtlL  明細リスト
	 * @param dtl2L 明細に対応するまとめリスト
	 */
	protected void createCachePoSchd (MCList<?> dtlL, MCList<?> dtl2L) {
		_poSchdL = MCList.create(MST_PO_SCHD_R.class);
		MCList<MST_PO_SCHD_R> tmpBindL = MCList.create(MST_PO_SCHD_R.class);
		
		// 対応する発注予定を取得するため発注予定NOのbindリストを作成
		for (MCRow r : dtl2L) {
			MST_PO_SCHD_R poSchdR = MST_PO_SCHD_R.create();
			poSchdR.po_schd_no(r.getStringNE("po_schd_no"));
			tmpBindL.add(poSchdR);
		}
		
		// 発注予定の取得およびロック
		if (!tmpBindL.isEmpty()) {
			MCList<MST_PO_SCHD_R> bindL = tmpBindL.groupBy(MST_PO_SCHD_R.$po_schd_no);
			MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdL_bldr = MCQueryApiBuilder.create(t);
			poSchdL_bldr.setOrderByAsc(t.po_schd_no);
			dbSelectKeyForUpdateNoWait("MSBDL0080_MST_PO_SCHD_S02", _poSchdL, poSchdL_bldr, bindL);
		}
		_idxPoSchdL = _poSchdL.createIndex(MST_PO_SCHD_R.$po_schd_no);
	}
	/**
	 * キャッシュ作成（受注明細）
	 * @param dtlL
	 * @return
	 */
	protected void createCacheSloD () {
		// 対応する受注情報を取得
		_sloDL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
		sloDL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		dbSelect("MSBDL0080_MST_SLO_D_S01", _sloDL, sloDL_bldr, _poSchdL);
		_idxSloDL = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
	}
	/**
	 * キャッシュ作成（発注明細情報）
	 */
	protected void createCachePoD (MCList<?> dtlL) {
		_poDL = MCList.create(MST_PO_D_R.class);
		MCList<MCRow> bindL = MCList.create(MCRow.class); 
		for (MCRow r : dtlL) {
			if (!isNull(r.getStringNE("po_d_no"))){
				bindL.add(r);
			}
		}
		if (!bindL.isEmpty()) {
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t);
			poDL_bldr.setWhere(t.can_flg.eq(value(false)));
			poDL_bldr.addWhereWithAnd(t.po_d_no.eq(bind("po_d_no")));
			poDL_bldr.setOrderByAsc(t.po_d_no);
			dbSelect("MSBDL0080_MST_PO_D_S01", _poDL, poDL_bldr, bindL);
		}
		_idxPoDL = _poDL.createIndex(MST_PO_D_R.$po_d_no);
	}
	/**
	 * キャッシュ作成（品目禁止）
	 * @param dtlL
	 * @return
	 */
	protected void createCacheItmStop(MCList<Chk01_DtlR> dtlL) {
		// 品目禁止マスタ取得
		_itmStopL = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
				MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")),
				dtlL.groupBy(Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1,
						Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3),
				Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2,
				Chk01_DtlR.$itm_sub3);
	}
	/**
	 * キャッシュ作成（承認）
	 * @param hdrR
	 * @return
	 */
	protected void createCacheAprvH(MCRow hdrR) {
		_aprvR = MBT_APRV_R.create();
		MBT_APRV_R t = MBT_APRV_R.create("T");
		MCQueryApiBuilder aprvR_bldr = MCQueryApiBuilder.create(t);
		aprvR_bldr.setWhere(t.aprv_no.eq(bind("aprv_no")));
		aprvR_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBDL0080_MBT_APRV_S01", _aprvR, aprvR_bldr, hdrR);
	}
	
	/**
	 * キャッシュ作成（品目製造指図）
	 */
	protected void createCacheItmMnfctInst(MCList<?> bind) {
		// 発注予定の外注品目オーダNOに対応する品目製造指図を取得する
		_itmMnfctInstL = MCList.create(MST_ITM_MFG_INST_R.class);
		MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
		MCQueryApiBuilder itmMnfctInstL_bldr = MCQueryApiBuilder.create(t);
		itmMnfctInstL_bldr.setWhere(t.itm_ord_no.eq(bind("outsrc_itm_ord_no")));
		itmMnfctInstL_bldr.addWhereWithAnd(t.can_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(false));
		dbSelect("MSBDL0080_MST_ITM_MFG_INST_S01", _itmMnfctInstL, itmMnfctInstL_bldr, bind);
		_idxItmMnfctInstL = _itmMnfctInstL.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
	}
	
	/**
	 * 補完処理
	 * @param dtlR
	 */
	protected void completionSub(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL){
		if (!hdrR.xrate_inpt_flg()) {
			hdrR.xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PURC_XRATE", "01"),
					MAPA_XCHNG$F_GET_PURC_XRATE(bind("trd_cur_cd"), bind("po_dt")), hdrR));
		}
		if (!hdrR.ptax_xrate_inpt_flg()) {
			MCRow bindR = MCRow.create();
			bindR.addStringColumn("trd_cur_cd", hdrR.trd_cur_cd());
			bindR.addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			bindR.addStringColumn("purc_xrate_cd", getCo().purc_xrate_cd());
			bindR.addDateColumn("po_dt", hdrR.po_dt());
			if (!isNull(getCo().ptax_cur_cd())) {
				hdrR.ptax_xrate(execFuncNumber(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_XRATE", "01"),
						MAPA_XCHNG$F_GET_XRATE(bind("trd_cur_cd"), bind("ptax_cur_cd"), bind("purc_xrate_cd"), bind("po_dt")),
						bindR));
			}
		}
		boolean setWtaxRate = false;
		if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd()) && 
				(isSame(hdrR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd()))) {
			setWtaxRate = true;
		}
		
		for (Chk01_DtlR dtlR : dtlL) {
			// 無償受給・ＶＭＩの場合単価無視
			if (isNonPurc(dtlR)) {
				dtlR.upri_not_tgt_flg(false);
				dtlR.trd_cur_upri(null);
				dtlR.trd_cur_proc_upri(null);
				dtlR.trd_cur_onr_prov_upri(null);
				dtlR.interim_flg(false);
				dtlR.trd_cur_dscnt_amt(null);
				dtlR.dscnt_rsn_cd(null);
				dtlR.tax_cd(null);
				dtlR.wtax_rate(null);
				dtlR.purc_upri_req_typ(null);
				dtlR.purc_schd_dt(null);
				dtlR.pay_crryovr_times(null);
			}
			if (dtlR.dscnt_itm_flg()) {
				dtlR.trd_unit_qty(MCNumber.ONE);
			}
			
			if (!isNull(dtlR.dlv_rqst_tm()) && !dtlR.dlv_rqst_tm().eqDate(dtlR.purc_schd_dt())) {
				dtlR.sync_flg(false);
			}
			
			if (!setWtaxRate) {
				dtlR.wtax_rate(null);
			}

		}
	}

	/**
	 * 共通チェック
	 * @param hdrR
	 * @param dtlL
	 * @return
	 */
	protected MCMessageList checkSub(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL, MCList<Chk01_Dtl2R> dtl2L, boolean isIns) {
		MCMessageList msgL = new MCMessageList();
		//----------------------------
		// チェック前処理（ヘッダ）
		//----------------------------
		if (isNullOrNullVal(hdrR.wrk_no()) && isIns) {
			if (!isNull(_wrkSnoL.getFirst(_idxWrkSnoL, dtlL.get(0).sno1()))) {
				hdrR.wrk_no(_wrkSnoL.getFirst(_idxWrkSnoL, dtlL.get(0).sno1()).wrk_no());
			}
		}
		
		//----------------------------
		// 全般的なチェック
		//----------------------------
		// 有効桁数チェック
		dtlL.addNumberColumn("trd_cur_upri_dec_place", hdrR.trd_cur_upri_dec_place());
		msgL.addAll(checkDecPlace(dtlL, Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
		msgL.addAll(checkDecPlace(dtlL, "trd_cur_upri_dec_place", Chk01_DtlR.$trd_cur_upri));
		// 条件付必須チェック
		if (hdrR.xrate_inpt_flg()) {
			msgL.addAll(check(hdrR, Chk01_HdrR.$xrate, new FXUCL_RequiredValidater()));
		}
		if (hdrR.ptax_xrate_inpt_flg()) {
			msgL.addAll(check(hdrR, Chk01_HdrR.$ptax_xrate, new FXUCL_RequiredValidater()));
		}
		// 登録、訂正後ＤＡＣチェック
		msgL.addAll(chkDac(hdrR));
		// 明細行が1件以上あるかチェック
		msgL.addAll(checkAtLeastOneDtl(hdrR, dtlL));
		
		for (Chk01_DtlR dtlR : dtlL) {
			if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				continue;
			}
				
			//----------------------------
			// チェック前処理（明細）
			//----------------------------
			setDrctDlvTyp(dtlR);
			hdrR.base_cur_cd(getCo().base_cur_cd());
			hdrR.ptax_cur_cd(getCo().ptax_cur_cd());
			hdrR.setStringNE("wtax_rnd_typ", getCo().wtax_rnd_typ());
			complProcUpriAmt(dtlR);
			MSBDL_PurcUtil.setAmtInfo(hdrR, dtlR);
			// 買戻し義務がオンの場合、加工金額を元に税額を再計算する
			if(dtlR.outsrc_flg() && hdrR.repurc_obli_flg() && MAC_OUTSRC_UPRI_TYP.isPROC_PROV(nvl(hdrR.outsrc_upri_typ(), getCo().outsrc_upri_typ()))) {
				if(dtlR.inc_tax_flg()) {
					// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
					MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(dtlR.trd_cur_proc_upri(),
							dtlR.trd_unit_qty(),
							hdrR.trd_cur_amt_dec_place(),
							hdrR.purc_amt_rnd_typ(),
							dtlR.trd_cur_dscnt_amt());
					dtlR.trd_cur_proc_amt(proc_inc_tax_amt);
					// 有償支給金額は金額-加工金額
					dtlR.trd_cur_onr_prov_amt(!isNull(dtlR.trd_cur_inc_tax_amt()) ? dtlR.trd_cur_inc_tax_amt().subtract(proc_inc_tax_amt) : null);
				}
				MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
						dtlR.trd_cur_proc_amt(),
						dtlR.tax_rate(),
						hdrR.trd_cur_amt_dec_place(),
						hdrR.purc_tax_rnd_typ(),
						dtlR.inc_tax_flg()
						);
				dtlR.trd_cur_tax_amt(trdCurTaxAmt);
				if(dtlR.inc_tax_flg()) {
					MCNumber amt = (dtlR.trd_cur_inc_tax_amt() != null) ? dtlR.trd_cur_inc_tax_amt().subtract(trdCurTaxAmt) : null;
					MCNumber proc_amt = !isNull(dtlR.trd_cur_proc_amt()) ? dtlR.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
					dtlR.trd_cur_amt(amt);
					dtlR.trd_cur_proc_amt(proc_amt);
				}
			}
			setBaseUnitInfo(dtlR);
			//----------------------------
			// 日付チェック
			//----------------------------
			FXUCL_BeforeAfterValidater validator = new FXUCL_BeforeAfterValidater();
			validator.setBefore(hdrR, Chk01_HdrR.$po_dt);
			msgL.addAll(check(dtlL, new String[] {Chk01_DtlR.$dlv_rqst_tm}, validator));
			msgL.addAll(check(dtlL, new String[] {Chk01_DtlR.$purc_schd_dt}, validator));
			
			
			// 発注禁止でないか(品目)
			MAM_ITM_STOP_R itmStopR =_itmStopL.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
			if (!isNull(itmStopR.po_stop_dt()) && itmStopR.po_stop_dt().lte(hdrR.po_dt())) {
				msgL.add(new MCMessage(dtlR, null , MSBDL0089, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()), toYMDString(hdrR.po_dt()), toYMDString(itmStopR.po_stop_dt()), toDispGUIIndex(dtlR)));
			}
			//----------------------------
			// 条件付必須チェック
			//----------------------------
			if (dtlR.ver_flg()) {
				// 版管理対象の場合版必須
				msgL.addAll(check(dtlR, Chk01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
			}
			if (!isNonPurc(dtlR)) {
				// 無償受給・ＶＭＩ以外の場合
				msgL.addAll(check(dtlR, Chk01_DtlR.$purc_schd_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, Chk01_DtlR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
				msgL.addAll(check(dtlR, Chk01_DtlR.$tax_cd, new FXUCL_RequiredValidater()));
			}
			//----------------------------
			// 外注関連チェック
			//----------------------------
			if (dtlR.outsrc_flg()) {
				msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_proc_upri, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
				
				// 外注品のＶＭＩ・無償受給での発注はできない
				if (isNonPurc(dtlR)) {
					msgL.add(new MCMessage(dtlR, null , MSBDL0076, toDispGUIIndex(dtlR)));
				}
				// 外注品の経費購買はできない
				if (isXpnsPurc(hdrR, dtlR)) {
					msgL.add(new MCMessage(dtlR, null , MSBDL0080, toDispGUIIndex(dtlR)));
				}
			}
			//----------------------------
			// 経費購買関連チェック
			//----------------------------
			boolean xpnsErrFlg = false;
			// 経費購買の場合、資産管理しない品目しか登録できない
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(hdrR.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ())) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0149, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						toDispGUIIndex(dtlR)));
				xpnsErrFlg = true;
			}
			// 資産管理する品目に経費理由を設定できない
			if (MAC_ASSET_MNG_TYP.isMNG(dtlR.asset_mng_typ()) && dtlR.xpns_purc_flg()) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0150, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
				xpnsErrFlg = true;
			}
			// 資産管理しない品目には経費理由しか設定できない
			if (MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ()) && !dtlR.xpns_purc_flg()) {
				msgL.add(new MCMessage(dtlR, null, MSBDL0151, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()),
						dtlR.purc_rsn_cd(), toDispGUIIndex(dtlR)));
				xpnsErrFlg = true;
			}
			if (!xpnsErrFlg && isXpnsPurc(hdrR, dtlR) && !isNonPurc(dtlR)) {
				// 経費購買の場合負担部門は必須
				msgL.addAll(check(dtlR, Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
				
			}
			//----------------------------
			// 金額関連チェック
			//----------------------------
			if (!isNull(dtlR.trd_cur_dscnt_amt()) && dtlR.trd_cur_dscnt_amt().gt(MCNumber.ZERO)) {
				// 値引理由の必須チェック
				msgL.addAll(check(dtlR, Chk01_DtlR.$dscnt_rsn_cd, new FXUCL_RequiredValidater()));
			}
			// 単価「0」指定で、値引額が入力されていないかチェック
			msgL.addAll(checkDscntAmt(dtlR, Chk01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_dscnt_amt));

			if (!isNonPurc(dtlR)) {
				// 値引額が大きすぎて金額が負の値になってはいけない
				msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_amt, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
				msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
				msgL.addAll(check(dtlR, Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
			}
			
			//----------------------------
			// まとめ関連・依頼元に応じてチェック
			//----------------------------
			// まとめ処理と打切りは同時にできない
			if (dtlR.bndl_flg() && isNull(dtlR.po_d_no()) && dtlR.abort_flg()) {
				msgL.add(new MCMessage(dtlR, null , MSBDL0081, toDispGUIIndex(dtlR)));
			}
			// まとめ対象をチェック
			MCList<Chk01_Dtl2R> subL = dtl2L.subList(Chk01_Dtl2R.$dtl_peg_no, dtlR.dtl_peg_no());
			for (Chk01_Dtl2R dtl2R : subL) {
				if (dtlR.bndl_flg()) {
					if (dtl2R.mfg_inst_flg() && isNull(dtlR.po_d_no())) {
						// 製造指図済の明細をまとめることはできない
						msgL.add(new MCMessage(dtlR, null , MSBDL0082, toDispGUIIndex(dtlR)));
					}
					if (dtl2R.getBooleanNE("next_opr_flg") && MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
						// 入荷・仕入済の明細をまとめることはできない
						msgL.add(new MCMessage(dtlR, null , MSBDL0094, toDispGUIIndex(dtlR)));
					}
				}
				// ＷＧ間依頼または受注からの依頼の場合は、取引ＣＤに見合う仕入理由のみ選択可能
				if (MSC_PO_SCHD_SRC_TYP.isRQST(dtl2R.po_schd_src_typ())
						||MSC_PO_SCHD_SRC_TYP.isSLO(dtl2R.po_schd_src_typ())){
					// 経費購買なのに仕入理由は不可
					if (isXpnsPurc(hdrR, dtlR)) {
						if (!dtlR.xpns_purc_flg()) {
							msgL.add(new MCMessage(dtlR, null , MSBDL0079, toDispGUIIndex(dtlR)));
						}
					}
					// 取引が経費購買でないのに経費理由は不可
					else {
						if (dtlR.xpns_purc_flg()) {
							msgL.add(new MCMessage(dtlR, null , MSBDL0083, toDispGUIIndex(dtlR)));
						}
					}
				}
			}
			
			//----------------------------
			// 納品先チェック（受注紐付の場合）
			//----------------------------
			if (!isNull(dtlR.slo_d_no()) && !dtlR.rqst_can_flg()) {
				MST_SLO_D_R sloDR = _sloDL.getFirst(_idxSloDL, dtlR.slo_d_no());
				if (!isNull(sloDR) && MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ())) {
					if (diffSloDlvInfo(dtlR, sloDR)) {
						// 受注紐付の場合は、受注明細の納品先と同じで無いといけない。
						msgL.add(new MCMessage(dtlR, null , MSBDL0088));
					}
					if (diffSloQtyInfo(dtlR, sloDR)) {
						// 受注紐付の場合は、受注明細の数量と同じでないといけない。
						msgL.add(new MCMessage(dtlR, Chk01_DtlR.$trd_unit_qty, MSBDL0161, 
								sloDR.base_unit_qty(), dtlR.base_unit_qty(), toDispGUIIndex(dtlR)));
					}

					if (!MAC_PURC_ID_TYP.isPURC(dtlR.purc_id_typ())) {
						// 受注紐付の場合は、通常購買でないといけない。
						msgL.add(new MCMessage(dtlR, Chk01_DtlR.$purc_id_typ, MSBDL0155, dtlR.purc_id_typ(), toDispGUIIndex(dtlR)));
					}
				}
			}
			//----------------------------
			// その他チェック
			//----------------------------
			// 下請法対象取引先に対しては入荷同時検収でないといけない
			if (hdrR.subcon_flg() && !isNonPurc(dtlR)) {
				if (!dtlR.dlv_rqst_tm().eqDate(dtlR.purc_schd_dt())) {
					msgL.add(new MCMessage(dtlR, null , MSBDL0074, toDispGUIIndex(dtlR)));
				}
			}
			// ＶＭＩ品の直送は不可
			if (!isNull(dtlR.outsrc_sppl_cd()) && MAC_PURC_ID_TYP.isVMI(dtlR.purc_id_typ())) {
				msgL.add(new MCMessage(dtlR, null , MSBDL0077, toDispGUIIndex(dtlR)));
			}
			// 在庫管理対象外のＶＭＩ発注は不可
			if (!MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())  && MAC_PURC_ID_TYP.isVMI(dtlR.purc_id_typ())) {
				msgL.add(new MCMessage(dtlR, null , MSBDL0148, toDispGUIIndex(dtlR)));
			}
			// 明細の手配ＮＯ１に対応する案件と、発注ヘッダ.案件ＮＯが異なる
			if (!isNull(_wrkSnoL.getFirst(_idxWrkSnoL, dtlR.sno1()))) {
				if(!isSame(hdrR.wrk_no(), _wrkSnoL.getFirst(_idxWrkSnoL, dtlR.sno1()).wrk_no())){
					if (!isIns) {
						msgL.add(new MCMessage(dtlR, null, MSBDL0099, hdrR.wrk_no(), _wrkSnoL.getFirst(_idxWrkSnoL, dtlR.sno1()).wrk_no(), toDispGUIIndex(dtlR)));
					}
					else {
						msgL.add(new MCMessage(dtlR, null, MSBDL0192, _wrkSnoL.getFirst(_idxWrkSnoL, dtlR.sno1()).wrk_no(), toDispGUIIndex(dtlR)));
					}
				}
			}
			else if (!isNull(hdrR.wrk_no())) {
				if (!isIns) {
					msgL.add(new MCMessage(dtlR, null, MSBDL0099, hdrR.wrk_no(), null, toDispGUIIndex(dtlR)));
				}
				else {
					msgL.add(new MCMessage(dtlR, null, MSBDL0192, null, toDispGUIIndex(dtlR)));
				}
			}
		}
		// 仮単価が含まれる場合、変更注文書発行予定日が必須
		MCList<Chk01_DtlR> exceptDelL = dtlL.subList(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
		int interimUpriCnt = exceptDelL.subList(Chk01_DtlR.$interim_flg, true).size();
		if (hdrR.subcon_flg() && interimUpriCnt > 0) {
			msgL.addAll(check(hdrR, Chk01_HdrR.$upd_po_print_schd_dt, new FXUCL_RequiredValidater()));
		}
		
		// 値引品のみでは登録できません。
		int dscntItmCnt = exceptDelL.subList(Chk01_DtlR.$dscnt_itm_flg, true).size();
		if (dscntItmCnt > 0) {
			msgL.add(new MCMessage(MSBDL0092));
		}
		return msgL;
	}

	protected void complProcUpriAmt(Chk01_DtlR dtlR) {
		if (dtlR.outsrc_flg()) {
			if (isNull(dtlR.trd_cur_proc_upri())) {
				dtlR.trd_cur_proc_upri(MCNumber.ZERO);
			}
		}
	}

	/**
	 * 品目詳細マスタの存在チェックを行います。
	 * @return
	 */
	protected MCMessageList checkExistItmDtl(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
		for (Chk01_DtlR r : dtlL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}
			// 品目詳細マスタの存在チェックを行う
			MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
			itmDtlR.setAttributes(r);
			itmDtlR.itm_cd(r.itm_cd());
			itmDtlR.itm_sub1(r.itm_sub1());
			itmDtlR.itm_sub2(r.itm_sub2());
			itmDtlR.itm_sub3(r.itm_sub3());
			itmDtlR.mfg_loc_cd(r.mfg_loc_cd());
			if(isNullOrNullVal(r.mfg_loc_cd())) {
				itmDtlR.sppl_cd(hdrR.sppl_cd());
				itmDtlR.maker_cd(r.maker_cd());
			}
			else {
				itmDtlR.sppl_cd(MAC_STR.NULL_VAL.value());
				itmDtlR.maker_cd(MAC_STR.NULL_VAL.value());
			}
			itmDtlR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
			itmDtlR.wg_cd(r.in_to_loc_wg_cd());
			itmDtlR.bom_ptn(r.bom_ptn());
			itmDtlR.st_dt(isSame(getSysParm("MASTER_DT_BASE") , "1") ?  r.rqst_avl_rqst_dt() : hdrR.po_dt());
			itmDtlL.add(itmDtlR);
		}
		return MSUCL_ProdUtil.chkItmDtlKey(itmDtlL);
	}

	/**
	 * 負担項目の各種ＮＯの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 * @return メッセージリスト
	 */
	protected MCMessageList existBdCheck(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();
		MCList<Chk01_DtlR> bdLotChkTgtL = MCList.create(Chk01_DtlR.class);
				
		for (Chk01_DtlR dr : dtlL) {
			if (dr.getStatus() == MCRow.DELETE) {
				continue;
			}
			if (!isNull(dr.bd_po_no())) {
				if (!existsPoNo(dr.bd_po_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_po_no, MSBDL0175, dr.bd_po_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_slo_no())) {
				if (!existsSloNo(dr.bd_slo_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_slo_no, MSBDL0177, dr.bd_slo_no(), toDispGUIIndex(dr)));
				}
			}
			if (!isNull(dr.bd_lot_no()) && !isNull(dr.bd_itm_cd())) {
				bdLotChkTgtL.add(dr);
			}
			if (!isNull(dr.bd_iv_no())) {
				if (!existsBdIvNo(dr.bd_iv_no())) {
					msgL.add(new MCMessage(dr, Chk01_DtlR.$bd_iv_no, MSBDL0179, dr.bd_iv_no(), toDispGUIIndex(dr)));
				}
			}
			
		}		
		callLotServiceChkBdItm(bdLotChkTgtL);
		
		return msgL;
	}
	/**
	 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
	 * @param dtlL 明細上り電文リスト(新規、または更新)
	 */
	protected void callLotServiceChkBdItm(MCList<Chk01_DtlR> dtlL) {
		if (dtlL.isEmpty()) {
			return;
		}		
		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
		addAll(ope.up0(), dtlL, createMap_Lot_Chk03_CndR_Chk01_DtlR());
		ope.exec();		
		copyErrFlg(dtlL, ope.up0());
	}
	
	/**
	 * 発注登録サービスのChk01を呼び出す。
	 */
	protected void callPoRegChk01(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL, MCList<Chk01_Dtl2R> dtl2L){
		MSBDL_PoRegService.Po_Chk01 poChk01 = MSBDL_PoRegService.crtPo_Chk01();
		
		Po_Ins01_HdrR ins01HdrR = Po_Ins01_HdrR.create();
		copy(ins01HdrR, hdrR, createMap_Po_Ins01_HdrR_Chk01_HdrR());
		poChk01.up0().add(ins01HdrR);
		
		MCIndexKey dtl2Key = dtl2L.createIndex(Chk01_Dtl2R.$dtl_peg_no);
		int dtl2PegNo = 0;
		
		for (Chk01_DtlR r : dtlL) {
			Po_Ins01_DtlR ins01DtlR = Po_Ins01_DtlR.create();
			copy(ins01DtlR, r, createMap_Po_Ins01_DtlR_Chk01_DtlR());
			poChk01.up1().add(ins01DtlR);
			
			MCList<Chk01_Dtl2R> dtl2SubL = dtl2L.subList(dtl2Key, r.dtl_peg_no());
			for (Chk01_Dtl2R dtl2R : dtl2SubL) {
				String outsrcItmOrdNo = "";
				if (isNull(dtl2R.po_d_no())) {
					MST_PO_SCHD_R poSchdR = _poSchdL.getFirst(_idxPoSchdL, dtl2R.po_schd_no());
					outsrcItmOrdNo = poSchdR.outsrc_itm_ord_no();
				}
				else {
					MST_PO_D_R poDR = _poDL.getFirst(_idxPoDL, dtl2R.po_d_no());
					outsrcItmOrdNo = poDR.outsrc_itm_ord_no();
				}
				
				Po_Ins01_Bndl_DtlR up2R = Po_Ins01_Bndl_DtlR.create();
				up2R.peg_no(dtl2PegNo++);
				up2R.dtl_peg_no(dtl2R.dtl_peg_no());
				up2R.outsrc_itm_ord_no(outsrcItmOrdNo);
				up2R.po_d_no(dtl2R.po_d_no());
				up2R.po_schd_no(dtl2R.po_schd_no());
				poChk01.up2().add(up2R);
			}
		}
		
		poChk01.exec();
		
		copyErrFlg(hdrR, poChk01.down0().get(0));
		copyErrFlg(dtlL, poChk01.down1());
	}

	/**
	 * 対応する受注明細と納品先などを比較します。
	 * @param dtlR
	 * @param sloDR
	 * @return true:差異あり/false：差異なし
	 */
	protected boolean diffSloDlvInfo(Chk01_DtlR dtlR, MST_SLO_D_R sloDR) {
		String dlvNm = null;
		if (dtlR.dlv_sundry_flg()) {
			dlvNm = dtlR.dlv_nm(); 
		}
		String tdlvNm = null;
		if (dtlR.tdlv_sundry_flg()) {
			tdlvNm = dtlR.tdlv_nm(); 
		}
		
		if (!isSame(dtlR.in_to_loc_cd(), nvl(sloDR.loc_cd(), sloDR.def_loc_cd()))
				|| !isSame(dtlR.str_ln_cd(), nvl(sloDR.str_ln_cd(), MAC_STR.NULL_VAL.value()))
				|| !isSame(dtlR.dlv_cd(), sloDR.dlv_cd())
				|| !isSame(dlvNm, sloDR.dlv_nm())
				|| !isSame(dtlR.dlv_sundry_flg(), sloDR.dlv_sundry_flg())
				|| !isSame(dtlR.dlv_zip_cd(), sloDR.dlv_zip_cd())
				|| !isSame(dtlR.dlv_addr1(), sloDR.dlv_addr1())
				|| !isSame(dtlR.dlv_addr2(), sloDR.dlv_addr2())
				|| !isSame(dtlR.dlv_addr3(), sloDR.dlv_addr3())
				|| !isSame(dtlR.dlv_addr4(), sloDR.dlv_addr4())
				|| !isSame(dtlR.dlv_tel(), sloDR.dlv_tel())
				|| !isSame(dtlR.dlv_fax(), sloDR.dlv_fax())
				|| !isSame(dtlR.tdlv_cd(), sloDR.tdlv_cd())
				|| !isSame(tdlvNm, sloDR.tdlv_nm())
				|| !isSame(dtlR.tdlv_sundry_flg(), sloDR.tdlv_sundry_flg())
				|| !isSame(dtlR.tdlv_cntct_psn(), sloDR.tdlv_cntct_psn())
				|| !isSame(dtlR.tdlv_cntct_dpt(), sloDR.tdlv_cntct_dpt())
				|| !isSame(dtlR.tdlv_zip_cd(), sloDR.tdlv_zip_cd())
				|| !isSame(dtlR.tdlv_addr1(), sloDR.tdlv_addr1())
				|| !isSame(dtlR.tdlv_addr2(), sloDR.tdlv_addr2())
				|| !isSame(dtlR.tdlv_addr3(), sloDR.tdlv_addr3())
				|| !isSame(dtlR.tdlv_addr4(), sloDR.tdlv_addr4())
				|| !isSame(dtlR.tdlv_tel(), sloDR.tdlv_tel())
				|| !isSame(dtlR.tdlv_fax(), sloDR.tdlv_fax())
		) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 対応する受注明細と数量を比較します。
	 * @param dtlR
	 * @param sloDR
	 * @return true:差異あり/false：差異なし 
	 */
	protected boolean diffSloQtyInfo(Chk01_DtlR dtlR, MST_SLO_D_R sloDR) {
		if (!isSame(dtlR.base_unit_qty(), sloDR.base_unit_qty())
				|| !isSame(dtlR.base_unit_cd(), sloDR.base_unit_cd())) {
			// 仕入直送で受注数量と発注数量が異なっている
			return true;
		}
		else {
			// 仕入直送で受注数量と発注数量が同じである
			return false;
		}
	}

	/**
	 * 明細行に対応するまとめ行を取得します
	 * @param dtlR
	 * @param dtl2L
	 * @return
	 */
	protected MCList<?> getRelatedBndlList(MCRow dtlR, MCList<?> dtl2L, MCIndexKey idxDtl2L) {
		return dtl2L.subList(idxDtl2L, dtlR.getNumberNE("dtl_peg_no"));
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 発注情報を登録する<br>
	 */
	public class Ins01 extends MSBDL_PoReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwUpdErr();
			callPoRegPoIns01();
			setDown();
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			// 上り電文の編集（ヘッダ項目）
			editHdrCol(up0(), up1());
			
			// 上り電文の編集（明細項目）
			setPegNo(up1());
			setPegNo(up2());
			MCList<Chk01_Dtl2R> tmpL = up2().clone();
			for (Chk01_Dtl2R r : tmpL) {
				Chk01_DtlR up1R = up1().getFirst(Chk01_DtlR.$dtl_peg_no, r.dtl_peg_no());
				Chk01_Dtl2R up2R = up2().getFirst(Chk01_Dtl2R.$peg_no, r.peg_no());
				up2R.dtl_peg_no(up1R.peg_no());
			}
			for (Chk01_DtlR r : up1()) {
				r.dtl_peg_no(r.peg_no());
				if (!isNullOrNullVal(r.mfg_loc_cd()) && !r.outsrc_flg()) {
					r.outsrc_flg(true);
				}
			}
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up1().setNumberNE(Chk01_DtlR.$hdr_peg_no, up0().peg_no());
			up1().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		}
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBDL_PoReg.Chk01 chk01 = MSBDL_PoReg.crtChk01();
			MCRow.copyall(chk01.up0(), up0());
			chk01.up1().setAll(up1());
			chk01.up2().setAll(up2());
			chk01.exec();
			MCRow.copyall(up0(), chk01.down0());
			up1().setAll(chk01.down1());
			up2().setAll(chk01.down2());
		}
		/**
		 * 発注登録サービスを実行する
		 */
		protected void callPoRegPoIns01() {
			MSBDL_PoRegService.Po_Ins01 poIns01 = MSBDL_PoRegService.crtPo_Ins01();
			Po_Ins01_HdrR hdrR = Po_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_Po_Ins01_HdrR_Chk01_HdrR());
			poIns01.up0().add(hdrR);
			
			// 表示順
			setDispSeq(up1());
			
			addAll(poIns01.up1(), up1(), createMap_Po_Ins01_DtlR_Chk01_DtlR());
			addAll(poIns01.up2(), up2(), createMap_Po_Ins01_Bndl_DtlR_Chk01_Dtl2R());
			makePoInsUpdUp2(poIns01.up1(), poIns01.up2());
			poIns01.exec();
			
			Po_Ins01_HdrR poInsDown0 = poIns01.down0().get(0);
			up0().po_no(poInsDown0.po_no());
			up0().po_rev(poInsDown0.po_rev());
			up0().aprv_flg(poInsDown0.aprv_flg());
			up0().aprv_no(poInsDown0.aprv_no());
			up0().aprv_sts_typ(poInsDown0.aprv_sts_typ());
			
			String[] destCols = {
					Chk01_DtlR.$po_d_no,
					Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_seq,
					Chk01_DtlR.$dlv_slip_mng_no,
					Chk01_DtlR.$dlv_slip_mng_seq,
					Chk01_DtlR.$purc_ddlv_dlv_slip_no
			};
			String[] srcCols = {
					Po_Ins01_DtlR.$po_d_no,
					Po_Ins01_DtlR.$dlv_slip_no,
					Po_Ins01_DtlR.$dlv_slip_seq,
					Po_Ins01_DtlR.$dlv_slip_mng_no,
					Po_Ins01_DtlR.$dlv_slip_mng_seq,
					Po_Ins01_DtlR.$purc_ddlv_dlv_slip_no
			};
			copyByPegNo(up1(), destCols, poIns01.down1(), srcCols);
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}
		
	}
	protected void makePoInsUpdUp2(MCList<Po_Ins01_DtlR> up1L, MCList<Po_Ins01_Bndl_DtlR> up2L) {
		MCNumber maxPegNo = (MCNumber)up2L.max(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
		if(isNull(maxPegNo)) {
			maxPegNo = MCNumber.ZERO;
		}
		else {
			maxPegNo = maxPegNo.add(1);
		}
		for (Po_Ins01_DtlR dtlR : up1L) {
			if (isNull(dtlR.po_schd_no()) && dtlR.outsrc_flg()) {
				Po_Ins01_Bndl_DtlR bndlR = Po_Ins01_Bndl_DtlR.create();
				bndlR.dtl_peg_no(dtlR.peg_no());
				bndlR.peg_no(maxPegNo);
				bndlR.base_unit_qty(dtlR.base_unit_qty());
				up2L.add(bndlR);
				maxPegNo = maxPegNo.add(1);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発注情報を訂正する<br>
	 */
	public class Upd01 extends MSBDL_PoReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			throwUpdErr();
			callPoRegPoUpd01();
			setDown();
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			// 上り電文の編集（ヘッダ項目）
			editHdrCol(up0(), up1());
			
			// 上り電文の編集（明細項目）
			setPegNo(up1());
			setPegNo(up2());
			MCList<Chk01_Dtl2R> tmpL = up2().clone();
			for (Chk01_Dtl2R r : tmpL) {
				Chk01_DtlR up1R = up1().getFirst(Chk01_DtlR.$dtl_peg_no, r.dtl_peg_no());
				Chk01_Dtl2R up2R = up2().getFirst(Chk01_Dtl2R.$peg_no, r.peg_no());
				up2R.dtl_peg_no(up1R.peg_no());
			}
			for (Chk01_DtlR r : up1()) {
				r.dtl_peg_no(r.peg_no());
				if (!isNullOrNullVal(r.mfg_loc_cd()) && !r.outsrc_flg()) {
					r.outsrc_flg(true);
				}
			}
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			up1().setNumberNE(Chk01_DtlR.$hdr_peg_no, up0().peg_no());
			setDataCrudTypDtl(up1());
		}
		
		/**
		 * データ更新区分を設定します。
		 * @param r 明細レコード
		 */
		protected void setDataCrudTypDtl(MCList<Chk01_DtlR> dtlL){
			for (Chk01_DtlR r : dtlL) {
				if (isSame(MCRow.Status.CREATE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				} 
				else if (isSame(MCRow.Status.MODIFY, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				} 
				else if (isSame(MCRow.Status.DELETE, r.getStatus())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		protected void callThisChk02() {
			MSBDL_PoReg.Chk02 chk02 = MSBDL_PoReg.crtChk02();
			MCRow.copyall(chk02.up0(), up0());
			chk02.up1().setAll(up1());
			chk02.up2().setAll(up2());
			chk02.exec();
			MCRow.copyall(up0(), chk02.down0());
			up1().setAll(chk02.down1());
			up2().setAll(chk02.down2());
		}
		/**
		 * 発注登録サービスを実行する
		 */
		protected void callPoRegPoUpd01() {
			MSBDL_PoRegService.Po_Upd01 poUpd01 = MSBDL_PoRegService.crtPo_Upd01();
			Po_Ins01_HdrR hdrR = Po_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_Po_Ins01_HdrR_Chk01_HdrR());
			poUpd01.up0().add(hdrR);
			
			// 表示順
			setDispSeq(up1());
			
			addAll(poUpd01.up1(), up1(), createMap_Po_Ins01_DtlR_Chk01_DtlR());
			addAll(poUpd01.up2(), up2(), createMap_Po_Ins01_Bndl_DtlR_Chk01_Dtl2R());
			makePoInsUpdUp2(poUpd01.up1(), poUpd01.up2());
			poUpd01.exec();
			
			Po_Ins01_HdrR poUpdDown0 = poUpd01.down0().get(0);
			up0().po_rev(poUpdDown0.po_rev());
			up0().aprv_flg(poUpdDown0.aprv_flg());
			up0().aprv_no(poUpdDown0.aprv_no());
			up0().aprv_sts_typ(poUpdDown0.aprv_sts_typ());
			
			String[] destCols = {
					Chk01_DtlR.$po_d_no,
					Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_seq,
					Chk01_DtlR.$dlv_slip_mng_no,
					Chk01_DtlR.$dlv_slip_mng_seq,
					Chk01_DtlR.$purc_ddlv_dlv_slip_no
			};
			String[] srcCols = {
					Po_Ins01_DtlR.$po_d_no,
					Po_Ins01_DtlR.$dlv_slip_no,
					Po_Ins01_DtlR.$dlv_slip_seq,
					Po_Ins01_DtlR.$dlv_slip_mng_no,
					Po_Ins01_DtlR.$dlv_slip_mng_seq,
					Po_Ins01_DtlR.$purc_ddlv_dlv_slip_no
			};
			copyByPegNo(up1(), destCols, poUpd01.down1(), srcCols);
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().addAll(up1());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 発注情報を取り消す<br>
	 */
	public class Del01 extends MSBDL_PoReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk03(); 
			throwCanErr();
			callPoRegPoUpd01();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			editHdrCol(up0(), up1());
			// データ更新区分
			setPegNo(up1());
			setPegNo(up2());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			up1().setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			up1().setNumberNE(Chk01_DtlR.$hdr_peg_no, up0().peg_no());
			
		}
		/**
		 * ヘッダ項目を編集します
		 * @param hdr
		 * @param dtlL
		 */
		protected void editHdrCol(Chk03_HdrR hdr, MCList<Chk03_DtlR> dtlL) {
			// 紐付けＮＯの設定
			setPegNo(Chk01_HdrR.$peg_no, hdr);
		}
		protected void callThisChk03() {
			MSBDL_PoReg.Chk03 chk03 = MSBDL_PoReg.crtChk03();
			MCRow.copyall(chk03.up0(), up0());
			chk03.up1().setAll(up1());
			chk03.up2().setAll(up2());
			chk03.exec();
			MCRow.copyall(up0(), chk03.down0());
			up1().setAll(chk03.down1());
			up2().setAll(chk03.down2());
		}
		/**
		 * 発注登録サービスを実行する
		 */
		protected void callPoRegPoUpd01() {
			MSBDL_PoRegService.Po_Del01 poDel01 = MSBDL_PoRegService.crtPo_Del01();
			Po_Ins01_HdrR hdrR = Po_Ins01_HdrR.create();
			copy(hdrR, up0(), createMap_Po_Ins01_HdrR_Chk03_HdrR());
			poDel01.up0().add(hdrR);
			addAll(poDel01.up1(), up1(), createMap_Po_Ins01_DtlR_Chk03_DtlR());
			addAll(poDel01.up2(), up2(), createMap_Po_Ins01_Bndl_DtlR_Chk03_Dtl2R());
			poDel01.exec();
		}
	}
	
	/**
	 * ヘッダ項目を編集します
	 * @param hdr
	 * @param dtlL
	 */
	protected void editHdrCol(Chk01_HdrR hdr, MCList<Chk01_DtlR> dtlL) {
		// 紐付けＮＯの設定
		setPegNo(Chk01_HdrR.$peg_no, hdr);
	}
	/**
	 * 基準単位数量を設定します
	 * @param dtlR
	 */
	protected void setBaseUnitInfo(Chk01_DtlR dtlR){		
		dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
				dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
	}
	/**
	 * 直納区分を設定します
	 * @param dtlR
	 */
	protected void setDrctDlvTyp(Chk01_DtlR dtlR) {
		if (isNullAnd(dtlR.outsrc_sppl_cd(), dtlR.dlv_cd())) {
			dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
		}
		else {
			dtlR.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
		}
	}
	/**
	 * 経費購買判定
	 * 取引パタンが経費購買であるか、資産管理しない品目を発注する場合は経費購買とする。
	 * @param poSchd
	 */
	protected boolean isXpnsPurc(Chk01_HdrR hdrR, Chk01_DtlR dtlR){
		if (MAC_TRD_PTN_TYP.isPURC_XPNS(hdrR.trd_ptn_typ()) || MAC_ASSET_MNG_TYP.isNOT_MNG(dtlR.asset_mng_typ())) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	protected Map_Po_Ins01_HdrR_Chk01_HdrR<Po_Ins01_HdrR,Chk01_HdrR> createMap_Po_Ins01_HdrR_Chk01_HdrR() {
		return new Map_Po_Ins01_HdrR_Chk01_HdrR<Po_Ins01_HdrR, Chk01_HdrR>();
	}
	public class Map_Po_Ins01_HdrR_Chk01_HdrR<D extends Po_Ins01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(Po_Ins01_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_HdrR.$po_no, Chk01_HdrR.$po_no);
			addColumnPathMap(Po_Ins01_HdrR.$po_rev, Chk01_HdrR.$po_rev);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cd, Chk01_HdrR.$trd_cd);
			addColumnPathMap(Po_Ins01_HdrR.$trd_ptn_typ, Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(Po_Ins01_HdrR.$purc_dpt_cd, Chk01_HdrR.$purc_dpt_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wg_cd, Chk01_HdrR.$purc_dpt_wg_cd);
			addColumnPathMap(Po_Ins01_HdrR.$purc_usr_cd, Chk01_HdrR.$purc_usr_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_dpt, Chk01_HdrR.$sppl_cntct_dpt);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_psn, Chk01_HdrR.$sppl_cntct_psn);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_zip_cd, Chk01_HdrR.$sppl_zip_cd);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr1, Chk01_HdrR.$sppl_addr1);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr2, Chk01_HdrR.$sppl_addr2);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr3, Chk01_HdrR.$sppl_addr3);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_addr4, Chk01_HdrR.$sppl_addr4);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_tel, Chk01_HdrR.$sppl_tel);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_fax, Chk01_HdrR.$sppl_fax);
			addColumnPathMap(Po_Ins01_HdrR.$po_dt, Chk01_HdrR.$po_dt);
			addColumnPathMap(Po_Ins01_HdrR.$upd_po_print_schd_dt, Chk01_HdrR.$upd_po_print_schd_dt);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_flg, Chk01_HdrR.$po_print_flg);
			addColumnPathMap(Po_Ins01_HdrR.$last_po_rev, Chk01_HdrR.$last_po_rev);
			addColumnPathMap(Po_Ins01_HdrR.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(Po_Ins01_HdrR.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(Po_Ins01_HdrR.$xrate_inpt_flg, Chk01_HdrR.$xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate, Chk01_HdrR.$ptax_xrate);
			addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate_inpt_flg, Chk01_HdrR.$ptax_xrate_inpt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$crct_rsn_cd, Chk01_HdrR.$crct_rsn_cd);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_cd, Chk01_HdrR.$po_print_cd);
			addColumnPathMap(Po_Ins01_HdrR.$wrk_no, Chk01_HdrR.$wrk_no);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd1, Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks1, Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd2, Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks2, Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_cd3, Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks3, Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_flg, Chk01_HdrR.$edi_flg);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_flg, Chk01_HdrR.$aprv_flg);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_no, Chk01_HdrR.$aprv_no);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_sts_typ, Chk01_HdrR.$aprv_sts_typ);
			addColumnPathMap(Po_Ins01_HdrR.$trd_rmrks, Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_rmrks, Chk01_HdrR.$po_print_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$dlv_slip_rmrks, Chk01_HdrR.$dlv_slip_rmrks);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(Po_Ins01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char1, Chk01_HdrR.$edi_sub_char1);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char2, Chk01_HdrR.$edi_sub_char2);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char3, Chk01_HdrR.$edi_sub_char3);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char4, Chk01_HdrR.$edi_sub_char4);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char5, Chk01_HdrR.$edi_sub_char5);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_num1, Chk01_HdrR.$edi_sub_num1);
			addColumnPathMap(Po_Ins01_HdrR.$edi_sub_dt1, Chk01_HdrR.$edi_sub_dt1);
			addColumnPathMap(Po_Ins01_HdrR.$prnt_po_flg, Chk01_HdrR.$prnt_po_flg);
			addColumnPathMap(Po_Ins01_HdrR.$prnt_dlv_flg, Chk01_HdrR.$prnt_dlv_flg);
			addColumnPathMap(Po_Ins01_HdrR.$prnt_purc_ddlv_dlv_flg, Chk01_HdrR.$prnt_purc_ddlv_dlv_flg);
			addColumnPathMap(Po_Ins01_HdrR.$indiv_prnt_flg, Chk01_HdrR.$indiv_prnt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$sppl_ship_form_cd, Chk01_HdrR.$sppl_ship_form_cd);
			addColumnPathMap(Po_Ins01_HdrR.$aprv_rvrs_flg, Chk01_HdrR.$aprv_rvrs_flg);
		}
	}
	
	protected Map_Po_Ins01_DtlR_Chk01_DtlR<Po_Ins01_DtlR,Chk01_DtlR> createMap_Po_Ins01_DtlR_Chk01_DtlR() {
		return new Map_Po_Ins01_DtlR_Chk01_DtlR<Po_Ins01_DtlR, Chk01_DtlR>();
	}

	public class Map_Po_Ins01_DtlR_Chk01_DtlR<D extends Po_Ins01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_DtlR.$hdr_peg_no, Chk01_DtlR.$hdr_peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_DtlR.$po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_no, Chk01_DtlR.$po_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_rev, Chk01_DtlR.$po_rev);
			addColumnPathMap(Po_Ins01_DtlR.$po_schd_no, Chk01_DtlR.$po_schd_no);
			addColumnPathMap(Po_Ins01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(Po_Ins01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Po_Ins01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Po_Ins01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(Po_Ins01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(Po_Ins01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(Po_Ins01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(Po_Ins01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(Po_Ins01_DtlR.$purc_rsn_cd, Chk01_DtlR.$purc_rsn_cd);
			addColumnPathMap(Po_Ins01_DtlR.$purc_id_typ, Chk01_DtlR.$purc_id_typ);
			addColumnPathMap(Po_Ins01_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_cd, Chk01_DtlR.$sppl_itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_nm, Chk01_DtlR.$sppl_itm_nm);
			addColumnPathMap(Po_Ins01_DtlR.$ap_dpt_cd, Chk01_DtlR.$ap_dpt_cd);
			addColumnPathMap(Po_Ins01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bp_lot_no, Chk01_DtlR.$bp_lot_no);
			addColumnPathMap(Po_Ins01_DtlR.$in_to_loc_cd, Chk01_DtlR.$in_to_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cd, Chk01_DtlR.$dlv_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_sundry_flg, Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_nm, Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cntct_dpt, Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_cntct_psn, Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_zip_cd, Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr1, Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr2, Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr3, Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_addr4, Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_tel, Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(Po_Ins01_DtlR.$tdlv_fax, Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(Po_Ins01_DtlR.$purc_lt, Chk01_DtlR.$purc_lt);
			addColumnPathMap(Po_Ins01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
			addColumnPathMap(Po_Ins01_DtlR.$sync_flg, Chk01_DtlR.$sync_flg);
			addColumnPathMap(Po_Ins01_DtlR.$purc_basis_typ, Chk01_DtlR.$purc_basis_typ);
			addColumnPathMap(Po_Ins01_DtlR.$purc_upri_req_typ, Chk01_DtlR.$purc_upri_req_typ);
			addColumnPathMap(Po_Ins01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Po_Ins01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Po_Ins01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Po_Ins01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Po_Ins01_DtlR.$interim_flg, Chk01_DtlR.$interim_flg);
			addColumnPathMap(Po_Ins01_DtlR.$upri_not_tgt_flg, Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_upri, Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_upri, Chk01_DtlR.$trd_cur_proc_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_upri, Chk01_DtlR.$trd_cur_onr_prov_upri);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_amt, Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_amt, Chk01_DtlR.$trd_cur_proc_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_amt, Chk01_DtlR.$trd_cur_onr_prov_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_tax_amt, Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(Po_Ins01_DtlR.$trd_cur_dscnt_amt, Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(Po_Ins01_DtlR.$dscnt_rsn_cd, Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(Po_Ins01_DtlR.$tax_fix_flg, Chk01_DtlR.$tax_fix_flg);
			addColumnPathMap(Po_Ins01_DtlR.$tax_cd, Chk01_DtlR.$tax_cd);
			addColumnPathMap(Po_Ins01_DtlR.$inc_tax_flg, Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(Po_Ins01_DtlR.$wtax_rate, Chk01_DtlR.$wtax_rate);
			addColumnPathMap(Po_Ins01_DtlR.$wtax_amt, Chk01_DtlR.$wtax_amt);
			addColumnPathMap(Po_Ins01_DtlR.$drct_dlv_typ, Chk01_DtlR.$drct_dlv_typ);
			addColumnPathMap(Po_Ins01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
			addColumnPathMap(Po_Ins01_DtlR.$bndl_flg, Chk01_DtlR.$bndl_flg);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_itm_ord_no, Chk01_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_flg, Chk01_DtlR.$outsrc_flg);
			addColumnPathMap(Po_Ins01_DtlR.$uplnd_flg, Chk01_DtlR.$uplnd_flg);
			addColumnPathMap(Po_Ins01_DtlR.$schd_chg_flg, Chk01_DtlR.$schd_chg_flg);
			addColumnPathMap(Po_Ins01_DtlR.$po_conf_rcpt_flg, Chk01_DtlR.$po_conf_rcpt_flg);
			addColumnPathMap(Po_Ins01_DtlR.$po_conf_rcpt_dt, Chk01_DtlR.$po_conf_rcpt_dt);
			addColumnPathMap(Po_Ins01_DtlR.$pri_print_flg, Chk01_DtlR.$pri_print_flg);
			addColumnPathMap(Po_Ins01_DtlR.$pay_crryovr_times, Chk01_DtlR.$pay_crryovr_times);
			addColumnPathMap(Po_Ins01_DtlR.$slo_no, Chk01_DtlR.$slo_no);
			addColumnPathMap(Po_Ins01_DtlR.$slo_d_no, Chk01_DtlR.$slo_d_no);
			addColumnPathMap(Po_Ins01_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno1, Chk01_DtlR.$bd_sno1);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno2, Chk01_DtlR.$bd_sno2);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno3, Chk01_DtlR.$bd_sno3);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sno4, Chk01_DtlR.$bd_sno4);
			addColumnPathMap(Po_Ins01_DtlR.$bd_loc_cd, Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_ctg_cd, Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_oper_cd, Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(Po_Ins01_DtlR.$bd_slo_no, Chk01_DtlR.$bd_slo_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_iv_no, Chk01_DtlR.$bd_iv_no);
			addColumnPathMap(Po_Ins01_DtlR.$bd_po_no, Chk01_DtlR.$bd_po_no);
			addColumnPathMap(Po_Ins01_DtlR.$arr_cnt_rmrks, Chk01_DtlR.$arr_cnt_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$po_print_d_rmrks, Chk01_DtlR.$po_print_d_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$dlv_slip_d_rmrks, Chk01_DtlR.$dlv_slip_d_rmrks);
			addColumnPathMap(Po_Ins01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(Po_Ins01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(Po_Ins01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char1, Chk01_DtlR.$edi_sub_d_char1);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char2, Chk01_DtlR.$edi_sub_d_char2);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char3, Chk01_DtlR.$edi_sub_d_char3);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char4, Chk01_DtlR.$edi_sub_d_char4);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char5, Chk01_DtlR.$edi_sub_d_char5);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_num1, Chk01_DtlR.$edi_sub_d_num1);
			addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_dt1, Chk01_DtlR.$edi_sub_d_dt1);
			
			
			addColumnPathMap(Po_Ins01_DtlR.$dlv_rqst_tm, Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_dlv_rqst_tm, Chk01_DtlR.$rqst_dlv_rqst_tm);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_avl_rqst_dt, Chk01_DtlR.$rqst_avl_rqst_dt);
			addColumnPathMap(Po_Ins01_DtlR.$rqst_can_flg, Chk01_DtlR.$rqst_can_flg);
			addColumnPathMap(Po_Ins01_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(Po_Ins01_DtlR.$arr_rem_abort_flg, Chk01_DtlR.$arr_rem_abort_flg);
			addColumnPathMap(Po_Ins01_DtlR.$purc_rem_abort_flg, Chk01_DtlR.$purc_rem_abort_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.base_unit_qty(src.base_unit_qty());
			if (!src.dlv_sundry_flg()) {
				dest.dlv_nm(null);
			}
			if (!src.tdlv_sundry_flg()) {
				dest.tdlv_nm(null);
			}
		}
	}
	
	protected Map_Po_Ins01_Bndl_DtlR_Chk01_Dtl2R<Po_Ins01_Bndl_DtlR,Chk01_Dtl2R> createMap_Po_Ins01_Bndl_DtlR_Chk01_Dtl2R() {
		return new Map_Po_Ins01_Bndl_DtlR_Chk01_Dtl2R<Po_Ins01_Bndl_DtlR, Chk01_Dtl2R>();
	}

	public class Map_Po_Ins01_Bndl_DtlR_Chk01_Dtl2R<D extends Po_Ins01_Bndl_DtlR, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$peg_no, Chk01_Dtl2R.$peg_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$dtl_peg_no, Chk01_Dtl2R.$dtl_peg_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_d_no, Chk01_Dtl2R.$po_d_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_schd_no, Chk01_Dtl2R.$po_schd_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$base_unit_qty, Chk01_Dtl2R.$base_unit_qty);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$base_unit_qty, Chk01_Dtl2R.$base_unit_qty);
		}
	}
	protected Map_Po_Ins01_HdrR_Chk03_HdrR<Po_Ins01_HdrR,Chk03_HdrR> createMap_Po_Ins01_HdrR_Chk03_HdrR() {
		return new Map_Po_Ins01_HdrR_Chk03_HdrR<Po_Ins01_HdrR, Chk03_HdrR>();
	}

	public class Map_Po_Ins01_HdrR_Chk03_HdrR<D extends Po_Ins01_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_HdrR.$peg_no, Chk03_HdrR.$peg_no);
			addColumnPathMap(Po_Ins01_HdrR.$data_crud_typ, Chk03_HdrR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_HdrR.$err_flg, Chk03_HdrR.$err_flg);
			addColumnPathMap(Po_Ins01_HdrR.$prnt_po_flg, Chk03_HdrR.$prnt_po_flg);
			addColumnPathMap(Po_Ins01_HdrR.$prnt_dlv_flg, Chk03_HdrR.$prnt_dlv_flg);
			addColumnPathMap(Po_Ins01_HdrR.$prnt_purc_ddlv_dlv_flg, Chk03_HdrR.$prnt_purc_ddlv_dlv_flg);
			addColumnPathMap(Po_Ins01_HdrR.$indiv_prnt_flg, Chk03_HdrR.$indiv_prnt_flg);
			addColumnPathMap(Po_Ins01_HdrR.$po_no, Chk03_HdrR.$po_no);
			addColumnPathMap(Po_Ins01_HdrR.$po_rev, Chk03_HdrR.$po_rev);
			addColumnPathMap(Po_Ins01_HdrR.$trd_ptn_typ, Chk03_HdrR.$trd_ptn_typ);
			addColumnPathMap(Po_Ins01_HdrR.$crct_rsn_cd, Chk03_HdrR.$crct_rsn_cd);
			addColumnPathMap(Po_Ins01_HdrR.$po_print_cd, Chk03_HdrR.$po_print_cd);
			addColumnPathMap(Po_Ins01_HdrR.$edi_flg, Chk01_HdrR.$edi_flg);
		}
	}
	
	protected Map_Po_Ins01_DtlR_Chk03_DtlR<Po_Ins01_DtlR,Chk03_DtlR> createMap_Po_Ins01_DtlR_Chk03_DtlR() {
		return new Map_Po_Ins01_DtlR_Chk03_DtlR<Po_Ins01_DtlR, Chk03_DtlR>();
	}
	public class Map_Po_Ins01_DtlR_Chk03_DtlR<D extends Po_Ins01_DtlR, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_DtlR.$peg_no, Chk03_DtlR.$peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$hdr_peg_no, Chk03_DtlR.$hdr_peg_no);
			addColumnPathMap(Po_Ins01_DtlR.$err_flg, Chk03_DtlR.$err_flg);
			addColumnPathMap(Po_Ins01_DtlR.$data_crud_typ, Chk03_DtlR.$data_crud_typ);
			addColumnPathMap(Po_Ins01_DtlR.$po_d_no, Chk03_DtlR.$po_d_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_no, Chk03_DtlR.$po_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_rev, Chk03_DtlR.$po_rev);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_flg, Chk03_DtlR.$outsrc_flg);
			addColumnPathMap(Po_Ins01_DtlR.$outsrc_itm_ord_no, Chk03_DtlR.$outsrc_itm_ord_no);
			addColumnPathMap(Po_Ins01_DtlR.$po_schd_no, Chk03_DtlR.$po_schd_no);
			addColumnPathMap(Po_Ins01_DtlR.$bndl_flg, Chk03_DtlR.$bndl_flg);
		}
	}
	protected Map_Po_Ins01_Bndl_DtlR_Chk03_Dtl2R<Po_Ins01_Bndl_DtlR,Chk03_Dtl2R> createMap_Po_Ins01_Bndl_DtlR_Chk03_Dtl2R() {
		return new Map_Po_Ins01_Bndl_DtlR_Chk03_Dtl2R<Po_Ins01_Bndl_DtlR, Chk03_Dtl2R>();
	}

	public class Map_Po_Ins01_Bndl_DtlR_Chk03_Dtl2R<D extends Po_Ins01_Bndl_DtlR, S extends Chk03_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$peg_no, Chk03_Dtl2R.$peg_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$dtl_peg_no, Chk03_Dtl2R.$dtl_peg_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_d_no, Chk03_Dtl2R.$po_d_no);
			addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_schd_no, Chk03_Dtl2R.$po_schd_no);

		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 購買単価、加工単価、有償支給単価を取得する<br>
	 */
	public class Sprt02 extends MSBDL_PoReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			setUpriInfo();
		}
		
		/**
		 * 単価情報の取得および金額情報を算出します。
		 */
		protected void setUpriInfo() {
			setPegNo(up1());
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			addAll(purcUtilSrch02.up0(), up1(), createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR());
			setHdrData(purcUtilSrch02.up0());
			
			purcUtilSrch02.up0();
			purcUtilSrch02.exec();
			String[] destCols = {Sprt02_DtlR.$trd_cur_upri, Sprt02_DtlR.$trd_cur_proc_upri, Sprt02_DtlR.$trd_cur_onr_prov_upri, Sprt02_DtlR.$interim_flg};
			String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
			copyByPegNo(up1(), destCols, purcUtilSrch02.down0(), srcCols);
			down0().setAll(up1());
		}
		
		protected void setHdrData(MCList<PurcUtil_Srch02_DtlR> tgtL){
			tgtL.setStringNE(PurcUtil_Srch02_DtlR.$sppl_cd, up0().sppl_cd());
			tgtL.setStringNE(PurcUtil_Srch02_DtlR.$cur_cd, up0().trd_cur_cd());
			//発注ＮＯ単位の番号なので固定で「1」
			tgtL.setStringNE(PurcUtil_Srch02_DtlR.$grp_no, String.valueOf(1));
		}
		
		protected Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR,Sprt02_DtlR> createMap_PurcUtil_Srch02_DtlR_Sprt02_DtlR() {
			return new Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<PurcUtil_Srch02_DtlR, Sprt02_DtlR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_Sprt02_DtlR<D extends PurcUtil_Srch02_DtlR, S extends Sprt02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				// 発注先・取引通貨ＣＤは別途設定
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, Sprt02_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, Sprt02_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, Sprt02_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, Sprt02_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, Sprt02_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, Sprt02_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, Sprt02_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, Sprt02_DtlR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, Sprt02_DtlR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, Sprt02_DtlR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$dlv_cd, Sprt02_DtlR.$dlv_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_dt, Sprt02_DtlR.$base_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, Sprt02_DtlR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, Sprt02_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, Sprt02_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$outsrc_itm_ord_no, Sprt02_DtlR.$outsrc_itm_ord_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, Sprt02_DtlR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, Sprt02_DtlR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, Sprt02_DtlR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, Sprt02_DtlR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$rqst_dlv_rqst_dt, Sprt02_DtlR.$dlv_rqst_tm);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itmdtl_base_dt, Sprt02_DtlR.$po_dt);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, Sprt02_DtlR.$base_unit_qty);
			}
		}
	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 納品先情報を取得する<br>
	 */
	public class Sprt03 extends MSBDL_PoReg_MC_A.Sprt03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setPegNo(up0());
			setDlvInfo();
			setDown();
		}
		
		/**
		 * 納品先情報を設定します
		 */
		protected void setDlvInfo () {
			MSBDL_PurcUtil.PurcUtil_Srch03 purcUtilSrch03 = MSBDL_PurcUtil.crtPurcUtil_Srch03();
			addAll(purcUtilSrch03.up0(), up0(), createMap_PurcUtil_Srch03_DtlR_Sprt03_DtlR());
			purcUtilSrch03.exec();
			
			String[] destCols = makeDestCol();
			String[] srcCols = makeSrcCol();
			copyByPegNo(up0(), destCols, purcUtilSrch03.down0(), srcCols);
		}
		
		/**
		 * コピー先カラムを設定します。
		 * @return
		 */
		protected String[] makeDestCol() {
			String[] destCols = {Sprt03_DtlR.$in_to_loc_cd,
					Sprt03_DtlR.$str_ln_cd,
					Sprt03_DtlR.$dlv_cd,
					Sprt03_DtlR.$dlv_sundry_flg,
					Sprt03_DtlR.$dlv_nm,
					Sprt03_DtlR.$dlv_cntct_dpt,
					Sprt03_DtlR.$dlv_cntct_psn,
					Sprt03_DtlR.$dlv_zip_cd,
					Sprt03_DtlR.$dlv_addr1,
					Sprt03_DtlR.$dlv_addr2,
					Sprt03_DtlR.$dlv_addr3,
					Sprt03_DtlR.$dlv_addr4,
					Sprt03_DtlR.$dlv_tel,
					Sprt03_DtlR.$dlv_fax,
					Sprt03_DtlR.$dlv_cal_cd,
					Sprt03_DtlR.$tdlv_cd,
					Sprt03_DtlR.$tdlv_sundry_flg,
					Sprt03_DtlR.$tdlv_nm,
					Sprt03_DtlR.$tdlv_cntct_dpt,
					Sprt03_DtlR.$tdlv_cntct_psn,
					Sprt03_DtlR.$tdlv_zip_cd,
					Sprt03_DtlR.$tdlv_addr1,
					Sprt03_DtlR.$tdlv_addr2,
					Sprt03_DtlR.$tdlv_addr3,
					Sprt03_DtlR.$tdlv_addr4,
					Sprt03_DtlR.$tdlv_tel,
					Sprt03_DtlR.$tdlv_fax};
			return destCols;
		}
		
		/**
		 * コピー元カラムを設定します。
		 * @return
		 */
		protected String[] makeSrcCol() {
			String[] srcCols = {PurcUtil_Srch03_DtlR.$in_to_loc_cd,
					PurcUtil_Srch03_DtlR.$str_ln_cd,
					PurcUtil_Srch03_DtlR.$dlv_cd,
					PurcUtil_Srch03_DtlR.$dlv_sundry_flg,
					PurcUtil_Srch03_DtlR.$dlv_nm,
					PurcUtil_Srch03_DtlR.$dlv_cntct_dpt,
					PurcUtil_Srch03_DtlR.$dlv_cntct_psn,
					PurcUtil_Srch03_DtlR.$dlv_zip_cd,
					PurcUtil_Srch03_DtlR.$dlv_addr1,
					PurcUtil_Srch03_DtlR.$dlv_addr2,
					PurcUtil_Srch03_DtlR.$dlv_addr3,
					PurcUtil_Srch03_DtlR.$dlv_addr4,
					PurcUtil_Srch03_DtlR.$dlv_tel,
					PurcUtil_Srch03_DtlR.$dlv_fax,
					PurcUtil_Srch03_DtlR.$dlv_cal_cd,
					PurcUtil_Srch03_DtlR.$tdlv_cd,
					PurcUtil_Srch03_DtlR.$tdlv_sundry_flg,
					PurcUtil_Srch03_DtlR.$tdlv_nm,
					PurcUtil_Srch03_DtlR.$tdlv_cntct_dpt,
					PurcUtil_Srch03_DtlR.$tdlv_cntct_psn,
					PurcUtil_Srch03_DtlR.$tdlv_zip_cd,
					PurcUtil_Srch03_DtlR.$tdlv_addr1,
					PurcUtil_Srch03_DtlR.$tdlv_addr2,
					PurcUtil_Srch03_DtlR.$tdlv_addr3,
					PurcUtil_Srch03_DtlR.$tdlv_addr4,
					PurcUtil_Srch03_DtlR.$tdlv_tel,
					PurcUtil_Srch03_DtlR.$tdlv_fax};
			return srcCols;
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
		
		protected Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<PurcUtil_Srch03_DtlR,Sprt03_DtlR> createMap_PurcUtil_Srch03_DtlR_Sprt03_DtlR() {
			return new Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<PurcUtil_Srch03_DtlR, Sprt03_DtlR>();
		}

		public class Map_PurcUtil_Srch03_DtlR_Sprt03_DtlR<D extends PurcUtil_Srch03_DtlR, S extends Sprt03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch03_DtlR.$peg_no, Sprt03_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch03_DtlR.$slo_d_no, Sprt03_DtlR.$slo_d_no);
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 注文書及び納品書を発行する<br>
	 */
	public class Prnt01 extends MSBDL_PoReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 ope = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
			// 紐付ＮＯの設定
			setPegNo(up0());
			if (up0().prnt_po_flg()) {
				up0().po_rev(up0().po_rev());
				PurcPrnt_Prnt01_PoR poPrntR = PurcPrnt_Prnt01_PoR.create();
				copy(poPrntR, up0(), createMap_PurcPrnt_Prnt01_PoR_Prnt01_HdrR());
				ope.up0().add(poPrntR);
			}
			if (up0().prnt_dlv_flg() || up0().prnt_purc_ddlv_dlv_flg()) {
				for (MCList<Prnt01_DtlR> list : up1().groupList(Prnt01_DtlR.$dlv_slip_mng_no, Prnt01_DtlR.$dlv_slip_mng_seq)) {
					Prnt01_DtlR firstR = list.get(0);
					if (isNull(firstR.dlv_slip_mng_no())) {
						continue;
					}
					boolean isPrnt = false;
					for (Prnt01_DtlR r : list) {
						if (!r.dlv_slip_invalid_flg()) {
							isPrnt = true;
							break;
						}
					}
					PurcPrnt_Prnt01_DlvSlipR dlvSlipR = PurcPrnt_Prnt01_DlvSlipR.create();
					dlvSlipR.bp_srch_flg(true);
					copy(dlvSlipR, up0(), createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_HdrR());
					dlvSlipR.dlv_slip_mng_no(firstR.dlv_slip_mng_no());
					dlvSlipR.dlv_slip_mng_seq(firstR.dlv_slip_mng_seq());
					dlvSlipR.inc_can_flg(true);
					if (up0().prnt_dlv_flg() && isPrnt) {
						ope.up2().add(dlvSlipR);
					}
					if (up0().prnt_purc_ddlv_dlv_flg()) {
						ope.up4().add(dlvSlipR);
					}
				}
			}
			ope.up3().indiv_prnt_flg(up0().indiv_prnt_flg());

			ope.exec();
		}
	}

	protected Map_PurcPrnt_Prnt01_PoR_Prnt01_HdrR<PurcPrnt_Prnt01_PoR, Prnt01_HdrR> createMap_PurcPrnt_Prnt01_PoR_Prnt01_HdrR() {
		return new Map_PurcPrnt_Prnt01_PoR_Prnt01_HdrR<PurcPrnt_Prnt01_PoR, Prnt01_HdrR>();
	}

	public class Map_PurcPrnt_Prnt01_PoR_Prnt01_HdrR<D extends PurcPrnt_Prnt01_PoR, S extends Prnt01_HdrR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Prnt01_PoR.$peg_no, Prnt01_HdrR.$peg_no);
			addColumnPathMap(PurcPrnt_Prnt01_PoR.$po_no, Prnt01_HdrR.$po_no);
			addColumnPathMap(PurcPrnt_Prnt01_PoR.$po_rev, Prnt01_HdrR.$po_rev);
		}
	}
	protected Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_HdrR<PurcPrnt_Prnt01_DlvSlipR,Prnt01_HdrR> createMap_PurcPrnt_Prnt01_DlvSlipR_Prnt01_HdrR() {
		return new Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_HdrR<PurcPrnt_Prnt01_DlvSlipR, Prnt01_HdrR>();
	}

	public class Map_PurcPrnt_Prnt01_DlvSlipR_Prnt01_HdrR<D extends PurcPrnt_Prnt01_DlvSlipR, S extends Prnt01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, Prnt01_HdrR.$peg_no);
			addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_no, Prnt01_HdrR.$po_no);
		}
	}

	protected MCMessageList chkDac(Chk01_HdrR hdrR) {
		return checkWritableDptCdDac(hdrR, Chk01_HdrR.$purc_dpt_cd);
	}
	protected MCMessageList chkDac(MST_PO_R poR) {
		return checkWritableDptCdDac(poR, MST_PO_R.$purc_dpt_cd);
	}

	protected boolean isNonPurc(Chk01_DtlR r) {
		return MAC_PURC_ID_TYP.isVMI(r.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ());
	}

	/**
	 * キャッシュ作成（取引先禁止マスタ）
	 */
	protected void createCacheBpStop(Chk01_HdrR up0) {
		// 取引先禁止マスタ取得
		MCList<Chk01_HdrR> hdrL = MCList.create(Chk01_HdrR.class);
		hdrL.add(up0);
		_bpStopL = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(
				MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")), hdrL,
				Chk01_HdrR.$sppl_cd);
	}
	
	protected MCMessageList checkBpStop(Chk01_HdrR up0) {
		MCMessageList msgL = new MCMessageList();
		// 発注禁止でないか(取引先)
		MAM_BP_STOP_R bpStopR = _bpStopL.get(up0.sppl_cd());
		if (!isNull(bpStopR.po_stop_dt()) && bpStopR.po_stop_dt().lte(up0.po_dt())) {
			msgL.add(new MCMessage(up0, null , MSBDL0091, up0.sppl_cd(), toYMDString(up0.po_dt())));
		}
		return msgL;
	}
	protected Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR,Chk01_DtlR> createMap_Lot_Chk03_CndR_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_Chk01_DtlR<Lot_Chk03_CndR, Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, Chk01_DtlR.$err_flg);
		}
	}
	protected String _coPoPrintNm = null;
	protected String getCoPoPrintNm() {
		if (isNull(_coPoPrintNm) && !isNull(getCo().po_print_cd())) {
			MAM_PO_PRINT_R dbc = MAM_PO_PRINT_R.create();
			MAM_PO_PRINT_R t = MAM_PO_PRINT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.po_print_nm);
			dbSelectKey("MSBDL0080_MAM_PO_PRINT_S01", dbc, dbc_bldr, getCo().po_print_cd());
			_coPoPrintNm = dbc.po_print_nm();
		}
		return _coPoPrintNm;
	}
	/**
	 * Sprt04オペレーション.<p>
	 *
	 * 発注先、発注日を変更したときに必要な情報を取得する<br>
	 */
	public class Sprt04 extends MSBDL_PoReg_MC_A.Sprt04 {
		//-------------------------------------
		// indexKey
		//-------------------------------------
		/** 品目詳細（購買用　品目・枝番・WG・発注先・メーカ） */
		MCIndexKey _idxItmDtlPurc = null;
		/** 品目詳細（外注用　品目・枝番・WG・製造場所・構成パタン・発注先） */
		MCIndexKey _idxItmDtlOutsrc = null;
		//-------------------------------------
		// cache
		//-------------------------------------
		/** 品目詳細マスタ */
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		//-------------------------------------
		// cache作成
		//-------------------------------------
		/**
		 * キャッシュ作成（品目詳細マスタ）
		 * @param list
		 */
		protected void createItmDtlCache() {

			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			_cacheItmDtl.addStringColumn("mfg_loc_sppl_cd");

			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			cacheItmDtl_bldr.addSelect(m1.sppl_cd.as("mfg_loc_sppl_cd"));
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addWhereWithAnd(value(up0().po_dt()).between(t.st_dt, t.end_dt));
			cacheItmDtl_bldr.addLeftOuterJoin(m1, bracket( t.mfg_loc_cd.eq(m1.loc_cd)));
			dbSelect("MSBDL0080_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr,
					up1().groupBy(Sprt04_DtlR.$itm_cd, Sprt04_DtlR.$itm_sub1,
							Sprt04_DtlR.$itm_sub2, Sprt04_DtlR.$itm_sub3,
							Sprt04_DtlR.$in_to_loc_wg_cd));
			_idxItmDtlPurc = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd);
			_idxItmDtlOutsrc = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd, MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$mfg_loc_cd, MAM_ITM_DTL_R.$bom_ptn, "mfg_loc_sppl_cd");
		}
		
		//-------------------------------------
		// cache取得
		//-------------------------------------
		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param hdrR
		 * @param dtlR
		 * @return
		 */
		protected MCList<MAM_ITM_DTL_R> getCacheItmDtlL(Sprt04_HdrR hdrR, Sprt04_DtlR dtlR){
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			if (dtlR.outsrc_flg()) {
				itmDtlL = _cacheItmDtl.subList(_idxItmDtlOutsrc,
						dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd(), dtlR.mfg_loc_cd(), dtlR.bom_ptn(), hdrR.sppl_cd());
			}
			else {
				itmDtlL = _cacheItmDtl.subList(_idxItmDtlPurc,
						dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.in_to_loc_wg_cd(), hdrR.sppl_cd(), nvl(dtlR.maker_cd(), NULL_VAL));
			}
			return itmDtlL;
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createCache();
			setHdr(up0());
			setDtl(up1());
		}
		
		/**
		 * キャッシュを作成する
		 */
		protected void createCache() {
			createItmDtlCache();
		}
		
		/**
		 * ヘッダ項目の補完を行う
		 * @param up0
		 */
		protected void setHdr(Sprt04_HdrR up0) {
			// 発注先変更時は画面のリストロジックで値を設定するので設定は不要
			if (!up0.sppl_chg_flg()) {
				MAM_BP_R aSpplR = getAsppl(up0);
				up0().ap_dpt_cd(nvl(aSpplR.getStringNE("ap_dpt_cd_sub"), aSpplR.ap_dpt_cd()));
			}
			MCRow.copyall(down0(), up0());
		}
		
		/**
		 * 発注先に紐づく取引先マスタを取得する。
		 * @param up0
		 * @return
		 */
		protected MAM_BP_R getSppl(Sprt04_HdrR up0) {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setWhere(t.bp_cd.eq(bind("sppl_cd")));
			MAM_BP_R spplR = MAM_BP_R.create();
			dbSelect("MSBDL0080_MAM_BP_S02", spplR, bldr, up0);
			return spplR;
		}
		
		/**
		 * 買掛先に紐づく取引先マスタを取得する。
		 * @param up0
		 * @return
		 */
		protected MAM_BP_R getAsppl(Sprt04_HdrR up0) {
			MAM_BP_R t = MAM_BP_R.create("T");
			MAM_BP_SUB_R m1 = MAM_BP_SUB_R.create("M1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.addSelect(m1.ap_dpt_cd.as("ap_dpt_cd_sub"));
			bldr.addLeftOuterJoin(m1, m1.bp_cd.eq(t.bp_cd).and(bind("po_dt").between(m1.st_dt, m1.end_dt)));
			bldr.setWhere(t.bp_cd.eq(bind("asppl_cd")));
			MAM_BP_R aSpplR = MAM_BP_R.create();
			dbSelect("MSBDL0080_MAM_BP_S01", aSpplR, bldr, up0);
			return aSpplR;
		}
		
		/**
		 * ＥＤＩ対象ＦＬＧを取得する
		 * @param up0
		 * @return ＥＤＩ対象ＦＬＧ
		 */
		protected boolean getEdiTgtFlg(Sprt04_HdrR up0) {
			boolean edi_tgt_flg = false;
			MAM_EDI_IF_CTL_R t = MAM_EDI_IF_CTL_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setWhere(t.bp_cd.eq(bind("sppl_cd")));
			bldr.addWhereWithAnd(t.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value())));
			bldr.addWhereWithAnd((bind("po_dt").between(t.st_dt, t.end_dt)));
			MAM_EDI_IF_CTL_R ediR = MAM_EDI_IF_CTL_R.create();
			dbSelect("MSBDL0080_MAM_EDI_IF_CTL_S01", ediR, bldr, up0);
			if (!isNull(ediR.if_proc_typ()) && !ediR.del_flg()) {
				edi_tgt_flg = true;
			}
			return edi_tgt_flg;
		}

		/**
		 * 仕入計上区分の初期値は以下の優先順で設定されるが
		 * ①～④はクライアント側で制御している。<p>
		 * 
		 * ①仕入直送：「１：入荷基準」<br>
		 * ②入荷不要の品目：「２：検収基準」<br>
		 * ③購買識別区分が「無償受給」、「VMI」：「２：検収基準」<br>
		 * ④発注先が下請対象：「１：入荷基準」<br>
		 * ⑤品目詳細マスタの「仕入計上区分」<br>
		 * ⑥取引先マスタの「仕入計上区分」<br>
		 * ⑦①～⑥以外：「９：任意」<br>
		 */
		protected String getPurcBasisTyp(MAM_ITM_DTL_R itmDtlR, MAM_BP_R spplR) {
			if (!isNull(itmDtlR.purc_basis_typ())) {
				return itmDtlR.purc_basis_typ();
			}
			else if (!isNull(spplR.purc_basis_typ())) {
				return spplR.purc_basis_typ();
			}
			else {
				return MAC_PURC_BASIS_TYP.ANY_BASIS.value();
			}
		}

		/**
		 * 明細項目の補完を行う
		 * @param up1
		 */
		protected void setDtl(MCList<Sprt04_DtlR> up1) {
			MAM_BP_R spplR = getSppl(up0());
			for (Sprt04_DtlR r : up1) {
				setDtl(up0(), r, spplR);
			}
			down1().setAll(up1);
		}
		
		/**
		 * 明細項目の設定
		 * @param hdrR
		 * @param dtlR
		 * @param spplR
		 */
		protected void setDtl(Sprt04_HdrR hdrR, Sprt04_DtlR dtlR, MAM_BP_R spplR) {
			if (!isNull(dtlR.itm_cd())) {
				MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtlL(hdrR, dtlR);
				MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create("ITM_DTL");
				if (!isNull(itmDtlL) && itmDtlL.size() == 1) {
					itmDtlR = itmDtlL.get(0);
					
					dtlR.purc_id_typ(itmDtlR.purc_id_typ());
				}
				dtlR.purc_basis_typ(getPurcBasisTyp(itmDtlR, spplR));
			}
		}
	}

	//FMCB CUSTOM END
}