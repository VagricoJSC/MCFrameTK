package mcframe.serverMABG.MABGL0420;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABG.MABGL0420.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.container.MCRow.Status;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_RptConfReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_RptConfReg_MC extends MABGL_RptConfReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RptConf_UpdChk01オペレーション.<p>
	 *
	 * 原価レポート構成マスタの登録前のチェックを行います。<br>
	 */
	public class RptConf_UpdChk01 extends MABGL_RptConfReg_MC_A.RptConf_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (RptConf_UpdChk01_DtlR row :up0()) {
				if (isNotCd(row.rpt_row_cd())){
					msgList.add(new MCMessage(row, RptConf_UpdChk01_DtlR.$rpt_row_cd, MABCL0306, 
									getLabel(row, RptConf_UpdChk01_DtlR.$rpt_row_cd), row.rpt_row_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				if (!(MAC_RPT_TGT_TYP.isIO(row.rpt_tgt_typ()) || MAC_RPT_TGT_TYP.isIO_AMT(row.rpt_tgt_typ()))
						&& !isNull(row.cost_io_typ())) {
					msgList.add(new MCMessage(row, RptConf_UpdChk01_DtlR.$cost_io_typ, MABGL0030, toDispGUIIndex(row)));
				}
				if (row.sml_flg() && !isNull(row.cost_io_typ())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$cost_io_typ, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.asst_typ())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$asst_typ, MABGL0107));
				}
				if (row.sml_flg() && row.std_flg()) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$std_flg, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.qty_unit_typ())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$qty_unit_typ, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.alc_ac_grp_cd1())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$alc_ac_grp_cd1, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.alc_ac_grp_cd2())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$alc_ac_grp_cd2, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.alc_ac_grp_cd3())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$alc_ac_grp_cd3, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.alc_ac_cd())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$alc_ac_cd, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.ac_slip_typ())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$ac_slip_typ, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.ac_rsn_cd())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$ac_rsn_cd, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_jnl_cd())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_jnl_cd, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd1())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd1, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd2())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd2, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd3())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd3, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd4())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd4, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd5())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd5, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd6())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd6, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd7())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd7, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd8())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd8, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd9())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd9, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.itm_grp_cd10())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$itm_grp_cd10, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.expns_typ())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$expns_typ, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.direct_typ())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$direct_typ, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.var_typ())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$var_typ, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.expns_grp_cd())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$expns_grp_cd, MABGL0107));
				}
				if (row.sml_flg() && !isNull(row.expns_cd())) {
					msgList.add(getMsg(row, RptConf_UpdChk01_DtlR.$expns_cd, MABGL0107));
				}
				if (!MAC_RPT_TGT_TYP.is_qty(row.rpt_tgt_typ()) && !isNull(row.qty_unit_typ())) {
					msgList.add(new MCMessage(row, RptConf_UpdChk01_DtlR.$qty_unit_typ, MABGL0098, toDispGUIIndex(row)));
				}
				if (!MAC_RPT_TGT_TYP.isALC(row.rpt_tgt_typ())) {
					if (!isNull(row.alc_ac_grp_cd1()) || !isNull(row.alc_ac_grp_cd2()) || !isNull(row.alc_ac_grp_cd3()) 
							|| !isNull(row.alc_ac_cd())) {
						msgList.add(new MCMessage(row, RptConf_UpdChk01_DtlR.$qty_unit_typ, MABGL0057 ,toDispGUIIndex(row)));
					}
				}
			}
			return msgList;
		}
		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(RptConf_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
	}
	/**
	 * RptConf_Upd01オペレーション.<p>
	 *
	 * 原価レポート構成マスタの登録を行います。<br>
	 */
	public class RptConf_Upd01 extends MABGL_RptConfReg_MC_A.RptConf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptConfLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価レポート構成マスタ（ロケール別情報）の登録前のチェックを行います。<br>
	 */
	public class RptConfLcl_UpdChk01 extends MABGL_RptConfReg_MC_A.RptConfLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptConfLcl_Upd01オペレーション.<p>
	 *
	 * 原価レポート構成マスタ（ロケール別情報）の登録を行います。<br>
	 */
	public class RptConfLcl_Upd01 extends MABGL_RptConfReg_MC_A.RptConfLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptConf_DelChk01オペレーション.<p>
	 *
	 * 原価レポート構成マスタの削除前のチェックを行います。<br>
	 */
	public class RptConf_DelChk01 extends MABGL_RptConfReg_MC_A.RptConf_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptConf_Del01オペレーション.<p>
	 *
	 * 原価レポート構成マスタの削除を行います。<br>
	 */
	public class RptConf_Del01 extends MABGL_RptConfReg_MC_A.RptConf_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポート構成マスタ、原価レポート構成マスタ（ロケール別情報）の検索を行います。<br>
	 */
	public class Srch01 extends MABGL_RptConfReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_RPT_CONF_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
			MAM_ALC_AC_GRP_R alc1 = MAM_ALC_AC_GRP_R.create("ALC1");
			MAM_ALC_AC_GRP_R alc2 = MAM_ALC_AC_GRP_R.create("ALC2");
			MAM_ALC_AC_GRP_R alc3 = MAM_ALC_AC_GRP_R.create("ALC3");

			builder.addSelect(ig1.itm_grp_nm.as("itm_grp_nm1"));
			builder.addSelect(ig2.itm_grp_nm.as("itm_grp_nm2"));
			builder.addSelect(ig3.itm_grp_nm.as("itm_grp_nm3"));
			builder.addSelect(ig4.itm_grp_nm.as("itm_grp_nm4"));
			builder.addSelect(ig5.itm_grp_nm.as("itm_grp_nm5"));
			builder.addSelect(ig6.itm_grp_nm.as("itm_grp_nm6"));
			builder.addSelect(ig7.itm_grp_nm.as("itm_grp_nm7"));
			builder.addSelect(ig8.itm_grp_nm.as("itm_grp_nm8"));
			builder.addSelect(ig9.itm_grp_nm.as("itm_grp_nm9"));
			builder.addSelect(ig10.itm_grp_nm.as("itm_grp_nm10"));
			builder.addSelect(alc1.alc_ac_grp_nm.as("alc_ac_grp_nm1"));
			builder.addSelect(alc2.alc_ac_grp_nm.as("alc_ac_grp_nm2"));
			builder.addSelect(alc3.alc_ac_grp_nm.as("alc_ac_grp_nm3"));
			
			MAM_RPT_CONF_R t = MAM_RPT_CONF_R.create(builder.getBaseDbcAlias());
			builder.addLeftOuterJoin(ig1, t.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addLeftOuterJoin(ig2, t.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addLeftOuterJoin(ig3, t.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addLeftOuterJoin(ig4, t.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addLeftOuterJoin(ig5, t.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addLeftOuterJoin(ig6, t.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addLeftOuterJoin(ig7, t.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addLeftOuterJoin(ig8, t.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addLeftOuterJoin(ig9, t.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addLeftOuterJoin(ig10, t.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
			builder.addLeftOuterJoin(alc1, t.alc_ac_grp_cd1.eq(alc1.alc_ac_grp_cd)
					.and(alc1.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP1.value()))));
			builder.addLeftOuterJoin(alc2, t.alc_ac_grp_cd2.eq(alc2.alc_ac_grp_cd)
					.and(alc2.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP2.value()))));
			builder.addLeftOuterJoin(alc3, t.alc_ac_grp_cd3.eq(alc3.alc_ac_grp_cd)
					.and(alc3.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP3.value()))));
			
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価レポート構成マスタ、原価レポート構成マスタ（ロケール別情報）の登録を行います。<br>
	 */
	public class Upd01 extends MABGL_RptConfReg_MC_A.Upd01 {
		@Override
		protected void call() {
			beforCall(up0());
			super.call();
		}

		/**
		 * 登録データの加工
		 */
		private void beforCall(MCList<RptConf_UpdChk01_DtlR> up0) {
			for(RptConf_UpdChk01_DtlR dtl : up0) {
				if (dtl.isStatusNone()) {
					// 表示順の変更だけのデータは、ステータスがNONEなので、MODIFYと見なす
					dtl.setStatus(Status.MODIFY);
				}
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価レポート構成マスタ、原価レポート構成マスタ（ロケール別情報）の削除を行います。<br>
	 */
	public class Del01 extends MABGL_RptConfReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}