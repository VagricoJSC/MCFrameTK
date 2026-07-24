package mcframe.serverMSBB.MSBBB0010;

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
 * "MSBBB_SloSumBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBB_SloSumBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBB_SloSumBatch.SloSum_Upd01 aSloSum_Upd01;

	protected void initSloSum_Upd01() {
		this.info = PDef.MS_MSBBB0010_SloSum_Upd01_INFO;
		this.aSloSum_Upd01 = ((MSBBB_SloSumBatch)this).new SloSum_Upd01();
	}

	public static MSBBB_SloSumBatch.SloSum_Upd01 crtSloSum_Upd01() {
		MSBBB_SloSumBatch lgc = new MSBBB_SloSumBatch();
		lgc.initSloSum_Upd01();
		return lgc.aSloSum_Upd01;
	}

	protected void paramSloSum_Upd01(MCParam p) {
		if (this.aSloSum_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloSum_Upd01.up0());
	}

	protected void doSloSum_Upd01() {
		aSloSum_Upd01.call();
	};

	/**
	 * SloSum_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR createSloSum_Upd01_CndR(){
		return mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SloSum_Upd01オペレーション.<p>
	 *
	 * 顧客期間内示・受注集計情報を更新する<br>
	 */
	abstract public class SloSum_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloSum_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected SloSum_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR.create();

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
			invoke((MSBBB_SloSumBatch)MSBBB_SloSumBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SloSum_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR createSloSum_Upd01_CndR(){
			return mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sum_st_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR
		 */
		public mcframe.serverMSBB.MSBBB0010.SloSum_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBB_SloSumBatch)MSBBB_SloSumBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}