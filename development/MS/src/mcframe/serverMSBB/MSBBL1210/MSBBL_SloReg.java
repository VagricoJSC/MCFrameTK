package mcframe.serverMSBB.MSBBL1210;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
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

//FMCB IMPORT START
import mcframe.serverMSBB.MSBBL6020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL1210.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB IMPORT END

/**
 * "MSBBL_SloReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBL_SloReg extends MSBBL_SloReg_MC {

//FMCB CUSTOM START
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価再取得を行う<br>
	 */
	public class Sprt01 extends MSBBL_SloReg_MC.Sprt01 {

	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 受注情報を取り消す<br>
	 */
	public class Del01 extends MSBBL_SloReg_MC.Del01 {

	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 受注情報を訂正する<br>
	 */
	public class Upd01 extends MSBBL_SloReg_MC.Upd01 {

	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 受注情報を新規登録する<br>
	 */
	public class Ins01 extends MSBBL_SloReg_MC.Ins01 {

	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 見積情報を検索する<br>
	 */
	public class Srch02 extends MSBBL_SloReg_MC.Srch02 {

	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受注情報を検索する<br>
	 */
	public class Srch01 extends MSBBL_SloReg_MC.Srch01 {

	}
//FMCB CUSTOM END
}