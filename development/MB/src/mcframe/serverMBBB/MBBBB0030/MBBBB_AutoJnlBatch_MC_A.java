package mcframe.serverMBBB.MBBBB0030;

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
 * "MBBBB_AutoJnlBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBB_AutoJnlBatch_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBBB0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBB_AutoJnlBatch.AutoJnl_Upd01 aAutoJnl_Upd01;

	protected void initAutoJnl_Upd01() {
		this.info = PDef.MB_MBBBB0030_AutoJnl_Upd01_INFO;
		this.aAutoJnl_Upd01 = ((MBBBB_AutoJnlBatch)this).new AutoJnl_Upd01();
	}

	public static MBBBB_AutoJnlBatch.AutoJnl_Upd01 crtAutoJnl_Upd01() {
		MBBBB_AutoJnlBatch lgc = new MBBBB_AutoJnlBatch();
		lgc.initAutoJnl_Upd01();
		return lgc.aAutoJnl_Upd01;
	}

	protected void paramAutoJnl_Upd01(MCParam p) {
		if (this.aAutoJnl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnl_Upd01.up0());
	}

	protected void doAutoJnl_Upd01() {
		aAutoJnl_Upd01.call();
	};

	/**
	 * AutoJnl_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR createAutoJnl_Upd01_CndR(){
		return mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AutoJnl_Upd01オペレーション.<p>
	 *
	 * 自動で仕訳を作成する。<br>
	 */
	abstract public class AutoJnl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected AutoJnl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR.create();

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
			invoke((MBBBB_AutoJnlBatch)MBBBB_AutoJnlBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AutoJnl_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR createAutoJnl_Upd01_CndR(){
			return mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_dt</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR
		 */
		public mcframe.serverMBBB.MBBBB0030.AutoJnl_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBB_AutoJnlBatch)MBBBB_AutoJnlBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}