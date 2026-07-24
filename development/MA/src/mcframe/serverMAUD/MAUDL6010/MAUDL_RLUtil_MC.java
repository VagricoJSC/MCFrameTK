package mcframe.serverMAUD.MAUDL6010;

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
 * "MAUDL_RLUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUDL_RLUtil_MC extends MAUDL_RLUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * MAM_MST_CTL(マスタ制御情報).マスタ設定区分の取得<br>
	 */
	public class Srch01 extends MAUDL_RLUtil_MC_A.Srch01 {
		@Override
		protected void call() {
			MAM_MST_CTL_R mstCtrR = MAM_MST_CTL_R.create("T");
			String sqlId = createSqlId(LOGIC_ID, mstCtrR, "select");
			sql(sqlId)
			.mainQuery()
			.select(
				mstCtrR.mst_nm,
				mstCtrR.mst_set_typ,
				mstCtrR.lcl_flg
			)
			.from(mstCtrR)
			.where(
				value(0).eq(value(0))
				.and(mstCtrR.mst_nm.eq(bind("mst_nm")))
			).executeQuery(up0(), down0());
			
			if (down0().mst_set_typ() == null) {
				return;
			}
			MAC_MST_SET_TYP.putName(down0(),
					Srch01_RsltR.$mst_set_typ, Srch01_RsltR.$mst_set_typ_nm);
		}
	}

	//FMCB CUSTOM END
}