package mcframe.serverMSBE.MSBEL5510;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEL_ShipSchdDtCalcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipSchdDtCalcService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5510";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 aShipSchdDt_Srch01;

	protected void initShipSchdDt_Srch01() {
		this.info = PDef.MS_MSBEL5510_ShipSchdDt_Srch01_INFO;
		this.aShipSchdDt_Srch01 = ((MSBEL_ShipSchdDtCalcService)this).new ShipSchdDt_Srch01();
	}

	public static MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 crtShipSchdDt_Srch01() {
		MSBEL_ShipSchdDtCalcService lgc = new MSBEL_ShipSchdDtCalcService();
		lgc.initShipSchdDt_Srch01();
		return lgc.aShipSchdDt_Srch01;
	}

	protected void paramShipSchdDt_Srch01(MCParam p) {
		if (this.aShipSchdDt_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchdDt_Srch01.up0());
		p.addDownBlock(aShipSchdDt_Srch01.down0());
	}

	protected void doShipSchdDt_Srch01() {
		aShipSchdDt_Srch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R createSrch01_CndR(){
		return mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R.create();
	}

	/**
	 * Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R> createSrch01_CndL(){
		return MCList.create(mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipSchdDt_Srch01オペレーション.<p>
	 *
	 * 基準日、リードタイムから出荷予定日を計算する。<br>
	 */
	abstract public class ShipSchdDt_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchdDt_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R> down0;
		
		
		// コンストラクタ
		protected ShipSchdDt_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R.class);
			down0 = MCList.create(mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipSchdDtCalcService)MSBEL_ShipSchdDtCalcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R createSrch01_CndR(){
			return mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R.create();
		}

		/**
		 * Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R> createSrch01_CndL(){
			return MCList.create(mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>cl_time_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dt_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cal_cd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>early_ship_dt_add_days_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MSW_SHIP_SCHD_DT_CALC_R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdDtCalcService)MSBEL_ShipSchdDtCalcService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}