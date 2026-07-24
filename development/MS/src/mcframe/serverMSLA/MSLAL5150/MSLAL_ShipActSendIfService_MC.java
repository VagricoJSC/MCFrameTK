package mcframe.serverMSLA.MSLAL5150;

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
import mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverMBBC.MBBCL5020.*;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ShipActSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ShipActSendIfService_MC extends MSLAL_ShipActSendIfService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * ＥＤＩ出荷実績送信ＩＦリスト
	 */
	protected MCList<MST_ESHIP_ACT_SEND_IF_R> _eshipActSendIfL = null;
	
	
	/**
	 * 納品伝票リスト
	 */
	protected MCList<MST_DLV_SLIP_R> _dlvSlipL = null;
	
	/**
	 * 出荷実績リスト
	 */
	protected MCList<MST_SHIP_ACT_R> _shipActL = null;
	
	/**
	 * インボイスリスト
	 */
	protected MCList<MST_IV_R> _ivL = null;
	
	/**
	 * 出荷実績ワーク
	 */
	protected MCList<MST_SHIP_ACT_R> _shipActWkL = null;
	protected MCQueryApiBuilder _shipActWkL_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
	
	/**
	 * 売上実績ワーク
	 */
	protected MCList<MST_SLS_ACT_R> _slsActWkL = null;
	protected MCQueryApiBuilder _slsActWkL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_R.create("T"));
	
	/**
	 * インボイスNOワーク
	 */
	protected MCList<MST_IV_NO_R> _ivNoWkL = null;
	protected MCQueryApiBuilder _ivNoWkL_bldr = MCQueryApiBuilder.create(MST_IV_NO_R.create("T"));
	
	/**
	 * 納入指示受領リスト
	 */
	protected MCList<MST_DLV_INST_RCPT_R> _dlvInstRcptL = null;
	
	/**
	 * 納入指示受領インデックス
	 */
	protected MCIndexKey _dlvInstRcptIdxkey = null;
	
	/**
	 * ロット情報リスト
	 */
	protected MCList<MSVT_LOT_LIST_R> _lotL = null;
	protected MSVT_LOT_LIST_R _lotL_t = MSVT_LOT_LIST_R.create("T");
	protected MCQueryApiBuilder _lotL_bldr = MCQueryApiBuilder.create(_lotL_t);
	
	/**
	 * ロット情報インデックス
	 */
	protected MCIndexKey _lotIdxkey = null;
	
	/**
	 * インボイス出荷実績マップリスト
	 */
	protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
	
	/**
	 * インボイス出荷実績マップインデックス
	 */
	protected MCIndexKey _ivShipActMapIdxkey = null;
	
	/**
	 * インボイス出荷実績明細リスト
	 */
	protected MCList<MST_IV_SHIP_ACT_D_R> _ivShipActDL = null;
	
	/**
	 * インボイス出荷実績明細インデックス
	 */
	protected MCIndexKey _ivShipActDIdxkey = null;
	
	/**
	 * インボイスリスト（取消分）
	 */
	protected MCList<MST_IV_R> _ivDelL = null;
	
	/**
	 * インボイスリスト（取消分）インデックス
	 */
	protected MCIndexKey _ivDelIdxkey = null;
	
	/**
	 * ShipActSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の出荷実績をＩＦテーブルに書き込む<br>
	 */
	public class ShipActSendIf_Upd01 extends MSLAL_ShipActSendIfService_MC_A.ShipActSendIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			initEshipActSendIf();
			
			crtDlvSlipSendIf();
			
			crtShipActSendIf();
			
			crtIvSendIf();
			chkNotInsEshipActSendIf();
			
			insEshipActSendIf();
			
			callSendRecvIfCtrl();
			registAttachedFormSrv();
		}
		
		/**
		 * ＥＤＩ出荷実績送信ＩＦのインスタンスを生成する。
		 */
		protected void initEshipActSendIf() {
			
			_eshipActSendIfL = MCList.create(MST_ESHIP_ACT_SEND_IF_R.class);
			_eshipActSendIfL.addStringColumn(MST_IV_R.$iv_no);
		}
		
		/**
		 * 納品伝票情報を元に、 ＥＤＩ出荷実績送信ＩＦを作成する。<br>
		 * パターン１：出荷実績サービスから実行されたケース（インボイス取引でない）、売上実績サービス実行されたケース　
		 */
		protected void crtDlvSlipSendIf() {
			
			crtDlvSlipWk();
			
			if (!_shipActWkL.isEmpty() || !_slsActWkL.isEmpty()) {
				
				getDlvSlip();
				
				getDelIV();
				
				getIvShipActMapL();
				
				doDlvSlipNoSeqCache();
				
				crtDlvSlipSendIfData();
				
				setDlvSlipNoDataNo();
			}
			
			delDlvSlipWk();
		}
		
		/**
		 * 納品伝票を取得するためのワークテーブルデータを登録する。
		 */
		protected void crtDlvSlipWk() {

			_shipActWkL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R shipActWkR = null;
			
			_slsActWkL = MCList.create(MST_SLS_ACT_R.class);
			MST_SLS_ACT_R slsActWkR = null;
			
			for (ShipActSendIf_Upd01_DtlR dtlR : up0()) {
				
				if (!isNull(dtlR.ship_act_no())) {
					
					shipActWkR = MST_SHIP_ACT_R.create();
					shipActWkR.ship_act_no(dtlR.ship_act_no());
					
					_shipActWkL.add(shipActWkR);
				}
				
				if (!isNull(dtlR.sls_act_no())) {
					
					slsActWkR = MST_SLS_ACT_R.create();
					slsActWkR.sls_act_no(dtlR.sls_act_no());
					
					_slsActWkL.add(slsActWkR);
				}
			}
			
			dbWkDelete("MSLAL5150_MSW_SHIP_ACT_D01", _shipActWkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5150_MSW_SHIP_ACT_I01", _shipActWkL, _shipActWkL_bldr.getBaseDbc());
			dbDeleteKey("MSLAL5150_MST_SLS_ACT_D01", _slsActWkL, _slsActWkL_bldr);
			dbWkInsert("MSLAL5150_MSW_SLS_ACT_I01", _slsActWkL, _slsActWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 納品伝票情報を取得する。
		 */
		protected void getDlvSlip() {
			MSW_SHIP_ACT_KEY_R w1 = MSW_SHIP_ACT_KEY_R.create("W1");
			MSW_SLS_ACT_KEY_R w2 = MSW_SLS_ACT_KEY_R.create("W2");
			MST_DLV_SLIP_D_R t2 = MST_DLV_SLIP_D_R.create("T2");
			MCTempView maxt3 = createTempView("MAXT3");
			MST_SLS_ACT_R S1GT = MST_SLS_ACT_R.create("GT");
			MSW_SLS_ACT_KEY_R S1GW = MSW_SLS_ACT_KEY_R.create("GW");
			MST_SLS_ACT_R t3 = MST_SLS_ACT_R.create("T3");
			MST_SHIP_ACT_R t4 = MST_SHIP_ACT_R.create("T4");
			MSVT_LOT_LIST_R t5 = MSVT_LOT_LIST_R.create("T5");
			MST_SLO_D_R t6 = MST_SLO_D_R.create("T6");
			MST_DLV_SLIP_R t7 = MST_DLV_SLIP_R.create("T7");
			MST_DLV_SLIP_D_R t8 = MST_DLV_SLIP_D_R.create("T8");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_BP_R m2 = MAM_BP_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_DPT_R m4 = MAM_DPT_R.create("M4");
			MAM_USR_R m5 = MAM_USR_R.create("M5");
			MAM_ITM_R m6 = MAM_ITM_R.create("M6");
			MAM_UNIT_R m7 = MAM_UNIT_R.create("M7");
			MAM_TAX_R m8 = MAM_TAX_R.create("M8");
			MAM_EDI_IF_CTL_R m9 = MAM_EDI_IF_CTL_R.create("M9");
			MAM_EXT_SYS_R m10 = MAM_EXT_SYS_R.create("M10");
			MCTempView S1ST = createTempView("S1ST");
			MST_DLV_SLIP_R S2CT = MST_DLV_SLIP_R.create("S2CT");
			MST_DLV_SLIP_R S3ST = MST_DLV_SLIP_R.create("S3ST");
			MST_DLV_SLIP_D_R S3ST2 = MST_DLV_SLIP_D_R.create("S3ST2");
			MAM_BP_LCL_R m11 = MAM_BP_LCL_R.create("M11");
			MAM_DPT_LCL_R m12 = MAM_DPT_LCL_R.create("M12");
			MAM_USR_LCL_R m13 = MAM_USR_LCL_R.create("M13");
			MAM_ITM_LCL_R m14 = MAM_ITM_LCL_R.create("M14");
			MAM_UNIT_LCL_R m15 = MAM_UNIT_LCL_R.create("M15");
			MAM_TAX_LCL_R m16 = MAM_TAX_LCL_R.create("M16");
			MAM_BP_LCL_R m17 = MAM_BP_LCL_R.create("M17");
			MST_DLV_SLIP_D_R slipDR = MST_DLV_SLIP_D_R.create("SLIPD");

			_dlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
			
			_dlvSlipL.addBooleanColumn(MAM_BP_R.$cst_iv_flg);
			_dlvSlipL.addBooleanColumn("tdlv_sundry_flg");
			_dlvSlipL.addBooleanColumn("inc_tax_flg");
			_dlvSlipL.addBooleanColumn("interim_flg");
			_dlvSlipL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			_dlvSlipL.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
			_dlvSlipL.addBooleanColumn(MST_SLO_D_R.$sls_cststk_flg);
			
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dlvSlipL_bldr = MCQueryApiBuilder.create(t);
			
			dlvSlipL_bldr.addSelect(m9.ext_sys_cd);
			dlvSlipL_bldr.addSelect(t2.cst_po_d_no);
			dlvSlipL_bldr.addSelect(t2.dlv_inst_no);
			dlvSlipL_bldr.addSelect(t2.dlv_inst_d_no);
			dlvSlipL_bldr.addSelect(m1.cst_iv_flg);
			dlvSlipL_bldr.addSelect(t2.dlv_slip_d_no);
			dlvSlipL_bldr.addSelect(nvl(m11.bp_nm, m1.bp_nm).as("cst_nm"));
			dlvSlipL_bldr.addSelect(m1.cntry_cd.as("cst_cntry_cd"));
			dlvSlipL_bldr.addSelect(nvl( t.dlv_id_nm, nvl(m11.bp_nm, m2.bp_nm)).as("dlv_nm"));
			dlvSlipL_bldr.addSelect(m2.cntry_cd.as("dlv_cntry_cd"));
			dlvSlipL_bldr.addSelect(t4.ship_to_id_cd.as("tdlv_cd"));
			dlvSlipL_bldr.addSelect(nvl(t4.ship_to_id_nm, nvl(m17.bp_nm, m3.bp_nm)).as("tdlv_nm"));
			dlvSlipL_bldr.addSelect(t4.ship_to_zip_cd.as("tdlv_zip_cd"));
			dlvSlipL_bldr.addSelect(t4.ship_to_addr1.as("tdlv_addr1"));
			dlvSlipL_bldr.addSelect(t4.ship_to_addr2.as("tdlv_addr2"));
			dlvSlipL_bldr.addSelect(t4.ship_to_addr3.as("tdlv_addr3"));
			dlvSlipL_bldr.addSelect(t4.ship_to_addr4.as("tdlv_addr4"));
			dlvSlipL_bldr.addSelect(t4.ship_to_cntct_dpt.as("tdlv_cntct_dpt"));
			dlvSlipL_bldr.addSelect(t4.ship_to_cntct_psn.as("tdlv_cntct_psn"));
			dlvSlipL_bldr.addSelect(t4.ship_to_tel.as("tdlv_tel"));
			dlvSlipL_bldr.addSelect(t4.ship_to_fax.as("tdlv_fax"));
			dlvSlipL_bldr.addSelect(t4.ship_to_sundry_flg.as("tdlv_sundry_flg"));
			dlvSlipL_bldr.addSelect(m3.cntry_cd.as("tdlv_cntry_cd"));
			dlvSlipL_bldr.addSelect(t4.via_dlv_typ);
			dlvSlipL_bldr.addSelect(nvl(m12.dpt_nm, m4.dpt_nm).as("sls_dpt_nm"));
			dlvSlipL_bldr.addSelect(nvl(m13.usr_nm, m5.usr_nm).as("sls_usr_nm"));
			dlvSlipL_bldr.addSelect(m4.wg_cd);
			dlvSlipL_bldr.addSelect(t2.itm_cd);
			dlvSlipL_bldr.addSelect(t2.itm_sub1);
			dlvSlipL_bldr.addSelect(t2.itm_sub2);
			dlvSlipL_bldr.addSelect(t2.itm_sub3);
			dlvSlipL_bldr.addSelect(nvl( t2.itm_nm, nvl(m14.itm_nm, m6.itm_nm)).as("itm_nm"));
			dlvSlipL_bldr.addSelect(t2.cst_itm_cd);
			dlvSlipL_bldr.addSelect(t2.cst_itm_nm);
			dlvSlipL_bldr.addSelect(t2.trd_unit_cd);
			dlvSlipL_bldr.addSelect(nvl(m15.unit_nm, m7.unit_nm).as("trd_unit_nm"));
			dlvSlipL_bldr.addSelect(t2.trd_unit_qty);
			dlvSlipL_bldr.addSelect(m8.inc_tax_flg);
			dlvSlipL_bldr.addSelect(decode(m1.cst_iv_flg, value(false), nvl(t6.interim_flg, value(false)), t2.interim_flg).as("interim_flg"));
			dlvSlipL_bldr.addSelect(t2.trd_cur_upri);
			dlvSlipL_bldr.addSelect(t2.trd_cur_amt);
			dlvSlipL_bldr.addSelect(t2.trd_cur_dscnt_amt);
			dlvSlipL_bldr.addSelect(t2.tax_cd);
			dlvSlipL_bldr.addSelect(nvl(m16.tax_nm, m8.tax_nm).as("tax_nm"));
			dlvSlipL_bldr.addSelect(m8.tax_typ);
			dlvSlipL_bldr.addSelect(m8.tax_rate);
			dlvSlipL_bldr.addSelect(t2.trd_cur_tax_amt);
			dlvSlipL_bldr.addSelect(t2.lot_no);
			dlvSlipL_bldr.addSelect(t2.sublot_no);
			dlvSlipL_bldr.addSelect(t5.vld_dt);
			dlvSlipL_bldr.addSelect(t5.lmt_dt);
			dlvSlipL_bldr.addSelect(t2.trd_d_rmrks);
			dlvSlipL_bldr.addSelect(t4.ship_act_no);
			dlvSlipL_bldr.addSelect(t8.dlv_slip_d_no.as("pre_dlv_slip_d_no"));
			dlvSlipL_bldr.addSelect(t3.sls_act_no);
			dlvSlipL_bldr.addSelect(m10.null_val_if_flg);
			dlvSlipL_bldr.addSelect(m6.dscnt_itm_flg);
			dlvSlipL_bldr.addSelect(t6.sls_cststk_flg);
			dlvSlipL_bldr.addSelect(nvl(FCPA_CO$F_GET_CO_NM1(m1.prnt_lcl_cd),
						FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())).as("co_nm"));
			
			dlvSlipL_bldr.addLeftOuterJoin(w1, t.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
					.and(t.dlv_slip_act_no.eq(w1.ship_act_no)));
			dlvSlipL_bldr.addLeftOuterJoin(w2, t.trn_typ.eq(value(MSC_TRN_TYP.SLS.value()))
					.and(t.dlv_slip_act_no.eq(w2.sls_act_no)));
			dlvSlipL_bldr.addInnerJoin(t2, t.dlv_slip_no.eq(t2.dlv_slip_no)
					.and(t.dlv_slip_seq.eq(t2.dlv_slip_seq)));
			// 売上実績の最新のレコード（納品書連番が最大）と結合する
			dlvSlipL_bldr.addLeftOuterJoin(subQuery().select( S1GT.sls_act_no,
					max(S1GT.sls_act_seq).as("max_sls_act_seq"))
					.from( S1GT .innerJoin(S1GW)
							.on(S1GT.sls_act_no.eq(S1GW.sls_act_no))).groupBy(S1GT.sls_act_no).view(maxt3),
					t.trn_typ.eq(value(MSC_TRN_TYP.SLS.value()))
					.and(t.dlv_slip_act_no.eq(maxt3.pr(S1GT.sls_act_no))));
			dlvSlipL_bldr.addLeftOuterJoin(t3, maxt3.pr(t3.sls_act_no).eq(t3.sls_act_no)
					.and(maxt3.pr("max_sls_act_seq").eq(t3.sls_act_seq)));
			dlvSlipL_bldr.addInnerJoin(t4, t.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
					.and(t.dlv_slip_act_no.eq(t4.ship_act_no))
					.or( t.trn_typ.eq(value(MSC_TRN_TYP.SLS.value()))
							.and(t3.ship_act_no.eq(t4.ship_act_no))));
			dlvSlipL_bldr.addLeftOuterJoin(t5, t2.itm_cd.eq(t5.itm_cd)
					.and(t2.itm_sub1.eq(t5.itm_sub1))
					.and(t2.itm_sub2.eq(t5.itm_sub2))
					.and(t2.itm_sub3.eq(t5.itm_sub3))
					.and(t2.lot_no.eq(t5.lot_no))
					.and(t2.sublot_no.eq(t5.sublot_no)));
			dlvSlipL_bldr.addLeftOuterJoin(t6, t2.slo_d_no.eq(t6.slo_d_no));
			dlvSlipL_bldr.addLeftOuterJoin(t7, t.dlv_slip_no.eq(t7.dlv_slip_no)
					.and(t7.dlv_slip_seq.eq(subQuery()
							.select(max(slipDR.dlv_slip_seq))
							.from(slipDR)
							.where(slipDR.dlv_slip_no.eq(t.dlv_slip_no)
							.and(slipDR.dlv_slip_seq.lt(t.dlv_slip_seq))
							.and(slipDR.dlv_slip_d_no.eq(t2.dlv_slip_d_no)))))
					.and(t7.dlv_slip_act_no.isNotNull()));
			dlvSlipL_bldr.addLeftOuterJoin(t8, t7.dlv_slip_no.eq(t8.dlv_slip_no)
					.and(t7.dlv_slip_seq.eq(t8.dlv_slip_seq))
					.and(t2.dlv_slip_d_no.eq(t8.dlv_slip_d_no)));
			dlvSlipL_bldr.addLeftOuterJoin(m1, t.bp_cd.eq(m1.bp_cd));
			dlvSlipL_bldr.addLeftOuterJoin(m11, t.bp_cd.eq(m11.bp_cd)
					.and(m11.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addLeftOuterJoin(m2, t.dlv_id_cd.eq(m2.bp_cd));
			dlvSlipL_bldr.addLeftOuterJoin(m11, t.dlv_id_cd.eq(m11.bp_cd)
					.and(m11.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addLeftOuterJoin(m3, t4.ship_to_id_cd.eq(m3.bp_cd));
			dlvSlipL_bldr.addLeftOuterJoin(m17, t4.ship_to_id_cd.eq(m17.bp_cd)
					.and(m17.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addLeftOuterJoin(m4, t.dpt_cd.eq(m4.dpt_cd)
					.and(t.ac_dt.between(m4.st_dt, m4.end_dt)));
			dlvSlipL_bldr.addLeftOuterJoin(m12, t.dpt_cd.eq(m12.dpt_cd)
					.and(t.ac_dt.between(m12.st_dt, m12.end_dt))
					.and(m12.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addLeftOuterJoin(m5, t.usr_cd.eq(m5.usr_cd));
			dlvSlipL_bldr.addLeftOuterJoin(m13, t.usr_cd.eq(m13.usr_cd)
					.and(m13.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addLeftOuterJoin(m6, t2.itm_cd.eq(m6.itm_cd)
					.and(t2.itm_sub1.eq(m6.itm_sub1))
					.and(t2.itm_sub2.eq(m6.itm_sub2))
					.and(t2.itm_sub3.eq(m6.itm_sub3)));
			dlvSlipL_bldr.addLeftOuterJoin(m14, t2.itm_cd.eq(m14.itm_cd)
					.and(t2.itm_sub1.eq(m14.itm_sub1))
					.and(t2.itm_sub2.eq(m14.itm_sub2))
					.and(t2.itm_sub3.eq(m14.itm_sub3))
					.and(m14.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addLeftOuterJoin(m7, t2.trd_unit_cd.eq(m7.unit_cd));
			dlvSlipL_bldr.addLeftOuterJoin(m15, t2.trd_unit_cd.eq(m15.unit_cd)
					.and(m15.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addLeftOuterJoin(m8, t2.tax_cd.eq(m8.tax_cd));
			dlvSlipL_bldr.addLeftOuterJoin(m16, t2.tax_cd.eq(m16.tax_cd)
					.and(m16.lcl_cd.eq(m1.prnt_lcl_cd)));
			dlvSlipL_bldr.addInnerJoin(m9, t.bp_cd.eq(m9.bp_cd)
					.and(m9.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SHIP_ACT_SEND.value())))
					.and(bind("today").between(m9.st_dt, m9.end_dt)));
			dlvSlipL_bldr.addInnerJoin(m10, m10.ext_sys_cd.eq(m9.ext_sys_cd));
			
			dlvSlipL_bldr.setWhere(w1.ship_act_no.isNotNull().or(w2.sls_act_no.isNotNull()));
			// 伝票状況区分が新規　または（伝票状況区分が取消　かつ　納品書連番=取消された納品伝票の納品書連番の最大値）
			dlvSlipL_bldr.addWhereWithAnd(t.slip_sts_typ
					.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
					.or(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value()))
							.and(exists(subQuery().select(value("X"))
									.from(subQuery()
											.select(S2CT.dlv_slip_no,
													max(S2CT.dlv_slip_seq)
															.as("max_can_dlv_slip_seq"))
											.from(S2CT)
											.where(S2CT.slip_sts_typ.eq(
													value(MAC_SLIP_STS_TYP.CAN.value()))
											.and(S2CT.trn_typ.eq(t.trn_typ)))
											.groupBy(S2CT.dlv_slip_no).view(S1ST))
									.where(t.dlv_slip_no.eq(S1ST.pr(S2CT.dlv_slip_no))
											.and(t.dlv_slip_seq.eq(
													S1ST.pr("max_can_dlv_slip_seq"))))))
							.and(notExists(subQuery().select(value("X"))
									.from(S3ST.innerJoin(S3ST2)
											.on(S3ST.dlv_slip_no.eq(S3ST2.dlv_slip_no)
													.and(S3ST.dlv_slip_seq.eq(S3ST2.dlv_slip_seq))))
									.where(t.dlv_slip_no.eq(S3ST.dlv_slip_no)
											.and(t2.dlv_slip_d_no.eq(S3ST2.dlv_slip_d_no))
											.and(S3ST.slip_sts_typ.eq(value(
													MAC_SLIP_STS_TYP.CRT.value())))
											.and(S3ST.trn_typ.eq(t.trn_typ)))))));
			dlvSlipL_bldr.addWhereWithAnd(t.cst_po_no.isNotNull());
			dlvSlipL_bldr.addWhereWithAnd(t.trd_ptn_typ.in(
							value(MAC_TRD_PTN_TYP.SLS.value()),
							value(MAC_TRD_PTN_TYP.SHIP.value())));
			dlvSlipL_bldr.addWhereWithAnd(m1.cst_iv_flg.eq(value(false))
					.or(t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
							.or(t4.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())).and(t4.iv_no.isNull())));
			dlvSlipL_bldr.addWhereWithAnd(t6.slo_d_no.isNull()
							.or(t6.proc_typ.neq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
							.or(t6.proc_typ.isNull()));
			dlvSlipL_bldr.addWhereWithAnd(m10.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.EDI.value()))
							.or(t2.cst_po_d_no.isNotNull()));
			dlvSlipL_bldr.addOrderByAsc(t.dlv_slip_no, t.dlv_slip_seq, t2.dlv_slip_d_no);
			
			MCRow bindR = MCRow.create();
			bindR.setValueNE("today", getToday());
			
			dbSelect("MSLAL5150_MST_DLV_SLIP_S01", _dlvSlipL, dlvSlipL_bldr, bindR);
		}
		
		/**
		 * インボイス出荷実績マップを取得する。
		 */
		protected void getIvShipActMapL() {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			
			MSW_SHIP_ACT_KEY_R w1 = MSW_SHIP_ACT_KEY_R.create("W1");
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACT");
			
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
			ivShipActMap_bldr.setDistinct();
			ivShipActMap_bldr.setSelect(shipActD.dlv_slip_d_no);
			ivShipActMap_bldr.addSelect(ivD.iv_d_no);
			ivShipActMap_bldr.addSelect(iv.iv_no, iv.iv_rev);
			
			ivShipActMap_bldr.addInnerJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipActMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipActMap_bldr.addInnerJoin(shipActD, ivShipActMap.ship_act_d_no.eq(shipActD.ship_act_d_no));
			ivShipActMap_bldr.addInnerJoin(shipAct, shipActD.ship_act_no.eq(shipAct.ship_act_no));
			ivShipActMap_bldr.addInnerJoin(w1, shipAct.ship_act_no.eq(w1.ship_act_no));
			ivShipActMap_bldr.setWhere(shipAct.can_flg.eq(value(false)));
			ivShipActMap_bldr.addWhereWithAnd(ivShipActMap.ship_act_fix_flg.eq(value(true)));
			ivShipActMap_bldr.addWhereWithAnd(iv.iv_ship_flg.eq(value(false)));
			ivShipActMap_bldr.addWhereWithAnd(iv.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
			ivShipActMap_bldr.addWhereWithAnd(iv.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.SHIP.value())));
			
			dbSelect("MSLAL5150_MST_IV_SHIP_ACT_MAP_S01", _ivShipActMapL, ivShipActMap_bldr);
			
			_ivShipActMapIdxkey = _ivShipActMapL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no);
		}
		
		/**
		 * 削除したインボイスの情報を取得する。
		 */
		protected void getDelIV() {
			
			_ivDelL = MCList.create(MST_IV_R.class);
			MST_IV_R iv = MST_IV_R.create("IV");
			
			if (!up2().isEmpty()) {
				MCQueryApiBuilder iv_bldr = MCQueryApiBuilder.create(iv);
				iv_bldr.setWhere(iv.iv_no.eq(bind(ShipActSendIf_Upd01_IvDlvR.$iv_no)));
				iv_bldr.addConstWhereWithAnd(iv.iv_ship_flg.eq(value(false)));
				iv_bldr.addConstWhereWithAnd(iv.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
				iv_bldr.addConstWhereWithAnd(iv.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.SHIP.value())));
				dbSelect("MSLAL5150_MST_IV_S02", _ivDelL, iv_bldr, up2());
			}
			
			_ivDelIdxkey = _ivDelL.createIndex(MST_IV_R.$iv_no);
		}
		
		/**
		* シーケンスから番号を取得し、キャッシュする。（納品伝票）
		*/
		protected void doDlvSlipNoSeqCache() {
			
			// データＮＯ発番
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO,
					_dlvSlipL.groupBy(MST_DLV_SLIP_R.$dlv_slip_no).size());
			
			// データ行ＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.EDISHIPACTSENDIF, _dlvSlipL.size());
		}
		
		/**
		 * 納品伝票情報をＥＤＩ出荷実績送信ＩＦに設定する。
		 */
		protected void crtDlvSlipSendIfData() {

			addAll(_eshipActSendIfL, _dlvSlipL, createMap_MST_ESHIP_ACT_SEND_IF_R_MST_DLV_SLIP_R());
		}
		
		/**
		 * 出荷時実績送信ＩＦのデータＮＯを設定する。（納品書NOごとに発番）
		 */
		protected void setDlvSlipNoDataNo() {

			for (MCList<MST_ESHIP_ACT_SEND_IF_R> eshipActSendIfL : 
				_eshipActSendIfL.groupList(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no)) {
				
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				
				eshipActSendIfL.setValueNE(MST_ESHIP_ACT_SEND_IF_R.$data_no, dataNo);
				for(MST_ESHIP_ACT_SEND_IF_R r: eshipActSendIfL) {
					convNullValToNull(r);
					convDscntAmt(r);
					convToNull(r);
				}
			}
		}
		
		/**
		 * 納品伝票を取得するためのワークテーブルデータを削除する。
		 */
		protected void delDlvSlipWk() {
			
			dbWkDelete("MSLAL5150_MSW_SHIP_ACT_D02", _shipActWkL_bldr.getBaseDbc());
			dbWkDelete("MSLAL5150_MSW_SLS_ACT_D01", _slsActWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 出荷実績情報を元に、 ＥＤＩ出荷実績送信ＩＦを作成する。<br>
		 * パターン２：出荷実績から実行されるケース（インボイス取引かつ、配送先経由しない）
		 */
		protected void crtShipActSendIf() {
			
			crtShipActWk();
			
			if (!_shipActWkL.isEmpty() && !_ivNoWkL.isEmpty()) {
				
				getShipAct();
				
				getDlvInstRcpt();
				
				getLotList();
				
				doShipActNoSeqCache();
				
				crtShipActpSendIfData();
				
				setShipActNoDataNo();
			}
			
			delShipActWk();
		}
		
		/**
		 * 出荷実績を取得するためのワークテーブルデータを登録する。
		 */
		protected void crtShipActWk() {
			
			_shipActWkL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R shipActWkR = null;
			
			_ivNoWkL = MCList.create(MST_IV_NO_R.class);
			MST_IV_NO_R ivNoWkR = null;
			
			for (ShipActSendIf_Upd01_DtlR dtlR : up0()) {
				
				if (!isNull(dtlR.ship_act_no()) && !isNull(dtlR.iv_no())) {
					
					shipActWkR = MST_SHIP_ACT_R.create();
					shipActWkR.ship_act_no(dtlR.ship_act_no());
					
					_shipActWkL.add(shipActWkR);
					
					ivNoWkR = MST_IV_NO_R.create();
					ivNoWkR.iv_no(dtlR.iv_no());
					
					_ivNoWkL.add(ivNoWkR);
				}
			}
			
			dbWkDelete("MSLAL5150_MSW_SHIP_ACT_D03", _shipActWkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5150_MSW_SHIP_ACT_I02", _shipActWkL, _shipActWkL_bldr.getBaseDbc());
			dbWkDelete("MSLAL5150_MSW_IV_NO_D01", _ivNoWkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5150_MSW_IV_NO_I01", _ivNoWkL, _ivNoWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 出荷実績を取得する。
		 */
		protected void getShipAct() {
			MSW_SHIP_ACT_KEY_R w1 = MSW_SHIP_ACT_KEY_R.create("W1");
			MSW_IV_NO_KEY_R w2 = MSW_IV_NO_KEY_R.create("W2");
			MST_IV_R t2 = MST_IV_R.create("T2");
			MST_IV_D_R t3 = MST_IV_D_R.create("T3");
			MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_BP_R m2 = MAM_BP_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_DPT_R m4 = MAM_DPT_R.create("M4");
			MAM_USR_R m5 = MAM_USR_R.create("M5");
			MAM_ITM_R m6 = MAM_ITM_R.create("M6");
			MAM_UNIT_R m7 = MAM_UNIT_R.create("M7");
			MAM_TAX_R m8 = MAM_TAX_R.create("M8");
			MAM_EDI_IF_CTL_R m9 = MAM_EDI_IF_CTL_R.create("M9");
			MAM_EXT_SYS_R m10 = MAM_EXT_SYS_R.create("M10");
			MAM_BP_LCL_R m11 = MAM_BP_LCL_R.create("M11");
			MAM_DPT_LCL_R m12 = MAM_DPT_LCL_R.create("M12");
			MAM_USR_LCL_R m13 = MAM_USR_LCL_R.create("M13");
			MAM_ITM_LCL_R m14 = MAM_ITM_LCL_R.create("M14");
			MAM_UNIT_LCL_R m15 = MAM_UNIT_LCL_R.create("M15");
			MAM_TAX_LCL_R m16 = MAM_TAX_LCL_R.create("M16");

			_shipActL = MCList.create(MST_SHIP_ACT_R.class);
			
			_shipActL.addBooleanColumn(MAM_BP_R.$cst_iv_flg);
			_shipActL.addBooleanColumn(MST_IV_R.$dlv_sundry_flg);
			_shipActL.addBooleanColumn("tdlv_sundry_flg");
			_shipActL.addBooleanColumn("inc_tax_flg");
			_shipActL.addBooleanColumn("interim_flg");
			_shipActL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			_shipActL.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
			_shipActL.addNumberColumn(MST_IV_R.$iv_rev);

			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder shipActL_bldr = MCQueryApiBuilder.create(t);

			shipActL_bldr.removeSelect(MST_SHIP_ACT_R.$cst_cd);
			
			shipActL_bldr.addSelect(m9.ext_sys_cd);
			shipActL_bldr.addSelect(t3.cst_po_no);
			shipActL_bldr.addSelect(t3.cst_po_d_no);
			shipActL_bldr.addSelect(m1.cst_iv_flg);
			shipActL_bldr.addSelect(value(MSC_TRN_TYP.SHIP.value()).as("trn_typ"));
			shipActL_bldr.addSelect(t3.iv_d_no);
			shipActL_bldr.addSelect(t2.ship_rqst_id_cd.as("cst_cd"));
			shipActL_bldr.addSelect(nvl(m11.bp_nm,m1.bp_nm).as("cst_nm"));
			shipActL_bldr.addSelect(m1.cntry_cd.as("cst_cntry_cd"));
			shipActL_bldr.addSelect(t2.dlv_id_cd);
			shipActL_bldr.addSelect(nvl( t2.dlv_id_nm, nvl(m11.bp_nm, m2.bp_nm)).as("dlv_nm"));
			shipActL_bldr.addSelect(t2.dlv_zip_cd);
			shipActL_bldr.addSelect(t2.dlv_addr1);
			shipActL_bldr.addSelect(t2.dlv_addr2);
			shipActL_bldr.addSelect(t2.dlv_addr3);
			shipActL_bldr.addSelect(t2.dlv_addr4);
			shipActL_bldr.addSelect(t2.dlv_cntct_dpt);
			shipActL_bldr.addSelect(t2.dlv_cntct_psn);
			shipActL_bldr.addSelect(t2.dlv_tel);
			shipActL_bldr.addSelect(t2.dlv_fax);
			shipActL_bldr.addSelect(t2.dlv_sundry_flg);
			shipActL_bldr.addSelect(m2.cntry_cd.as("dlv_cntry_cd"));
			shipActL_bldr.addSelect(nvl( t.ship_to_id_nm, m3.bp_nm).as("tdlv_nm"));
			shipActL_bldr.addSelect(m3.cntry_cd.as("tdlv_cntry_cd"));
			shipActL_bldr.addSelect(t3.sls_dpt_cd);
			shipActL_bldr.addSelect(nvl(m12.dpt_nm, m4.dpt_nm).as("sls_dpt_nm"));
			shipActL_bldr.addSelect(t3.sls_usr_cd);
			shipActL_bldr.addSelect(nvl(m13.usr_nm,m5.usr_nm).as("sls_usr_nm"));
			shipActL_bldr.addSelect(m4.wg_cd);
			shipActL_bldr.addSelect(t3.itm_cd);
			shipActL_bldr.addSelect(t3.itm_sub1);
			shipActL_bldr.addSelect(t3.itm_sub2);
			shipActL_bldr.addSelect(t3.itm_sub3);
			shipActL_bldr.addSelect(nvl( t3.itm_nm, nvl(m14.itm_nm,m6.itm_nm)).as("itm_nm"));
			shipActL_bldr.addSelect(t3.cst_itm_cd);
			shipActL_bldr.addSelect(t3.cst_itm_nm);
			shipActL_bldr.addSelect(t3.trd_unit_cd);
			shipActL_bldr.addSelect(nvl(m15.unit_nm, m7.unit_nm).as("trd_unit_nm"));
			shipActL_bldr.addSelect(t3.trd_unit_qty);
			shipActL_bldr.addSelect(t2.trd_cur_cd);
			shipActL_bldr.addSelect(m8.inc_tax_flg);
			shipActL_bldr.addSelect(t3.interim_flg);
			shipActL_bldr.addSelect(t3.trd_cur_upri);
			shipActL_bldr.addSelect(t3.trd_cur_amt);
			shipActL_bldr.addSelect(t3.trd_cur_dscnt_amt);
			shipActL_bldr.addSelect(t3.tax_cd);
			shipActL_bldr.addSelect(nvl(m16.tax_nm,m8.tax_nm).as("tax_nm"));
			shipActL_bldr.addSelect(m8.tax_typ);
			shipActL_bldr.addSelect(m8.tax_rate);
			shipActL_bldr.addSelect(t3.trd_cur_tax_amt);
			shipActL_bldr.addSelect(t2.iv_rmrks);
			shipActL_bldr.addSelect(t3.iv_d_rmrks);
			shipActL_bldr.addSelect(m10.null_val_if_flg);			
			shipActL_bldr.addSelect(m6.dscnt_itm_flg);			
			shipActL_bldr.addSelect(t2.iv_rev);
			shipActL_bldr.addSelect(nvl(FCPA_CO$F_GET_CO_NM1(m1.prnt_lcl_cd),
					FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())).as("co_nm"));

			shipActL_bldr.addInnerJoin(w1, t.ship_act_no.eq(w1.ship_act_no));
			shipActL_bldr.addInnerJoin(w2, t.iv_no.eq(w2.iv_no));
			shipActL_bldr.addInnerJoin(t2, t.iv_no.eq(t2.iv_no));
			shipActL_bldr.addInnerJoin(t3, t2.iv_mng_no.eq(t3.iv_mng_no));
			shipActL_bldr.addInnerJoin(t4, t3.slo_d_no.eq(t4.slo_d_no));
			shipActL_bldr.addLeftOuterJoin(m1, t2.ship_rqst_id_cd.eq(m1.bp_cd));
			shipActL_bldr.addLeftOuterJoin(m11, t2.ship_rqst_id_cd.eq(m11.bp_cd)
					.and(m11.lcl_cd.eq(m1.prnt_lcl_cd)));
			shipActL_bldr.addLeftOuterJoin(m2, t2.dlv_id_cd.eq(m2.bp_cd));
			shipActL_bldr.addLeftOuterJoin(m11, t2.dlv_id_cd.eq(m11.bp_cd)
					.and(m11.lcl_cd.eq(m2.prnt_lcl_cd)));
			shipActL_bldr.addLeftOuterJoin(m3, t.ship_to_id_cd.eq(m3.bp_cd));
			shipActL_bldr.addLeftOuterJoin(m4, t3.sls_dpt_cd.eq(m4.dpt_cd)
					.and(t.ac_dt.between(m4.st_dt, m4.end_dt)));
			shipActL_bldr.addLeftOuterJoin(m12, t3.sls_dpt_cd.eq(m12.dpt_cd)
					.and(t.ac_dt.between(m12.st_dt, m12.end_dt))
					.and(m12.lcl_cd.eq(m2.prnt_lcl_cd)));
			shipActL_bldr.addLeftOuterJoin(m5, t3.sls_usr_cd.eq(m5.usr_cd));
			shipActL_bldr.addLeftOuterJoin(m13, t3.sls_usr_cd.eq(m13.usr_cd)
					.and(m13.lcl_cd.eq(m2.prnt_lcl_cd)));
			shipActL_bldr.addLeftOuterJoin(m6, t3.itm_cd.eq(m6.itm_cd)
					.and(t3.itm_sub1.eq(m6.itm_sub1))
					.and(t3.itm_sub2.eq(m6.itm_sub2))
					.and(t3.itm_sub3.eq(m6.itm_sub3)));
			shipActL_bldr.addLeftOuterJoin(m14, t3.itm_cd.eq(m14.itm_cd)
					.and(t3.itm_sub1.eq(m14.itm_sub1))
					.and(t3.itm_sub2.eq(m14.itm_sub2))
					.and(t3.itm_sub3.eq(m14.itm_sub3))
					.and(m14.lcl_cd.eq(m2.prnt_lcl_cd)));
			shipActL_bldr.addLeftOuterJoin(m7, t3.trd_unit_cd.eq(m7.unit_cd));
			shipActL_bldr.addLeftOuterJoin(m15, t3.trd_unit_cd.eq(m15.unit_cd)
					.and(m15.lcl_cd.eq(m2.prnt_lcl_cd)));
			shipActL_bldr.addLeftOuterJoin(m8, t3.tax_cd.eq(m8.tax_cd));
			shipActL_bldr.addLeftOuterJoin(m16, t3.tax_cd.eq(m16.tax_cd)
					.and(m16.lcl_cd.eq(m2.prnt_lcl_cd)));
			shipActL_bldr.addInnerJoin(m9, t2.ship_rqst_id_cd.eq(m9.bp_cd)
					.and(m9.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SHIP_ACT_SEND.value())))
					.and(bind("today").between(m9.st_dt, m9.end_dt)));
			shipActL_bldr.addInnerJoin(m10, m10.ext_sys_cd.eq(m9.ext_sys_cd));

			shipActL_bldr.addOrderByAsc(t2.iv_no, t3.disp_seq);
			
			shipActL_bldr.setWhere(t3.cst_po_no.isNotNull());
			shipActL_bldr.addWhereWithAnd(t2.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
			shipActL_bldr.addWhereWithAnd(t2.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.SHIP.value())));
			shipActL_bldr.addWhereWithAnd(m10.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.EDI.value()))
					.or(t3.cst_po_d_no.isNotNull()));
			
			MCRow bindR = MCRow.create();
			bindR.setValueNE("today", getToday());
			dbSelect("MSLAL5150_MST_SHIP_ACT_S01", _shipActL, shipActL_bldr, bindR);
		}
		
		/**
		* シーケンスから番号を取得し、キャッシュする。（出荷実績）
		*/
		protected void doShipActNoSeqCache() {
			
			// データＮＯ発番
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO,
					_shipActL.groupBy(MST_SHIP_ACT_R.$iv_no).size());
			
			// データ行ＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.EDISHIPACTSENDIF, _shipActL.size());
		}
		
		/**
		 * 出荷実績情報を ＥＤＩ出荷実績送信ＩＦに設定する。
		 */
		protected void crtShipActpSendIfData() {

			addAll(_eshipActSendIfL, _shipActL, createMap_MST_ESHIP_ACT_SEND_IF_R_MST_SHIP_ACT_R());
			
		}
		
		/**
		 * 出荷時実績送信ＩＦのデータＮＯを設定する。（インボイスNOごとに発番）
		 */
		protected void setShipActNoDataNo() {

			for (MCList<MST_ESHIP_ACT_SEND_IF_R> eshipActSendIfL : 
				_eshipActSendIfL.groupList(MST_SHIP_ACT_R.$iv_no)) {
				
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				
				eshipActSendIfL.setValueNE(MST_ESHIP_ACT_SEND_IF_R.$data_no, dataNo);
				for(MST_ESHIP_ACT_SEND_IF_R r: eshipActSendIfL) {
					convNullValToNull(r);
					convDscntAmt(r);
				}
			}
		}
		
		/**
		 * 出荷実績を取得するためのワークテーブルデータを削除する。
		 */
		protected void delShipActWk() {

			dbWkDelete("MSLAL5150_MSW_SHIP_ACT_D04", _shipActWkL_bldr.getBaseDbc());
			dbWkDelete("MSLAL5150_MSW_IV_NO_D02", _ivNoWkL_bldr.getBaseDbc());
		}
		
		/**
		 * インボイス情報を元に、 ＥＤＩ出荷実績送信ＩＦを作成する。<br>
		 * パターン３：輸出実績から実行されるケース
		 */
		protected void crtIvSendIf() {
			
			crtIvWk();
			
			if (!_ivNoWkL.isEmpty()) {
				
				getIv();
				
				getDlvInstRcpt();
				
				getIvShipActLotList();
				
				getIvShipActD();
				
				doIvNoSeqCache();
				
				crtIvSendIfData();
				
				setIvNoDataNo();
			}
			
			delIvWk();
		}
		
		/**
		 * インボイスを取得するためのワークテーブルデータを登録する。
		 */
		protected void crtIvWk() {
			
			_ivNoWkL = MCList.create(MST_IV_NO_R.class);
			MST_IV_NO_R ivNoWkR = null;
			
			for (ShipActSendIf_Upd01_DtlR dtlR : up0()) {
				
				if (isNull(dtlR.ship_act_no()) && !isNull(dtlR.iv_no())) {
					
					ivNoWkR = MST_IV_NO_R.create();
					ivNoWkR.iv_no(dtlR.iv_no());
					
					_ivNoWkL.add(ivNoWkR);
				}
			}
			dbWkDelete("MSLAL5150_MSW_IV_NO_D03", _ivNoWkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5150_MSW_IV_NO_I02", _ivNoWkL, _ivNoWkL_bldr.getBaseDbc());
		}
		
		/**
		 * インボイス情報を取得する。
		 */
		protected void getIv() {
			MSW_IV_NO_KEY_R w1 = MSW_IV_NO_KEY_R.create("W1");
			MST_IV_D_R t2 = MST_IV_D_R.create("T2");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_BP_R m2 = MAM_BP_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_DPT_R m4 = MAM_DPT_R.create("M4");
			MAM_USR_R m5 = MAM_USR_R.create("M5");
			MAM_ITM_R m6 = MAM_ITM_R.create("M6");
			MAM_UNIT_R m7 = MAM_UNIT_R.create("M7");
			MAM_TAX_R m8 = MAM_TAX_R.create("M8");
			MAM_EDI_IF_CTL_R m9 = MAM_EDI_IF_CTL_R.create("M9");
			MAM_EXT_SYS_R m10 = MAM_EXT_SYS_R.create("M10");
			MAM_BP_LCL_R m11 = MAM_BP_LCL_R.create("M11");
			MAM_DPT_LCL_R m12 = MAM_DPT_LCL_R.create("M12");
			MAM_USR_LCL_R m13 = MAM_USR_LCL_R.create("M13");
			MAM_ITM_LCL_R m14 = MAM_ITM_LCL_R.create("M14");
			MAM_UNIT_LCL_R m15 = MAM_UNIT_LCL_R.create("M15");
			MAM_TAX_LCL_R m16 = MAM_TAX_LCL_R.create("M16");
			MAM_BP_LCL_R m17 = MAM_BP_LCL_R.create("M17");

			_ivL = MCList.create(MST_IV_R.class);
			
			_ivL.addBooleanColumn(MAM_BP_R.$cst_iv_flg);
			_ivL.addBooleanColumn("inc_tax_flg");
			_ivL.addBooleanColumn("interim_flg");
			_ivL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			_ivL.addBooleanColumn("dscnt_itm_flg");

			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
			
			ivL_bldr.addSelect(m9.ext_sys_cd);
			ivL_bldr.addSelect(t2.cst_po_no);
			ivL_bldr.addSelect(t2.cst_po_d_no);
			ivL_bldr.addSelect(m1.cst_iv_flg);
			ivL_bldr.addSelect(t2.iv_d_no);
			ivL_bldr.addSelect(nvl(m11.bp_nm, m1.bp_nm).as("cst_nm"));
			ivL_bldr.addSelect(m1.cntry_cd.as("cst_cntry_cd"));
			ivL_bldr.addSelect(nvl( t.dlv_id_nm, nvl(m11.bp_nm, m2.bp_nm)).as("dlv_nm"));
			ivL_bldr.addSelect(m2.cntry_cd.as("dlv_cntry_cd"));
			ivL_bldr.addSelect(nvl( t.tdlv_nm, nvl(m17.bp_nm, m3.bp_nm)).as("tdlv_nm"));
			ivL_bldr.addSelect(m3.cntry_cd.as("tdlv_cntry_cd"));
			ivL_bldr.addSelect(t2.sls_dpt_cd);
			ivL_bldr.addSelect(nvl(m12.dpt_nm, m4.dpt_nm).as("sls_dpt_nm"));
			ivL_bldr.addSelect(t2.sls_usr_cd);
			ivL_bldr.addSelect(nvl(m13.usr_nm, m5.usr_nm).as("sls_usr_nm"));
			ivL_bldr.addSelect(m4.wg_cd);
			ivL_bldr.addSelect(t2.itm_cd);
			ivL_bldr.addSelect(t2.itm_sub1);
			ivL_bldr.addSelect(t2.itm_sub2);
			ivL_bldr.addSelect(t2.itm_sub3);
			ivL_bldr.addSelect(nvl( t2.itm_nm, nvl(m14.itm_nm, m6.itm_nm)).as("itm_nm"));
			ivL_bldr.addSelect(t2.cst_itm_cd);
			ivL_bldr.addSelect(t2.cst_itm_nm);
			ivL_bldr.addSelect(t2.trd_unit_cd);
			ivL_bldr.addSelect(nvl(m15.unit_nm, m7.unit_nm).as("trd_unit_nm"));
			ivL_bldr.addSelect(t2.trd_unit_qty);
			ivL_bldr.addSelect(m8.inc_tax_flg);
			ivL_bldr.addSelect(t2.interim_flg);
			ivL_bldr.addSelect(t2.trd_cur_upri);
			ivL_bldr.addSelect(t2.trd_cur_amt);
			ivL_bldr.addSelect(t2.trd_cur_dscnt_amt);
			ivL_bldr.addSelect(t2.tax_cd);
			ivL_bldr.addSelect(nvl(m16.tax_nm, m8.tax_nm).as("tax_nm"));
			ivL_bldr.addSelect(m8.tax_typ);
			ivL_bldr.addSelect(m8.tax_rate);
			ivL_bldr.addSelect(t2.trd_cur_tax_amt);
			ivL_bldr.addSelect(t2.iv_d_rmrks);
			ivL_bldr.addSelect(m10.null_val_if_flg);			
			ivL_bldr.addSelect(m6.dscnt_itm_flg);			
			ivL_bldr.addSelect(nvl(FCPA_CO$F_GET_CO_NM1(m1.prnt_lcl_cd),
					FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())).as("co_nm"));
			
			ivL_bldr.addInnerJoin(w1, t.iv_no.eq(w1.iv_no));
			ivL_bldr.addInnerJoin(t2, t.iv_mng_no.eq(t2.iv_mng_no));
			ivL_bldr.addLeftOuterJoin(m1, t.ship_rqst_id_cd.eq(m1.bp_cd));
			ivL_bldr.addLeftOuterJoin(m11, t.ship_rqst_id_cd.eq(m11.bp_cd)
					.and(m11.lcl_cd.eq(m1.prnt_lcl_cd)));
			ivL_bldr.addLeftOuterJoin(m2, t.dlv_id_cd.eq(m2.bp_cd));
			ivL_bldr.addLeftOuterJoin(m11, t.dlv_id_cd.eq(m11.bp_cd)
					.and(m11.lcl_cd.eq(m2.prnt_lcl_cd)));
			ivL_bldr.addLeftOuterJoin(m3, t.tdlv_cd.eq(m3.bp_cd));
			ivL_bldr.addLeftOuterJoin(m17, t.tdlv_cd.eq(m17.bp_cd)
					.and(m17.lcl_cd.eq(m2.prnt_lcl_cd)));
			ivL_bldr.addLeftOuterJoin(m4, t2.sls_dpt_cd.eq(m4.dpt_cd)
					.and(t.ac_dt.between(m4.st_dt, m4.end_dt)));
			ivL_bldr.addLeftOuterJoin(m12, t2.sls_dpt_cd.eq(m12.dpt_cd)
					.and(t.ac_dt.between(m12.st_dt, m12.end_dt))
					.and(m12.lcl_cd.eq(m2.prnt_lcl_cd)));
			ivL_bldr.addLeftOuterJoin(m5, t2.sls_usr_cd.eq(m5.usr_cd));
			ivL_bldr.addLeftOuterJoin(m13, t2.sls_usr_cd.eq(m13.usr_cd)
					.and(m13.lcl_cd.eq(m2.prnt_lcl_cd)));
			ivL_bldr.addLeftOuterJoin(m6, t2.itm_cd.eq(m6.itm_cd)
					.and(t2.itm_sub1.eq(m6.itm_sub1))
					.and(t2.itm_sub2.eq(m6.itm_sub2))
					.and(t2.itm_sub3.eq(m6.itm_sub3)));
			ivL_bldr.addLeftOuterJoin(m14, t2.itm_cd.eq(m14.itm_cd)
					.and(t2.itm_sub1.eq(m14.itm_sub1))
					.and(t2.itm_sub2.eq(m14.itm_sub2))
					.and(t2.itm_sub3.eq(m14.itm_sub3))
					.and(m14.lcl_cd.eq(m2.prnt_lcl_cd)));
			ivL_bldr.addLeftOuterJoin(m7, t2.trd_unit_cd.eq(m7.unit_cd));
			ivL_bldr.addLeftOuterJoin(m15, t2.trd_unit_cd.eq(m15.unit_cd)
					.and(m15.lcl_cd.eq(m2.prnt_lcl_cd)));
			ivL_bldr.addLeftOuterJoin(m8, t2.tax_cd.eq(m8.tax_cd));
			ivL_bldr.addLeftOuterJoin(m16, t2.tax_cd.eq(m16.tax_cd)
					.and(m16.lcl_cd.eq(m2.prnt_lcl_cd)));
			ivL_bldr.addInnerJoin(m9, t.ship_rqst_id_cd.eq(m9.bp_cd)
					.and(m9.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SHIP_ACT_SEND.value())))
					.and(bind("today").between(m9.st_dt, m9.end_dt)));
			ivL_bldr.addInnerJoin(m10, m10.ext_sys_cd.eq(m9.ext_sys_cd));
			
			ivL_bldr.addOrderByAsc(t.iv_no, t2.disp_seq);
			
			ivL_bldr.setWhere(t2.cst_po_no.isNotNull());
			ivL_bldr.addWhereWithAnd(t.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value())));
			ivL_bldr.addWhereWithAnd(m10.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.EDI.value()))
					.or(t2.cst_po_d_no.isNotNull()));
			
			MCRow bindR = MCRow.create();
			bindR.setValueNE("today", getToday());
			dbSelect("MSLAL5150_MST_IV_S01", _ivL, ivL_bldr, bindR);
		}
		
		/**
		 * インボイス明細に紐付く納入指示受領情報を取得する。
		 */
		protected void getDlvInstRcpt() {

			_dlvInstRcptL = MCList.create(MST_DLV_INST_RCPT_R.class);
			MST_DLV_INST_RCPT_R t = MST_DLV_INST_RCPT_R.create("T");
			MCQueryApiBuilder dlvInstRcptL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			MST_IV_MAP_R t3 = MST_IV_MAP_R.create("T3");
			MST_IV_D_R t4 = MST_IV_D_R.create("T4");
			MST_IV_R t5 = MST_IV_R.create("T5");
			MSW_IV_NO_KEY_R w1 = MSW_IV_NO_KEY_R.create("W1");

			dlvInstRcptL_bldr.setSelect(t.cst_dlv_inst_no, t.cst_dlv_inst_d_no);
			dlvInstRcptL_bldr.addSelect(t4.iv_d_no);
			
			dlvInstRcptL_bldr.addInnerJoin(t2, t.dlv_inst_rcpt_no.eq(t2.dlv_inst_rcpt_no));
			dlvInstRcptL_bldr.addInnerJoin(t3, t2.ship_schd_no.eq(t3.ship_schd_no));
			dlvInstRcptL_bldr.addInnerJoin(t4, t3.iv_d_no.eq(t4.iv_d_no));
			dlvInstRcptL_bldr.addInnerJoin(t5, t4.iv_mng_no.eq(t5.iv_mng_no));
			dlvInstRcptL_bldr.addInnerJoin(w1, t5.iv_no.eq(w1.iv_no));
			
			dbSelect("MSLAL5150_MST_DLV_INST_RCPT_S01", _dlvInstRcptL, dlvInstRcptL_bldr);
			
			_dlvInstRcptIdxkey = _dlvInstRcptL.createIndex("iv_d_no");
		}
		
		/**
		 * インボイスを取得するためのワークテーブルデータを削除する。
		 */
		protected void delIvWk() {

			dbWkDelete("MSLAL5150_MSW_IV_NO_D04", _ivNoWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 引数で指定されたインボイス明細NOに紐付くロット情報を返す。<br>
		 * 納入指示受領明細が一意に特定できない場合に、nullを返す。
		 * @param ivDNo インボイス明細NO
		 * @return 納入指示受領
		 */
		protected MST_DLV_INST_RCPT_R getDlvInstRcptR(String ivDNo) {

			MCList<MST_DLV_INST_RCPT_R> subL = _dlvInstRcptL.subList(_dlvInstRcptIdxkey, ivDNo);
			
			if (subL.size() == 1) {
				
				return subL.get(0);
			}
			
			return null;
		}
		
		/**
		 * インボイス明細に紐付くロット情報を取得する。(出荷実績から取得)
		 */
		protected void getLotList() {
			
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			MST_SHIP_ALLOC_STS_R t3 = MST_SHIP_ALLOC_STS_R.create("T3");
			MST_SHIP_SCHD_R t4 = MST_SHIP_SCHD_R.create("T4");
			MST_IV_MAP_R t5 = MST_IV_MAP_R.create("T5");
			MST_IV_D_R t6 = MST_IV_D_R.create("T6");
			MST_IV_R t7 = MST_IV_R.create("T7");
			MSW_IV_NO_KEY_R w1 = MSW_IV_NO_KEY_R.create("W1");

			_lotL = MCList.create(MSVT_LOT_LIST_R.class);
			_lotL_t = MSVT_LOT_LIST_R.create("T");
			_lotL_bldr = MCQueryApiBuilder.create(_lotL_t);
			
			_lotL_bldr.setDistinct();
			_lotL_bldr.setSelect(_lotL_t.lot_no); 
			_lotL_bldr.addSelect(_lotL_t.sublot_no);
			_lotL_bldr.addSelect(_lotL_t.vld_dt);
			_lotL_bldr.addSelect(_lotL_t.lmt_dt);
			_lotL_bldr.addSelect(t6.iv_d_no);
			_lotL_bldr.addSelect(t2.ship_act_no);
			
			_lotL_bldr.addInnerJoin(t2,
					_lotL_t.itm_cd.eq(t2.itm_cd)
					.and(_lotL_t.itm_sub1.eq(t2.itm_sub1))
					.and(_lotL_t.itm_sub2.eq(t2.itm_sub2))
					.and(_lotL_t.itm_sub3.eq(t2.itm_sub3))
					.and(_lotL_t.lot_no.eq(t2.lot_no))
					.and(_lotL_t.sublot_no.eq(t2.sublot_no)));
			_lotL_bldr.addInnerJoin(t3, t2.ship_alloc_sts_no.eq(t3.ship_alloc_sts_no));
			
			_lotL_bldr.addInnerJoin(t4, t3.ship_schd_no.eq(t4.ship_schd_no));
			_lotL_bldr.addInnerJoin(t5, t4.ship_schd_no.eq(t5.ship_schd_no));
			_lotL_bldr.addInnerJoin(t6, t5.iv_d_no.eq(t6.iv_d_no));
			_lotL_bldr.addInnerJoin(t7, t6.iv_mng_no.eq(t7.iv_mng_no));
			_lotL_bldr.addInnerJoin(w1, t7.iv_no.eq(w1.iv_no));
			
			dbSelect("MSLAL5150_MSVT_LOT_LIST_S01", _lotL, _lotL_bldr);
			
			_lotIdxkey = _lotL.createIndex("iv_d_no", "ship_act_no");
		}
		
		
		/**
		 * インボイス明細に紐付くロット情報を取得する。(インボイス出荷実績から取得)
		 */
		protected void getIvShipActLotList() {
			
			MST_IV_SHIP_ACT_D_R t2 = MST_IV_SHIP_ACT_D_R.create("T2");
			MSW_IV_NO_KEY_R w1 = MSW_IV_NO_KEY_R.create("W1");

			_lotL = MCList.create(MSVT_LOT_LIST_R.class);
			_lotL_t = MSVT_LOT_LIST_R.create("T");
			_lotL_bldr = MCQueryApiBuilder.create(_lotL_t);
			
			_lotL_bldr.setSelect(_lotL_t.lot_no); 
			_lotL_bldr.addSelect(_lotL_t.sublot_no);
			_lotL_bldr.addSelect(_lotL_t.vld_dt);
			_lotL_bldr.addSelect(_lotL_t.lmt_dt);
			_lotL_bldr.addSelect(t2.iv_d_no);
			
			_lotL_bldr.addInnerJoin(t2,
					_lotL_t.itm_cd.eq(t2.itm_cd)
					.and(_lotL_t.itm_sub1.eq(t2.itm_sub1))
					.and(_lotL_t.itm_sub2.eq(t2.itm_sub2))
					.and(_lotL_t.itm_sub3.eq(t2.itm_sub3))
					.and(_lotL_t.lot_no.eq(t2.lot_no))
					.and(_lotL_t.sublot_no.eq(t2.sublot_no)));
			_lotL_bldr.addInnerJoin(w1, t2.iv_no.eq(w1.iv_no));
			
			dbSelect("MSLAL5150_MSVT_LOT_LIST_S02", _lotL, _lotL_bldr);
			
			_lotIdxkey = _lotL.createIndex("iv_d_no");
		}
		
		/**
		 * インボイス出荷実績明細に紐付く出荷実績を取得する。
		 */
		protected void getIvShipActD() {
			
			_ivShipActDL = MCList.create(MST_IV_SHIP_ACT_D_R.class);
			
			MST_IV_SHIP_ACT_D_R ivShipActD = MST_IV_SHIP_ACT_D_R.create("ISAD");
			MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACT");
			MSW_IV_NO_KEY_R wk = MSW_IV_NO_KEY_R.create("WK");
			
			MCQueryApiBuilder ivShipActD_bldr = MCQueryApiBuilder.create(ivShipActD);
			
			ivShipActD_bldr.setSelect(ivShipActD.iv_no);
			ivShipActD_bldr.addSelect(ivShipActD.iv_d_no);
			ivShipActD_bldr.addSelect(shipAct.dlv_tm);
			
			ivShipActD_bldr.addInnerJoin(shipActD, ivShipActD.ship_act_d_no.eq(shipActD.ship_act_d_no));
			ivShipActD_bldr.addInnerJoin(shipAct, shipActD.ship_act_no.eq(shipAct.ship_act_no));
			ivShipActD_bldr.addInnerJoin(wk, ivShipActD.iv_no.eq(wk.iv_no));
			
			dbSelect("MSLAL5150_MST_IV_SHIP_ACT_D_S01", _ivShipActDL, ivShipActD_bldr);
			
			_ivShipActDIdxkey = _ivShipActDL.createIndex(MST_IV_SHIP_ACT_D_R.$iv_no);
		}
		
		/**
		 * 引数で指定されたインボイス明細NOに紐付くロット情報を返す。<br>
		 * ロットNO＆サブロットNOが一意に決まらない場合に、nullを返す。
		 * @param ivDNo インボイス明細NO
		 * @return ロット情報
		 */
		protected MSVT_LOT_LIST_R getLotR(String ivDNo) {

			MCList<MSVT_LOT_LIST_R> subL = _lotL.subList(_lotIdxkey, ivDNo);
			
			if (subL.size() == 1) {
				
				return subL.get(0);
			}
			
			return null;
		}
		
		/**
		 * 引数で指定されたインボイス明細NOと出荷実績ＮＯに紐付くロット情報を返す。<br>
		 * ロットNO＆サブロットNOが一意に決まらない場合に、nullを返す。
		 * @param ivDNo インボイス明細NO
		 * @param shipActNo 出荷実績NO
		 * @return ロット情報
		 */
		protected MSVT_LOT_LIST_R getLotR(String ivDNo,String shipActNo) {

			MCList<MSVT_LOT_LIST_R> subL = _lotL.subList(_lotIdxkey, ivDNo, shipActNo);
			
			if (subL.size() == 1) {
				
				return subL.get(0);
			}
			
			return null;
		}		
		
		/**
		 * シーケンスから番号を取得し、キャッシュする。（インボイス）
		 */
		protected void doIvNoSeqCache() {
			
			// データＮＯ発番
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO,
					_ivL.groupBy(MST_IV_R.$iv_no).size());
			
			// データ行ＮＯ発番
			doSeqCache(MSC_NUM_SYS_TYP.EDISHIPACTSENDIF, _ivL.size());
		}
		
		/**
		 * インボイス情報をＥＤＩ出荷実績送信ＩＦに設定する。
		 */
		protected void crtIvSendIfData() {

			addAll(_eshipActSendIfL, _ivL, createMap_MST_ESHIP_ACT_SEND_IF_R_MST_IV_R());
		}
		
		/**
		 * 出荷時実績送信ＩＦのデータＮＯを設定する。（インボイスNOごとに発番）
		 */
		protected void setIvNoDataNo() {
			
			for (MCList<MST_ESHIP_ACT_SEND_IF_R> eshipActSendIfL : 
				_eshipActSendIfL.groupList(MST_IV_R.$iv_no)) {
				
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				
				eshipActSendIfL.setValueNE(MST_ESHIP_ACT_SEND_IF_R.$data_no, dataNo);
				
				for(MST_ESHIP_ACT_SEND_IF_R r: eshipActSendIfL) {
					convNullValToNull(r);
					convDscntAmt(r);
				}
			}
		}
		
		protected void convNullValToNull(MST_ESHIP_ACT_SEND_IF_R r) {			
			if (!r.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg)) {
				r.itm_sub1(nullValToNull(r.itm_sub1()));
				r.itm_sub2(nullValToNull(r.itm_sub2()));
				r.itm_sub3(nullValToNull(r.itm_sub3()));
				r.lot_no(nullValToNull(r.lot_no()));
				r.sublot_no(nullValToNull(r.sublot_no()));
			}
		}
		protected void convDscntAmt(MST_ESHIP_ACT_SEND_IF_R r) {			
			if (r.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg)) {
				if(!isNull(r.trd_cur_upri())) {
					r.trd_cur_upri(r.trd_cur_upri().negate());
				}
				if(!isNull(r.trd_cur_amt())) {
					r.trd_cur_amt(r.trd_cur_amt().negate());
				}
				if(!isNull(r.trd_cur_tax_amt())) {
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().negate());
				}
			}
		}
		protected void convToNull(MST_ESHIP_ACT_SEND_IF_R r) {			
			if (r.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg)) {
				//受注明細.預り売上ＦＬＧ=オンの場合は以下の項目をNULL,falseにする
				r.trd_cur_cd(null);
				r.inc_tax_flg(false);
				r.interim_flg(false);
				r.trd_cur_upri(null);
				r.trd_cur_amt(null);
				r.trd_cur_dscnt_amt(null);
				r.tax_cd(null);
				r.tax_nm(null);
				r.tax_typ(null);
				r.tax_rate(null);
				r.trd_cur_tax_amt(null);
			}
		}
		/**
		 * 送信対象外のＩＦデータがあるかチェックする<br>
		 * 納品書もしくはEDI出荷実績送信IFに変更がある場合のみ送信対象とする
		 */
		protected void chkNotInsEshipActSendIf() {
		
			MCList<MST_ESHIP_ACT_SEND_IF_R> notInsL = MCList.create(MST_ESHIP_ACT_SEND_IF_R.class);
			for (MCList<MST_ESHIP_ACT_SEND_IF_R> gp :
				_eshipActSendIfL.groupList(
					MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no, MST_ESHIP_ACT_SEND_IF_R.$iv_flg)) {
				
				boolean isIns = false;
				for (MST_ESHIP_ACT_SEND_IF_R ifR : gp) {
					MST_ESHIP_ACT_SEND_IF_R prevIfR = getPrevIfR(ifR);
					if (isInsEshipActSendIf(ifR, prevIfR)) {
						isIns = true;
						break;
					}
				}
				if (!isIns){ 
					notInsL.addAll(gp);
				}
			}
			
			_eshipActSendIfL.removeAll(notInsL);
		}
		protected boolean isInsEshipActSendIf(MST_ESHIP_ACT_SEND_IF_R ifR, MST_ESHIP_ACT_SEND_IF_R prevIfR) {
			if (MAC_DATA_CRUD_TYP.isCRT(ifR.data_crud_typ()) 
				|| MAC_DATA_CRUD_TYP.isDEL(ifR.data_crud_typ())) {
				return true;
			}
			else if (!ifR.iv_flg()) {
				ShipActSendIf_Upd01_DlvR dlvR = getUp1R(ifR.dlv_slip_no());
				if (!isNull(dlvR) && dlvR.upded_flg()) {
					// 納品書に変更あり⇒送信対象
					// upded_flg：出荷帳票発行サービスの下り電文が設定される。 納品伝票トランを登録した場合にオンになる
					return true;
				}
			}
			
			// 値が異なる項目がある⇒送信対象
			return !isColSame(ifR, prevIfR, getSameChkIfCols());
		}
		protected String[] _sameChkIfCols;
		protected String[] getSameChkIfCols() {
			if (_sameChkIfCols == null) {
				_sameChkIfCols = new String[]{
					MST_ESHIP_ACT_SEND_IF_R.$ext_sys_cd,
					MST_ESHIP_ACT_SEND_IF_R.$cst_po_no,
					MST_ESHIP_ACT_SEND_IF_R.$cst_po_d_no,
					MST_ESHIP_ACT_SEND_IF_R.$cst_dlv_inst_no,
					MST_ESHIP_ACT_SEND_IF_R.$cst_dlv_inst_d_no,
					MST_ESHIP_ACT_SEND_IF_R.$iv_flg,
					MST_ESHIP_ACT_SEND_IF_R.$trn_typ,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_act_no,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_d_no,
					MST_ESHIP_ACT_SEND_IF_R.$ship_tm,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_tm,
					MST_ESHIP_ACT_SEND_IF_R.$cst_cd,
					MST_ESHIP_ACT_SEND_IF_R.$cst_nm,
					MST_ESHIP_ACT_SEND_IF_R.$cst_cntry_cd,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_cd,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_nm,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_zip_cd,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_addr1,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_addr2,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_addr3,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_addr4,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_cntct_dpt,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_cntct_psn,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_tel,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_fax,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_sundry_flg,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_cntry_cd,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_cd,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_nm,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_zip_cd,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr1,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr2,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr3,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr4,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_cntct_dpt,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_cntct_psn,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_tel,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_fax,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_sundry_flg,
					MST_ESHIP_ACT_SEND_IF_R.$tdlv_cntry_cd,
					MST_ESHIP_ACT_SEND_IF_R.$via_dlv_typ,
					MST_ESHIP_ACT_SEND_IF_R.$sls_dpt_cd,
					MST_ESHIP_ACT_SEND_IF_R.$sls_dpt_nm,
					MST_ESHIP_ACT_SEND_IF_R.$sls_usr_cd,
					MST_ESHIP_ACT_SEND_IF_R.$sls_usr_nm,
					MST_ESHIP_ACT_SEND_IF_R.$wg_cd,
					MST_ESHIP_ACT_SEND_IF_R.$itm_cd,
					MST_ESHIP_ACT_SEND_IF_R.$itm_sub1,
					MST_ESHIP_ACT_SEND_IF_R.$itm_sub2,
					MST_ESHIP_ACT_SEND_IF_R.$itm_sub3,
					MST_ESHIP_ACT_SEND_IF_R.$itm_nm,
					MST_ESHIP_ACT_SEND_IF_R.$cst_itm_cd,
					MST_ESHIP_ACT_SEND_IF_R.$cst_itm_nm,
					MST_ESHIP_ACT_SEND_IF_R.$trd_unit_cd,
					MST_ESHIP_ACT_SEND_IF_R.$trd_unit_nm,
					MST_ESHIP_ACT_SEND_IF_R.$trd_unit_qty,
					MST_ESHIP_ACT_SEND_IF_R.$trd_cur_cd,
					MST_ESHIP_ACT_SEND_IF_R.$inc_tax_flg,
					MST_ESHIP_ACT_SEND_IF_R.$interim_flg,
					MST_ESHIP_ACT_SEND_IF_R.$trd_cur_upri,
					MST_ESHIP_ACT_SEND_IF_R.$trd_cur_amt,
					MST_ESHIP_ACT_SEND_IF_R.$trd_cur_dscnt_amt,
					MST_ESHIP_ACT_SEND_IF_R.$tax_cd,
					MST_ESHIP_ACT_SEND_IF_R.$tax_nm,
					MST_ESHIP_ACT_SEND_IF_R.$tax_typ,
					MST_ESHIP_ACT_SEND_IF_R.$tax_rate,
					MST_ESHIP_ACT_SEND_IF_R.$trd_cur_tax_amt,
					MST_ESHIP_ACT_SEND_IF_R.$lot_no,
					MST_ESHIP_ACT_SEND_IF_R.$sublot_no,
					MST_ESHIP_ACT_SEND_IF_R.$vld_dt,
					MST_ESHIP_ACT_SEND_IF_R.$lmt_dt,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_rmrks,
					MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_d_rmrks,
					MST_ESHIP_ACT_SEND_IF_R.$co_nm,
					MST_ESHIP_ACT_SEND_IF_R.$cntry_cd,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char1,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char2,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char3,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char4,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char5,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char6,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char7,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char8,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char9,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char10,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char11,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char12,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char13,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char14,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char15,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char16,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char17,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char18,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char19,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char20,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char21,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char22,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char23,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char24,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char25,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char26,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char27,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char28,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char29,
					MST_ESHIP_ACT_SEND_IF_R.$sub_char30,
					MST_ESHIP_ACT_SEND_IF_R.$sub_num1,
					MST_ESHIP_ACT_SEND_IF_R.$sub_num2,
					MST_ESHIP_ACT_SEND_IF_R.$sub_num3,
					MST_ESHIP_ACT_SEND_IF_R.$sub_num4,
					MST_ESHIP_ACT_SEND_IF_R.$sub_num5,
					MST_ESHIP_ACT_SEND_IF_R.$sub_dt1,
					MST_ESHIP_ACT_SEND_IF_R.$sub_dt2,
					MST_ESHIP_ACT_SEND_IF_R.$sub_dt3,
					MST_ESHIP_ACT_SEND_IF_R.$sub_dt4,
					MST_ESHIP_ACT_SEND_IF_R.$sub_dt5
				};
			}
			return _sameChkIfCols;
		}
		
		protected MCList<MST_ESHIP_ACT_SEND_IF_R> _prevIfData;
		protected MCIndexKey _prevIfDataIdx;
		protected MST_ESHIP_ACT_SEND_IF_R getPrevIfR(MST_ESHIP_ACT_SEND_IF_R ifR) {
			if (_prevIfData == null) {
				_prevIfData = MCList.create(MST_ESHIP_ACT_SEND_IF_R.class);
				
				// 納品書明細ＮＯは、インボイス取引の場合、インボイス明細ＮＯが設定されるので
				// インボイス取引対象と対象外で別々に取得する（インボイスフラグを条件に含めるため）
				MCList<MST_ESHIP_ACT_SEND_IF_R>
					tmp1L = MCList.create(MST_ESHIP_ACT_SEND_IF_R.class),
					tmp2L = MCList.create(MST_ESHIP_ACT_SEND_IF_R.class);
				_eshipActSendIfL.forEach(r -> {
					if (r.iv_flg()) {
						tmp1L.add(r);
					}
					else {
						tmp2L.add(r);
					}
				});
				
				_prevIfData.addAll(selectPrevIfData(tmp1L));
				_prevIfData.addAll(selectPrevIfData(tmp2L));
				
				_prevIfDataIdx = _prevIfData.createIndex(
					MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_d_no, MST_ESHIP_ACT_SEND_IF_R.$iv_flg
				);
			}
			
			return _prevIfData.getFirst(_prevIfDataIdx, ifR.dlv_slip_d_no(), ifR.iv_flg());
		}
		protected MCList<MST_ESHIP_ACT_SEND_IF_R>
				 selectPrevIfData(MCList<MST_ESHIP_ACT_SEND_IF_R> ls) {
			if (isNull(ls)) {
				return null;
			}
			
			MST_ESHIP_ACT_SEND_IF_R t = MST_ESHIP_ACT_SEND_IF_R.create("T");
			MSW_DLV_SLIP_D_KEY_R w1 = MSW_DLV_SLIP_D_KEY_R.create("W1");
			MST_ESHIP_ACT_SEND_IF_R w2 = MST_ESHIP_ACT_SEND_IF_R.create("W2");
			MCTempView w3 = createTempView("w3");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.addInnerJoin(
				subQuery()
				.select(
					w2.dlv_slip_d_no,
					max(w2.data_lno).as("data_lno")
				)
				.from(w1
					.innerJoin(w2).on(
						w2.dlv_slip_d_no.eq(w1.dlv_slip_d_no)
						.and(w2.iv_flg.eq(bind("iv_flg"))
					)
				))
				.groupBy(w2.dlv_slip_d_no)
				.view(w3), w3.pr("data_lno").eq(t.data_lno)
			);
			
			crtDlvSlipDWk(ls);
			
			MCList<MST_ESHIP_ACT_SEND_IF_R> rsltL = MCList.create(MST_ESHIP_ACT_SEND_IF_R.class);
			dbSelect("MSLAL5150_MST_ESHIP_ACT_SEND_IF_S01", rsltL, bldr, ls.get(0));
			
			delDlvSlipDWk();
			
			return rsltL;
		}
		protected void crtDlvSlipDWk(MCList<MST_ESHIP_ACT_SEND_IF_R> ls) {
			delDlvSlipDWk();
			dbWkInsert(
				"MSLAL5150_MSW_DLV_SLIP_D_I01",
				ls.distinctNE(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_d_no),
				MST_DLV_SLIP_D_R.create()
			);
		}
		protected void delDlvSlipDWk() {
			dbWkDelete("MSLAL5150_MSW_DLV_SLIP_D_D01", MST_DLV_SLIP_D_R.create());
		}
		/**
		 * ＥＤＩ出荷実績送信ＩＦを登録する。
		 */
		protected void insEshipActSendIf() {

			MCQueryApiBuilder eshipActSendIfL_bldr = MCQueryApiBuilder.create(MST_ESHIP_ACT_SEND_IF_R.create("T"));
			dbInsert("MSLAL5150_MST_ESHIP_ACT_SEND_IF_I01", _eshipActSendIfL, eshipActSendIfL_bldr);
		}
		
		/**
		 * 送受信ＩＦ制御を実行する。
		 */
		protected void callSendRecvIfCtrl() {
			
			PFBZL_SendRecvIfCtrl.Ins01 ope = PFBZL_SendRecvIfCtrl.crtIns01();
			
			addAll(ope.up0(), 
					_eshipActSendIfL.groupBy(MST_PO_SEND_IF_R.$data_no, MST_PO_SEND_IF_R.$ext_sys_cd), 
					createMap_DtlR_MST_ESHIP_ACT_SEND_IF_R());
			
			ope.exec();
		}
		
		/**
		 * 引数で指定された納品伝票の情報に対応する上り電文を取得する。
		 * @param dlvSlipR 納品伝票
		 * @return 上り電文
		 */
		protected ShipActSendIf_Upd01_DtlR getUpR(MST_DLV_SLIP_R dlvSlipR) {
			
			 MCList<ShipActSendIf_Upd01_DtlR> subL = 
					 up0().subList(r -> (isSame(r.ship_act_no(), dlvSlipR.getStringNE("ship_act_no")) && isNull(r.iv_no())) 
							 || isSame(r.sls_act_no(), dlvSlipR.getStringNE("sls_act_no")));
			 
			 return subL.get(0);
		}
		
		/**
		 * 引数で指定された出荷実績の情報に対応する上り電文を取得する。
		 * @param shipActR 出荷実績
		 * @return 上り電文
		 */
		protected ShipActSendIf_Upd01_DtlR getUpR(MST_SHIP_ACT_R shipActR) {
			
			 MCList<ShipActSendIf_Upd01_DtlR> subL = 
					 up0().subList(r -> isSame(r.ship_act_no(), shipActR.ship_act_no()) && isSame(r.iv_no(), shipActR.iv_no()));
			 
			 return subL.get(0);
		}
		
		/**
		 * 引数で指定されたインボイスの情報に対応する上り電文を取得する。
		 * @param ivR インボイス
		 * @return 上り電文
		 */
		protected ShipActSendIf_Upd01_DtlR getUpR(MST_IV_R ivR) {
			
			 MCList<ShipActSendIf_Upd01_DtlR> subL = 
					 up0().subList(r -> isNull(r.ship_act_no()) && isSame(r.iv_no(), ivR.iv_no()));
			 
			 return subL.get(0);
		}
		/**
		 * 引数で指定された納品書ＮＯに対応する上り電文を取得する
		 */
		protected MCIndexKey _up1Idx;
		protected ShipActSendIf_Upd01_DlvR getUp1R(String dlvSlipNo) {
			if (_up1Idx == null) {
				_up1Idx = up1().createIndex(ShipActSendIf_Upd01_DlvR.$dlv_slip_no);
			}
			
			return up1().getFirst(_up1Idx, dlvSlipNo);
		}
		
		protected Map_DtlR_MST_ESHIP_ACT_SEND_IF_R<DtlR,MST_ESHIP_ACT_SEND_IF_R> createMap_DtlR_MST_ESHIP_ACT_SEND_IF_R() {
			return new Map_DtlR_MST_ESHIP_ACT_SEND_IF_R<DtlR, MST_ESHIP_ACT_SEND_IF_R>();
		}

		public class Map_DtlR_MST_ESHIP_ACT_SEND_IF_R<D extends DtlR, S extends MST_ESHIP_ACT_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_ESHIP_ACT_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_ESHIP_ACT_SEND_IF_R.$ext_sys_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.if_proc_typ(MAC_IF_PROC_TYP.SHIP_ACT_SEND.value());
			}
		}
		
		protected Map_MST_ESHIP_ACT_SEND_IF_R_MST_DLV_SLIP_R<MST_ESHIP_ACT_SEND_IF_R,MST_DLV_SLIP_R> createMap_MST_ESHIP_ACT_SEND_IF_R_MST_DLV_SLIP_R() {
			return new Map_MST_ESHIP_ACT_SEND_IF_R_MST_DLV_SLIP_R<MST_ESHIP_ACT_SEND_IF_R, MST_DLV_SLIP_R>();
		}

		public class Map_MST_ESHIP_ACT_SEND_IF_R_MST_DLV_SLIP_R<D extends MST_ESHIP_ACT_SEND_IF_R, S extends MST_DLV_SLIP_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$cst_po_no, MST_DLV_SLIP_R.$cst_po_no);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$trn_typ, MST_DLV_SLIP_R.$trn_typ);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_act_no, MST_DLV_SLIP_R.$dlv_slip_act_no);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no, MST_DLV_SLIP_R.$dlv_slip_no);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_rev, MST_DLV_SLIP_R.$dlv_slip_rev);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$ship_tm, MST_DLV_SLIP_R.$ship_tm);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_tm, MST_DLV_SLIP_R.$dlv_tm);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$cst_cd, MST_DLV_SLIP_R.$bp_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_cd, MST_DLV_SLIP_R.$dlv_id_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_zip_cd, MST_DLV_SLIP_R.$dlv_zip_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr1, MST_DLV_SLIP_R.$dlv_addr1);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr2, MST_DLV_SLIP_R.$dlv_addr2);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr3, MST_DLV_SLIP_R.$dlv_addr3);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr4, MST_DLV_SLIP_R.$dlv_addr4);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_cntct_dpt, MST_DLV_SLIP_R.$dlv_cntct_dpt);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_cntct_psn, MST_DLV_SLIP_R.$dlv_cntct_psn);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_tel, MST_DLV_SLIP_R.$dlv_tel);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_fax, MST_DLV_SLIP_R.$dlv_fax);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_sundry_flg, MST_DLV_SLIP_R.$dlv_sundry_flg);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$sls_dpt_cd, MST_DLV_SLIP_R.$dpt_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$sls_usr_cd, MST_DLV_SLIP_R.$usr_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$trd_cur_cd, MST_DLV_SLIP_R.$trd_cur_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_rmrks, MST_DLV_SLIP_R.$trd_rmrks);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.EDISHIPACTSENDIF.value()));

				ShipActSendIf_Upd01_DtlR upR = getUpR(src);
				String dataCrudTyp = null;
				
				if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ()) || 
						MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					dataCrudTyp = upR.data_crud_typ();
				}
				else {
					if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
						dataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
					}
					else if (MAC_SLIP_STS_TYP.isCRT(src.slip_sts_typ())) {
						
						ShipActSendIf_Upd01_DlvR dlvR = getUp1R(dest.dlv_slip_no());
						if (!isNull(dlvR) && dlvR.upded_flg()) {
							if (isNull(src.getStringNE("pre_dlv_slip_d_no")) 
									|| !isSame(src.getStringNE("pre_dlv_slip_d_no"), src.getStringNE("dlv_slip_d_no"))) {
						
								dataCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
							}
							else if (isSame(src.getStringNE("pre_dlv_slip_d_no"), src.getStringNE("dlv_slip_d_no"))) {
								dataCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
							}
						}
						else {
							dataCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
						}
					}
				}
				dest.data_crud_typ(dataCrudTyp);
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(src.getStringNE(MAM_EDI_IF_CTL_R.$ext_sys_cd));
				dest.cst_po_d_no(src.getStringNE(MST_DLV_SLIP_D_R.$cst_po_d_no));
				dest.cst_dlv_inst_no(src.getStringNE(MST_DLV_SLIP_D_R.$dlv_inst_no));
				dest.cst_dlv_inst_d_no(src.getStringNE(MST_DLV_SLIP_D_R.$dlv_inst_d_no));
				dest.iv_flg(src.getBooleanNE(MAM_BP_R.$cst_iv_flg));
				dest.dlv_slip_d_no(src.getStringNE(MST_DLV_SLIP_D_R.$dlv_slip_d_no));
				dest.cst_nm(src.getStringNE("cst_nm"));
				dest.cst_cntry_cd(src.getStringNE("cst_cntry_cd"));
				dest.dlv_nm(src.getStringNE("dlv_nm"));
				dest.dlv_cntry_cd(src.getStringNE("dlv_cntry_cd"));
				
				if (!isSame(src.dlv_id_cd(), src.getStringNE("tdlv_cd"))) {
					
					dest.tdlv_cd(src.getStringNE("tdlv_cd"));
					dest.tdlv_nm(src.getStringNE("tdlv_nm"));
					dest.tdlv_zip_cd(src.getStringNE("tdlv_zip_cd"));
					dest.tdlv_addr1(src.getStringNE("tdlv_addr1"));
					dest.tdlv_addr2(src.getStringNE("tdlv_addr2"));
					dest.tdlv_addr3(src.getStringNE("tdlv_addr3"));
					dest.tdlv_addr4(src.getStringNE("tdlv_addr4"));
					dest.tdlv_cntct_dpt(src.getStringNE("tdlv_cntct_dpt"));
					dest.tdlv_cntct_psn(src.getStringNE("tdlv_cntct_psn"));
					dest.tdlv_tel(src.getStringNE("tdlv_tel"));
					dest.tdlv_fax(src.getStringNE("tdlv_fax"));
					dest.tdlv_sundry_flg(src.getBooleanNE("tdlv_sundry_flg"));
					dest.tdlv_cntry_cd(src.getStringNE("tdlv_cntry_cd"));
				}
				dest.via_dlv_typ(src.getStringNE(MST_SHIP_ACT_R.$via_dlv_typ));
				dest.sls_dpt_nm(src.getStringNE("sls_dpt_nm"));
				dest.sls_usr_nm(src.getStringNE("sls_usr_nm"));
				dest.wg_cd(src.getStringNE("wg_cd"));
				dest.itm_cd(src.getStringNE(MST_DLV_SLIP_D_R.$itm_cd));
				dest.itm_sub1(src.getStringNE(MST_DLV_SLIP_D_R.$itm_sub1));
				dest.itm_sub2(src.getStringNE(MST_DLV_SLIP_D_R.$itm_sub2));
				dest.itm_sub3(src.getStringNE(MST_DLV_SLIP_D_R.$itm_sub3));
				dest.itm_nm(src.getStringNE(MST_DLV_SLIP_D_R.$itm_nm));
				dest.cst_itm_cd(src.getStringNE(MST_DLV_SLIP_D_R.$cst_itm_cd));
				dest.cst_itm_nm(src.getStringNE(MST_DLV_SLIP_D_R.$cst_itm_nm));
				dest.trd_unit_cd(src.getStringNE(MST_DLV_SLIP_D_R.$trd_unit_cd));
				dest.trd_unit_nm(src.getStringNE("trd_unit_nm"));
				dest.trd_unit_qty(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_unit_qty).abs());
				dest.inc_tax_flg(src.getBooleanNE(MAM_TAX_R.$inc_tax_flg));
				dest.interim_flg(src.getBooleanNE(MST_SLO_D_R.$interim_flg));
				dest.trd_cur_upri(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_upri));
				dest.trd_cur_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_amt)) 
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_amt).abs());
				dest.trd_cur_dscnt_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt))
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt).abs());
				dest.trd_cur_tax_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_tax_amt))
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_tax_amt).abs());
				dest.tax_cd(src.getStringNE(MST_DLV_SLIP_D_R.$tax_cd));
				dest.tax_nm(src.getStringNE(MAM_TAX_R.$tax_nm));
				dest.tax_typ(src.getStringNE(MAM_TAX_R.$tax_typ));
				dest.tax_rate(src.getNumberNE(MAM_TAX_R.$tax_rate));
				dest.lot_no(src.getStringNE(MST_DLV_SLIP_D_R.$lot_no));
				dest.sublot_no(src.getStringNE(MST_DLV_SLIP_D_R.$sublot_no));
				dest.vld_dt(src.getDateNE(MSVT_LOT_LIST_R.$vld_dt));
				dest.lmt_dt(src.getDateNE(MSVT_LOT_LIST_R.$lmt_dt));
				dest.dlv_slip_d_rmrks(src.getStringNE(MST_DLV_SLIP_D_R.$trd_d_rmrks));
				dest.co_nm(src.getStringNE(MAM_CO_R.$co_nm));
				dest.cntry_cd(getCo().cntry_cd());
				dest.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg,src.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg));
				dest.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg,src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg));
				dest.addBooleanColumn(MST_SLO_D_R.$sls_cststk_flg,src.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg));
				dest.addNumberColumn("report_rev", src.dlv_slip_rev());
				if (dest.iv_flg() && !MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ())) {
					if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
						ShipActSendIf_Upd01_IvDlvR ivDlvR = up2().getFirst(ShipActSendIf_Upd01_IvDlvR.$dlv_slip_d_no, dest.dlv_slip_d_no());
						if (!isNull(ivDlvR)) {
							dest.dlv_slip_no(ivDlvR.iv_no());
							dest.dlv_slip_d_no(ivDlvR.iv_d_no());
							dest.dlv_slip_rev(null);
							MST_IV_R ivR = _ivDelL.getFirst(_ivDelIdxkey, ivDlvR.iv_no());
							if (!isNull(ivR)) {
								dest.setNumberNE("report_rev", ivR.iv_rev());
							}
						}
					}
					else {
						MST_IV_SHIP_ACT_MAP_R ivShipActMapR = _ivShipActMapL.getFirst(_ivShipActMapIdxkey, dest.dlv_slip_d_no());
						if (!isNull(ivShipActMapR)) {
							dest.dlv_slip_no(ivShipActMapR.getStringNE(MST_IV_R.$iv_no));
							dest.dlv_slip_d_no(ivShipActMapR.iv_d_no());
							dest.dlv_slip_rev(null);
							dest.setNumberNE("report_rev", ivShipActMapR.getNumberNE(MST_IV_R.$iv_rev));
						}
					}
				}
			}
		}
		
		protected Map_MST_ESHIP_ACT_SEND_IF_R_MST_SHIP_ACT_R<MST_ESHIP_ACT_SEND_IF_R,MST_SHIP_ACT_R> createMap_MST_ESHIP_ACT_SEND_IF_R_MST_SHIP_ACT_R() {
			return new Map_MST_ESHIP_ACT_SEND_IF_R_MST_SHIP_ACT_R<MST_ESHIP_ACT_SEND_IF_R, MST_SHIP_ACT_R>();
		}

		public class Map_MST_ESHIP_ACT_SEND_IF_R_MST_SHIP_ACT_R<D extends MST_ESHIP_ACT_SEND_IF_R, S extends MST_SHIP_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_act_no, MST_SHIP_ACT_R.$ship_act_no);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no, MST_SHIP_ACT_R.$iv_no);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$ship_tm, MST_SHIP_ACT_R.$ship_tm);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_tm, MST_SHIP_ACT_R.$dlv_tm);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$cst_cd, MST_SHIP_ACT_R.$cst_cd);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.EDISHIPACTSENDIF.value()));
				dest.data_crud_typ(getUpR(src).data_crud_typ());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(src.getStringNE(MAM_EDI_IF_CTL_R.$ext_sys_cd));
				dest.cst_po_no(src.getStringNE(MST_IV_D_R.$cst_po_no));
				dest.cst_po_d_no(src.getStringNE(MST_IV_D_R.$cst_po_d_no));
				MST_DLV_INST_RCPT_R dlvInstRcptR = getDlvInstRcptR(src.getStringNE(MST_IV_D_R.$iv_d_no));
				if (!isNull(dlvInstRcptR)) {
					dest.cst_dlv_inst_no(dlvInstRcptR.cst_dlv_inst_no());
					dest.cst_dlv_inst_d_no(dlvInstRcptR.cst_dlv_inst_d_no());
				}
				dest.iv_flg(src.getBooleanNE(MAM_BP_R.$cst_iv_flg));
				dest.trn_typ(src.getStringNE("trn_typ"));
				dest.dlv_slip_rev(null);
				dest.dlv_slip_d_no(src.getStringNE(MST_IV_D_R.$iv_d_no));
				
				dest.cst_nm(src.getStringNE("cst_nm"));
				dest.cst_cntry_cd(src.getStringNE("cst_cntry_cd"));
				dest.dlv_cd(src.getStringNE(MST_IV_R.$dlv_id_cd));
				dest.dlv_nm(src.getStringNE("dlv_nm"));
				dest.dlv_zip_cd(src.getStringNE(MST_IV_R.$dlv_zip_cd));
				dest.dlv_addr1(src.getStringNE(MST_IV_R.$dlv_addr1));
				dest.dlv_addr2(src.getStringNE(MST_IV_R.$dlv_addr2));
				dest.dlv_addr3(src.getStringNE(MST_IV_R.$dlv_addr3));
				dest.dlv_addr4(src.getStringNE(MST_IV_R.$dlv_addr4));
				dest.dlv_cntct_dpt(src.getStringNE(MST_IV_R.$dlv_cntct_dpt));
				dest.dlv_cntct_psn(src.getStringNE(MST_IV_R.$dlv_cntct_psn));
				dest.dlv_tel(src.getStringNE(MST_IV_R.$dlv_tel));
				dest.dlv_fax(src.getStringNE(MST_IV_R.$dlv_fax));
				dest.dlv_sundry_flg(src.getBooleanNE(MST_IV_R.$dlv_sundry_flg));
				dest.dlv_cntry_cd(src.getStringNE("dlv_cntry_cd"));
				
				if (!isSame(src.getStringNE(MST_IV_R.$dlv_id_cd), src.ship_to_id_cd())) {
					
					dest.tdlv_cd(src.ship_to_id_cd());
					dest.tdlv_nm(src.getStringNE("tdlv_nm"));
					dest.tdlv_zip_cd(src.ship_to_zip_cd());
					dest.tdlv_addr1(src.ship_to_addr1());
					dest.tdlv_addr2(src.ship_to_addr2());
					dest.tdlv_addr3(src.ship_to_addr3());
					dest.tdlv_addr4(src.ship_to_addr4());
					dest.tdlv_cntct_dpt(src.ship_to_cntct_dpt());
					dest.tdlv_cntct_psn(src.ship_to_cntct_psn());
					dest.tdlv_tel(src.ship_to_tel());
					dest.tdlv_fax(src.ship_to_fax());
					dest.tdlv_sundry_flg(src.ship_to_sundry_flg());
					dest.tdlv_cntry_cd(src.getStringNE("tdlv_cntry_cd"));
				}
				dest.via_dlv_typ(src.via_dlv_typ());
				dest.sls_dpt_cd(src.getStringNE(MST_IV_D_R.$sls_dpt_cd));
				dest.sls_dpt_nm(src.getStringNE("sls_dpt_nm"));
				dest.sls_usr_cd(src.getStringNE(MST_IV_D_R.$sls_usr_cd));
				dest.sls_usr_nm(src.getStringNE("sls_usr_nm"));
				dest.wg_cd(src.getStringNE("wg_cd"));
				dest.itm_cd(src.getStringNE(MST_IV_D_R.$itm_cd));
				dest.itm_sub1(src.getStringNE(MST_IV_D_R.$itm_sub1));
				dest.itm_sub2(src.getStringNE(MST_IV_D_R.$itm_sub2));
				dest.itm_sub3(src.getStringNE(MST_IV_D_R.$itm_sub3));
				dest.itm_nm(src.getStringNE(MST_IV_D_R.$itm_nm));
				dest.cst_itm_cd(src.getStringNE(MST_IV_D_R.$cst_itm_cd));
				dest.cst_itm_nm(src.getStringNE(MST_IV_D_R.$cst_itm_nm));
				dest.trd_unit_cd(src.getStringNE(MST_IV_D_R.$trd_unit_cd));
				dest.trd_unit_nm(src.getStringNE("trd_unit_nm"));
				dest.trd_unit_qty(src.getNumberNE(MST_IV_D_R.$trd_unit_qty));
				dest.trd_cur_cd(src.getStringNE(MST_IV_R.$trd_cur_cd));
				dest.inc_tax_flg(src.getBooleanNE(MAM_TAX_R.$inc_tax_flg));
				dest.interim_flg(src.getBooleanNE(MST_IV_D_R.$interim_flg));
				dest.trd_cur_upri(src.getNumberNE(MST_IV_D_R.$trd_cur_upri));
				dest.trd_cur_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_amt)) 
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_amt).abs());
				dest.trd_cur_dscnt_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt))
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt).abs());
				dest.trd_cur_tax_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_tax_amt))
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_tax_amt).abs());
				dest.tax_cd(src.getStringNE(MST_IV_D_R.$tax_cd));
				dest.tax_nm(src.getStringNE(MAM_TAX_R.$tax_nm));
				dest.tax_typ(src.getStringNE(MAM_TAX_R.$tax_typ));
				dest.tax_rate(src.getNumberNE(MAM_TAX_R.$tax_rate));
				MSVT_LOT_LIST_R lotR = getLotR(src.getStringNE(MST_IV_D_R.$iv_d_no),src.ship_act_no());
				if (!isNull(lotR)) {
					dest.lot_no(lotR.lot_no());
					dest.sublot_no(lotR.sublot_no());
					dest.vld_dt(lotR.vld_dt());
					dest.lmt_dt(lotR.lmt_dt());					
				}
				dest.dlv_slip_rmrks(src.getStringNE(MST_IV_R.$iv_rmrks));
				dest.dlv_slip_d_rmrks(src.getStringNE(MST_IV_D_R.$iv_d_rmrks));
				dest.co_nm(src.getStringNE(MAM_CO_R.$co_nm));
				dest.cntry_cd(getCo().cntry_cd());
				dest.setValueNE(MST_IV_R.$iv_no, src.iv_no());
				dest.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg,src.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg));
				dest.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg,src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg));
				dest.addNumberColumn("report_rev", src.getNumberNE(MST_IV_D_R.$iv_rev));
			}
		}
	
		protected Map_MST_ESHIP_ACT_SEND_IF_R_MST_IV_R<MST_ESHIP_ACT_SEND_IF_R,MST_IV_R> createMap_MST_ESHIP_ACT_SEND_IF_R_MST_IV_R() {
			return new Map_MST_ESHIP_ACT_SEND_IF_R_MST_IV_R<MST_ESHIP_ACT_SEND_IF_R, MST_IV_R>();
		}
	
		public class Map_MST_ESHIP_ACT_SEND_IF_R_MST_IV_R<D extends MST_ESHIP_ACT_SEND_IF_R, S extends MST_IV_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no, MST_IV_R.$iv_no);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$ship_tm, MST_IV_R.$cmpl_dt);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_tm, MST_IV_R.$eta_dt);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$cst_cd, MST_IV_R.$ship_rqst_id_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_cd, MST_IV_R.$dlv_id_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_zip_cd, MST_IV_R.$dlv_zip_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr1, MST_IV_R.$dlv_addr1);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr2, MST_IV_R.$dlv_addr2);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr3, MST_IV_R.$dlv_addr3);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_addr4, MST_IV_R.$dlv_addr4);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_cntct_dpt, MST_IV_R.$dlv_cntct_dpt);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_cntct_psn, MST_IV_R.$dlv_cntct_psn);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_tel, MST_IV_R.$dlv_tel);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_fax, MST_IV_R.$dlv_fax);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_sundry_flg, MST_IV_R.$dlv_sundry_flg);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_cntry_cd, MST_IV_R.$dlv_cntry_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_cd, MST_IV_R.$tdlv_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_nm, MST_IV_R.$tdlv_nm);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_zip_cd, MST_IV_R.$tdlv_zip_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr1, MST_IV_R.$tdlv_addr1);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr2, MST_IV_R.$tdlv_addr2);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr3, MST_IV_R.$tdlv_addr3);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_addr4, MST_IV_R.$tdlv_addr4);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_cntct_dpt, MST_IV_R.$tdlv_cntct_dpt);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_cntct_psn, MST_IV_R.$tdlv_cntct_psn);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_tel, MST_IV_R.$tdlv_tel);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_fax, MST_IV_R.$tdlv_fax);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$tdlv_sundry_flg, MST_IV_R.$tdlv_sundry_flg);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$via_dlv_typ, MST_IV_R.$via_dlv_typ);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$trd_cur_cd, MST_IV_R.$trd_cur_cd);
				addColumnPathMap(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_rmrks, MST_IV_R.$iv_rmrks);
	
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.EDISHIPACTSENDIF.value()));
				dest.data_crud_typ(getUpR(src).data_crud_typ());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(src.getStringNE(MAM_EDI_IF_CTL_R.$ext_sys_cd));
				dest.cst_po_no(src.getStringNE(MST_IV_D_R.$cst_po_no));
				dest.cst_po_d_no(src.getStringNE(MST_IV_D_R.$cst_po_d_no));
				
				MST_DLV_INST_RCPT_R dlvInstRcptR = getDlvInstRcptR(src.getStringNE(MST_IV_D_R.$iv_d_no));
				if (!isNull(dlvInstRcptR)) {
					dest.cst_dlv_inst_no(dlvInstRcptR.cst_dlv_inst_no());
					dest.cst_dlv_inst_d_no(dlvInstRcptR.cst_dlv_inst_d_no());
				}
				dest.iv_flg(src.getBooleanNE(MAM_BP_R.$cst_iv_flg));
				dest.trn_typ(null);
				dest.dlv_slip_act_no(null);
				dest.dlv_slip_rev(null);
				dest.dlv_slip_d_no(src.getStringNE(MST_IV_D_R.$iv_d_no));
				
				dest.cst_nm(src.getStringNE("cst_nm"));
				dest.cst_cntry_cd(src.getStringNE("cst_cntry_cd"));
				dest.dlv_nm(src.getStringNE("dlv_nm"));
				dest.dlv_cntry_cd(src.getStringNE("dlv_cntry_cd"));
				dest.tdlv_cntry_cd(src.getStringNE("tdlv_cntry_cd"));
				dest.sls_dpt_cd(src.getStringNE(MST_IV_D_R.$sls_dpt_cd));
				dest.sls_dpt_nm(src.getStringNE("sls_dpt_nm"));
				dest.sls_usr_cd(src.getStringNE(MST_IV_D_R.$sls_usr_cd));
				dest.sls_usr_nm(src.getStringNE("sls_usr_nm"));
				dest.wg_cd(src.getStringNE("wg_cd"));
				dest.itm_cd(src.getStringNE(MST_IV_D_R.$itm_cd));
				dest.itm_sub1(src.getStringNE(MST_IV_D_R.$itm_sub1));
				dest.itm_sub2(src.getStringNE(MST_IV_D_R.$itm_sub2));
				dest.itm_sub3(src.getStringNE(MST_IV_D_R.$itm_sub3));
				dest.itm_nm(src.getStringNE(MST_IV_D_R.$itm_nm));
				dest.cst_itm_cd(src.getStringNE(MST_IV_D_R.$cst_itm_cd));
				dest.cst_itm_nm(src.getStringNE(MST_IV_D_R.$cst_itm_nm));
				dest.trd_unit_cd(src.getStringNE(MST_IV_D_R.$trd_unit_cd));
				dest.trd_unit_nm(src.getStringNE("trd_unit_nm"));
				dest.trd_unit_qty(src.getNumberNE(MST_IV_D_R.$trd_unit_qty));
				dest.inc_tax_flg(src.getBooleanNE(MAM_TAX_R.$inc_tax_flg));
				dest.interim_flg(src.getBooleanNE(MST_IV_D_R.$interim_flg));
				dest.trd_cur_upri(src.getNumberNE(MST_IV_D_R.$trd_cur_upri));
				dest.trd_cur_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_amt)) 
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_amt).abs());
				dest.trd_cur_dscnt_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt))
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt).abs());
				dest.trd_cur_tax_amt(isNull(src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_tax_amt))
						? null : src.getNumberNE(MST_DLV_SLIP_D_R.$trd_cur_tax_amt).abs());
				dest.tax_cd(src.getStringNE(MST_IV_D_R.$tax_cd));
				dest.tax_nm(src.getStringNE(MAM_TAX_R.$tax_nm));
				dest.tax_typ(src.getStringNE(MAM_TAX_R.$tax_typ));
				dest.tax_rate(src.getNumberNE(MAM_TAX_R.$tax_rate));
				MSVT_LOT_LIST_R lotR = getLotR(src.getStringNE(MST_IV_D_R.$iv_d_no));
				if (!isNull(lotR)) {
					dest.lot_no(lotR.lot_no());
					dest.sublot_no(lotR.sublot_no());
					dest.vld_dt(lotR.vld_dt());
					dest.lmt_dt(lotR.lmt_dt());
				}
				dest.dlv_slip_d_rmrks(src.getStringNE(MST_IV_D_R.$iv_d_rmrks));
				dest.co_nm(src.getStringNE(MAM_CO_R.$co_nm));
				dest.cntry_cd(getCo().cntry_cd());
				dest.setValueNE(MST_IV_R.$iv_no, src.iv_no());
				dest.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg,src.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg));
				dest.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg,src.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg));
				dest.addNumberColumn("report_rev", src.iv_rev());
				
				if (isNull(dest.dlv_tm())) {
					MCList<MST_IV_SHIP_ACT_D_R> ivShipActDL = _ivShipActDL.subList(_ivShipActDIdxkey, src.getStringNE(MST_IV_R.$iv_no));
					if (!ivShipActDL.isEmpty()) {
						dest.dlv_tm((MCDate)ivShipActDL.max(MST_SHIP_ACT_R.$dlv_tm));
					}
				}
			}
		}
	}
	/***
	 * 添付帳票登録サービスを呼び出す。
	 */
	protected void registAttachedFormSrv() {
		MBBCL_AttachService.Attach_Upd01 opAttc = MBBCL_AttachService.crtAttach_Upd01();
		MBBCL_AttachService.Attach_Del01 opAttcDel = MBBCL_AttachService.crtAttach_Del01();
		opAttc.up1().upd_cntr_chk_flg(false);

		MCGroupByPolicy policy = new MCGroupByPolicy(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no);
		MCList<MST_ESHIP_ACT_SEND_IF_R> regGrpL = _eshipActSendIfL.groupBy(policy);
		MCIndexKey idxkey = _eshipActSendIfL.createIndex(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no);
		MCIndexKey idxkey2 = _eshipActSendIfL.createIndex(MST_ESHIP_ACT_SEND_IF_R.$dlv_slip_no, MST_ESHIP_ACT_SEND_IF_R.$data_crud_typ);

		for (MST_ESHIP_ACT_SEND_IF_R r : regGrpL) {
			MCList<MST_ESHIP_ACT_SEND_IF_R> delBefL = _eshipActSendIfL.subList(idxkey, r.dlv_slip_no());
			MCList<MST_ESHIP_ACT_SEND_IF_R> delAftL = _eshipActSendIfL.subList(idxkey2, r.dlv_slip_no(),
					MAC_DATA_CRUD_TYP.DEL.value());
			
			if (delBefL.size() > 0 && isNull(delBefL.get(0).trd_cur_cd())) {
				continue;
			}

			if (delBefL.size() == delAftL.size()) {
				Attach_Chk02_DtlR attcUp = Attach_Chk02_DtlR.create();
				attcUp.biz_typ(getBizTyp(delBefL.get(0)).value());
				attcUp.report_id("MSLAR0050");
				attcUp.biz_key1(delBefL.get(0).dlv_slip_no());
				attcUp.biz_key2(delBefL.get(0).getNumberNE("report_rev").toString());
				opAttcDel.up0().add(attcUp);
			}
		}

		for (MST_ESHIP_ACT_SEND_IF_R r : regGrpL) {
			MST_ESHIP_ACT_SEND_IF_R firstR = _eshipActSendIfL.getFirst(idxkey, r.dlv_slip_no());
			MCNumber trdAmtSum = new MCNumber(0);
			MCList<MST_ESHIP_ACT_SEND_IF_R> datalnoL = _eshipActSendIfL.subList(idxkey,
					firstR.dlv_slip_no());
			
			if (isNull(firstR.trd_cur_cd())) {
				continue;
			}
			
			int maxRevNum = 0;
			for (MST_ESHIP_ACT_SEND_IF_R sr : datalnoL) {
				if(sr.getNumberNE("report_rev").intValue() > maxRevNum) {
					maxRevNum = sr.getNumberNE("report_rev").intValue();
				}
			}

			for (MST_ESHIP_ACT_SEND_IF_R sr : datalnoL) {
				Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R.create();
				up2.biz_typ(getBizTyp(firstR).value());
				up2.biz_key1(firstR.dlv_slip_no());
				up2.biz_key2(new MCNumber(maxRevNum).toString());
				up2.report_id("MSLAR0050");
				up2.data_lno(sr.data_lno());
				opAttc.up2().add(up2);

				if (!MAC_DATA_CRUD_TYP.isDEL(sr.data_crud_typ())) {
					if (!isNull(sr.trd_cur_amt()) && !isNull(sr.trd_cur_tax_amt())) {
						trdAmtSum = trdAmtSum.add(sr.trd_cur_amt()).add(sr.trd_cur_tax_amt());
					}
				}
			}

			Attach_Chk01_DtlR up = Attach_Chk01_DtlR.create();
			up.biz_typ(getBizTyp(firstR).value());
			up.report_id("MSLAR0050");
			up.biz_key1(firstR.dlv_slip_no());
			up.biz_key2(new MCNumber(maxRevNum).toString());
			up.dt(firstR.ship_tm());
			up.bp_cd(firstR.cst_cd());
			up.amt(trdAmtSum);
			up.cur_cd(firstR.trd_cur_cd());
			up.wg_cd(firstR.wg_cd());
			up.sls_dpt_cd(firstR.sls_dpt_cd());
			up.dlv_cd(firstR.dlv_cd());
			up.cntry_cd(firstR.dlv_cntry_cd());
			up.if_proc_typ(MAC_IF_PROC_TYP.SHIP_ACT_SEND.value());
			opAttc.up0().add(up);
		}

		if (opAttc.up0().size() > 0) {
			opAttc.exec();
		}
		if (opAttcDel.up0().size() > 0) {
			opAttcDel.exec();
		}
	}
	
	/**
	 * 業務区分を取得する。
	 */
	protected MAC_BIZ_TYP getBizTyp(MST_ESHIP_ACT_SEND_IF_R r) {
		MAC_BIZ_TYP retBizTyp = MAC_BIZ_TYP.SHIP_ACT_EDI;
		if (!r.iv_flg()) {
			retBizTyp = MAC_BIZ_TYP.SHIP_ACT_EDI;
		}
		else if (r.iv_flg() && MAC_VIA_DLV_TYP.isNOT_VIA(r.via_dlv_typ())) {
			retBizTyp = MAC_BIZ_TYP.SHIP_ACT_IV_EDI;
		}
		else if (r.iv_flg()) {
			retBizTyp = MAC_BIZ_TYP.SHIP_ACT_IV_EDI;
		}
		return retBizTyp;
	}

	//FMCB CUSTOM END
}