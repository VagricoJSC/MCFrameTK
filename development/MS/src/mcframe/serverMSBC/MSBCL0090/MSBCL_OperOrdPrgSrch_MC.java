package mcframe.serverMSBC.MSBCL0090;

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
import static mcframe.serverMSBC.MSBCL0090.Query.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_OperOrdPrgSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_OperOrdPrgSrch_MC extends MSBCL_OperOrdPrgSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工程オーダを検索する。
	 */
	public class Srch01 extends MSBCL_OperOrdPrgSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			//bind用一時カラム追加
			setUpTmpCol();
			//工程オーダ検索
			srchOperOrd();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			setRedFlg();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			// 上り電文に「オーダ状況区分」条件の設定
			if (up0().opn_flg()) {
				up0().addStringColumn("wk_opn", MSC_OPER_ORD_STS_TYP.OPN.value());
			}
			if (up0().sav_flg()) {
				up0().addStringColumn("wk_save", MSC_OPER_ORD_STS_TYP.SAV.value());
			}
			if (up0().fix_flg()) {
				up0().addStringColumn("wk_fix", MSC_OPER_ORD_STS_TYP.FIX.value());
			}
			if (up0().inst_flg()) {
				up0().addStringColumn("wk_inst", MSC_OPER_ORD_STS_TYP.INST.value());
			}
			if (up0().part_inst_flg()) {
				up0().addStringColumn("wk_part_inst", MSC_OPER_ORD_STS_TYP.PART_INST.value());
			}
			if (up0().cmpl_flg()) {
				up0().addStringColumn("wk_cmpl", MSC_OPER_ORD_STS_TYP.CMPL.value());
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
		 * 工程オーダ情報を取得する
		 * 
		 */
		protected void srchOperOrd(){
			MCQueryPlan sql = MSBCL0090_MST_OPER_ORDER_S01();
			searchForDL(sql, up0(), down0());
		}

		/**
		 * 赤ＦＬＧの設定と単位換算を行う
		 * 
		 */
		protected void setRedFlg(){
			
			MCList<Srch01_RsltR> rsltL = down0().createInstance();
			
			for (Srch01_RsltR r: down0()){

				//赤ＦＬＧの設定
				//工程数量不足
				if (MSC_OPER_ORD_STS_TYP.isCMPL(r.oper_ord_sts_typ())) {
					//実績の数量が工程オーダの指図予定数量より小さい場合にチェックがオンになる。
					if (r.oper_schd_qty().gt(r.oper_act_qty())) {
						r.oper_qty_red_flg(true);
					}
				}
				//工程着手日時遅れ
				if (isDelayed(r.st_schd_tm(), r.inst_st_schd_tm(), r.act_st_tm(), !isNull(r.act_st_tm()))) {
					r.st_dt_red_flg(true);
				}
				//工程終了日時遅れ
				if (isDelayed(r.end_schd_tm(), r.inst_end_schd_tm(), r.act_end_tm(), MSC_OPER_ORD_STS_TYP.isCMPL(r.oper_ord_sts_typ()))) {
					r.end_dt_red_flg(true);
				}
				//異常なし
				if (!(r.oper_qty_red_flg() || r.st_dt_red_flg() || r.end_dt_red_flg())) {
					r.no_problem_flg(true);
				}

				//単位換算
				if (!isNull(r.oper_unit_cd())) {

					//指図時工程指図予定数量
					if (!isNull(r.oper_int_schd_qty())) {
						r.oper_int_schd_qty(convQtyBaseToOper(r.oper_int_schd_qty(),
								r.oper_inst_conv_qty(),
								r.oper_inst_std_qty(), 
								r.oper_unit_dec_place(), 
								r.oper_unit_conv_rnd_typ()));
					}

					//工程指図予定数量.
					if (!isNull(r.oper_schd_qty())) {
						r.oper_schd_qty(convQtyBaseToOper(r.oper_schd_qty(), 
								r.oper_conv_qty(), 
								r.oper_std_qty(), 
								r.dec_place(), 
								r.unit_conv_rnd_typ()));
					}
				}
				else {
					r.oper_unit_cd(r.base_unit_cd());
					r.oper_unit_nm(r.base_unit_nm());
				}
				
				//上り電文の表示条件によりリストをセットする。
				if (r.no_problem_flg() && up0().no_problem_flg()){
					rsltL.add(r);
				}
				else if(r.oper_qty_red_flg() && up0().oper_qty_red_flg()){
					rsltL.add(r);
				}
				else if(r.st_dt_red_flg() && up0().st_dt_red_flg()){
					rsltL.add(r);
				}
				else if(r.end_dt_red_flg() && up0().end_dt_red_flg()){
					rsltL.add(r);
				}
			}
			//下り電文を再設定
			down0().setAll(rsltL);
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
	}

	//FMCB CUSTOM END
}