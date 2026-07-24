package mcframe.serverMSLA.MSLAL5130;

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
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_PrmsSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_PrmsSendIfService_MC extends MSLAL_PrmsSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * 受注明細ワーク
	 */
	protected MCList<MST_SLO_D_R> _sloDWkL = null;
	MCQueryApiBuilder _sloDWkL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
	
	/**
	 * 受注明細リスト
	 */
	protected MCList<MST_SLO_D_R> _sloDL = null;
	
	/**
	 * 上り電文インデックス
	 */
	protected MCIndexKey _upSloDIdxkey = null;
	
	/**
	 * 受注納期回答リスト
	 */
	protected MCList<MST_SLO_PRMS_R> _sloPrmsL = null;
	
	/**
	 * 受注納期回答送信IF
	 */
	protected MCList<MST_SLO_PRMS_SEND_IF_R> _sloPrmsSendIfL = null;

	/**
	 * PrmsSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の受注納期回答をＩＦテーブルに書き込む<br>
	 */
	public class PrmsSendIf_Upd01 extends MSLAL_PrmsSendIfService_MC_A.PrmsSendIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			crtDelWk();
			
			getSlo();
			
			crtInsUpdWk();
			
			getSloPrms();
			
			crtSloPrmsSendIf();
			
			callSendRecvIfCtrl();
			
			delWk();
		}
		
		/**
		 * 受注明細ワークテーブルに削除データを登録する。
		 */
		protected void crtDelWk() {
			
			_sloDWkL = MCList.create(MST_SLO_D_R.class);
			
			dbWkDelete("MSLAL5130_MSW_SLO_D_D01", _sloDWkL_bldr.getBaseDbc());
			
			setAll(_sloDWkL, up0().subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())), createMap_MST_SLO_D_R_PrmsSendIf_Upd01_DtlR());
			
			dbWkInsert("MSLAL5130_MSW_SLO_D_I01", _sloDWkL, _sloDWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 受注明細ワークテーブルに削除以外データを登録する。
		 */
		protected void crtInsUpdWk() {
			
			dbWkDelete("MSLAL5130_MSW_SLO_D_D02", _sloDWkL_bldr.getBaseDbc());
			
			_sloDWkL.clear();
			
			setAll(_sloDWkL, up0().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())), createMap_MST_SLO_D_R_PrmsSendIf_Upd01_DtlR());
			
			dbWkInsert("MSLAL5130_MSW_SLO_D_I02", _sloDWkL, _sloDWkL_bldr.getBaseDbc());
		}
		
		/**
		 * 受注明細情報を取得する。<br>
		 * データ更新区分が「削除」の場合も、受注、受注明細の情報を設定する必要のため、取得する。
		 */
		protected void getSlo() {
			MSW_SLO_D_KEY_R w1 = MSW_SLO_D_KEY_R.create("W1");
			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MAM_EDI_IF_CTL_R m1 = MAM_EDI_IF_CTL_R.create("M1");
			MAM_BP_R m2 = MAM_BP_R.create("M2");
			MAM_DPT_R m3 = MAM_DPT_R.create("M3");
			MAM_USR_R m4 = MAM_USR_R.create("M4");
			MAM_ITM_R m5 = MAM_ITM_R.create("M5");
			MAM_EXT_SYS_R m7 = MAM_EXT_SYS_R.create("M7");
			MCTempView S0_T3 = createTempView("T3");
			MCTempView S1_SLOPRMSH1 = createTempView("SLOPRMSH1");
			MST_SLO_PRMS_H_R S1_PRMSH = MST_SLO_PRMS_H_R.create("PRMSH");
			MST_SLO_PRMS_H_R S2_SLOPRMSH = MST_SLO_PRMS_H_R.create("SLOPRMSH");

			_sloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
			_sloDL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			
			sloDL_bldr.addSelect(m1.ext_sys_cd);
			sloDL_bldr.addSelect(t2.cst_po_no);
			sloDL_bldr.addSelect(t2.cst_po_rev);
			sloDL_bldr.addSelect(t2.cst_cd);
			sloDL_bldr.addSelect(m2.bp_nm);
			sloDL_bldr.addSelect(m2.cntry_cd);
			sloDL_bldr.addSelect(t2.sls_dpt_cd);
			sloDL_bldr.addSelect(m3.dpt_nm);
			sloDL_bldr.addSelect(t2.sls_usr_cd);
			sloDL_bldr.addSelect(m4.usr_nm);
			sloDL_bldr.addSelect(t2.wg_cd);
			sloDL_bldr.addSelect(nvl( t.itm_nm, m5.itm_nm).as("itm_nm"));
			sloDL_bldr.addSelect(m7.null_val_if_flg);			

			
			sloDL_bldr.addInnerJoin(w1, t.slo_d_no.eq(w1.slo_d_no));
			sloDL_bldr.addInnerJoin(t2, t.slo_no.eq(t2.slo_no));
			sloDL_bldr.addInnerJoin(
					subQuery()
					.select(
						S1_PRMSH.slo_d_no,
						S1_PRMSH.edi_prms_flg
					)
					.from(
						subQuery()
						.select(
							S2_SLOPRMSH.slo_d_no,
							max(S2_SLOPRMSH.slo_prms_rev).as("slo_prms_rev")
						)
						.from(S2_SLOPRMSH)
						.groupBy(S2_SLOPRMSH.slo_d_no).view(S1_SLOPRMSH1)
						.innerJoin(S1_PRMSH).on(
							bracket(
								S1_SLOPRMSH1.pr(S2_SLOPRMSH.slo_d_no).eq(S1_PRMSH.slo_d_no)
								.and(S1_SLOPRMSH1.pr("slo_prms_rev").eq(S1_PRMSH.slo_prms_rev))
							)
						)
					).view(S0_T3), t.slo_d_no.eq(S0_T3.pr(S1_PRMSH.slo_d_no)));
			sloDL_bldr.addInnerJoin(m1, t2.cst_cd.eq(m1.bp_cd)
					.and(m1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SLO_PRMS_SEND.value())))
					.and(bind("today").between(m1.st_dt, m1.end_dt)));
			sloDL_bldr.addLeftOuterJoin(m2, t2.cst_cd.eq(m2.bp_cd));
			sloDL_bldr.addLeftOuterJoin(m3, t2.sls_dpt_cd.eq(m3.dpt_cd)
					.and(t2.slo_dt.between(m3.st_dt, m3.end_dt)));
			sloDL_bldr.addLeftOuterJoin(m4, t2.sls_usr_cd.eq(m4.usr_cd));
			sloDL_bldr.addLeftOuterJoin(m5, t.itm_cd.eq(m5.itm_cd)
					.and(t.itm_sub1.eq(m5.itm_sub1))
					.and(t.itm_sub2.eq(m5.itm_sub2))
					.and(t.itm_sub3.eq(m5.itm_sub3)));
			sloDL_bldr.addInnerJoin(m7, m7.ext_sys_cd.eq(m1.ext_sys_cd));
			sloDL_bldr.setWhere(t2.cst_po_no.isNotNull());
			sloDL_bldr.addWhereWithAnd(S0_T3.pr(S1_PRMSH.edi_prms_flg).eq(value(true)));
			
			MCRow bindR = MCRow.create();
			bindR.setValueNE("today", getToday());
			dbSelect("MSLAL5130_MST_SLO_D_S01", _sloDL, sloDL_bldr, bindR);
		}
		
		/**
		 * 受注納期回答を取得する。
		 */
		protected void getSloPrms() {
			MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
			MST_SLO_R t3 = MST_SLO_R.create("T3");
			MST_DLV_INST_RCPT_R t4 = MST_DLV_INST_RCPT_R.create("T4");
			MST_SHIP_SCHD_R t5 = MST_SHIP_SCHD_R.create("T5");
			MST_SHIP_PR_R t6 = MST_SHIP_PR_R.create("T6");
			MST_SLO_PRMS_H_R t7 = MST_SLO_PRMS_H_R.create("T7");
			MSW_SLO_D_KEY_R w1 = MSW_SLO_D_KEY_R.create("W1");
			MAM_EDI_IF_CTL_R m1 = MAM_EDI_IF_CTL_R.create("M1");
			MAM_BP_R m2 = MAM_BP_R.create("M2");
			MAM_DPT_R m3 = MAM_DPT_R.create("M3");
			MAM_USR_R m4 = MAM_USR_R.create("M4");
			MAM_ITM_R m5 = MAM_ITM_R.create("M5");
			MAM_UNIT_R m6 = MAM_UNIT_R.create("M6");
			MAM_EXT_SYS_R m7 = MAM_EXT_SYS_R.create("M7");
			MST_SLS_SCHD_R S1ST = MST_SLS_SCHD_R.create("ST");
			MAM_BP_LCL_R m8 = MAM_BP_LCL_R.create("M8");
			MAM_DPT_LCL_R m9 = MAM_DPT_LCL_R.create("M9");
			MAM_USR_LCL_R m10 = MAM_USR_LCL_R.create("M10");
			MAM_ITM_LCL_R m11 = MAM_ITM_LCL_R.create("M11");
			MAM_UNIT_LCL_R m12 = MAM_UNIT_LCL_R.create("M12");

			
			_sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
			MCQueryApiBuilder sloPrmsL_bldr = MCQueryApiBuilder.create(t);
			_sloPrmsL.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg);
			
			sloPrmsL_bldr.addSelect(m1.ext_sys_cd);
			sloPrmsL_bldr.addSelect(t3.cst_po_no);
			sloPrmsL_bldr.addSelect(t3.cst_po_rev);
			sloPrmsL_bldr.addSelect(t2.cst_po_d_no);
			sloPrmsL_bldr.addSelect(t4.cst_dlv_inst_no);
			sloPrmsL_bldr.addSelect(t4.cst_dlv_inst_rev);
			sloPrmsL_bldr.addSelect(t4.cst_dlv_inst_d_no);
			sloPrmsL_bldr.addSelect(t3.cst_cd);
			sloPrmsL_bldr.addSelect(nvl(m8.bp_nm, m2.bp_nm).as("bp_nm"));
			sloPrmsL_bldr.addSelect(m2.cntry_cd);
			sloPrmsL_bldr.addSelect(t3.sls_dpt_cd);
			sloPrmsL_bldr.addSelect(nvl(m9.dpt_nm, m3.dpt_nm).as("dpt_nm"));
			sloPrmsL_bldr.addSelect(t3.sls_usr_cd);
			sloPrmsL_bldr.addSelect(nvl(m10.usr_nm, m4.usr_nm).as("usr_nm"));
			sloPrmsL_bldr.addSelect(t3.wg_cd);
			sloPrmsL_bldr.addSelect(t2.cst_itm_cd);
			sloPrmsL_bldr.addSelect(t2.cst_itm_nm);
			sloPrmsL_bldr.addSelect(t2.itm_cd);
			sloPrmsL_bldr.addSelect(t2.itm_sub1);
			sloPrmsL_bldr.addSelect(t2.itm_sub2);
			sloPrmsL_bldr.addSelect(t2.itm_sub3);
			sloPrmsL_bldr.addSelect(nvl(t2.itm_nm,nvl(m11.itm_nm, m5.itm_nm)).as("itm_nm"));
			sloPrmsL_bldr.addSelect(t5.trd_unit_cd);
			sloPrmsL_bldr.addSelect(nvl(m12.unit_nm, m6.unit_nm).as("unit_nm"));
			sloPrmsL_bldr.addSelect(m7.null_val_if_flg);
			sloPrmsL_bldr.addSelect(nvl(FCPA_CO$F_GET_CO_NM1(m2.prnt_lcl_cd),FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())).as("co_nm"));
			
			sloPrmsL_bldr.addInnerJoin(t2, t.slo_d_no.eq(t2.slo_d_no));
			sloPrmsL_bldr.addInnerJoin(t3, t2.slo_no.eq(t3.slo_no));
			sloPrmsL_bldr.addLeftOuterJoin(t4, t.dlv_inst_rcpt_no.eq(t4.dlv_inst_rcpt_no));
			sloPrmsL_bldr.addInnerJoin(t5, t.slo_prms_no.eq(t5.slo_prms_no));
			sloPrmsL_bldr.addInnerJoin(t6, t2.slo_d_no.eq(t6.slo_d_no));
			sloPrmsL_bldr.addInnerJoin(t7, t2.slo_d_no.eq(t7.slo_d_no)
					.and(t7.can_flg.eq(value(false))));
			sloPrmsL_bldr.addInnerJoin(w1, t2.slo_d_no.eq(w1.slo_d_no));
			sloPrmsL_bldr.addInnerJoin(m1, t3.cst_cd.eq(m1.bp_cd)
					.and(m1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SLO_PRMS_SEND.value())))
					.and(bind("today").between(m1.st_dt, m1.end_dt)));
			sloPrmsL_bldr.addLeftOuterJoin(m2, t3.cst_cd.eq(m2.bp_cd));
			sloPrmsL_bldr.addLeftOuterJoin(m8, t3.cst_cd.eq(m8.bp_cd)
					.and(m8.lcl_cd.eq(m2.prnt_lcl_cd)));
			sloPrmsL_bldr.addLeftOuterJoin(m3, t3.sls_dpt_cd.eq(m3.dpt_cd)
					.and(t3.slo_dt.between(m3.st_dt, m3.end_dt)));
			sloPrmsL_bldr.addLeftOuterJoin(m9, t3.sls_dpt_cd.eq(m9.dpt_cd)
					.and(t3.slo_dt.between(m9.st_dt, m9.end_dt))
					.and(m9.lcl_cd.eq(m2.prnt_lcl_cd)));
			sloPrmsL_bldr.addLeftOuterJoin(m4, t3.sls_usr_cd.eq(m4.usr_cd));
			sloPrmsL_bldr.addLeftOuterJoin(m10, t3.sls_usr_cd.eq(m10.usr_cd)
					.and(m10.lcl_cd.eq(m2.prnt_lcl_cd)));
			sloPrmsL_bldr.addLeftOuterJoin(m5, t2.itm_cd.eq(m5.itm_cd)
					.and(t2.itm_sub1.eq(m5.itm_sub1))
					.and(t2.itm_sub2.eq(m5.itm_sub2))
					.and(t2.itm_sub3.eq(m5.itm_sub3)));
			sloPrmsL_bldr.addLeftOuterJoin(m11, t2.itm_cd.eq(m11.itm_cd)
					.and(t2.itm_sub1.eq(m11.itm_sub1))
					.and(t2.itm_sub2.eq(m11.itm_sub2))
					.and(t2.itm_sub3.eq(m11.itm_sub3))
					.and(m11.lcl_cd.eq(m2.prnt_lcl_cd)));
			sloPrmsL_bldr.addLeftOuterJoin(m6, t5.trd_unit_cd.eq(m6.unit_cd));
			sloPrmsL_bldr.addLeftOuterJoin(m12,t2.trd_unit_cd.eq(m12.unit_cd)
					.and(m12.lcl_cd.eq(m2.prnt_lcl_cd)));
			sloPrmsL_bldr.addInnerJoin(m7, m7.ext_sys_cd.eq(m1.ext_sys_cd));
		
			sloPrmsL_bldr.setWhere(t2.can_flg.eq(value(false)));
			sloPrmsL_bldr.addWhereWithAnd(t2.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())));
			sloPrmsL_bldr.addWhereWithAnd(t5.ship_act_qty.eq(value(0)));
			sloPrmsL_bldr.addWhereWithAnd(t5.abort_flg.eq(value(false)));
			sloPrmsL_bldr.addWhereWithAnd(t7.edi_prms_flg.eq(value(true)));
			sloPrmsL_bldr.addWhereWithAnd(t3.cst_po_no.isNotNull());
			sloPrmsL_bldr.addWhereWithAnd(t2.proc_typ.neq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value()))
							.or( notExists(
									subQuery()
									.select(value("X")) .from(S1ST) .where( S1ST.ship_schd_no.eq(t5.ship_schd_no) 
											.and(S1ST.purc_act_d_no.isNotNull()) ) )));
			
			MCRow bindR = MCRow.create();
			bindR.setValueNE("today", getToday());
			dbSelect("MSLAL5130_MST_SLO_PRMS_S01", _sloPrmsL, sloPrmsL_bldr, bindR);
		}
		
		/**
		 * 受注納期回答送信ＩＦを作成する。
		 */
		protected void crtSloPrmsSendIf() {
			
			initSloPrmsSendIf();
			
			doNoSeqCache();
			
			addInsUpdSloPrmsSendIf();
			
			addDelSloPrmsSendIf();
			
			setDataNo();
			
			insSloPrmsSendIf();
		}
		
		/**
		 * 受注納期回答送信ＩＦのインスタンスを生成する。
		 */
		protected void initSloPrmsSendIf() {
			
			_sloPrmsSendIfL = MCList.create(MST_SLO_PRMS_SEND_IF_R.class);
		}
		
		/**
		* シーケンスから番号を取得し、キャッシュする。
		*/
		protected void doNoSeqCache() {
			
			// データＮＯ発番
			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO,
					_sloPrmsL.groupBy(MST_SLO_D_R.$slo_d_no).size());
			
			// データ行ＮＯ発番
			doSeqCache(
					MSC_NUM_SYS_TYP.SLOPRMSSENDIF, 
					_sloPrmsL.size() + up0().subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())).size());
		}
		
		/**
		 * 受注納期回答送信ＩＦの新規・更新レコードを追加する。
		 */
		protected void addInsUpdSloPrmsSendIf() {
			
			addAll(_sloPrmsSendIfL, _sloPrmsL, createMap_MST_SLO_PRMS_SEND_IF_R_MST_SLO_PRMS_R());
		}
		
		/**
		 * 受注納期回答送信ＩＦの取消レコード（全行削除）を追加する。
		 */
		protected void addDelSloPrmsSendIf() {
			
			addAll(_sloPrmsSendIfL, _sloDL, createMap_MST_SLO_PRMS_SEND_IF_R_MST_SLO_D_R());
		}
		
		/**
		 * 受注納期回答送信ＩＦのデータＮＯを設定する。
		 */
		protected void setDataNo() {

			for (MCList<MST_SLO_PRMS_SEND_IF_R> sloPrmsSendIfL : _sloPrmsSendIfL.groupList(MST_SLO_PRMS_SEND_IF_R.$slo_d_no)) {
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				
				sloPrmsSendIfL.setValueNE(MST_SLO_PRMS_SEND_IF_R.$data_no, dataNo);
				for(MST_SLO_PRMS_SEND_IF_R r: sloPrmsSendIfL) {
					convNullValToNull(r);
				}
			}
		}
		
		protected void convNullValToNull(MST_SLO_PRMS_SEND_IF_R r) {			
			if (!r.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg)) {
				r.itm_sub1(nullValToNull(r.itm_sub1()));
				r.itm_sub2(nullValToNull(r.itm_sub2()));
				r.itm_sub3(nullValToNull(r.itm_sub3()));
			}
		}
		/**
		 * 受注納期回答送信ＩＦにデータを登録する。
		 */
		protected void insSloPrmsSendIf() {
			
			dbInsert("MSLAL5130_MST_SLO_PRMS_SEND_IF_I01", _sloPrmsSendIfL, MCQueryApiBuilder.create(MST_SLO_PRMS_SEND_IF_R.create("T2")));
		}
		
		/**
		 * 送受信ＩＦ制御を実行する。
		 */
		protected void callSendRecvIfCtrl() {
			
			PFBZL_SendRecvIfCtrl.Ins01 ope = PFBZL_SendRecvIfCtrl.crtIns01();
			
			addAll(ope.up0(), 
					_sloPrmsSendIfL.groupBy(MST_PO_SEND_IF_R.$data_no, MST_PO_SEND_IF_R.$ext_sys_cd), 
					createMap_DtlR_MST_SLO_PRMS_SEND_IF_R());
			
			ope.exec();
		}
		
		/**
		 * 引数にて指定された受注明細NOに紐付く上り電文を返す。
		 * @param sloDNo 受注明細NO
		 * @return 上り電文
		 */
		protected PrmsSendIf_Upd01_DtlR getUpR(String sloDNo) {
			
			if (_upSloDIdxkey == null) {
				_upSloDIdxkey = up0().createIndex(PrmsSendIf_Upd01_DtlR.$slo_d_no);
			}
			
			return up0().getFirst(_upSloDIdxkey, sloDNo);
		}
		
		/**
		 * ワークテーブルのデータを削除する。
		 */
		protected void delWk() {
			
			dbWkDelete("MSLAL5130_MSW_SLO_D_D03", _sloDWkL_bldr.getBaseDbc());
		}
		
		protected Map_MST_SLO_D_R_PrmsSendIf_Upd01_DtlR<MST_SLO_D_R,PrmsSendIf_Upd01_DtlR> createMap_MST_SLO_D_R_PrmsSendIf_Upd01_DtlR() {
			return new Map_MST_SLO_D_R_PrmsSendIf_Upd01_DtlR<MST_SLO_D_R, PrmsSendIf_Upd01_DtlR>();
		}

		public class Map_MST_SLO_D_R_PrmsSendIf_Upd01_DtlR<D extends MST_SLO_D_R, S extends PrmsSendIf_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLO_D_R.$slo_d_no, PrmsSendIf_Upd01_DtlR.$slo_d_no);

			}
		}
		
		protected Map_MST_SLO_PRMS_SEND_IF_R_MST_SLO_PRMS_R<MST_SLO_PRMS_SEND_IF_R,MST_SLO_PRMS_R> createMap_MST_SLO_PRMS_SEND_IF_R_MST_SLO_PRMS_R() {
			return new Map_MST_SLO_PRMS_SEND_IF_R_MST_SLO_PRMS_R<MST_SLO_PRMS_SEND_IF_R, MST_SLO_PRMS_R>();
		}

		public class Map_MST_SLO_PRMS_SEND_IF_R_MST_SLO_PRMS_R<D extends MST_SLO_PRMS_SEND_IF_R, S extends MST_SLO_PRMS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$slo_prms_rev, MST_SLO_PRMS_R.$slo_prms_rev);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$slo_no, MST_SLO_PRMS_R.$slo_no);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$slo_d_no, MST_SLO_PRMS_R.$slo_d_no);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$dlv_inst_rcpt_no, MST_SLO_PRMS_R.$dlv_inst_rcpt_no);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$trd_unit_qty, MST_SLO_PRMS_R.$trd_unit_prms_qty);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$prms_dlv_tm, MST_SLO_PRMS_R.$prms_dlv_tm);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$prms_rmrks, MST_SLO_PRMS_R.$prms_rmrks);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.SLOPRMSSENDIF.value()));
				dest.data_crud_typ(getUpR(src.slo_d_no()).data_crud_typ());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(src.getStringNE(MAM_EDI_IF_CTL_R.$ext_sys_cd));
				dest.cst_po_no(src.getStringNE(MST_SLO_R.$cst_po_no));
				dest.cst_po_rev(src.getNumberNE(MST_SLO_R.$cst_po_rev));
				dest.cst_po_d_no(src.getStringNE(MST_SLO_D_R.$cst_po_d_no));
				dest.cst_dlv_inst_no(src.getStringNE(MST_DLV_INST_RCPT_R.$cst_dlv_inst_no));
				dest.cst_dlv_inst_rev(src.getNumberNE(MST_DLV_INST_RCPT_R.$cst_dlv_inst_rev));
				dest.cst_dlv_inst_d_no(src.getStringNE(MST_DLV_INST_RCPT_R.$cst_dlv_inst_d_no));
				dest.cst_cd(src.getStringNE(MST_SLO_R.$cst_cd));
				dest.cst_nm(src.getStringNE(MAM_BP_R.$bp_nm));
				dest.cst_cntry_cd(src.getStringNE(MAM_BP_R.$cntry_cd));
				dest.sls_dpt_cd(src.getStringNE(MST_SLO_R.$sls_dpt_cd));
				dest.sls_dpt_nm(src.getStringNE(MAM_DPT_R.$dpt_nm));
				dest.sls_usr_cd(src.getStringNE(MST_SLO_R.$sls_usr_cd));
				dest.wg_cd(src.getStringNE(MST_SLO_R.$wg_cd));
				dest.sls_usr_nm(src.getStringNE(MAM_USR_R.$usr_nm));
				dest.cst_itm_cd(src.getStringNE(MST_SLO_D_R.$cst_itm_cd));
				dest.cst_itm_nm(src.getStringNE(MST_SLO_D_R.$cst_itm_nm));
				dest.itm_cd(src.getStringNE(MST_SLO_D_R.$itm_cd));
				dest.itm_sub1(src.getStringNE(MST_SLO_D_R.$itm_sub1));
				dest.itm_sub2(src.getStringNE(MST_SLO_D_R.$itm_sub2));
				dest.itm_sub3(src.getStringNE(MST_SLO_D_R.$itm_sub3));
				dest.itm_nm(src.getStringNE(MST_SLO_D_R.$itm_nm));
				dest.trd_unit_cd(src.getStringNE(MST_SLO_D_R.$trd_unit_cd));
				dest.trd_unit_nm(src.getStringNE(MAM_UNIT_R.$unit_nm));
				dest.co_nm(src.getStringNE(MAM_CO_R.$co_nm));
				dest.cntry_cd(getCo().cntry_cd());
				dest.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg,src.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg));
			}
		}
		
		protected Map_MST_SLO_PRMS_SEND_IF_R_MST_SLO_D_R<MST_SLO_PRMS_SEND_IF_R,MST_SLO_D_R> createMap_MST_SLO_PRMS_SEND_IF_R_MST_SLO_D_R() {
			return new Map_MST_SLO_PRMS_SEND_IF_R_MST_SLO_D_R<MST_SLO_PRMS_SEND_IF_R, MST_SLO_D_R>();
		}

		public class Map_MST_SLO_PRMS_SEND_IF_R_MST_SLO_D_R<D extends MST_SLO_PRMS_SEND_IF_R, S extends MST_SLO_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$cst_po_d_no, MST_SLO_D_R.$cst_po_d_no);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$slo_no, MST_SLO_D_R.$slo_no);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$slo_d_no, MST_SLO_D_R.$slo_d_no);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$cst_itm_cd, MST_SLO_D_R.$cst_itm_cd);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$cst_itm_nm, MST_SLO_D_R.$cst_itm_nm);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$itm_cd, MST_SLO_D_R.$itm_cd);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$itm_sub1, MST_SLO_D_R.$itm_sub1);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$itm_sub2, MST_SLO_D_R.$itm_sub2);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$itm_sub3, MST_SLO_D_R.$itm_sub3);
				addColumnPathMap(MST_SLO_PRMS_SEND_IF_R.$itm_nm, MST_SLO_D_R.$itm_nm);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.SLOPRMSSENDIF.value()));
				dest.data_crud_typ(getUpR(src.slo_d_no()).data_crud_typ());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(src.getStringNE(MAM_EDI_IF_CTL_R.$ext_sys_cd));
				dest.cst_po_no(src.getStringNE(MST_SLO_R.$cst_po_no));
				dest.cst_po_rev(src.getNumberNE(MST_SLO_R.$cst_po_rev));
				dest.slo_prms_rev(getUpR(src.slo_d_no()).del_prms_rev());
				dest.cst_cd(src.getStringNE(MST_SLO_R.$cst_cd));
				dest.cst_nm(src.getStringNE(MAM_BP_R.$bp_nm));
				dest.cst_cntry_cd(src.getStringNE(MAM_BP_R.$cntry_cd));
				dest.sls_dpt_cd(src.getStringNE(MST_SLO_R.$sls_dpt_cd));
				dest.sls_dpt_nm(src.getStringNE(MAM_DPT_R.$dpt_nm));
				dest.sls_usr_cd(src.getStringNE(MST_SLO_R.$sls_usr_cd));
				dest.sls_usr_nm(src.getStringNE(MAM_USR_R.$usr_nm));
				dest.wg_cd(src.getStringNE(MST_SLO_R.$wg_cd));
				dest.co_nm(src.getStringNE(MAM_CO_R.$co_nm));
				dest.cntry_cd(getCo().cntry_cd());
				dest.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg,src.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg));
			}
		}
		
		protected Map_DtlR_MST_SLO_PRMS_SEND_IF_R<DtlR,MST_SLO_PRMS_SEND_IF_R> createMap_DtlR_MST_SLO_PRMS_SEND_IF_R() {
			return new Map_DtlR_MST_SLO_PRMS_SEND_IF_R<DtlR, MST_SLO_PRMS_SEND_IF_R>();
		}

		public class Map_DtlR_MST_SLO_PRMS_SEND_IF_R<D extends DtlR, S extends MST_SLO_PRMS_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_SLO_PRMS_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_SLO_PRMS_SEND_IF_R.$ext_sys_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.if_proc_typ(MAC_IF_PROC_TYP.SLO_PRMS_SEND.value());
			}
		}
	}

	//FMCB CUSTOM END
}