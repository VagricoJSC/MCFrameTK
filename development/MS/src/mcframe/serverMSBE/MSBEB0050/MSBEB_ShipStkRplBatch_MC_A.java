package mcframe.serverMSBE.MSBEB0050;

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
 * "MSBEB_ShipStkRplBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEB_ShipStkRplBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEB0050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEB_ShipStkRplBatch.ShipStkRplBatch_Upd01 aShipStkRplBatch_Upd01;

	protected void initShipStkRplBatch_Upd01() {
		this.info = PDef.MS_MSBEB0050_ShipStkRplBatch_Upd01_INFO;
		this.aShipStkRplBatch_Upd01 = ((MSBEB_ShipStkRplBatch)this).new ShipStkRplBatch_Upd01();
	}

	public static MSBEB_ShipStkRplBatch.ShipStkRplBatch_Upd01 crtShipStkRplBatch_Upd01() {
		MSBEB_ShipStkRplBatch lgc = new MSBEB_ShipStkRplBatch();
		lgc.initShipStkRplBatch_Upd01();
		return lgc.aShipStkRplBatch_Upd01;
	}

	protected void paramShipStkRplBatch_Upd01(MCParam p) {
		if (this.aShipStkRplBatch_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRplBatch_Upd01.up0());
	}

	protected void doShipStkRplBatch_Upd01() {
		aShipStkRplBatch_Upd01.call();
	};

	/**
	 * ShipStkRplBatch_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR createShipStkRplBatch_CndR(){
		return mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR.create();
	}

	/**
	 * ShipStkRplBatch_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_DtlR createShipStkRplBatch_DtlR(){
		return mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_DtlR.create();
	}
	protected MSBEB_ShipStkRplBatch.ShipStkRplBatch_Del01 aShipStkRplBatch_Del01;

	protected void initShipStkRplBatch_Del01() {
		this.info = PDef.MS_MSBEB0050_ShipStkRplBatch_Del01_INFO;
		this.aShipStkRplBatch_Del01 = ((MSBEB_ShipStkRplBatch)this).new ShipStkRplBatch_Del01();
	}

	public static MSBEB_ShipStkRplBatch.ShipStkRplBatch_Del01 crtShipStkRplBatch_Del01() {
		MSBEB_ShipStkRplBatch lgc = new MSBEB_ShipStkRplBatch();
		lgc.initShipStkRplBatch_Del01();
		return lgc.aShipStkRplBatch_Del01;
	}

	protected void paramShipStkRplBatch_Del01(MCParam p) {
		if (this.aShipStkRplBatch_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipStkRplBatch_Del01.up0());
	}

	protected void doShipStkRplBatch_Del01() {
		aShipStkRplBatch_Del01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipStkRplBatch_Upd01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRplBatch_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRplBatch_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR up0;
		/** [ShipStkRplBatch_Dtl]ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_DtlR aShipStkRplBatch_Dtl;
		
		
		// コンストラクタ
		protected ShipStkRplBatch_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR.create();
			aShipStkRplBatch_Dtl = mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_DtlR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEB_ShipStkRplBatch)MSBEB_ShipStkRplBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipStkRplBatch_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR createShipStkRplBatch_CndR(){
			return mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR.create();
		}

		/**
		 * ShipStkRplBatch_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_DtlR createShipStkRplBatch_DtlR(){
			return mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR
		 */
		public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR up0() {
			return up0;
		}



		/**
		 * [ShipStkRplBatch_Dtl]ブロックのコンテナaShipStkRplBatch_DtlRを返します。
		 *
		 * @return ShipStkRplBatch_DtlR
		 */
		public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_DtlR ShipStkRplBatch_Dtl() {
			return aShipStkRplBatch_Dtl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_ShipStkRplBatch)MSBEB_ShipStkRplBatch_MC_A.this).info;
		}


	}
	/**
	 * ShipStkRplBatch_Del01オペレーション.<p>
	 *
	 */
	abstract public class ShipStkRplBatch_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipStkRplBatch_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR up0;
		
		
		// コンストラクタ
		protected ShipStkRplBatch_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEB_ShipStkRplBatch)MSBEB_ShipStkRplBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipStkRplBatch_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR createShipStkRplBatch_CndR(){
			return mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_stk_rpl_lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>tm_fr</td></tr>
		 * 	<tr><td><br></td><td>tm_to</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR
		 */
		public mcframe.serverMSBE.MSBEB0050.ShipStkRplBatch_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_ShipStkRplBatch)MSBEB_ShipStkRplBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}