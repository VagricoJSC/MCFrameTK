package mcframe.serverMGBB.MGBBB0010;

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
 * "MGBBB_PcmIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBB_PcmIfBatch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBBB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBBB_PcmIfBatch.PcmIf_Upd01 aPcmIf_Upd01;

	protected void initPcmIf_Upd01() {
		this.info = PDef.MG_MGBBB0010_PcmIf_Upd01_INFO;
		this.aPcmIf_Upd01 = ((MGBBB_PcmIfBatch)this).new PcmIf_Upd01();
	}

	public static MGBBB_PcmIfBatch.PcmIf_Upd01 crtPcmIf_Upd01() {
		MGBBB_PcmIfBatch lgc = new MGBBB_PcmIfBatch();
		lgc.initPcmIf_Upd01();
		return lgc.aPcmIf_Upd01;
	}

	protected void paramPcmIf_Upd01(MCParam p) {
		if (this.aPcmIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmIf_Upd01.up0());
	}

	protected void doPcmIf_Upd01() {
		aPcmIf_Upd01.call();
	};

	/**
	 * PcmIf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR createPcmIf_Upd01_CndR(){
		return mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PcmIf_Upd01オペレーション.<p>
	 *
	 * 原価ＩＦデータを取り込む。<br>
	 */
	abstract public class PcmIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected PcmIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR.create();

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
			invoke((MGBBB_PcmIfBatch)MGBBB_PcmIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PcmIf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR createPcmIf_Upd01_CndR(){
			return mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR.create();
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
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>wip_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>non_mov_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR
		 */
		public mcframe.serverMGBB.MGBBB0010.PcmIf_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBB_PcmIfBatch)MGBBB_PcmIfBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}