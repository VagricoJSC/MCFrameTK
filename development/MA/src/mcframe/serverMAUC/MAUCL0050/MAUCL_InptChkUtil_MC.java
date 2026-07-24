package mcframe.serverMAUC.MAUCL0050;

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
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUCL_InptChkUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_InptChkUtil_MC extends MAUCL_InptChkUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入力値チェックユーティリティ<br>
	 */
	public class Srch01 extends MAUCL_InptChkUtil_MC_A.Srch01 {
		@Override
		protected void call() {
			// 検索
			MCList<MAM_INPT_CHK_R> result = MCList.create(MAM_INPT_CHK_R.class);
			MAM_INPT_CHK_R t = MAM_INPT_CHK_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.addWhereWithCutOffAnd(t.func_typ.eq(bind("1")), up0().func_typ());
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), result, builder);

			// 下り電文に設定
			for (MAM_INPT_CHK_R r :result) {
				Srch01_RsltR s = Srch01_RsltR.create();
				s.func_typ(r.func_typ());
				down0().add(s);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 入力値チェックユーティリティ<br>
	 */
	public class Srch02 extends MAUCL_InptChkUtil_MC_A.Srch02 {
		@Override
		protected void call() {
			for (Srch02_DtlR r :up0()) {
				inptChk(r);
			}
			down0().addAll(up0());
		}
		
		protected void inptChk(Srch02_DtlR r) {
			// 予定数または実績数がnullならばチェック結果は正とする
			if (isNull(r.base_num()) || isNull(r.num())) {
				return;
			}
			
			setRateLmt(r);
			
			// マスタレコードがなかった場合はチェック結果は正とする
			if (isNull(r.low_rate_lmt())) {
				return;
			}
			
			// 上限チェック（予定数 * 上限 < 実績数）
			if (r.base_num().multiply(r.up_rate_lmt()).lt(r.num())) {
				r.up_lmt_rslt_flg(true);
			}
			// 下限チェック（予定数 * 下限 > 実績数）
			if (r.base_num().multiply(r.low_rate_lmt()).gt(r.num())) {
				r.low_lmt_rslt_flg(true);
			}
		}
		
		protected void setRateLmt(Srch02_DtlR r) {
			String procId = "MAPA_COMM$P_INPT_CHK_NE";
			execProc(createSqlId(LOGIC_ID, procId, "setRateLmt"), procId, r, r,
					":func_typ, :itm_cd, :itm_sub1, :itm_sub2, :itm_sub3, :up_rate_lmt, :low_rate_lmt",
					"up_rate_lmt", "low_rate_lmt");
		}
	}

	//FMCB CUSTOM END
}