package mcframe.serverMSBD.MSBDB0020;

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
 * "MSBDB_PoBulkRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDB_PoBulkRegBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDB0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDB_PoBulkRegBatch.PoBulkRegBatch_Ins01 aPoBulkRegBatch_Ins01;

	protected void initPoBulkRegBatch_Ins01() {
		this.info = PDef.MS_MSBDB0020_PoBulkRegBatch_Ins01_INFO;
		this.aPoBulkRegBatch_Ins01 = ((MSBDB_PoBulkRegBatch)this).new PoBulkRegBatch_Ins01();
	}

	public static MSBDB_PoBulkRegBatch.PoBulkRegBatch_Ins01 crtPoBulkRegBatch_Ins01() {
		MSBDB_PoBulkRegBatch lgc = new MSBDB_PoBulkRegBatch();
		lgc.initPoBulkRegBatch_Ins01();
		return lgc.aPoBulkRegBatch_Ins01;
	}

	protected void paramPoBulkRegBatch_Ins01(MCParam p) {
		if (this.aPoBulkRegBatch_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoBulkRegBatch_Ins01.up0());
	}

	protected void doPoBulkRegBatch_Ins01() {
		aPoBulkRegBatch_Ins01.call();
	};

	/**
	 * PoBulkRegBatch_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR createPoBulkRegBatch_Ins01_CndR(){
		return mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PoBulkRegBatch_Ins01オペレーション.<p>
	 *
	 * 発注を一括で登録する<br>
	 */
	abstract public class PoBulkRegBatch_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoBulkRegBatch_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected PoBulkRegBatch_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR.create();

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
			invoke((MSBDB_PoBulkRegBatch)MSBDB_PoBulkRegBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PoBulkRegBatch_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR createPoBulkRegBatch_Ins01_CndR(){
			return mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_po_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_err_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_schd_dt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR
		 */
		public mcframe.serverMSBD.MSBDB0020.PoBulkRegBatch_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDB_PoBulkRegBatch)MSBDB_PoBulkRegBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}