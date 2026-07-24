package mcframe.serverMSBC.MSBCL0050;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL0050.Query.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBF.MSBFL5010.*;

import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_OrdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_OrdSrch_MC extends MSBCL_OrdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_OrdSrch_MC_A.Srch01 {
		/** 工程保存取得用 */
		protected MCList<MST_OPER_ORDER_R> _operL = MCList.create(MST_OPER_ORDER_R.class);
		protected MCList<MST_OPER_ORDER_R> _operAllL = MCList.create(MST_OPER_ORDER_R.class);
		protected MCIndexKey _operIdx;
		protected MCIndexKey _operAllIdx;
		protected MCIndexKey _operFrozenIdx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			//bind用一時カラム追加
			setUpTmpCol();
			//品目オーダ検索
			srchItmOrd();
		}

		/**
		 * 検索条件用一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			// 「品目オーダ区分」条件の設定
			if (up0().mfg_flg()) {
				up0().addStringColumn("wk_mfg", MSC_ITM_ORD_TYP.MFG.value());
			}
			if (up0().purc_flg()) {
				up0().addStringColumn("wk_purc", MSC_ITM_ORD_TYP.PURC.value());
			}
			if (up0().outsrc_flg()) {
				up0().addStringColumn("wk_outsrc", MSC_ITM_ORD_TYP.OUTSRC.value());
			}
			if (up0().xfr_flg()) {
				up0().addStringColumn("wk_xfr", MSC_ITM_ORD_TYP.XFR.value());
			}
			if (up0().wg_xfr_flg()) {
				up0().addStringColumn("wk_wg_xfr", MSC_ITM_ORD_TYP.WG_XFR.value());
			}

			// 「オーダ状況区分」条件の設定
			if (up0().opn_flg()) {
				up0().addStringColumn("wk_opn", MSC_ITM_ORD_STS_TYP.OPN.value());
			}
			if (up0().sav_flg()) {
				up0().addStringColumn("wk_sav", MSC_ITM_ORD_STS_TYP.SAV.value());
			}
			if (up0().fix_flg()) {
				up0().addStringColumn("wk_fix", MSC_ITM_ORD_STS_TYP.FIX.value());
			}
			if (up0().part_inst_flg()) {
				up0().addStringColumn("wk_part_inst", MSC_ITM_ORD_STS_TYP.PART_INST.value());
			}
			if (up0().inst_flg()) {
				up0().addStringColumn("wk_inst", MSC_ITM_ORD_STS_TYP.INST.value());
			}
			if (up0().cmpl_flg()) {
				up0().addStringColumn("wk_cmpl", MSC_ITM_ORD_STS_TYP.CMPL.value());
			}

			//「手配不許可」条件の設定
			if (up0().true_not_fix_flg() && !up0().false_not_fix_flg()) {
				up0().addStringColumn("wk_not_fix_flg", toTrueStr(true));
			}
			else if (!up0().true_not_fix_flg() && up0().false_not_fix_flg()) {
				up0().addStringColumn("wk_not_fix_flg", toFalseStr(false));
			}
			//「オーダ受信」条件の設定
			if (up0().ord_rcv_tgt_flg() && !up0().not_ord_rcv_tgt_flg()) {
				up0().addStringColumn("wk_ord_rcv_tgt_flg", toTrueStr(true));
			}
			else if (!up0().ord_rcv_tgt_flg() && up0().not_ord_rcv_tgt_flg()) {
				up0().addStringColumn("wk_ord_rcv_tgt_flg", toFalseStr(false));
			}
			// 「オーダ送信」条件の設定
			if (up0().ord_snd_tgt_flg() && !up0().not_ord_snd_tgt_flg()) {
				up0().addStringColumn("wk_ord_snd_tgt_flg", toTrueStr(true));
			}
			else if (!up0().ord_snd_tgt_flg() && up0().not_ord_snd_tgt_flg()) {
				up0().addStringColumn("wk_ord_snd_tgt_flg", toFalseStr(false));
			}
		}

		/** 品目オーダ情報を検索する */
		protected void srchItmOrd() {
			MCQueryPlan itmOrdSql = MSBCL0050_MST_ITM_ORDER_S01();
			searchForDL(itmOrdSql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			// editListMain()は複数回呼ばれる可能性がある
			super.editListMain();
			if(_operIdx == null){
				MCQueryPlan operOrdSql = MSBCL0050_MST_OPER_ORDER_S01();
				executeQuery(_operL, operOrdSql, up0());
				_operIdx = _operL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);	
			}
			for (Srch01_RsltR r : down0()) {
				editDown(r);
				calcContFctrQty(r);
			}

			//検査対象取得
			callInspSchdSrch01();

		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			if (_operAllIdx == null) {
				MCQueryPlan operOrdAllSql = MSBCL0050_MST_OPER_ORDER_S02();
				executeQuery(_operAllL, operOrdAllSql, down0());
				_operAllIdx = _operAllL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
				_operFrozenIdx = _operAllL.createIndex(MST_OPER_ORDER_R.$itm_ord_no,
						MST_OPER_ORDER_R.$scheduler_frozen_flg);
			}
			for (Srch01_RsltR r : down0()) {
				setItmOrderSchedulerFrozenFlg(r);
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
				down0().sort(Srch01_RsltR.$itm_ord_no);
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
		
		protected void setItmOrderSchedulerFrozenFlg(Srch01_RsltR r) {
			if (!r.for_scheduler_frozen_flg()) {
				return;
			}

			MCList<MST_OPER_ORDER_R> allOperL = _operAllL.subList(_operAllIdx,
					r.itm_ord_no());
			MCList<MST_OPER_ORDER_R> frozenOperL = _operAllL.subList(_operFrozenIdx,
					r.itm_ord_no(), true);
			int allOperListCnt = 0;
			int frozenOperListCnt = 0;
			
			if (!isNull(allOperL)) {
				allOperListCnt = allOperL.size();
			}
			
			if (!isNull(frozenOperL)) {
				frozenOperListCnt = frozenOperL.size();
			}
			
			if (allOperListCnt > 0 && allOperListCnt == frozenOperListCnt) {
				r.scheduler_frozen_flg(true);
			}
		}

		/** 工程保存を設定 */
		protected void editDown(Srch01_RsltR r) {
			if(MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())){
				MST_OPER_ORDER_R operR = _operL.getFirst(_operIdx, r.itm_ord_no());
				if (!isNull(operR)) {
					r.oper_sav_flg(!MAC_STR.isNULL_VAL(operR.oper_cd()));
				}
			}
		}

		/** 標準有効成分数量を算出する */
		protected void calcContFctrQty(Srch01_RsltR r) {
			if(r.cont_fctr_flg()) {
				r.cont_fctr_inst_qty(convToContFctrUnit(r.inst_qty(), r.std_cont_fctr(),
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
				r.cont_fctr_schd_yield(convToContFctrUnit(r.yield_schd_qty(),
						r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			}
		}
		/** 検査対象フラグの取得 */
		protected void callInspSchdSrch01() {
			MCList<Srch01_RsltR> inspL = down0().subList(r->isInspChk(r));
			if(inspL.isEmpty()){
				return;
			}

			setPegNo(inspL);
			MSBFL_InspSchdService.InspSchd_Srch01 ope = MSBFL_InspSchdService.crtInspSchd_Srch01();
			addAll(ope.up0(), inspL, createMap_InspSchd_Srch01_CndR_Srch01_RsltR());
			ope.exec();

			MCIndexKey idx = ope.down0().createIndex(InspSchd_Srch01_CndR.$peg_no);
			for (Srch01_RsltR r : inspL){
				InspSchd_Srch01_CndR chk = ope.down0().getFirst(idx, r.peg_no());
				if (chk != null){
					r.insp_flg(true);
				}
			}
		}

		protected boolean isInspChk(Srch01_RsltR r) {
			return MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ());
		}

		/** Srch01_HdrR → InspSchd_Srch01_CndR (Srch01 → InspSchd_Srch01) */
		protected Map_InspSchd_Srch01_CndR_Srch01_RsltR<InspSchd_Srch01_CndR, Srch01_RsltR> createMap_InspSchd_Srch01_CndR_Srch01_RsltR() {
			return new Map_InspSchd_Srch01_CndR_Srch01_RsltR<InspSchd_Srch01_CndR, Srch01_RsltR>();
		}

		/** Srch01_HdrR → InspSchd_Srch01_CndR (Srch01 → InspSchd_Srch01) */
		public class Map_InspSchd_Srch01_CndR_Srch01_RsltR<D extends InspSchd_Srch01_CndR, S extends Srch01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Srch01_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$mfg_loc_cd, Srch01_RsltR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Srch01_RsltR.$strg_loc_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$sppl_cd, Srch01_RsltR.$sppl_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, Srch01_RsltR.$maker_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Srch01_RsltR.$strg_schd_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				if (MSC_ITM_ORD_TYP.isMFG(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				}
				else if (MSC_ITM_ORD_TYP.isOUTSRC(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isPURC(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
				else if (MSC_ITM_ORD_TYP.isXFR(src.itm_ord_typ())
						|| MSC_ITM_ORD_TYP.isWG_XFR(src.itm_ord_typ())) {
					dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				}
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 * 
	 * 品目オーダの状況を更新するために、チェックを行う。
	 *
	 */
	public class Chk01 extends MSBCL_OrdSrch_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// オーダ状況更新前チェック呼び出し
				callOrdStsUpdChkSrv(notErrL);
			}

			setErrToRtnStsTyp();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				msgL.addAll(lockAndCheckBase(notErrL));
			}
			return msgL;
		}

		/** ロックの取得、更新カウンタチェック、更新前DACチェック */
		protected MCMessageList lockAndCheckBase(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			// ロック取得
			MCList<MST_ITM_ORDER_R> selectL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.itm_ord_no, t.strg_loc_cd, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.itm_ord_no);
			notErrL.sort(Chk01_DtlR.$itm_ord_no);
			dbSelectKeyForUpdateNoWait("MSBCL0050_MST_ITM_ORDER_S01", selectL, selectL_bldr, notErrL);

			// 更新カウンタチェック、更新前データDACチェック
			MCIndexKey idx = selectL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Chk01_DtlR r : notErrL) {
				MST_ITM_ORDER_R selectR = selectL.getFirst(idx, r.itm_ord_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$itm_order_upd_cntr, selectR));
				if (!isNull(selectR)) {
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_ITM_ORDER_R.$strg_loc_cd));
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			//更新だけなのでステータスでの絞り込みはしない
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				msgL.addAll(checkSub(notErrL));
			}
			return msgL;
		}

		protected MCMessageList checkSub(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			//場所は変更できないので更新後の値でのDACチェックはなし
			return msgL;
		}

		/** オーダ状況更新前チェックサービスを実行する */
		protected void callOrdStsUpdChkSrv(MCList<Chk01_DtlR> notErrL){
			// 品目オーダチェック（手配不可チェック、品目禁止チェック、スケジューラ排他チェック）
			// 出荷・供給依頼登録前チェックサービス
			MSBCL_OrdRegService.Ord_Chk02 ope = MSBCL_OrdRegService.crtOrd_Chk02();
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk01_DtlR());
			ope.exec();

			copyErrFlg(notErrL, ope.down0());
			MCJoinKey<MCList<Ord_Upd01_Dtl1R>> jk =
				notErrL.join(Chk01_DtlR.$peg_no , ope.down0() , Ord_Upd01_Dtl1R.$peg_no);
			join(notErrL, jk, createMap_Chk01_DtlR_Ord_Upd01_Dtl1R());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Chk01_DtlR → Ord_Upd01_Dtl1R (Chk01 → Ord_Chk02) */
		protected Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R,Chk01_DtlR> createMap_Ord_Upd01_Dtl1R_Chk01_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R, Chk01_DtlR>();
		}

		/** Chk01_DtlR → Ord_Upd01_Dtl1R (Chk01 → Ord_Chk02) */
		public class Map_Ord_Upd01_Dtl1R_Chk01_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk01_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk01_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$a_itm_ord_sts_typ, Chk01_DtlR.$a_itm_ord_sts_typ);
			}
		}

		/** Ord_Upd01_Dtl1R → Chk01_DtlR　(Ord_Chk02 → Chk01) */
		protected Map_Chk01_DtlR_Ord_Upd01_Dtl1R<Chk01_DtlR,Ord_Upd01_Dtl1R> createMap_Chk01_DtlR_Ord_Upd01_Dtl1R() {
			return new Map_Chk01_DtlR_Ord_Upd01_Dtl1R<Chk01_DtlR, Ord_Upd01_Dtl1R>();
		}

		/** Ord_Upd01_Dtl1R → Chk01_DtlR　(Ord_Chk02 → Chk01) */
		public class Map_Chk01_DtlR_Ord_Upd01_Dtl1R<D extends Chk01_DtlR, S extends Ord_Upd01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_DtlR.$b_itm_ord_sts_typ, Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ);
				addColumnPathMap(Chk01_DtlR.$ord, Ord_Upd01_Dtl1R.$ord);
				addColumnPathMap(Chk01_DtlR.$unit_cd, Ord_Upd01_Dtl1R.$unit_cd);
				addColumnPathMap(Chk01_DtlR.$mfg_sppl_cd, Ord_Upd01_Dtl1R.$mfg_sppl_cd);
				addColumnPathMap(Chk01_DtlR.$mfg_maker_cd, Ord_Upd01_Dtl1R.$mfg_maker_cd);
				addColumnPathMap(Chk01_DtlR.$strg_lg_grp_cd, Ord_Upd01_Dtl1R.$strg_lg_grp_cd);
				addColumnPathMap(Chk01_DtlR.$strg_sppl_cd, Ord_Upd01_Dtl1R.$strg_sppl_cd);
				addColumnPathMap(Chk01_DtlR.$rqst_to_lg_grp_cd, Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd);
				addColumnPathMap(Chk01_DtlR.$lot_mng_typ, Ord_Upd01_Dtl1R.$lot_mng_typ);
				addColumnPathMap(Chk01_DtlR.$sublot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 * 
	 * 品目オーダを訂正するために、チェックを行う。
	 *
	 */
	public class Chk02 extends MSBCL_OrdSrch_MC_A.Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// オーダ更新前チェック呼び出し
				callOrdUpdChkSrv(notErrL);
			}

			setErrToRtnStsTyp();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// ファイル取込（新規）時、チェック対象外。
			MCList<Chk02_DtlR> notErrL = getChkList(up0(), MCRow.MODIFY, MCRow.NONE);
			
			if (!notErrL.isEmpty()) {
				msgL.addAll(lockAndCheckBase(notErrL));
				msgL.addAll(chkOrderImport(notErrL));
				msgL.addAll(chkForSchedulerFrozen(notErrL));
			}
			return msgL;
		}

		protected MCMessageList chkOrderImport(MCList<Chk02_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk02_DtlR r : notErrL) {
				if (r.ord().ord_rcv_flg() && !r.ord().for_scheduler_frozen_flg()) {
					msgL.add(new MCMessage(r, null, MSBCL1315, r.itm_ord_no()));
					r.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		protected MCMessageList chkForSchedulerFrozen(MCList<Chk02_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk02_DtlR r : notErrL) {
				if (r.ord().for_scheduler_frozen_flg()) {
					msgL.add(new MCMessage(r, null, MSBCL1401, r.itm_ord_no()));
					r.err_flg(true);
				}
			}
			
			return msgL;
		}

		/** ロックの取得、更新カウンタチェック、更新前DACチェック、値の補完 */
		protected MCMessageList lockAndCheckBase(MCList<Chk02_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			// ロック取得
			MCList<MST_ITM_ORDER_R> selectL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.itm_ord_no);
			notErrL.sort(Chk02_DtlR.$itm_ord_no);
			dbSelectKeyForUpdateNoWait("MSBCL0050_MST_ITM_ORDER_S02", selectL, selectL_bldr, notErrL);

			MCIndexKey idx = selectL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Chk02_DtlR r : notErrL) {
				MST_ITM_ORDER_R selectR = selectL.getFirst(idx, r.itm_ord_no());
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$itm_order_upd_cntr, selectR));

				if(selectR != null){
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_ITM_ORDER_R.$strg_loc_cd));

					// 値の補完
					selectR.itm_ord_no(r.itm_ord_no());
					selectR.inst_qty(r.inst_qty());
					selectR.yield_schd_qty(r.yield_schd_qty());
					selectR.po_schd_dt(r.po_schd_dt());
					selectR.mfg_st_schd_dt(r.mfg_st_schd_dt());
					selectR.mfg_end_schd_dt(r.mfg_end_schd_dt());
					selectR.gi_schd_dt(r.gi_schd_dt());
					selectR.strg_schd_dt(r.strg_schd_dt());
					selectR.accpt_schd_dt(r.accpt_schd_dt());
					selectR.insp_st_schd_dt(r.insp_st_schd_dt());
					selectR.insp_end_schd_dt(r.insp_end_schd_dt());
					selectR.avl_schd_dt(r.avl_schd_dt());
					selectR.inst_po_cnt_rmrks(r.inst_po_cnt_rmrks());
					selectR.intr_rmrks(r.intr_rmrks());
					selectR.sub_char1(r.sub_char1());
					selectR.sub_char2(r.sub_char2());
					selectR.sub_char3(r.sub_char3());
					selectR.itm_ord_sts_typ(r.itm_ord_sts_typ());
					selectR.strg_loc_cd(r.strg_loc_cd());
					selectR.itm_ord_typ(r.itm_ord_typ());
					selectR.mfg_loc_cd(r.mfg_loc_cd());
					selectR.bom_ptn(r.bom_ptn());
					selectR.sppl_cd(r.sppl_cd());
					selectR.maker_cd(r.maker_cd());
					selectR.rqst_loc_cd(r.rqst_loc_cd());
					selectR.oper_ptn(r.oper_ptn());

					r.ord(selectR);
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			//更新だけなのでステータスでの絞り込みはしない
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				msgL.addAll(checkSub(notErrL));
			}
			return msgL;
		}

		protected MCMessageList checkSub(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			//場所は変更できないので更新後の値でのDACチェックはなし
			return msgL;
		}

		/** オーダ更新前チェックサービスを実行する */
		protected void callOrdUpdChkSrv(MCList<Chk02_DtlR> notErrL){
			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk02_DtlR());
			ope.exec();

			copyErrFlg(notErrL, ope.down0());
			String[] dest = new String[]{Chk02_DtlR.$strg_sppl_cd, Chk02_DtlR.$unit_cd,
											Chk02_DtlR.$lot_mng_typ, Chk02_DtlR.$sublot_mng_typ,Chk02_DtlR.$ord_fix_pd, Chk02_DtlR.$purc_lt, Chk02_DtlR.$mfg_lt};
			String[] src = new String[]{Ord_Upd01_Dtl1R.$strg_sppl_cd, Ord_Upd01_Dtl1R.$unit_cd,
											Ord_Upd01_Dtl1R.$lot_mng_typ, Ord_Upd01_Dtl1R.$sublot_mng_typ, Ord_Upd01_Dtl1R.$ord_fix_pd, Ord_Upd01_Dtl1R.$purc_lt, Ord_Upd01_Dtl1R.$mfg_lt};
			copyByPegNo(notErrL, dest,  ope.down0(), src);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Chk02_DtlR → Ord_Upd01_Dtl1R (Chk02 → Ord_Chk01) */
		protected Map_Ord_Upd01_Dtl1R_Chk02_DtlR<Ord_Upd01_Dtl1R,Chk02_DtlR> createMap_Ord_Upd01_Dtl1R_Chk02_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Chk02_DtlR<Ord_Upd01_Dtl1R, Chk02_DtlR>();
		}

		/** Chk02_DtlR → Ord_Upd01_Dtl1R (Chk02 → Ord_Chk01) */
		public class Map_Ord_Upd01_Dtl1R_Chk02_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk02_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Chk02_DtlR.$ord);
			}
			
			@Override
			protected void valueCopy(D dest, S src){
				dest.oper_ord_pr_flg(true);
			}
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 * 
	 * 品目オーダを取り消すために、チェックを行う。
	 *
	 */
	public class Chk03 extends MSBCL_OrdSrch_MC_A.Chk03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk03_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// オーダ更新前チェック呼び出し
				callOrdUpdChkSrv(notErrL);
			}

			setErrToRtnStsTyp();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			MCList<Chk03_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				msgL.addAll(lockAndCheckBase(notErrL));
			}
			return msgL;
		}

		/** ロックの取得および更新カウンタチェック */
		protected MCMessageList lockAndCheckBase(MCList<Chk03_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			// ロック取得
			MCList<MST_ITM_ORDER_R> selectL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.itm_ord_no, t.strg_loc_cd, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.itm_ord_no);
			notErrL.sort(Chk03_DtlR.$itm_ord_no);
			dbSelectKeyForUpdateNoWait("MSBCL0050_MST_ITM_ORDER_S03", selectL, selectL_bldr, notErrL);

			// 更新カウンタチェック
			MCIndexKey idx = selectL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Chk03_DtlR r : notErrL) {
				MST_ITM_ORDER_R selectR = selectL.getFirst(idx, r.itm_ord_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_DtlR.$itm_order_upd_cntr, selectR));
				if (!isNull(selectR)) {
					selectR.setAttributes(r);
					msgL.addAll(checkWritableLocCdDac(selectR, MST_ITM_ORDER_R.$strg_loc_cd));
				}
			}

			return msgL;
		}

		/** オーダ更新前チェックサービスを実行する */
		protected void callOrdUpdChkSrv(MCList<Chk03_DtlR> notErrL){
			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();	
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk03_DtlR());
			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Chk03_DtlR → Ord_Upd01_Dtl1R (Chk03 → Ord_Chk01) */
		protected Map_Ord_Upd01_Dtl1R_Chk03_DtlR<Ord_Upd01_Dtl1R,Chk03_DtlR> createMap_Ord_Upd01_Dtl1R_Chk03_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Chk03_DtlR<Ord_Upd01_Dtl1R, Chk03_DtlR>();
		}

		/** Chk03_DtlR → Ord_Upd01_Dtl1R (Chk03 → Ord_Chk01) */
		public class Map_Ord_Upd01_Dtl1R_Chk03_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk03_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk03_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk03_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, Chk03_DtlR.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, Chk03_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, Chk03_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, Chk03_DtlR.$itm_sub3);
			}
		}
	}

	/**
	 * Chk04オペレーション.<p>
	 * 
	 * ファイルから品目オーダを取り込むために、チェックを行う。
	 *
	 */
	public class Chk04 extends MSBCL_OrdSrch_MC_A.Chk04 {
		/** 品目オーダ情報のキャッシュ */
		protected MCList<MST_ITM_ORDER_R> _cacheItmOrdL = null;
		
		/** インデックス */
		protected MCIndexKey _idxItmOrdCache = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk04_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				// オーダ取込チェックサービス呼び出し
				callOrdRegImpSrv(notErrL);
			}

			setErrToRtnStsTyp();

			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk04_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				msgL.addAll(checkSub(notErrL));
			}
			return msgL;
		}
		
		protected MCMessageList checkSub(MCList<Chk04_DtlR> notErrL) {
			createItmOrdCache();
			
			MCMessageList msgL = new MCMessageList();
			for (Chk04_DtlR r : notErrL){
				msgL.addAll(checkWritableLocCdDac(r, Chk04_DtlR.$strg_loc_cd));
				if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()) || MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())) {
					r.mfg_loc_cd(nullValToNull(r.mfg_loc_cd()));
					msgL.addAll(check(r, Chk04_DtlR.$mfg_loc_cd, new FXUCL_RequiredValidater()));
				}
				else if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ()) || MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())) {
					msgL.addAll(check(r, Chk04_DtlR.$rqst_loc_cd, new FXUCL_RequiredValidater()));
				}
				else if (MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())) {
					msgL.addAll(check(r, Chk04_DtlR.$sppl_cd, new FXUCL_RequiredValidater()));
				}
				msgL.addAll(check(r, new String[] {Chk04_DtlR.$inst_qty, Chk04_DtlR.$yield_schd_qty}, new FXUCL_AtLeastOneValidater()));

				if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()) && !isNull(r.strg_sppl_cd())) {
					msgL.add(new MCMessage(r, Chk04_DtlR.$strg_loc_cd, MSBCL1206, toDispGUIIndex(r)));
				}
				if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()) && !isNull(r.mfg_sppl_cd())) {
					msgL.add(new MCMessage(r, Chk04_DtlR.$mfg_loc_cd, MSBCL1208, toDispGUIIndex(r)));
				}
				if (MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ()) && isNull(r.mfg_sppl_cd())) {
					msgL.add(new MCMessage(r, Chk04_DtlR.$mfg_loc_cd, MSBCL1209, toDispGUIIndex(r)));
				}
				if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ()) && (!isNullOrNullVal(r.sppl_cd()) || !isNullOrNullVal(r.mfg_loc_cd()))) {
					msgL.add(new MCMessage(r, Chk04_DtlR.$rqst_loc_cd, MSBCL1210, toDispGUIIndex(r)));
				}
				if (!isNull(r.itm_ord_no())) {
					MST_ITM_ORDER_R itmOrdR = _cacheItmOrdL.getFirst(_idxItmOrdCache, r.itm_ord_no());
					if (isNull(itmOrdR)) {
						msgL.add(new MCMessage(r, null, MSBCL1403, r.itm_ord_no()));
					}
					else {
						r.ord().upd_cntr(itmOrdR.upd_cntr());
					}
				}
			}
			return msgL;
		}
		
		protected void createItmOrdCache() {
			_cacheItmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R itmOrdR = MST_ITM_ORDER_R.create("ITMORD");
			MCQueryApiBuilder cacheItmOrdL_bldr = MCQueryApiBuilder.create(itmOrdR);
			cacheItmOrdL_bldr.setSelect(itmOrdR.itm_ord_no, itmOrdR.upd_cntr);
			cacheItmOrdL_bldr.setWhere(itmOrdR.itm_ord_no.eq(bind("itm_ord_no")));
			dbSelectKey("MSBCL0050_MST_ITM_ORDER_S04", _cacheItmOrdL, cacheItmOrdL_bldr, up0());
			
			_idxItmOrdCache = _cacheItmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
		}
		
		/**
		 * ファイル入力サービス
		 */
		protected void callOrdRegImpSrv(MCList<Chk04_DtlR> notErrL) {
			MSBCL_OrdRegService.Ord_Imp01 ope = MSBCL_OrdRegService.crtOrd_Imp01();
			addAll(ope.up0(), notErrL, createMap_Ord_Imp01_DtlR_Chk04_DtlR());
			ope.exec();

			copyErrFlg(notErrL, ope.down0());
			MCJoinKey<MCList<Ord_Imp01_DtlR>> jk = notErrL.join(Chk04_DtlR.$peg_no, ope.down0(), Ord_Imp01_DtlR.$peg_no);
			join(notErrL, jk, createMap_Chk04_DtlR_Ord_Imp01_DtlR());
		}

		/**
		 * 下り電文を設定
		 */
		protected void setDown(){
			down0().setAll(up0());
		}

		/** Chk04_DtlR → Ord_Imp01_DtlR (Chk04 → Ord_Imp01) */
		protected Map_Ord_Imp01_DtlR_Chk04_DtlR<Ord_Imp01_DtlR, Chk04_DtlR> createMap_Ord_Imp01_DtlR_Chk04_DtlR() {
			return new Map_Ord_Imp01_DtlR_Chk04_DtlR<Ord_Imp01_DtlR, Chk04_DtlR>();
		}

		/** Chk04_DtlR → Ord_Imp01_DtlR (Chk04 → Ord_Imp01) */
		public class Map_Ord_Imp01_DtlR_Chk04_DtlR<D extends Ord_Imp01_DtlR, S extends Chk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Imp01_DtlR.$peg_no, Chk04_DtlR.$peg_no);
				addColumnPathMap(Ord_Imp01_DtlR.$data_crud_typ, Chk04_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Imp01_DtlR.$mrp_typ, Chk04_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_ord_typ, Chk04_DtlR.$itm_ord_typ);
				addColumnPathMap(Ord_Imp01_DtlR.$ord_gnrt_typ, Chk04_DtlR.$ord_gnrt_typ);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_cd, Chk04_DtlR.$itm_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_sub1, Chk04_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_sub2, Chk04_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_sub3, Chk04_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Imp01_DtlR.$ver_no, Chk04_DtlR.$ver_no);
				addColumnPathMap(Ord_Imp01_DtlR.$strg_loc_cd, Chk04_DtlR.$strg_loc_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$mfg_loc_cd, Chk04_DtlR.$mfg_loc_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$sppl_cd, Chk04_DtlR.$sppl_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$maker_cd, Chk04_DtlR.$maker_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$rqst_loc_cd, Chk04_DtlR.$rqst_loc_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$rqst_wg_cd, Chk04_DtlR.$rqst_wg_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$bom_ptn, Chk04_DtlR.$bom_ptn);
				addColumnPathMap(Ord_Imp01_DtlR.$oper_ptn, Chk04_DtlR.$oper_ptn);
				addColumnPathMap(Ord_Imp01_DtlR.$yield_schd_qty, Chk04_DtlR.$yield_schd_qty);
				addColumnPathMap(Ord_Imp01_DtlR.$inst_qty, Chk04_DtlR.$inst_qty);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_ord_sts_typ, Chk04_DtlR.$itm_ord_sts_typ);
				addColumnPathMap(Ord_Imp01_DtlR.$po_schd_dt, Chk04_DtlR.$po_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$mfg_st_schd_dt, Chk04_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$mfg_end_schd_dt, Chk04_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$gi_schd_dt, Chk04_DtlR.$gi_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$strg_schd_dt, Chk04_DtlR.$strg_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$accpt_schd_dt, Chk04_DtlR.$accpt_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$insp_st_schd_dt, Chk04_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$insp_end_schd_dt, Chk04_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$avl_schd_dt, Chk04_DtlR.$avl_schd_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$master_dt, Chk04_DtlR.$master_dt);
				addColumnPathMap(Ord_Imp01_DtlR.$sno1, Chk04_DtlR.$sno1);
				addColumnPathMap(Ord_Imp01_DtlR.$sno2, Chk04_DtlR.$sno2);
				addColumnPathMap(Ord_Imp01_DtlR.$sno3, Chk04_DtlR.$sno3);
				addColumnPathMap(Ord_Imp01_DtlR.$sno4, Chk04_DtlR.$sno4);
				addColumnPathMap(Ord_Imp01_DtlR.$inst_po_cnt_rmrks, Chk04_DtlR.$inst_po_cnt_rmrks);
				addColumnPathMap(Ord_Imp01_DtlR.$intr_rmrks, Chk04_DtlR.$intr_rmrks);
				addColumnPathMap(Ord_Imp01_DtlR.$sub_char1, Chk04_DtlR.$sub_char1);
				addColumnPathMap(Ord_Imp01_DtlR.$sub_char2, Chk04_DtlR.$sub_char2);
				addColumnPathMap(Ord_Imp01_DtlR.$sub_char3, Chk04_DtlR.$sub_char3);
				addColumnPathMap(Ord_Imp01_DtlR.$wrk_no, Chk04_DtlR.$wrk_no);
				addColumnPathMap(Ord_Imp01_DtlR.$wrk_nm, Chk04_DtlR.$wrk_nm);
				addColumnPathMap(Ord_Imp01_DtlR.$cont_fctr_inst_qty, Chk04_DtlR.$cont_fctr_inst_qty);
				addColumnPathMap(Ord_Imp01_DtlR.$cont_fctr_schd_yield, Chk04_DtlR.$cont_fctr_schd_yield);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_typ, Chk04_DtlR.$itm_typ);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_typ_d_cd, Chk04_DtlR.$itm_typ_d_cd);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_typ_d_nm, Chk04_DtlR.$itm_typ_d_nm);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_ord_no, Chk04_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Imp01_DtlR.$itm_ord_sts_typ, Chk04_DtlR.$itm_ord_sts_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.setBooleanNE(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, src.getBooleanNE(Ord_Upd01_Dtl1R.$oper_ord_pr_flg));
				dest.setBooleanNE(Ord_Upd01_Dtl1R.$io_schd_pr_flg, src.getBooleanNE(Ord_Upd01_Dtl1R.$io_schd_pr_flg));
			}
		}

		/** Ord_Imp01_DtlR → Chk04_DtlR (Ord_Imp01 → Chk04) */
		protected Map_Chk04_DtlR_Ord_Imp01_DtlR<Chk04_DtlR,Ord_Imp01_DtlR> createMap_Chk04_DtlR_Ord_Imp01_DtlR() {
			return new Map_Chk04_DtlR_Ord_Imp01_DtlR<Chk04_DtlR, Ord_Imp01_DtlR>();
		}

		/** Ord_Imp01_DtlR → Chk04_DtlR (Ord_Imp01 → Chk04) */
		public class Map_Chk04_DtlR_Ord_Imp01_DtlR<D extends Chk04_DtlR, S extends Ord_Imp01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk04_DtlR.$rqst_wg_cd, Ord_Imp01_DtlR.$rqst_wg_cd);
				addColumnPathMap(Chk04_DtlR.$bom_ptn, Ord_Imp01_DtlR.$bom_ptn);
				addColumnPathMap(Chk04_DtlR.$oper_ptn, Ord_Imp01_DtlR.$oper_ptn);
				addColumnPathMap(Chk04_DtlR.$inst_qty, Ord_Imp01_DtlR.$inst_qty);
				addColumnPathMap(Chk04_DtlR.$yield_schd_qty, Ord_Imp01_DtlR.$yield_schd_qty);
				addColumnPathMap(Chk04_DtlR.$nmr_qty, Ord_Imp01_DtlR.$nmr_qty);
				addColumnPathMap(Chk04_DtlR.$dnm_qty, Ord_Imp01_DtlR.$dnm_qty);
				addColumnPathMap(Chk04_DtlR.$fxd_yield_qty, Ord_Imp01_DtlR.$fxd_yield_qty);
				addColumnPathMap(Chk04_DtlR.$po_schd_dt, Ord_Imp01_DtlR.$po_schd_dt);
				addColumnPathMap(Chk04_DtlR.$purc_lt, Ord_Imp01_DtlR.$purc_lt);
				addColumnPathMap(Chk04_DtlR.$mfg_st_schd_dt, Ord_Imp01_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Chk04_DtlR.$mfg_end_schd_dt, Ord_Imp01_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Chk04_DtlR.$mfg_lt, Ord_Imp01_DtlR.$mfg_lt);
				addColumnPathMap(Chk04_DtlR.$gi_schd_dt, Ord_Imp01_DtlR.$gi_schd_dt);
				addColumnPathMap(Chk04_DtlR.$strg_schd_dt, Ord_Imp01_DtlR.$strg_schd_dt);
				addColumnPathMap(Chk04_DtlR.$xfr_lt, Ord_Imp01_DtlR.$xfr_lt);
				addColumnPathMap(Chk04_DtlR.$accpt_schd_dt, Ord_Imp01_DtlR.$accpt_schd_dt);
				addColumnPathMap(Chk04_DtlR.$accpt_insp_lt, Ord_Imp01_DtlR.$accpt_insp_lt);
				addColumnPathMap(Chk04_DtlR.$insp_st_schd_dt, Ord_Imp01_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Chk04_DtlR.$insp_end_schd_dt, Ord_Imp01_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Chk04_DtlR.$insp_lt, Ord_Imp01_DtlR.$insp_lt);
				addColumnPathMap(Chk04_DtlR.$insp_offst, Ord_Imp01_DtlR.$insp_offst);
				addColumnPathMap(Chk04_DtlR.$avl_schd_dt, Ord_Imp01_DtlR.$avl_schd_dt);
				addColumnPathMap(Chk04_DtlR.$wg_cd, Ord_Imp01_DtlR.$wg_cd);
				addColumnPathMap(Chk04_DtlR.$not_fix_flg, Ord_Imp01_DtlR.$not_fix_flg);
				addColumnPathMap(Chk04_DtlR.$unit_cd, Ord_Imp01_DtlR.$unit_cd);
				
				addColumnPathMap(Chk04_DtlR.$itm_nm, Ord_Imp01_DtlR.$itm_nm);
				addColumnPathMap(Chk04_DtlR.$unit_nm, Ord_Imp01_DtlR.$unit_nm);
				addColumnPathMap(Chk04_DtlR.$cont_fctr_flg, Ord_Imp01_DtlR.$cont_fctr_flg);
				addColumnPathMap(Chk04_DtlR.$cont_fctr_unit_cd, Ord_Imp01_DtlR.$cont_fctr_unit_cd);
				addColumnPathMap(Chk04_DtlR.$cont_fctr_unit_nm, Ord_Imp01_DtlR.$cont_fctr_unit_nm);
				addColumnPathMap(Chk04_DtlR.$std_cont_fctr, Ord_Imp01_DtlR.$std_cont_fctr);
				addColumnPathMap(Chk04_DtlR.$strg_site_cd, Ord_Imp01_DtlR.$strg_site_cd);
				addColumnPathMap(Chk04_DtlR.$strg_site_nm, Ord_Imp01_DtlR.$strg_site_nm);
				addColumnPathMap(Chk04_DtlR.$strg_loc_grp_cd, Ord_Imp01_DtlR.$strg_loc_grp_cd);
				addColumnPathMap(Chk04_DtlR.$strg_loc_grp_nm, Ord_Imp01_DtlR.$strg_loc_grp_nm);
				addColumnPathMap(Chk04_DtlR.$strg_lg_grp_cd, Ord_Imp01_DtlR.$strg_lg_grp_cd);
				addColumnPathMap(Chk04_DtlR.$strg_lg_grp_nm, Ord_Imp01_DtlR.$strg_lg_grp_nm);
				addColumnPathMap(Chk04_DtlR.$strg_alloc_grp_cd, Ord_Imp01_DtlR.$strg_alloc_grp_cd);
				addColumnPathMap(Chk04_DtlR.$strg_alloc_grp_nm, Ord_Imp01_DtlR.$strg_alloc_grp_nm);
				addColumnPathMap(Chk04_DtlR.$strg_loc_nm, Ord_Imp01_DtlR.$strg_loc_nm);
				addColumnPathMap(Chk04_DtlR.$mfg_site_cd, Ord_Imp01_DtlR.$mfg_site_cd);
				addColumnPathMap(Chk04_DtlR.$mfg_site_nm, Ord_Imp01_DtlR.$mfg_site_nm);
				addColumnPathMap(Chk04_DtlR.$mfg_loc_grp_cd, Ord_Imp01_DtlR.$mfg_loc_grp_cd);
				addColumnPathMap(Chk04_DtlR.$mfg_loc_grp_nm, Ord_Imp01_DtlR.$mfg_loc_grp_nm);
				addColumnPathMap(Chk04_DtlR.$mfg_loc_nm, Ord_Imp01_DtlR.$mfg_loc_nm);
				addColumnPathMap(Chk04_DtlR.$sppl_nm, Ord_Imp01_DtlR.$sppl_nm);
				addColumnPathMap(Chk04_DtlR.$maker_nm, Ord_Imp01_DtlR.$maker_nm);
				addColumnPathMap(Chk04_DtlR.$rqst_site_cd, Ord_Imp01_DtlR.$rqst_site_cd);
				addColumnPathMap(Chk04_DtlR.$rqst_site_nm, Ord_Imp01_DtlR.$rqst_site_nm);
				addColumnPathMap(Chk04_DtlR.$rqst_loc_grp_cd, Ord_Imp01_DtlR.$rqst_loc_grp_cd);
				addColumnPathMap(Chk04_DtlR.$rqst_loc_grp_nm, Ord_Imp01_DtlR.$rqst_loc_grp_nm);
				addColumnPathMap(Chk04_DtlR.$rqst_loc_nm, Ord_Imp01_DtlR.$rqst_loc_nm);
				addColumnPathMap(Chk04_DtlR.$rqst_wg_nm, Ord_Imp01_DtlR.$rqst_wg_nm);
				addColumnPathMap(Chk04_DtlR.$wg_nm, Ord_Imp01_DtlR.$wg_nm);
				addColumnPathMap(Chk04_DtlR.$ver_no, Ord_Imp01_DtlR.$ver_no);
				addColumnPathMap(Chk04_DtlR.$wrk_no, Ord_Imp01_DtlR.$wrk_no);
				addColumnPathMap(Chk04_DtlR.$wrk_nm, Ord_Imp01_DtlR.$wrk_nm);
				addColumnPathMap(Chk04_DtlR.$itm_typ, Ord_Imp01_DtlR.$itm_typ);
				addColumnPathMap(Chk04_DtlR.$itm_typ_d_cd, Ord_Imp01_DtlR.$itm_typ_d_cd);
				addColumnPathMap(Chk04_DtlR.$itm_typ_d_nm, Ord_Imp01_DtlR.$itm_typ_d_nm);
				addColumnPathMap(Chk04_DtlR.$cont_fctr_inst_qty, Ord_Imp01_DtlR.$cont_fctr_inst_qty);
				addColumnPathMap(Chk04_DtlR.$cont_fctr_schd_yield, Ord_Imp01_DtlR.$cont_fctr_schd_yield);
			}
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 * 
	 * ファイルから品目オーダを取り込むために、チェックを行う。
	 *
	 */
	public class Imp01 extends MSBCL_OrdSrch_MC_A.Imp01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt(){
			editUp();
			callThisChk04();
			setDown();
		}

		protected void editUp() {
			setPegNo(Chk04_DtlR.$peg_no, up0());
			up0().setStringNE(Chk04_DtlR.$mrp_typ, MSC_MRP_TYP.MRP.value());
			up0().setStringNE(Chk04_DtlR.$ord_gnrt_typ, MSC_ORD_GNRT_TYP.MNL.value());
			
			for (Chk04_DtlR r : up0()) {
				if (isNull(r.itm_ord_no())) {
					r.setStringNE(Chk04_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
					r.setStringNE(Chk04_DtlR.$mrp_typ, MSC_MRP_TYP.MRP.value());
					r.setStringNE(Chk04_DtlR.$ord_gnrt_typ, MSC_ORD_GNRT_TYP.MNL.value());
					r.setStringNE(Chk04_DtlR.$itm_ord_sts_typ, MSC_ITM_ORD_STS_TYP.SAV.value());
					r.setStringNE(Chk04_DtlR.$rqst_wg_cd, null);
					r.setStatus(MCRow.CREATE);
				}
				else {
					r.setStringNE(Chk04_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
					r.setStatus(MCRow.MODIFY);

					if (MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())) {
						r.setBooleanNE(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, true);
						r.setBooleanNE(Ord_Upd01_Dtl1R.$io_schd_pr_flg, true);
					}
					else if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ()) && isSame(r.oper_ptn(), NULL_VAL) ){
						r.setBooleanNE(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, true);
					}
				}
			}
		}		

		protected void callThisChk04() {
			MCList<Chk04_DtlR> org = up0().clone();
			MSBCL_OrdSrch.Chk04 ope = MSBCL_OrdSrch.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			setAvlSchdDtOnlyInput(org, ope.down0());
			up0().setAll(ope.down0());
		}

		protected void setAvlSchdDtOnlyInput(MCList<Chk04_DtlR> org, MCList<Chk04_DtlR> down04DtlRL) {
			MCIndexKey idxDown04 = down04DtlRL.createIndex(Chk04_DtlR.$peg_no);
			
			for (Chk04_DtlR dtlR : org) {
				if (MSC_ITM_ORD_TYP.isOUTSRC(dtlR.itm_ord_typ())
						&& isNull(dtlR.po_schd_dt()) && isNull(dtlR.mfg_st_schd_dt()) && isNull(dtlR.mfg_st_schd_dt())
						&& isNull(dtlR.gi_schd_dt()) && isNull(dtlR.strg_schd_dt()) && isNull(dtlR.accpt_schd_dt())
						&& isNull(dtlR.insp_st_schd_dt()) && isNull(dtlR.insp_end_schd_dt()) && !isNull(dtlR.avl_schd_dt())) {
					Chk04_DtlR down04DtlR = down04DtlRL.getFirst(idxDown04, dtlR.peg_no());
					down04DtlR.avl_schd_dt(dtlR.avl_schd_dt());
				}
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 * 
	 * 品目オーダ状況を保存に更新する。
	 *
	 */
	public class Upd01 extends MSBCL_OrdSrch_MC_A.Upd01 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getSplitRowCountCmn(up0());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown(up0(), down0());
			}
		}

		@Override
		protected void doIt() {
			// 未確定　⇒　保存
			doOrdStsUpdCmn(up0(), MSC_ITM_ORD_STS_TYP.SAV.value(), down0());
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 品目オーダ状況を確定に更新する。
	 * 
	 */
	public class Upd02 extends MSBCL_OrdSrch_MC_A.Upd02 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getSplitRowCountCmn(up0());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown(up0(), down0());
			}
		}

		@Override
		protected void doIt() {
			// 未確定、保存　⇒　確定
			doOrdStsUpdCmn(up0(), MSC_ITM_ORD_STS_TYP.FIX.value(), down0());
		}
	}

	/**
	 * Upd03オペレーション.<p>
	 * 
	 * 品目オーダ状況を保存に取り消す。
	 *
	 */
	public class Upd03 extends MSBCL_OrdSrch_MC_A.Upd03 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getSplitRowCountCmn(up0());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown(up0(), down0());
			}
		}

		@Override
		protected void doIt() {
			// 確定　⇒　保存
			doOrdStsUpdCmn(up0(), MSC_ITM_ORD_STS_TYP.SAV.value(), down0());
		}
	}

	/**
	 * Upd04オペレーション.<p>
	 * 
	 * 品目オーダ状況を未確定に取り消す。
	 *
	 */
	public class Upd04 extends MSBCL_OrdSrch_MC_A.Upd04 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getSplitRowCountCmn(up0());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown(up0(), down0());
			}
		}

		@Override
		protected void doIt() {
			// 保存、確定　⇒　未確定
			doOrdStsUpdCmn(up0(), MSC_ITM_ORD_STS_TYP.OPN.value(), down0());
		}
	}

	/**
	 * Upd05オペレーション.<p>
	 * 
	 * 品目オーダを訂正する。
	 *
	 */
	public class Upd05 extends MSBCL_OrdSrch_MC_A.Upd05 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			// 登り電文編集
			editUp();

			// オーダ更新前チェック処理
			callThisChk02();

			MCList<Chk02_DtlR> notErrL = up0().subList(Chk02_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				// オーダ更新サービス実行
				callOrdUpdSrv(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_DtlR.$peg_no, up0());
			up0().setString(Chk02_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			up0().setString(Chk02_DtlR.$mrp_typ, MSC_MRP_TYP.MRP.value());
		}

		/**
		 * オーダ更新時のチェック処理
		 */
		protected void callThisChk02() {
			MSBCL_OrdSrch.Chk02 ope = MSBCL_OrdSrch.crtChk02();
			ope.up0().setAll(up0());	
			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * オーダ更新サービスを実行する
		 * 
		 * @param notErrL
		 */
		protected void callOrdUpdSrv(MCList<Chk02_DtlR> notErrL) {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk02_DtlR());
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 正常終了したスレッドの後処理 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk02_DtlR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk02_DtlR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/** Chk01_DtlR → Ord_Upd01_Dtl1R (Upd05 → Ord_Upd01) */
		protected Map_Ord_Upd01_Dtl1R_Chk02_DtlR<Ord_Upd01_Dtl1R,Chk02_DtlR> createMap_Ord_Upd01_Dtl1R_Chk02_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Chk02_DtlR<Ord_Upd01_Dtl1R, Chk02_DtlR>();
		}

		/** Chk01_DtlR → Ord_Upd01_Dtl1R (Upd05 → Ord_Upd01) */
		public class Map_Ord_Upd01_Dtl1R_Chk02_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk02_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Chk02_DtlR.$ord);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk02_DtlR.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd, Chk02_DtlR.$strg_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd, Chk02_DtlR.$strg_sppl_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd, Chk02_DtlR.$rqst_to_lg_grp_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk02_DtlR.$lot_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk02_DtlR.$sublot_mng_typ);
			}

			@Override
			protected void valueCopy(D dest, S src){
				dest.oper_ord_pr_flg(true);
				dest.io_schd_pr_flg(true);
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 * 
	 * ファイルから取り込んだ品目オーダを登録する。
	 *
	 */
	public class Ins01 extends MSBCL_OrdSrch_MC_A.Ins01 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt(){
			// 登り電文編集
			editUp();

			callThisChk02();

			MCList<Chk04_DtlR> notErrL = up0().subList(Chk04_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				callOrdUpdSrv(notErrL);
			}
		}

		/** 上り電文の編集 */
		protected void editUp() {
			setPegNo(Chk04_DtlR.$peg_no, up0());
			
			for (Chk04_DtlR r : up0()) {
				if (isNull(r.itm_ord_no())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
			
			up0().setStringNE(Chk04_DtlR.$mrp_typ, MSC_MRP_TYP.MRP.value());
		}

		/** オーダ更新サービスを実行する */
		protected void callOrdUpdSrv(MCList<Chk04_DtlR> notErrL) {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk04_DtlR());
			ope.exec();
			copyByPegNo(up0(), new String[]{Chk04_DtlR.$itm_ord_no},
					ope.down0(), new String[]{Ord_Upd01_Rslt1R.$itm_ord_no});
		}

		/** 下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 正常終了したスレッドの後処理 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk04_DtlR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk04_DtlR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * オーダ更新時のチェック処理
		 */
		protected void callThisChk02() {
			MSBCL_OrdSrch.Chk02 ope = MSBCL_OrdSrch.crtChk02();
			addAll(ope.up0(), up0(), createMap_Chk02_DtlR_Chk04_DtlR());
			ope.exec();

			copyErrFlg(up0(), ope.down0());
			String[] dest = new String[]{Chk04_DtlR.$lot_mng_typ, Chk04_DtlR.$sublot_mng_typ, Chk04_DtlR.$rtn_sts_typ, Chk04_DtlR.$ord_fix_pd, Chk04_DtlR.$rqmt_no};
			String[] src = new String[]{Chk02_DtlR.$lot_mng_typ, Chk02_DtlR.$sublot_mng_typ, Chk02_DtlR.$rtn_sts_typ,Chk02_DtlR.$ord_fix_pd, Chk02_DtlR.$rqmt_no};
			copyByPegNo(up0(), dest,  ope.down0(), src);
		}

		/** Chk02_DtlR → Ord_Upd01_Dtl1R (Ins01 → Ord_Upd01) */
		protected Map_Ord_Upd01_Dtl1R_Chk04_DtlR<Ord_Upd01_Dtl1R,Chk04_DtlR> createMap_Ord_Upd01_Dtl1R_Chk04_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Chk04_DtlR<Ord_Upd01_Dtl1R, Chk04_DtlR>();
		}

		/** Chk02_DtlR → Ord_Upd01_Dtl1R (Ins01 → Ord_Upd01) */
		public class Map_Ord_Upd01_Dtl1R_Chk04_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk04_DtlR> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk04_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk04_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk04_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Chk04_DtlR.$ord);
				addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk04_DtlR.$unit_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk04_DtlR.$lot_mng_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk04_DtlR.$sublot_mng_typ);
			}

			@Override
			protected void valueCopy(D dest, S src){
				dest.oper_ord_pr_flg(true);
				dest.io_schd_pr_flg(true);
			}
		}
		
		protected Map_Chk02_DtlR_Chk04_DtlR<Chk02_DtlR,Chk04_DtlR> createMap_Chk02_DtlR_Chk04_DtlR() {
			return new Map_Chk02_DtlR_Chk04_DtlR<Chk02_DtlR, Chk04_DtlR>();
		}

		public class Map_Chk02_DtlR_Chk04_DtlR<D extends Chk02_DtlR, S extends Chk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$peg_no, Chk04_DtlR.$peg_no);
				addColumnPathMap(Chk02_DtlR.$mrp_typ, Chk04_DtlR.$mrp_typ);
				addColumnPathMap(Chk02_DtlR.$data_crud_typ, Chk04_DtlR.$data_crud_typ);
				addColumnPathMap(Chk02_DtlR.$ord, Chk04_DtlR.$ord);
				addColumnPathMap(Chk02_DtlR.$unit_cd, Chk04_DtlR.$unit_cd);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 * 
	 * 品目オーダを取り消す。
	 *
	 */
	public class Del01 extends MSBCL_OrdSrch_MC_A.Del01 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			// 登り電文編集
			editUp();

			// オーダ更新前チェック処理
			callThisChk03();

			MCList<Chk03_DtlR> notErrL = up0().subList(Chk03_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				// オーダ更新サービス実行
				callOrdUpdSrv(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk03_DtlR.$peg_no, up0());
			up0().setString(Chk03_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			up0().setString(Chk01_DtlR.$mrp_typ, MSC_MRP_TYP.MRP.value());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBCL_OrdSrch.Chk03 ope = MSBCL_OrdSrch.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * オーダ更新処理（取消）を実行する
		 * 
		 * @param notErrL
		 */
		protected void callOrdUpdSrv(MCList<Chk03_DtlR> notErrL) {
			MSBCL_OrdRegService.Ord_Upd01 ope = MSBCL_OrdRegService.crtOrd_Upd01();	
			addAll(ope.up0(), notErrL, createMap_Ord_Upd01_Dtl1R_Chk03_DtlR());
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** 正常終了したスレッドの後処理 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk03_DtlR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

			dbTran().rollback();
			
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk03_DtlR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/** Chk03_DtlR → Ord_Upd01_Dtl1R (Del01 → Ord_Upd01) */
		protected Map_Ord_Upd01_Dtl1R_Chk03_DtlR<Ord_Upd01_Dtl1R,Chk03_DtlR> createMap_Ord_Upd01_Dtl1R_Chk03_DtlR() {
			return new Map_Ord_Upd01_Dtl1R_Chk03_DtlR<Ord_Upd01_Dtl1R, Chk03_DtlR>();
		}

		/** Chk03_DtlR → Ord_Upd01_Dtl1R (Del01 → Ord_Upd01) */
		public class Map_Ord_Upd01_Dtl1R_Chk03_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk03_DtlR.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk03_DtlR.$mrp_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, Chk03_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$rqmt_no, Chk03_DtlR.$rqmt_no);
			}
		}
	}
	/////////////////////////////////////////////////////////////////
	//Upd01～Upd04の共通処理

	/**
	 * オーダ状況更新時（Upd01～Upd04）共通処理
	 */
	protected void doOrdStsUpdCmn(MCList<Chk01_DtlR> up, String newItmOrdStsTyp, MCList<Chk01_DtlR> down) {
		// 登り電文編集
		editOrdStsUp(up, newItmOrdStsTyp);

		// オーダ状況更新前チェック処理
		callThisChk01(up);

		MCList<Chk01_DtlR> notErrL = up.subList(Chk01_DtlR.$err_flg, false);
		if (notErrL.size() != 0) {
			// オーダ状況更新サービス実行
			callOrdStsUpdSrv(notErrL);
		}
	}

	/**
	 * 上り電文の編集
	 */
	protected void editOrdStsUp(MCList<Chk01_DtlR> up, String newItmOrdStsTyp) {
		setPegNo(Chk01_DtlR.$peg_no, up);
		for (Chk01_DtlR r : up) {
			r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			r.mrp_typ(MSC_MRP_TYP.MRP.value());
			r.a_itm_ord_sts_typ(newItmOrdStsTyp);
		}
	}

	/**
	 * オーダ状況更新時（Upd01～Upd04）のチェック処理
	 */
	protected void callThisChk01(MCList<Chk01_DtlR> up) {
		MSBCL_OrdSrch.Chk01 ope = MSBCL_OrdSrch.crtChk01();
		ope.up0().setAll(up);
		ope.exec();

		up.setAll(ope.down0());
	}

	/**
	 * オーダ状況更新サービスを実行する
	 */
	protected void callOrdStsUpdSrv(MCList<Chk01_DtlR> up) {
		MSBCL_OrdRegService.Ord_Upd02 ope = MSBCL_OrdRegService.crtOrd_Upd02();
		addAll(ope.up0(), up, createMap_Ord_Upd01_Dtl1R_Chk01_DtlR());
		ope.exec();	
	}

	/**
	 * 下り電文設定
	 */
	protected void setDown(MCList<Chk01_DtlR> up, MCList<Chk01_DtlR> down) {
		down.setAll(up);
	}

	/** 正常終了したスレッドの後処理 */
	protected void handleSuccess(MCList<Chk01_DtlR> up) {
		dbTran().commit();
		for (Chk01_DtlR r : up) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	/** 例外が発生したスレッドのエラー処理 */
	protected void handleEx(Exception e, MCList<Chk01_DtlR> up) {

		dbTran().rollback();

		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (Chk01_DtlR r : up) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}

	protected int getSplitRowCountCmn(MCList<Chk01_DtlR> up) {
		return getThreadBatchSize(up.size());
	}

	/////////////////////////////////////////////////////////////////

	/** Chk01_DtlR → Ord_Upd01_Dtl1R (Upd01～04 → Ord_Upd02) */
	protected Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R,Chk01_DtlR> createMap_Ord_Upd01_Dtl1R_Chk01_DtlR() {
		return new Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R, Chk01_DtlR>();
	}

	/** Chk01_DtlR → Ord_Upd01_Dtl1R (Upd01～04 → Ord_Upd02) */
	public class Map_Ord_Upd01_Dtl1R_Chk01_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk01_DtlR.$mrp_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$a_itm_ord_sts_typ, Chk01_DtlR.$a_itm_ord_sts_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$b_itm_ord_sts_typ, Chk01_DtlR.$b_itm_ord_sts_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Chk01_DtlR.$ord);
			addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk01_DtlR.$unit_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_sppl_cd, Chk01_DtlR.$mfg_sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_maker_cd, Chk01_DtlR.$mfg_maker_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_lg_grp_cd, Chk01_DtlR.$strg_lg_grp_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$strg_sppl_cd, Chk01_DtlR.$strg_sppl_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$rqst_to_lg_grp_cd, Chk01_DtlR.$rqst_to_lg_grp_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk01_DtlR.$lot_mng_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk01_DtlR.$sublot_mng_typ);
		}
	}

	//FMCB CUSTOM END
}