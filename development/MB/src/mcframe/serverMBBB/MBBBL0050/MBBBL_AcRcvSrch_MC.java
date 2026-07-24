package mcframe.serverMBBB.MBBBL0050;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_AcRcvSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_AcRcvSrch_MC extends MBBBL_AcRcvSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MBBBL_AcRcvSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MBT_AC_RCV_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAVM_RD_WG_R wg = MAVM_RD_WG_R.create("WG");
			MAM_AC_DPT_R ar_dpt = MAM_AC_DPT_R.create("AR_DPT");
			MAM_AC_DPT_R rcv_dpt = MAM_AC_DPT_R.create("RCV_DPT");
			MAM_AC_DPT_R so_dpt = MAM_AC_DPT_R.create("SO_DPT");
			MAM_AC_DPT_R sub_dpt1 = MAM_AC_DPT_R.create("SUB_DPT1");
			MAM_AC_DPT_R sub_dpt2 = MAM_AC_DPT_R.create("SUB_DPT2");
			MAM_AC_DPT_R sub_dpt3 = MAM_AC_DPT_R.create("SUB_DPT3");

			builder.addSelect(wg.wg_nm);
			builder.addSelect(ar_dpt.ac_dpt_nm.as("ar_dpt_nm"));
			builder.addSelect(rcv_dpt.ac_dpt_nm.as("rcv_dpt_nm"));
			builder.addSelect(so_dpt.ac_dpt_nm.as("so_dpt_nm"));
			builder.addSelect(sub_dpt1.ac_dpt_nm.as("sub_dpt_nm1"));
			builder.addSelect(sub_dpt2.ac_dpt_nm.as("sub_dpt_nm2"));
			builder.addSelect(sub_dpt3.ac_dpt_nm.as("sub_dpt_nm3"));

			MBT_AC_RCV_R t = MBT_AC_RCV_R.create(builder.getBaseDbcAlias());
			builder.addInnerJoin(wg, wg.wg_cd.eq(t.wg_cd));
			builder.addLeftOuterJoin(ar_dpt, ar_dpt.ac_dpt_cd.eq(t.ar_dpt_cd)
					.and(t.ac_dt.between(ar_dpt.st_dt, ar_dpt.end_dt)));
			builder.addLeftOuterJoin(rcv_dpt, rcv_dpt.ac_dpt_cd.eq(t.rcv_dpt_cd)
					.and(t.ac_dt.between(rcv_dpt.st_dt, rcv_dpt.end_dt)));
			builder.addLeftOuterJoin(so_dpt, so_dpt.ac_dpt_cd.eq(t.so_dpt_cd)
					.and(t.ac_dt.between(so_dpt.st_dt, so_dpt.end_dt)));
			builder.addLeftOuterJoin(sub_dpt1, sub_dpt1.ac_dpt_cd.eq(t.sub_dpt_cd1)
					.and(t.ac_dt.between(sub_dpt1.st_dt, sub_dpt1.end_dt)));
			builder.addLeftOuterJoin(sub_dpt2, sub_dpt2.ac_dpt_cd.eq(t.sub_dpt_cd2)
					.and(t.ac_dt.between(sub_dpt2.st_dt, sub_dpt2.end_dt)));
			builder.addLeftOuterJoin(sub_dpt3, sub_dpt3.ac_dpt_cd.eq(t.sub_dpt_cd3)
					.and(t.ac_dt.between(sub_dpt3.st_dt, sub_dpt3.end_dt)));

			builder.addWhereWithCutOffAnd(wg.wg_nm.like(bind("wg_nm")));
			builder.addWhereWithCutOffAnd(ar_dpt.ac_dpt_nm.like(bind("ar_dpt_nm")));
			builder.addWhereWithCutOffAnd(rcv_dpt.ac_dpt_nm.like(bind("rcv_dpt_nm")));
			builder.addWhereWithCutOffAnd(so_dpt.ac_dpt_nm.like(bind("so_dpt_nm")));
			builder.addWhereWithCutOffAnd(t.ac_ym.lte(bind("ac_ym_to")));
			builder.addWhereWithCutOffAnd(t.ac_ym.gte(bind("ac_ym_fr")));

			builder.addOrderByAsc(t.data_no);
		}
	}

	//FMCB CUSTOM END
}