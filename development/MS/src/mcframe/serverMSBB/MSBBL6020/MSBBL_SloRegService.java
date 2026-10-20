package mcframe.serverMSBB.MSBBL6020;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL6020.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB IMPORT END

/**
 * "MSBBL_SloRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBL_SloRegService extends MSBBL_SloRegService_MC {

//FMCB CUSTOM START
	/**
	 * Slo_BulkImp_Del01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の削除を行う。<br>
	 */
	public class Slo_BulkImp_Del01 extends MSBBL_SloRegService_MC.Slo_BulkImp_Del01 {

	}
	/**
	 * Slo_BulkImp_Ins01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の登録を行う。<br>
	 */
	public class Slo_BulkImp_Ins01 extends MSBBL_SloRegService_MC.Slo_BulkImp_Ins01 {

	}
	/**
	 * Slo_BulkImp_Chk02オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の削除前のチェック処理、項目値の補完を行う。<br>
	 */
	public class Slo_BulkImp_Chk02 extends MSBBL_SloRegService_MC.Slo_BulkImp_Chk02 {

	}
	/**
	 * Slo_BulkImp_Chk01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の登録前のチェック処理、項目値の補完を行う。<br>
	 */
	public class Slo_BulkImp_Chk01 extends MSBBL_SloRegService_MC.Slo_BulkImp_Chk01 {

	}
	/**
	 * Slo_RevUpd01オペレーション.<p>
	 *
	 * 受注改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class Slo_RevUpd01 extends MSBBL_SloRegService_MC.Slo_RevUpd01 {

	}
	/**
	 * Slo_Del01オペレーション.<p>
	 *
	 */
	public class Slo_Del01 extends MSBBL_SloRegService_MC.Slo_Del01 {

	}
	/**
	 * Slo_Upd02オペレーション.<p>
	 *
	 */
	public class Slo_Upd02 extends MSBBL_SloRegService_MC.Slo_Upd02 {

	}
	/**
	 * Slo_Upd01オペレーション.<p>
	 *
	 */
	public class Slo_Upd01 extends MSBBL_SloRegService_MC.Slo_Upd01 {

	}
	/**
	 * Slo_Ins01オペレーション.<p>
	 *
	 */
	public class Slo_Ins01 extends MSBBL_SloRegService_MC.Slo_Ins01 {

	}
	/**
	 * Slo_Chk04オペレーション.<p>
	 *
	 * 前受金入金額更新前チェック<br>
	 */
	public class Slo_Chk04 extends MSBBL_SloRegService_MC.Slo_Chk04 {

	}
	/**
	 * Slo_Chk03オペレーション.<p>
	 *
	 * 削除前のチェック処理、項目値の補完<br>
	 */
	public class Slo_Chk03 extends MSBBL_SloRegService_MC.Slo_Chk03 {

	}
	/**
	 * Slo_Chk02オペレーション.<p>
	 *
	 * 承認状況チェック（発注登録用）<br>
	 */
	public class Slo_Chk02 extends MSBBL_SloRegService_MC.Slo_Chk02 {

	}
	/**
	 * Slo_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理、項目値の補完<br>
	 */
	public class Slo_Chk01 extends MSBBL_SloRegService_MC.Slo_Chk01 {

	}
//FMCB CUSTOM END
}