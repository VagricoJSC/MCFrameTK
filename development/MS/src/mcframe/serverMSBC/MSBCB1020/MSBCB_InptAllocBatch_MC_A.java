package mcframe.serverMSBC.MSBCB1020;

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
 * "MSBCB_InptAllocBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCB_InptAllocBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCB1020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCB_InptAllocBatch.InptAlloc_Upd01 aInptAlloc_Upd01;

	protected void initInptAlloc_Upd01() {
		this.info = PDef.MS_MSBCB1020_InptAlloc_Upd01_INFO;
		this.aInptAlloc_Upd01 = ((MSBCB_InptAllocBatch)this).new InptAlloc_Upd01();
	}

	public static MSBCB_InptAllocBatch.InptAlloc_Upd01 crtInptAlloc_Upd01() {
		MSBCB_InptAllocBatch lgc = new MSBCB_InptAllocBatch();
		lgc.initInptAlloc_Upd01();
		return lgc.aInptAlloc_Upd01;
	}

	protected void paramInptAlloc_Upd01(MCParam p) {
		if (this.aInptAlloc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptAlloc_Upd01.up0());
	}

	protected void doInptAlloc_Upd01() {
		aInptAlloc_Upd01.call();
	};

	/**
	 * InptAlloc_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR createInptAlloc_Upd01_CndR(){
		return mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InptAlloc_Upd01オペレーション.<p>
	 *
	 * 内製・外注の製造指図によって作成された投入予定の引当を行う<br>
	 */
	abstract public class InptAlloc_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptAlloc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected InptAlloc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR.create();

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
			invoke((MSBCB_InptAllocBatch)MSBCB_InptAllocBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InptAlloc_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR createInptAlloc_Upd01_CndR(){
			return mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>re_alloc_mode_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>int_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_flg</td></tr>
		 * 	<tr><td><br></td><td>err_alloc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR
		 */
		public mcframe.serverMSBC.MSBCB1020.InptAlloc_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCB_InptAllocBatch)MSBCB_InptAllocBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}