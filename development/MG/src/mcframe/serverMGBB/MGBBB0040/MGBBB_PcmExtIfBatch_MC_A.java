package mcframe.serverMGBB.MGBBB0040;

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
 * "MGBBB_PcmExtIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBB_PcmExtIfBatch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBBB0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBBB_PcmExtIfBatch.PcmExtIf_Upd01 aPcmExtIf_Upd01;

	protected void initPcmExtIf_Upd01() {
		this.info = PDef.MG_MGBBB0040_PcmExtIf_Upd01_INFO;
		this.aPcmExtIf_Upd01 = ((MGBBB_PcmExtIfBatch)this).new PcmExtIf_Upd01();
	}

	public static MGBBB_PcmExtIfBatch.PcmExtIf_Upd01 crtPcmExtIf_Upd01() {
		MGBBB_PcmExtIfBatch lgc = new MGBBB_PcmExtIfBatch();
		lgc.initPcmExtIf_Upd01();
		return lgc.aPcmExtIf_Upd01;
	}

	protected void paramPcmExtIf_Upd01(MCParam p) {
		if (this.aPcmExtIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmExtIf_Upd01.up0());
	}

	protected void doPcmExtIf_Upd01() {
		aPcmExtIf_Upd01.call();
	};

	/**
	 * PcmExtIf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR createPcmExtIf_Upd01_CndR(){
		return mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PcmExtIf_Upd01オペレーション.<p>
	 *
	 * 原価外部ＩＦデータを取り込む。<br>
	 */
	abstract public class PcmExtIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmExtIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected PcmExtIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR.create();

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
			invoke((MGBBB_PcmExtIfBatch)MGBBB_PcmExtIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PcmExtIf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR createPcmExtIf_Upd01_CndR(){
			return mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>wip_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR
		 */
		public mcframe.serverMGBB.MGBBB0040.PcmExtIf_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBB_PcmExtIfBatch)MGBBB_PcmExtIfBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}