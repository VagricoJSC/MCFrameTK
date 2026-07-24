package mcframe.serverMSBC.MSBCL1040;

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
import mcframe.serverMSBC.MSBCL1040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL6110.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL1040.Query.*;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverMSBC.MSBCL6020.*;
import mcframe.serverMSBC.MSBCL6090.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMSUC.MSUCL0110.MSUCL_StrLnUtil;
import mcframe.serverMSUC.MSUCL0110.StrLnUtil_Srch01_CndR;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgInstListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgInstListReg_MC extends MSBCL_MfgInstListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目オーダ、製造指図、工程オーダ、工程指図を検索する<br>
	 */
	public class Srch01 extends MSBCL_MfgInstListReg_MC_A.Srch01 {
		protected MCList<MST_OPER_ORDER_R> _operAllL = MCList.create(MST_OPER_ORDER_R.class);
		protected MCIndexKey _operAllIdx;
		protected MCIndexKey _operFrozenIdx;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUp();

			if (isHdrMode()) {
				if (up0().tmp_sts_yet_flg() && isSrchOrd()) {
					// 品目オーダ検索
					MCQueryPlan sql = MSBCL1040_MST_ITM_ORDER_S01();
					searchForDL(sql, up0(), down0());
				}
				if (isSrchInst(up0())) {
					// 製造指図検索
					MCQueryPlan sql = MSBCL1040_MST_MFG_INST_S01();
					searchForDL(sql, up0(), down0());
				}
			}
			else {
				if (up0().tmp_sts_yet_flg() && isSrchOrd()) {
					// 工程オーダ検索
					MCQueryPlan sql = MSBCL1040_MST_OPER_ORDER_S01();
					searchForDL(sql, up0(), down0());
				}
				if (isSrchInst(up0())) {
					// 工程指図検索
					MCQueryPlan sql = MSBCL1040_MST_OPER_INST_S01();
					searchForDL(sql, up0(), down0());
				}
			}
		}
		
		protected void editUp() {
			if (up0().unschd_act_flg() && up0().not_unschd_act_flg()) {
				// 「計画」と「計画外」チェックボックスが両方ONの場合は、検索の条件を追加しない
			}
			else if (up0().unschd_act_flg()) {
				// 「計画外」の条件をONにする
				up0().addStringColumn("tmp_unschd_act_flg_str", toTrueStr(true));
				// 「計画外」の場合、「品目オーダ検索」と「工程オーダ検索」の検索結果を0件にする
				// (オーダーがある・・・ということは計画外ではないため)
				up0().addStringColumn("tmp_frcd_invld_flg_str", toTrueStr(true));
			}
			else if (up0().not_unschd_act_flg()) {
				// 「計画外」の条件をOFFにする
				up0().addStringColumn("tmp_unschd_act_flg_str", toFalseStr(false));
			}
			
			if (up0().tmp_sts_yet_flg()) {
				up0().addStringColumn("tmp_sts_yet_str", MSC_MFG_STS_TYP.YET.value());
			}
			if (up0().tmp_sts_sav_flg()) {
				up0().addStringColumn("tmp_sts_sav_str", MSC_MFG_STS_TYP.SAV.value());
			}
			if (up0().tmp_sts_ord_flg()) {
				up0().addStringColumn("tmp_sts_ord_str", MSC_MFG_STS_TYP.ORD.value());
			}
			if (up0().tmp_sts_cmpl_flg()) {
				up0().addStringColumn("tmp_sts_cmpl_str", MSC_MFG_STS_TYP.CMPL.value());
			}
			if (up0().tmp_sts_stt_flg()) {
				up0().addStringColumn("tmp_sts_stt_str", MSC_MFG_STS_TYP.STT.value());
			}

			// 指図書発行
			if (up0().inst_prnt_flg() && up0().not_inst_prnt_flg()) {
				// 両方trueなら何もしない
			}
			else if (up0().inst_prnt_flg()){
				up0().addStringColumn("tmp_inst_prnt_flg_str", toTrueStr(true));
			}
			else if (up0().not_inst_prnt_flg()) {
				up0().addStringColumn("tmp_inst_prnt_flg_str", toFalseStr(false));
			}
			
			// 現品票発行
			if (up0().stk_lst_issue_flg() && up0().not_stk_lst_issue_flg()) {
				// 両方trueなら何もしない
			}
			else if (up0().stk_lst_issue_flg()){
				up0().addStringColumn("tmp_stk_lst_issue_flg_str", toTrueStr(true));
			}
			else if (up0().not_stk_lst_issue_flg()) {
				up0().addStringColumn("tmp_stk_lst_issue_flg_str", toFalseStr(false));
			}
			
			if (!up0().abort_flg()) {
				up0().addStringColumn("tmp_abort_flg_str", toFalseStr(false));
			}
			
			if (isAprvOrAprvDelMode()) {
				// 承認種別
				up0().addStringColumn("OPE_VAL", "1");
				up0().addStringColumn("tmp_aprv_usr", mcframe.serverCore.sys.MCSys.user.ID());
				up0().addDateColumn("tmp_today", getToday());
			}
			else {
				up0().addStringColumn("OPE_VAL", "0");
			}
			
			if (isAllocMode() || up0().not_alloc_srch_flg()) {
				// 引当種別または、未引当ありのみの場合、マスタ上で引当対象としている投入予定が存在する製造指図のみを検索対象とするために
				// tmp_alloc_tgt_flg_strに'1'を設定する
				// ※未引当ありのみがオンの場合、その中でも引当が終わっていない投入予定が存在する製造指図のみを検索対象とする
				up0().addStringColumn("tmp_alloc_tgt_flg_str", toTrueStr(true));
			}
			if (up0().all_alloc_srch_flg()) {
				// 未引当なしのみの場合、マスタ上で引当対象としている投入予定が存在する製造指図のみを検索対象とするために
				// tmp_alloc_tgt_flg_strに'1'を設定する
				up0().addStringColumn("tmp_alloc_tgt_flg_str", toTrueStr(true));
				// また、その中でも引当ＦＬＧがfalseのレコードが存在しない製造指図のみを検索対象とするために
				// tmp_alloc_flg_false_strに'0'を設定する
				up0().addStringColumn("tmp_alloc_flg_false_str", toFalseStr(false));
			}
			
			if (isPrntStklstMode()) {
				// 現品票発行種別
				up0().addStringColumn("tmp_stk_lst_flg_str", toTrueStr(true));
			}
			else if (isRefMode()){
				// 現品票発行
				if (up0().stk_lst_issue_flg() && up0().not_stk_lst_issue_flg()) {
					// 両方trueなら何もしない
				}
				else {
					// 現品票発行種別
					up0().addStringColumn("tmp_stk_lst_flg_str", toTrueStr(true));
				}
			}
			// オーダ未確定除くの場合、未確定の品目オーダ情報を検索対象外とする
			if (!up0().not_srch_opn_flg()) {
				up0().addStringColumn("tmp_not_srch_opn_flg_str", toFalseStr(false));
			}
			// オーダ保存除くの場合、保存の品目オーダ情報を検索対象外とする
			if (!up0().not_srch_sav_flg()) {
				up0().addStringColumn("tmp_not_srch_sav_flg_str", toFalseStr(false));
			}
			// ＭＥＳ対象
			if (up0().mes_tgt_flg() && up0().not_mes_tgt_flg()) {
				// 両方trueなら何もしない
			}
			else if (up0().mes_tgt_flg()){
				up0().addStringColumn("tmp_mes_tgt_flg_str", toTrueStr(true));
			}
			else if (up0().not_mes_tgt_flg()) {
				up0().addStringColumn("tmp_mes_tgt_flg_str", toFalseStr(false));
			}
			// 引当の場合は、投入予定の製造状況区分を検索対象とする
			if(isAllocMode()) {
				up0().addStringColumn("tmp_alloc_mode_flg_str", toTrueStr(true));
			}
		}
		
		protected boolean isSrchOrd() {
			if (!up0().not_inst_prnt_flg()) {
				return false;
			}
			if (!up0().not_stk_lst_issue_flg() && isPrntStklstMode()) {
				return false;
			}
			//　未引当ありのみの場合はfalse
			if (up0().not_alloc_srch_flg()) {
				return false;
			}
			//　未引当なしのみの場合はfalse
			if (up0().all_alloc_srch_flg()) {
				return false;
			}

			if (!isNull(up0().inst_dt_fr()) || !isNull(up0().inst_dt_to())
					|| !isNull(up0().aprv_dt_fr()) || !isNull(up0().aprv_dt_to())
					|| !isNull(up0().mfg_str_ln_cd()) || !isNull(up0().mfg_str_ln_nm())
					|| !isNull(up0().strg_str_ln_cd()) || !isNull(up0().strg_str_ln_nm())
					|| !isNull(up0().oper_str_ln_cd()) || !isNull(up0().oper_str_ln_nm())
					|| !isNull(up0().lot_no()) || !isNull(up0().sublot_no())
					|| !isNull(up0().inst_dpt_cd()) || !isNull(up0().inst_dpt_nm())
					|| !isNull(up0().inst_usr_cd()) || !isNull(up0().inst_usr_nm())
					|| !isNull(up0().aprv_dpt_cd()) || !isNull(up0().aprv_dpt_nm())
					|| !isNull(up0().aprv_usr_cd()) || !isNull(up0().aprv_usr_nm())
					|| !isNull(up0().oper_usr_cd()) || !isNull(up0().oper_usr_nm())
					|| !isNull(up0().mfg_aprv_sts_typ())
					|| !isNull(up0().po_aprv_sts_typ()) 
					|| !isNull(up0().itm_mfg_inst_no()) || !isNull(up0().mfg_inst_no())
					|| !isNull(up0().oper_inst_no()) || !isNull(up0().inst_rpt_rmrks())
					|| !isNull(up0().intr_rmrks()) || !isNull(up0().disp_pd())
					|| !isNull(up0().oper_inst_rpt_rmrks())
					|| !isNull(up0().oper_intr_rmrks()) || !isNull(up0().oper_inst_sub_char1())
					|| !isNull(up0().oper_inst_sub_char2()) || !isNull(up0().oper_inst_sub_char3())
					|| !isNull(up0().itm_mfg_inst_sub_char1())
					|| !isNull(up0().itm_mfg_inst_sub_char2())
					|| !isNull(up0().itm_mfg_inst_sub_char3())
					|| !isNull(up0().mfg_inst_sub_char1())
					|| !isNull(up0().mfg_inst_sub_char2())
					|| !isNull(up0().mfg_inst_sub_char3())) {
				return false;
			}
			return true;
		}

		protected boolean isSrchInst(Srch01_CndR r) {
			if (isHdrMode()) {
				if (r.tmp_sts_cmpl_flg() || r.tmp_sts_ord_flg() || r.tmp_sts_sav_flg()
						|| r.tmp_sts_stt_flg()) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				// 工程単位製造指図の未指図工程を検索するため、工程モードの場合は、状況によらず工程指図のSQLを実行する
				return true;
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			down0().addNumberColumn("peg_no");
			setPegNo(down0());
			// ＭＥＳ対象フラグをセットし、対象レコードを絞り込む
			setMesFlgAndSubList();
			for (Srch01_RsltR r : down0()) {
				// 内製FLG、外注FLG
				if (MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ())) {
					r.mfg_flg(true);
				}
				else if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					r.outsrc_flg(true);
				}
				// 工程単位数量の計算
				if (MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ())) {
					calcOperNum(r);
				}
				// 出来高予定数
				if (MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ())) {
					if (!isSame(r.base_unit_ord_qty(), r.base_unit_inst_qty())) {
						// 残数分の出来高予定数を計算する
						// ※同様の処理が、製造指図登録の検索処理や登録時の残数分の受払予定作成処理にも存在するため、修正の際は注意
						MCNumber yieldSchdQty = r.base_unit_yield_qty().subtract(nvl(r.sum_base_unit_yield_qty(), MCNumber.ZERO));
						if (yieldSchdQty.isNegative()) {
							yieldSchdQty = MCNumber.ZERO;
						}
						r.base_unit_yield_qty(yieldSchdQty);
					}
				}
				else if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					r.base_unit_yield_qty(r.base_unit_inst_qty());
				}
			}
			setDefStrLnCd();
			compDtFromOper();
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			if (!down0().isEmpty()) {
				setItmOrderSchedulerFrozenFlg();
			}
			
			if (isExecRebuildDown()) {
				rebuildDownListSchedulerLinkageCnd();
			}
		}
		
		protected boolean isExecRebuildDown() {
			if (down0().isEmpty()) {
				return false;
			}
			
			if (up0().before_frozen_flg() && up0().frozen_flg()) {
				return false;
			}
			
			return true;
		}
		
		protected void rebuildDownListSchedulerLinkageCnd() {
			MCList<Srch01_RsltR> orgDownList = down0().clone();
			down0().clear();
			for (Srch01_RsltR ordDownR : orgDownList) {
				if (isDownAddTgt(ordDownR)) {
					down0().add(ordDownR);
				}
			}
			
			if (!down0().isEmpty()) {
				if (isHdrMode()) {
					down0().sort(Srch01_RsltR.$mfg_st_schd_dt, Srch01_RsltR.$itm_ord_typ,
							Srch01_RsltR.$itm_ord_no);
				}
				else {
					down0().sort(Srch01_RsltR.$st_schd_tm, Srch01_RsltR.$itm_ord_typ,
							Srch01_RsltR.$itm_ord_no, Srch01_RsltR.$disp_seq);
				}
			}
		}
		
		protected boolean isDownAddTgt(Srch01_RsltR ordDownR) {
			if (up0().before_frozen_flg()) {
				if (ordDownR.for_scheduler_frozen_flg()
						&& !ordDownR.scheduler_frozen_flg()) {
					return true;
				}
			}
			
			if (up0().frozen_flg()) {
				if (!ordDownR.for_scheduler_frozen_flg()
						|| ordDownR.scheduler_frozen_flg()) {
					return true;
				}
			}
			return false;
		}
		
		protected void setItmOrderSchedulerFrozenFlg() {
			getOperOdrList();
			for (Srch01_RsltR down0R : down0()) {
				if (!down0R.for_scheduler_frozen_flg()) {
					continue;
				}
				
				MCList<MST_OPER_ORDER_R> allOperL = _operAllL.subList(_operAllIdx,
						down0R.itm_ord_no());
				MCList<MST_OPER_ORDER_R> frozenOperL = _operAllL.subList(_operFrozenIdx,
						down0R.itm_ord_no(), true);
				
				down0R.scheduler_frozen_flg(getSchedulerFrozenFlg(allOperL, frozenOperL));
				down0R.scheduler_frozen_itm_flg(down0R.scheduler_frozen_flg());
			}
		}
		
		protected boolean getSchedulerFrozenFlg(MCList<MST_OPER_ORDER_R> allOperL,
				MCList<MST_OPER_ORDER_R> frozenOperL) {
			int allOperListCnt = 0;
			int frozenOperListCnt = 0;
			
			if (!isNull(allOperL)) {
				allOperListCnt = allOperL.size();
			}
			
			if (!isNull(frozenOperL)) {
				frozenOperListCnt = frozenOperL.size();
			}
			
			if (allOperListCnt > 0 && allOperListCnt == frozenOperListCnt) {
				return true;
			}
			
			return false;
		}
		
		protected void getOperOdrList() {
			MCQueryPlan operOrdAllSql = MSBCL1040_MST_OPER_ORDER_S02();
			executeQuery(_operAllL, operOrdAllSql, down0());
			_operAllIdx = _operAllL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			_operFrozenIdx = _operAllL.createIndex(MST_OPER_ORDER_R.$itm_ord_no,
					MST_OPER_ORDER_R.$scheduler_frozen_flg);
		}
		
		protected void compDtFromOper() {
			// 上り電文の予定日補正フラグがオンの場合、工程オーダから着手予定日時の最小値、終了予定日時の最大値を設定する
			if (!up0().comp_dt_from_oper_flg()) {
				return;
			}
			
			if (down0().isEmpty()) {
				return;
			}
			
			MCList<MST_OPER_ORDER_R> dbcL = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setGroupBy(t.itm_ord_no);
			dbcL_bldr.addMin(t.st_schd_tm, MST_OPER_ORDER_R.$st_schd_tm);
			dbcL_bldr.addMax(t.end_schd_tm, MST_OPER_ORDER_R.$end_schd_tm);
			dbcL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
			dbSelect("MSBCL1040_MST_OPER_ORDER_S01", dbcL, dbcL_bldr, down0());
			
			MCIndexKey idx = dbcL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			
			for (Srch01_RsltR r : down0()) {
				MST_OPER_ORDER_R operR = dbcL.getFirst(idx, r.itm_ord_no());
				if (!isNull(operR)) {
					r.st_schd_dt(operR.st_schd_tm());
					r.st_schd_hm(operR.st_schd_tm());
					r.end_schd_dt(operR.end_schd_tm());
					r.end_schd_hm(operR.end_schd_tm());
				}
			}
		}
		
		protected void setMesFlgAndSubList() {
			if (isHdrMode()) {
				return;
			}
			if (down0().isEmpty()) {
				return;
			}
			MSBCL_ReExpService.ReExp_Sprt02 o = MSBCL_ReExpService.crtReExp_Sprt02();
			for (Srch01_RsltR d : down0()) {
				ReExp_Sprt02_HdrR hdrR = ReExp_Sprt02_HdrR.create();
				copy(hdrR, d, createMap_ReExp_Sprt02_HdrR_Srch01_RsltR());
				hdrR.oper_peg_no(d.getNumberNE("peg_no"));
				o.up0().add(hdrR);
			}
			o.exec();
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch02();
			for (Srch01_RsltR rstR : down0()) {
				SCMLinkUtil_Srch02_CndR cndR = SCMLinkUtil_Srch02_CndR.create();
				cndR.peg_no(rstR.getNumberNE("peg_no"));
				cndR.loc_cd(rstR.mfg_loc_cd());
				cndR.itm_cd(rstR.itm_cd());
				cndR.itm_sub1(rstR.itm_sub1());
				cndR.itm_sub2(rstR.itm_sub2());
				cndR.itm_sub3(rstR.itm_sub3());
				cndR.oper_cd(rstR.oper_cd());
				cndR.master_dt(getToday());
				boolean firstRow = true;
				for (ReExp_Sprt02_RsltWkR wkR : o.down0()) {
					// 対象工程に紐づかない工数予定ならスキップ
					if (!isSame(rstR.getNumberNE("peg_no"), wkR.oper_peg_no())) {
						continue;
					}
					if (firstRow) {
						cndR.wk_cost_cd(wkR.wk_cost_cd());
						firstRow = false;
					}
					else {
						SCMLinkUtil_Srch02_CndR subR = cndR.clone();
						subR.wk_cost_cd(wkR.wk_cost_cd());
						ope.up0().add(subR);
					}
				}
				ope.up0().add(cndR);
			}
			
			ope.exec();
			
			String[] destCols = new String[] {Srch01_RsltR.$mes_tgt_flg};
			String[] srcCols = new String[] {SCMLinkUtil_Srch02_CndR.$mes_flg};
			copyByPegNo(down0(), destCols, ope.down0(), srcCols);
			
			//　ＭＥＳ対象、ＭＥＳ対象外が両方ともオンの場合は絞込を行わない。
			if (isNull(up0().getStringNE("tmp_mes_tgt_flg_str"))) {
				return;
			}
			MCList<Srch01_RsltR> removeDownL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				// 指図済以降の場合はSQLで絞り込むため再絞込みは不要
				if (!MSC_MFG_STS_TYP.isYET(r.mfg_sts_typ()) && !MSC_MFG_STS_TYP.isSAV(r.mfg_sts_typ())) {
					continue;
				}
				else {
					if (up0().mes_tgt_flg() && !r.mes_tgt_flg()) {
						removeDownL.add(r);
					}
					else if (up0().not_mes_tgt_flg() && r.mes_tgt_flg()) {
						removeDownL.add(r);
					}
				}
			}
				
			down0().removeAll(removeDownL);
		}
		protected Map_ReExp_Sprt02_HdrR_Srch01_RsltR<ReExp_Sprt02_HdrR,Srch01_RsltR> createMap_ReExp_Sprt02_HdrR_Srch01_RsltR() {
			return new Map_ReExp_Sprt02_HdrR_Srch01_RsltR<ReExp_Sprt02_HdrR, Srch01_RsltR>();
		}

		public class Map_ReExp_Sprt02_HdrR_Srch01_RsltR<D extends ReExp_Sprt02_HdrR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt02_HdrR.$mfg_inst_no, Srch01_RsltR.$mfg_inst_no);
				addColumnPathMap(ReExp_Sprt02_HdrR.$oper_inst_no, Srch01_RsltR.$oper_inst_no);
				addColumnPathMap(ReExp_Sprt02_HdrR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(ReExp_Sprt02_HdrR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt02_HdrR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt02_HdrR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt02_HdrR.$mfg_loc_cd, Srch01_RsltR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt02_HdrR.$oper_ptn, Srch01_RsltR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt02_HdrR.$oper_cd, Srch01_RsltR.$oper_cd);
				addColumnPathMap(ReExp_Sprt02_HdrR.$oper_seq, Srch01_RsltR.$oper_seq);
				addColumnPathMap(ReExp_Sprt02_HdrR.$mfg_st_schd_dt, Srch01_RsltR.$st_schd_dt);
				addColumnPathMap(ReExp_Sprt02_HdrR.$oper_inst_qty, Srch01_RsltR.$oper_base_unit_qty);
			}
			
		}

		protected boolean isHdrMode() {
			return isSame(up0().srch_mode(), "HDR");
		}
		
		protected boolean isAprvOrAprvDelMode() {
			return isSame(up0().ope(), MSC_MFG_INST_LIST_REG_OPE.OPE_APRV.value())
					|| isSame(up0().ope(), MSC_MFG_INST_LIST_REG_OPE.OPE_APRV_DEL.value());
		}
		
		protected boolean isAllocMode() {
			return isSame(up0().ope(), MSC_MFG_INST_LIST_REG_OPE.OPE_ALLOC.value());
		}
		
		protected boolean isPrntStklstMode() {
			return isSame(up0().ope(), MSC_MFG_INST_LIST_REG_OPE.OPE_PRNT_STKLST.value());
		}
		
		protected boolean isRefMode() {
			return isSame(up0().ope(), MSC_MFG_INST_LIST_REG_OPE.OPE_REF.value());
		}

		/**
		 * 工程単位指図数の計算
		 */
		protected void calcOperNum(Srch01_RsltR r) {
			MCNumber operUnitQty = convQtyBaseToOper(r.oper_base_unit_qty(),
					r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
					r.oper_unit_conv_rnd_typ());

			if (isNull(operUnitQty)) {
				r.oper_unit_qty(r.oper_base_unit_qty());
				r.oper_unit_cd(r.base_unit_cd());
				r.oper_unit_nm(r.base_unit_nm());
				r.oper_std_qty(1);
				r.oper_conv_qty(1);
				r.oper_unit_dec_place(r.base_unit_dec_place());
				r.oper_unit_conv_rnd_typ(r.base_unit_conv_rnd_typ());
			}
			else {
				r.oper_unit_qty(operUnitQty);
			}
		}

		/**
		 * 標準の棚・ラインCDを設定します。
		 */
		protected void setDefStrLnCd() {
			String[] keys = {Srch01_RsltR.$mfg_mtd_typ, Srch01_RsltR.$mfg_sts_typ};
			String[] vals = {MSC_MFG_MTD_TYP.INTNL.value(), MSC_MFG_STS_TYP.YET.value()};
			MCList<Srch01_RsltR> intnlL = down0().subList(keys, vals);
			if (intnlL.isEmpty()) {
				return;
			}

			MSUCL_StrLnUtil.StrLnUtil_Srch01 ope = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			intnlL.forEach(intnlR ->{
				StrLnUtil_Srch01_CndR cndR = StrLnUtil_Srch01_CndR.create();
				cndR.peg_no(intnlR.getNumberNE("peg_no"));
				cndR.itm_cd(intnlR.itm_cd());
				cndR.itm_sub1(intnlR.itm_sub1());
				cndR.itm_sub2(intnlR.itm_sub2());
				cndR.itm_sub3(intnlR.itm_sub3());
				cndR.loc_cd(intnlR.strg_loc_cd());
				ope.up0().add(cndR);
			});
			ope.exec();
			ope.down0().forEach(downR -> {
				Srch01_RsltR intnlR = intnlL.getFirst("peg_no", downR.peg_no());
				if (isNull(downR.str_ln_cd())) {
					intnlR.strg_str_ln_cd_none_flg(true);
				}
				else {
					intnlR.strg_str_ln_cd(downR.str_ln_cd());
					intnlR.strg_str_ln_nm(downR.str_ln_nm());
				}
			});
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 製造指図の取消を行う<br>
	 */
	public class Del01 extends MSBCL_MfgInstListReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			
			callMfgInstRegDel01();
			
			setDown();
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Del01_HdrR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Del01_HdrR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Del01_HdrR> up0L = ((MCList<Del01_HdrR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void editUp() {
			setPegNo(Del01_HdrR.$peg_no, up0());
		}
		
		protected void callMfgInstRegDel01() {

			// MfgInstReg_Del01を２回に分けてコールする
			// １回目：品目単位製造指図、工程単位製造指図の初回製造指図以外
			// ２回目：工程単位製造指図の初回製造指図
			MCList<Del01_HdrR> up1L = MCList.create(Del01_HdrR.class);
			MCList<Del01_HdrR> up2L = MCList.create(Del01_HdrR.class);
			for (Del01_HdrR r : up0()) {
				if (r.frst_mfg_inst_flg()) {
					up2L.add(r);
				}
				else {
					up1L.add(r);
				}
			}

			// １回目
			if (!up1L.isEmpty()) {
				MSBCL_MfgInstRegService.MfgInstReg_Del01 ope = MSBCL_MfgInstRegService
						.crtMfgInstReg_Del01();
				addAll(ope.up1(), up1L, createMap_MfgInstReg_Del01_HdrR_Del01_HdrR());
				ope.up0().lst_del_flg(true);
				if (!up2L.isEmpty()) {
					// ２回目のレコードが存在する場合は２回目登録時にコミットするため、コミット不要フラグをオンにする
					ope.up0().not_commit_flg(true);
				}
				ope.exec();
				copyByPegNo(up1L, new String[] {
						MfgInstReg_Del01_HdrR.$rtn_sts_typ
				}, ope.down0(), new String[] {
						Del01_HdrR.$rtn_sts_typ
				});
			}

			// ２回目
			if (!up2L.isEmpty()) {
				MSBCL_MfgInstRegService.MfgInstReg_Del01 ope = MSBCL_MfgInstRegService
						.crtMfgInstReg_Del01();
				addAll(ope.up1(), up2L, createMap_MfgInstReg_Del01_HdrR_Del01_HdrR());
				ope.up0().lst_del_flg(true);
				if (!up1L.isEmpty()) {
					// １回目のレコードが存在する場合は１回目登録時に更新カウンタチェックをするため、更新カウンタチェック不要フラグをオンにする
					ope.up0().not_chk_cntr_flg(true);
				}
				ope.exec();
				copyByPegNo(up2L, new String[] {
						MfgInstReg_Del01_HdrR.$rtn_sts_typ
				}, ope.down0(), new String[] {
						Del01_HdrR.$rtn_sts_typ
				});
			}
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Del01_HdrR>> splitUp(MCList<Del01_HdrR> list, int max) {
			List<MCList<Del01_HdrR>> ret = new ArrayList<>();
			MCList<Del01_HdrR>[] grpL = list.groupList(Del01_HdrR.$itm_cd
					, Del01_HdrR.$itm_sub1, Del01_HdrR.$itm_sub2, Del01_HdrR.$itm_sub3);
			MCList<Del01_HdrR> tmp = MCList.create(Del01_HdrR.class);
			for (MCList<Del01_HdrR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Del01_HdrR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		protected Map_MfgInstReg_Del01_HdrR_Del01_HdrR<MfgInstReg_Del01_HdrR,Del01_HdrR> createMap_MfgInstReg_Del01_HdrR_Del01_HdrR() {
			return new Map_MfgInstReg_Del01_HdrR_Del01_HdrR<MfgInstReg_Del01_HdrR, Del01_HdrR>();
		}

		public class Map_MfgInstReg_Del01_HdrR_Del01_HdrR<D extends MfgInstReg_Del01_HdrR, S extends Del01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Del01_HdrR.$peg_no, Del01_HdrR.$peg_no);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$mfg_inst_no, Del01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$itm_ord_upd_cntr, Del01_HdrR.$itm_ord_upd_cntr);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$itm_mfg_inst_upd_cntr, Del01_HdrR.$itm_mfg_inst_upd_cntr);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$mfg_inst_upd_cntr, Del01_HdrR.$mfg_inst_upd_cntr);
				addColumnPathMap(MfgInstReg_Del01_HdrR.$xfr_inst_del_enable_flg, Del01_HdrR.$xfr_inst_del_enable_flg);
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 製造指図の承認を行う<br>
	 */
	public class Upd02 extends MSBCL_MfgInstListReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editAprvUp(up0());

			callMfgInstActComUpd01(MSC_MFG_APRV_STS_TYP.INST_ACPT.value(), up0());
			
			setDown();
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd02_DtlR>> list = splitAprvUp(up0(), getSplitRowCount());
			for (MCList<Upd02_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Upd02_DtlR> up0L = ((MCList<Upd02_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Del02オペレーション.<p>
	 *
	 * 製造指図の承認取消を行う<br>
	 */
	public class Del02 extends MSBCL_MfgInstListReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editAprvUp(up0());

			callMfgInstActComUpd01(MSC_MFG_APRV_STS_TYP.INST_OPN.value(), up0());
			
			setDown();
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd02_DtlR>> list = splitAprvUp(up0(), getSplitRowCount());
			for (MCList<Upd02_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Upd02_DtlR> up0L = ((MCList<Upd02_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * 承認・承認取消時上り電文の編集
	 */
	protected void editAprvUp(MCList<Upd02_DtlR> upL) {
		setPegNo(Upd02_DtlR.$peg_no, upL);
	}
	
	/**
	 * 製造指図・実績共通処理サービスの承認・承認取消処理の呼出
	 */
	protected void callMfgInstActComUpd01(String mfgAprvStsTyp, MCList<Upd02_DtlR> upL) {
		MSBCL_MfgInstActComService.MfgInstActCom_Upd01 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd01();
		ope.up0().lst_reg_flg(true);
		ope.up0().mfg_aprv_sts_typ(mfgAprvStsTyp);
		addAll(ope.up1(), upL ,createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR());
		ope.exec();
		copyByPegNo(upL, new String[] {
				MfgInstActCom_Chk01_DtlR.$mfg_aprv_sts_typ,
				MfgInstActCom_Chk01_DtlR.$mfg_aprv_sts_typ_nm,
				MfgInstActCom_Chk01_DtlR.$rtn_sts_typ
		}, ope.down0(), new String[] {
				Upd02_DtlR.$mfg_aprv_sts_typ, Upd02_DtlR.$mfg_aprv_sts_typ_nm,
				Upd02_DtlR.$rtn_sts_typ
		});
	}
	
	protected Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR,Upd02_DtlR> createMap_MfgInstActCom_Chk01_DtlR_Upd02_DtlR() {
		return new Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<MfgInstActCom_Chk01_DtlR, Upd02_DtlR>();
	}

	public class Map_MfgInstActCom_Chk01_DtlR_Upd02_DtlR<D extends MfgInstActCom_Chk01_DtlR, S extends Upd02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$peg_no, Upd02_DtlR.$peg_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_no, Upd02_DtlR.$mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$itm_mfg_inst_no, Upd02_DtlR.$itm_mfg_inst_no);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dt, Upd02_DtlR.$aprv_dt);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_tm, Upd02_DtlR.$aprv_tm);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_dpt_cd, Upd02_DtlR.$aprv_dpt_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_usr_cd, Upd02_DtlR.$aprv_usr_cd);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$aprv_rsn, Upd02_DtlR.$aprv_rsn);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$mfg_inst_upd_cntr, Upd02_DtlR.$mfg_inst_upd_cntr);
			addColumnPathMap(MfgInstActCom_Chk01_DtlR.$rtn_sts_typ, Upd02_DtlR.$rtn_sts_typ);
		}
	}

	protected List<MCList<Upd02_DtlR>> splitAprvUp(MCList<Upd02_DtlR> list, int max) {
		List<MCList<Upd02_DtlR>> ret = new ArrayList<>();
		MCList<Upd02_DtlR>[] grpL = list.groupList(Upd02_DtlR.$itm_cd
				, Upd02_DtlR.$itm_sub1, Upd02_DtlR.$itm_sub2, Upd02_DtlR.$itm_sub3);
		MCList<Upd02_DtlR> tmp = MCList.create(Upd02_DtlR.class);
		for (MCList<Upd02_DtlR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Upd02_DtlR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造指図の登録・訂正を行う<br>
	 */
	public class Upd01 extends MSBCL_MfgInstListReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			if (!up0().oper_unit_flg()) {
				// ヘッダ単位の指図・引当
				callMfgInstRegUpd02HdrMode();
				editDown();
			}
			else {
				// 工程単位の指図
				//callMfgInstRegUpd02OperMode();
				callMfgInstRegUpd02OperMode();
				editDown();
			}
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			MCList<T> ret = (MCList<T>) up1();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up1().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<MfgInstReg_Upd02_Hdr1R>> list = splitUp(up1(), getSplitRowCount());
			for (MCList<MfgInstReg_Upd02_Hdr1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				Upd01_CtrlR up0R = (Upd01_CtrlR)ope.up(0);
				MCList<MfgInstReg_Upd02_Hdr1R> up1L = ((MCList<MfgInstReg_Upd02_Hdr1R>)ope.up(1));
				MCRow.copyall(up0R, up0());
				up1L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		protected void editUp() {
			for (MfgInstReg_Upd02_Hdr1R r : up1()) {
				if (!up0().alloc_ope_flg()) {
					r.mfg_sts_typ(up0().mfg_sts_typ());
				}
				r.inst_immed_prnt_flg(up0().inst_immed_prnt_flg());
			}
			setPegNo(up1());
		}
		
		protected void callMfgInstRegUpd02HdrMode() {
			MSBCL_MfgInstRegService.MfgInstReg_Upd02 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Upd02();
			ope.up0().oper_unit_flg(up0().oper_unit_flg());
			ope.up0().re_alloc_mode_flg(up0().re_alloc_mode_flg());
			ope.up0().is_src_alloc_flg(up0().alloc_ope_flg());
			ope.up0().upd_cntr_chk_flg(true);
			ope.up2().addAll(up1());
			ope.exec();
			down0().addAll(ope.down1());
		}

		protected void callMfgInstRegUpd02OperMode() {
			MSBCL_MfgInstRegService.MfgInstReg_Upd02 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Upd02();
			ope.up0().oper_unit_flg(up0().oper_unit_flg());
			ope.up0().re_alloc_mode_flg(up0().re_alloc_mode_flg());
			ope.up0().is_src_alloc_flg(false);
			ope.up0().upd_cntr_chk_flg(true);
			ope.up1().addAll(up1());
			ope.exec();
			down0().addAll(ope.down0());
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<MfgInstReg_Upd02_Hdr1R>> splitUp(MCList<MfgInstReg_Upd02_Hdr1R> list, int max) {
			List<MCList<MfgInstReg_Upd02_Hdr1R>> ret = new ArrayList<>();
			MCList<MfgInstReg_Upd02_Hdr1R>[] grpL = list.groupList(MfgInstReg_Upd02_Hdr1R.$itm_cd
					, MfgInstReg_Upd02_Hdr1R.$itm_sub1, MfgInstReg_Upd02_Hdr1R.$itm_sub2, MfgInstReg_Upd02_Hdr1R.$itm_sub3);
			MCList<MfgInstReg_Upd02_Hdr1R> tmp = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
			for (MCList<MfgInstReg_Upd02_Hdr1R> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(MfgInstReg_Upd02_Hdr1R.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		protected void editDown() {
			for (MfgInstReg_Upd02_Hdr1R downR : down0()) {
				if (MAC_RTN_STS_TYP.isERR(downR.rtn_sts_typ())) {
					// エラー行はそのまま
					continue;
				}
				
				// 登録処理が正常終了したとしても、全件引当できたわけではない場合があるので、引当結果によって処理結果を変更する
				if (!isSame(downR.alloc_tgt_cnt(), downR.alloc_success_cnt())) {
					downR.rtn_sts_typ(MAC_RTN_STS_TYP.WRN.value());
					MCMessagePool.add(downR, null, MSBCL1083, downR.alloc_tgt_cnt(),
							downR.alloc_success_cnt(), downR.alloc_failure_cnt(), toDispGUIIndex(downR));
				}
				else if (downR.lot_inh_err_flg()) {
					downR.rtn_sts_typ(MAC_RTN_STS_TYP.WRN.value());
				}
				if (MAC_RTN_STS_TYP.isOK(downR.rtn_sts_typ())) {
					for (MCMessage msgRow : MCMessagePool.getMessageList()) {
						if (isSame(msgRow.getID(), MAUDL0009)
								|| (isSame(msgRow.getCauseRow().getParamIndex(), downR.getParamIndex())
										&& isSame(msgRow.getCauseRow().getParamRowIndex(), downR.getParamRowIndex()))) {
							downR.rtn_sts_typ(MAC_RTN_STS_TYP.WRN.value());
							break;
						}
					}
				}
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 製造指図書を発行する。<br>
	 */
	public class Prnt01 extends MSBCL_MfgInstListReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();

			// 製造帳票発行サービスの製造指図書発行
			callMfgRptServicePrnt01();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_RsltR.$peg_no, up0());
		}
		
		/**
		 * 製造指図書を発行する。
		 */
		protected void callMfgRptServicePrnt01() {
			MSBCL_MfgRptService.MfgRpt_Prnt01 prnt = MSBCL_MfgRptService.crtMfgRpt_Prnt01();

			addAll(prnt.up0(), up0(), createMap_MfgRpt_Prnt01_DtlR_Prnt01_RsltR());

			prnt.exec();

			String[] destCols = new String[] {Prnt01_RsltR.$inst_prnt_flg, Prnt01_RsltR.$inst_prnt_tm, Prnt01_RsltR.$err_flg};
			String[] srcCols = new String[] {MfgRpt_Prnt01_DtlR.$inst_prnt_flg, MfgRpt_Prnt01_DtlR.$inst_prnt_tm, MfgRpt_Prnt01_DtlR.$err_flg};
			copyByPegNo(up0(), destCols, prnt.down0(), srcCols);
			
			for (Prnt01_RsltR r : up0()) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_MfgRpt_Prnt01_DtlR_Prnt01_RsltR<MfgRpt_Prnt01_DtlR,Prnt01_RsltR> createMap_MfgRpt_Prnt01_DtlR_Prnt01_RsltR() {
			return new Map_MfgRpt_Prnt01_DtlR_Prnt01_RsltR<MfgRpt_Prnt01_DtlR, Prnt01_RsltR>();
		}

		public class Map_MfgRpt_Prnt01_DtlR_Prnt01_RsltR<D extends MfgRpt_Prnt01_DtlR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$peg_no, Prnt01_RsltR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$mfg_inst_no, Prnt01_RsltR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt01_DtlR.$mfg_inst_rev, Prnt01_RsltR.$mfg_inst_rev);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 製造品のロットＮＯ、サブロットＮＯを発番する<br>
	 */
	public class Sprt01 extends MSBCL_MfgInstListReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<Sprt01_HdrR> tgtL = getTgtL();
			callLotIssueSrv(tgtL);
			setDown();
		}
		
		protected MCList<Sprt01_HdrR> getTgtL() {
			MCList<Sprt01_HdrR> ret = MCList.create(Sprt01_HdrR.class);
			
			MCNumber pegNo = MCNumber.ZERO;
			// 工程表示でロット発番した場合を考慮して、品目オーダＮＯ・品目製造指図ＮＯでグループ化する
			for (MCList<Sprt01_HdrR> gL : up1().groupList(Sprt01_HdrR.$itm_ord_no, Sprt01_HdrR.$itm_mfg_inst_no)) {
				// ロット発番処理に渡すのは１行目だけだが、後の処理で同じヘッダの場合は同じロットＮＯを下り電文にする必要があるため、紐付けＮＯは全行に設定する
				for (Sprt01_HdrR hdrR : gL) {
					hdrR.peg_no(pegNo);
					hdrR.hdr_peg_no(pegNo);
					hdrR.lot_issue_flg(isLotAutoIssue(hdrR));
					hdrR.sublot_issue_flg(isSublotAutoIssue(hdrR));
				}
				
				gL.sort(MCList.SortType.DESC, Sprt01_HdrR.$yield_oper_flg);
				Sprt01_HdrR tgtR = gL.get(0);
				if (tgtR.lot_issue_flg() || tgtR.sublot_issue_flg()) {
					ret.add(tgtR);

				}
				pegNo = pegNo.add(1);
			}
			
			return ret;
		}
		
		protected boolean isLotAutoIssue(Sprt01_HdrR hdrR) {
			if (!up0().lot_issue_flg()) {
				return false;
			}
			if (!isNull(hdrR.lot_no())) {
				return false;
			}
			if (MAC_LOT_NO_TYP.isMANUAL(hdrR.lot_no_typ())) {
				return false;
			}
			if (MAC_LOT_MNG_TYP.isNOT_MNG(hdrR.lot_mng_typ())) {
				return false;
			}
			if (!MAC_LOT_ISSUE_TYP.isON_INST(hdrR.lot_issue_typ())) {
				return false;
			}
			return true;
		}
		
		protected boolean isSublotAutoIssue(Sprt01_HdrR hdrR) {
			if (!up0().sublot_issue_flg()) {
				return false;
			}
			if (!isNull(hdrR.sublot_no())) {
				return false;
			}
			if (MAC_LOT_NO_TYP.isMANUAL(hdrR.lot_no_typ())) {
				return false;
			}
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(hdrR.sublot_mng_typ())) {
				return false;
			}
			if (!MAC_LOT_ISSUE_TYP.isON_INST(hdrR.lot_issue_typ())) {
				return false;
			}
			return true;
		}
		
		protected void callLotIssueSrv(MCList<Sprt01_HdrR> tgtL) {
			if (tgtL.isEmpty()) {
				return;
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), tgtL, createMap_MfgInstActCom_Sprt01_HdrR_Sprt01_HdrR());
			o.up1().addAll(getInptContainer(tgtL));
			o.exec();
			
			// copyByPegNoはup1に対して実行する
			copyByPegNo(up1(), new String[] {
					Sprt01_HdrR.$lot_no, Sprt01_HdrR.$sublot_no
			}, o.down0(), new String[] {
					MfgInstActCom_Sprt01_HdrR.$lot_no, MfgInstActCom_Sprt01_HdrR.$sublot_no
			});
		}
		
		protected MCList<MfgInstActCom_Sprt01_DtlR> getInptContainer(MCList<Sprt01_HdrR> tgtL) {
			MCList<MfgInstActCom_Sprt01_DtlR> ret = MCList.create(MfgInstActCom_Sprt01_DtlR.class);
			MCList<Sprt01_HdrR> bindL = tgtL.subList(r -> !isNull(r.itm_mfg_inst_no()));
			if (bindL.isEmpty()) {
				return ret;
			}
			
			MCList<MST_INPT_SCHD_R> inptL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t1 = MST_INPT_SCHD_R.create("T");
			MSVT_LOT_LIST_R t2 = MSVT_LOT_LIST_R.create("T2");
			MCQueryApiBuilder inptL_bldr = MCQueryApiBuilder.create(t1);
			inptL_bldr.setSelect(t1.itm_mfg_inst_no, t1.lot_no, t1.sublot_no, t1.main_itm_flg);
			inptL_bldr.addSelect(t2.vld_dt);
			inptL_bldr.addSelect(t2.first_gr_dt);
			inptL_bldr.addSelect(t2.lot_seq);
			inptL_bldr.addLeftOuterJoin(t2, bracket( t1.itm_cd.eq(t2.itm_cd) .and(t1.itm_sub1.eq(t2.itm_sub1)) .and(t1.itm_sub2.eq(t2.itm_sub2)) .and(t1.itm_sub3.eq(t2.itm_sub3)) .and(t1.lot_no.eq(t2.lot_no)) .and(t1.sublot_no.eq(t2.sublot_no))));
			inptL_bldr.setWhere(t1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			dbSelect("MSBCL1040_MST_INPT_SCHD_S01", inptL, inptL_bldr, bindL);
			
			MCIndexKey idxkey = inptL.createIndex(MST_INPT_SCHD_R.$itm_mfg_inst_no);
			for (Sprt01_HdrR bindR : bindL) {
				MCList<MST_INPT_SCHD_R> subL = inptL.subList(idxkey, bindR.itm_mfg_inst_no());
				for (MST_INPT_SCHD_R subR : subL) {
					MfgInstActCom_Sprt01_DtlR retR = MfgInstActCom_Sprt01_DtlR.create();
					retR.hdr_peg_no(bindR.hdr_peg_no());
					retR.lot_no(subR.lot_no());
					retR.sublot_no(subR.sublot_no());
					retR.main_itm_flg(subR.main_itm_flg());
					retR.vld_dt(subR.getDateNE("vld_dt"));
					retR.first_gr_dt(subR.getDateNE("first_gr_dt"));
					retR.lot_seq(subR.getStringNE("lot_seq"));
					
					ret.add(retR);
				}
			}
			return ret;
		}
		
		protected Map_MfgInstActCom_Sprt01_HdrR_Sprt01_HdrR<MfgInstActCom_Sprt01_HdrR,Sprt01_HdrR> createMap_MfgInstActCom_Sprt01_HdrR_Sprt01_HdrR() {
			return new Map_MfgInstActCom_Sprt01_HdrR_Sprt01_HdrR<MfgInstActCom_Sprt01_HdrR, Sprt01_HdrR>();
		}

		public class Map_MfgInstActCom_Sprt01_HdrR_Sprt01_HdrR<D extends MfgInstActCom_Sprt01_HdrR, S extends Sprt01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$peg_no, Sprt01_HdrR.$peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$hdr_peg_no, Sprt01_HdrR.$peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_issue_flg, Sprt01_HdrR.$lot_issue_flg);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_issue_flg, Sprt01_HdrR.$sublot_issue_flg);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_cd, Sprt01_HdrR.$itm_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub1, Sprt01_HdrR.$itm_sub1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub2, Sprt01_HdrR.$itm_sub2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub3, Sprt01_HdrR.$itm_sub3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno1, Sprt01_HdrR.$sno1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno2, Sprt01_HdrR.$sno2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno3, Sprt01_HdrR.$sno3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno4, Sprt01_HdrR.$sno4);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_mng_typ, Sprt01_HdrR.$lot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_mng_typ, Sprt01_HdrR.$sublot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no_ptn_cd, Sprt01_HdrR.$lot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_no_ptn_cd, Sprt01_HdrR.$sublot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$yield_dt, Sprt01_HdrR.$yield_dt);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sppl_cd, Sprt01_HdrR.$sppl_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$mfg_loc_cd, Sprt01_HdrR.$mfg_loc_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$mfg_loc_wg_cd, Sprt01_HdrR.$mfg_loc_wg_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$mfg_loc_site_cd, Sprt01_HdrR.$mfg_loc_site_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no, Sprt01_HdrR.$lot_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_no, Sprt01_HdrR.$sublot_no);
				
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.yield_dt_label_nm(getLabel(src, Sprt01_HdrR.$yield_dt));
				dest.no_exception_flg(true);
			}
			
		}
		
		protected void setDown() {
			down0().addAll(up1());
		}
	}

	//FMCB CUSTOM END
}