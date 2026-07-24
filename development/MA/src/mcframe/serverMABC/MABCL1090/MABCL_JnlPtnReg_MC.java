package mcframe.serverMABC.MABCL1090;

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

//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_JnlPtnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_JnlPtnReg_MC extends MABCL_JnlPtnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 自動仕訳パタンマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_JnlPtnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			editDmlJnlPtn(builder);
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			cond.addDateColumn("today", getToday());
		}

		/**
		 * 部門マスタと結合するためのSQL編集
		 * 
		 * @param dbc
		 */
		protected <R extends MCDBContainer> void editDmlJnlPtn(MCQueryApiBuilder builder) {
			MAM_AC_DPT_R dr = MAM_AC_DPT_R.create("DR");
			MAM_AC_DPT_R cr = MAM_AC_DPT_R.create("CR");
			MAM_JNL_PTN_R t = MAM_JNL_PTN_R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(dr, t.dr_dpt_cd.eq(dr.ac_dpt_cd)
					.and(bind("today").between(dr.st_dt, dr.end_dt)));
			builder.addLeftOuterJoin(cr, t.cr_dpt_cd.eq(cr.ac_dpt_cd)
					.and(bind("today").between(cr.st_dt, cr.end_dt)));

			builder.addSelect(dr.ac_dpt_nm.as("dr_dpt_nm"));
			builder.addSelect(cr.ac_dpt_nm.as("cr_dpt_nm"));
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_JNL_PTN_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			r_dest.dr_dpt_nm(r_src.getString("dr_dpt_nm"));
			r_dest.cr_dpt_nm(r_src.getString("cr_dpt_nm"));
		}
		
	}

	//FMCB CUSTOM END
}