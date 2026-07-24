package mcframe.serverMSBC.MSBCL0080;

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
import static mcframe.serverMSBC.MSBCL0080.Query.*;

import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_ItmOrdPrgSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_ItmOrdPrgSrch_MC extends MSBCL_ItmOrdPrgSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目オーダを検索する。<br>
	 */
	public class Srch01 extends MSBCL_ItmOrdPrgSrch_MC_A.Srch01 {

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

		@Override
		protected void editListMain() {
			super.editListMain();

			// 有効成分数量を設定
			setFctrQty();
			//数量算出、赤フラグ設定
			setRedFlg();
			//表示条件で絞り込み
			setDown();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			//品目状況
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

			//オーダ区分
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

			//手配許可
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
			//「オーダ送信」条件の設定
			if (up0().ord_snd_tgt_flg() && !up0().not_ord_snd_tgt_flg()) {
				up0().addStringColumn("wk_ord_snd_tgt_flg", toTrueStr(true));
			}
			else if (!up0().ord_snd_tgt_flg() && up0().not_ord_snd_tgt_flg()) {
				up0().addStringColumn("wk_ord_snd_tgt_flg", toFalseStr(false));
			}
		}

		/**
		 * 品目オーダ情報を取得する
		 * 
		 */
		protected void srchItmOrd() {
			MCQueryPlan sql = MSBCL0080_MST_ITM_ORDER_S01();
			searchForDL(sql, up0(), down0());
		}

		/**
		 * 有効成分(指図予定数量)、有効成分(出来高予定数量)の計算と設定を行う
		 */
		protected void setFctrQty() {
			for(Srch01_RsltR r : down0()) {
				MCNumber stdContInstQty = convToContFctrUnit(r.inst_qty(), r.std_cont_fctr(),
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.cont_fctr_inst_qty(stdContInstQty);
				
				MCNumber stdContYieldQty = convToContFctrUnit(r.yield_schd_qty(), r.std_cont_fctr(),
						r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
				r.cont_fctr_schd_yield_qty(stdContYieldQty);
			}
		}

		/** 
		 * 赤ＦＬＧの設定と数量計算を行う 
		 * 
		 */
		protected void setRedFlg() {
			for (Srch01_RsltR r :down0()) {
				//使用可能予定日(指図・発注)
				r.po_avl_schd_dt(getLatestDate(r.inst_strg_schd_dt(),
					r.inst_accpt_schd_dt(), r.inst_insp_end_schd_dt(), r.inst_mfg_end_schd_dt()));
				//使用可能日（実績として遅れたかどうかを判断する項目なので、完了の場合のみ表示）
				if (MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
					r.avl_dt(getLatestDate(r.latest_strg_act_dt(),
							r.latest_accpt_act_dt(), r.latest_insp_end_act_dt()));
				}

				setRedFlgSub(r);
				
				if (!isNull(r.yield_remain_qty())) {
					if (r.yield_remain_qty().isNegative()) {
						r.yield_remain_qty(MCNumber.ZERO);
					}
				}
				if (!isNull(r.purc_remain_qty())) {
					if (r.purc_remain_qty().isNegative()) {
						r.purc_remain_qty(MCNumber.ZERO);
					}
				}
				if (!isNull(r.insp_remain_qty())) {
					if (r.insp_remain_qty().isNegative()) {
						r.insp_remain_qty(MCNumber.ZERO);
					}
				}
			}
		}

		/** 
		 * 赤ＦＬＧの設定
		 *
		 */
		protected void setRedFlgSub(Srch01_RsltR r) {
			boolean cmpl = MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ());

			//必要数量不足
			if (!r.bndl_flg()) {
				MCNumber schdQty = r.yield_schd_qty();
				if (MSC_ITM_ORD_STS_TYP.isINST(r.itm_ord_sts_typ())) {
					schdQty = nvl(r.inst_yield_schd_qty(), MCNumber.ZERO);
				}
				else if(cmpl) {
					schdQty = nvl(r.yield_act_qty(), MCNumber.ZERO);
				}
				if (r.yield_schd_qty().gt(schdQty)){
					r.schd_yield_red_flg(true);
				}
			}

			//着手日遅れ
			// 実績日が取得できれば着手できているとみなす
			boolean isRed;
			if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())) {
				isRed = isDelayed(r.mfg_st_schd_dt(), r.inst_mfg_st_schd_dt(), r.latest_mfg_st_act_dt(), !isNull(r.latest_mfg_st_act_dt()));
			} 
			else if (MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())
					|| MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())) {
				isRed = isDelayed(r.po_schd_dt(), null, r.latest_po_d_dt(), !isNull(r.latest_po_d_dt()));
			}
			else {
				isRed = isDelayed(r.gi_schd_dt(), r.inst_gi_schd_dt(), r.latest_gi_act_dt(), !isNull(r.latest_gi_act_dt()));
			}
			if(isRed) {
				r.st_dt_red_flg(true);
			}

			//終了日遅れ
			isRed = false;
			if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())) {
				isRed = isDelayed(r.mfg_end_schd_dt(), r.inst_mfg_end_schd_dt(), r.latest_mfg_end_act_dt(), cmpl);
			}
			if(!isRed) {
				isRed = isDelayed(r.strg_schd_dt(), r.inst_strg_schd_dt(), r.latest_strg_act_dt(), cmpl);
			}
			if(isRed) {
				r.end_dt_red_flg(true);
			}

			//使用可能予定日遅れ
			if (cmpl && r.avl_schd_dt().ltDate(r.avl_dt())) {
				r.avl_schd_dt_red_flg(true);
			}

			//引当予定遅れ
			if (!isNullOr(r.schd_so_dt(), r.avl_schd_dt())
					&& r.schd_so_dt().ltDate(r.io_avl_schd_dt())) {
				r.alloc_pln_red_flg(true);
			}

			//遅れ見込
			if (!cmpl && !isNullOr(r.io_avl_schd_dt(), r.avl_schd_dt())
					&& r.io_avl_schd_dt().gtDate(r.avl_schd_dt())) {
				r.delay_expt_flg(true);
			}

			//余剰オーダ
			if (!MSC_ITM_ORD_STS_TYP.isCMPL(r.itm_ord_sts_typ())) {
				if (isSame(r.schd_alloc_qty(),0) 
						|| (!isNull(r.yield_remain_qty()) && r.yield_remain_qty().gt(nvl(r.schd_alloc_qty(), MCNumber.ZERO)))) {
					r.surplus_ord_flg(true);
				}
			}

			//異常なし
			if (!(r.schd_yield_red_flg() || r.st_dt_red_flg()
					|| r.end_dt_red_flg() || r.avl_schd_dt_red_flg()
					|| r.alloc_pln_red_flg() || r.surplus_ord_flg())) {
				r.no_problem_flg(true);
			}
		}

		/** 予定日付、予定日付（指図・発注）、実績日付から遅れているかどうか返す */
		protected boolean isDelayed(MCDate schdDt, MCDate instDt, MCDate actDt, boolean cmpl) {
			if (!isNull(schdDt)) {
				if (!isNull(actDt) && schdDt.ltDate(actDt)) {
					return true;
				}
				else if (!isNull(actDt) && !(schdDt.ltDate(actDt))) {
					return false;
				}
				else if (!isNull(instDt) && schdDt.ltDate(instDt)) {
					return true;
				}

				if (!cmpl && schdDt.ltDate(getToday())) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 引数の中から最も遅い日付を返す
		 */
		protected MCDate getLatestDate(MCDate... list) {
			MCDate latestDt = null;
			for (MCDate d :list) {
				if (isNull(latestDt) || latestDt.ltDate(d)) {
					latestDt = d;
				} 
			}
			return latestDt;
		}

		/** 表示条件に合致する行のみを下り電文に再設定する */
		protected void setDown() {
			//下り電文を再設定
			down0().setAll(down0().subList(r -> isDisp(r)));
		}

		protected boolean isDisp(Srch01_RsltR r) {
			return (r.no_problem_flg() && up0().no_problem_flg())
				|| (r.schd_yield_red_flg() && up0().schd_yield_red_flg())
				|| (r.st_dt_red_flg() && up0().st_dt_red_flg())
				|| (r.end_dt_red_flg() && up0().end_dt_red_flg())
				|| (r.avl_schd_dt_red_flg() && up0().avl_schd_dt_red_flg())
				|| (r.alloc_pln_red_flg() && up0().alloc_pln_red_flg())
				|| (r.surplus_ord_flg() && up0().surplus_ord_flg());
		}
	}

	//FMCB CUSTOM END
}