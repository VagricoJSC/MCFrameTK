package mcframe.serverMGBG.MGBGL0140;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMGBG.MGBGL0140.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PreAlcRateLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PreAlcRateLst_MC extends MGBGL_PreAlcRateLst_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 期・年月別に一次配賦比率情報の登録状況を確認する。<br>
	 */
	public class Srch01 extends MGBGL_PreAlcRateLst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
			if (isSame(up0().srch_typ(), "1")) {
				// 期間
				executeQuery(down0(), MGBGL0140_MGT_PRE_RATE_TERM_S01(), up0());
			}
			else {
				// 計画・実績選択時、マスタとトランのデータを別々に取得して合体
				MCList<Srch01_RsltR> masterL = MCList.create(Srch01_RsltR.class);
				MCList<Srch01_RsltR> tranL = MCList.create(Srch01_RsltR.class);
				if (isSame(up0().srch_typ(), "2")) {
					// 計画
					up0().addStringColumn("pln_mly_flg_str", "1");
					up0().addStringColumn("sa_typ", MAC_SA_TYP.PLN.value());
				}
				else {
					// 実績
					up0().addStringColumn("act_mly_flg_str", "1");
					up0().addStringColumn("sa_typ", MAC_SA_TYP.ACT.value());
				}
				executeQuery(masterL, MGBGL0140_MGT_PRE_RATE_TERM_S02(), up0());
				executeQuery(tranL,MGBGL0140_MGT_PRE_RATE_MLY_S01(), up0());
				MCIndexKey tranIdx = tranL.createIndex(Srch01_RsltR.$pre_alc_rate_cd,
						Srch01_RsltR.$ym);

				for (Srch01_RsltR r : masterL) {
					r.calc_ctg_cd(up0().calc_ctg_cd());
					r.calc_ctg_nm(up0().calc_ctg_nm());
				}

				Srch01_RsltR tmpRow;
				for (MCDate ym = up0().ym_fr(); ym
						.lte(up0().ym_to()); ym = ym.addMonth(1)) {
					for (Srch01_RsltR r : masterL) {
						tmpRow = r.clone();
						tmpRow.ym(ym);

						if (!isNull(tranL.getFirst(tranIdx, tmpRow.pre_alc_rate_cd(),
								tmpRow.ym()))) {
							tmpRow.exist_flg(true);
						}

						down0().add(tmpRow);
					}
				}
			}
		}
	}

	//FMCB CUSTOM END
}