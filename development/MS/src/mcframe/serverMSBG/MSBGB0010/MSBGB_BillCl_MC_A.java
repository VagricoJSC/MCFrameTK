package mcframe.serverMSBG.MSBGB0010;

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
 * "MSBGB_BillCl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGB_BillCl_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGB_BillCl.BillCl_Upd01 aBillCl_Upd01;

	protected void initBillCl_Upd01() {
		this.info = PDef.MS_MSBGB0010_BillCl_Upd01_INFO;
		this.aBillCl_Upd01 = ((MSBGB_BillCl)this).new BillCl_Upd01();
	}

	public static MSBGB_BillCl.BillCl_Upd01 crtBillCl_Upd01() {
		MSBGB_BillCl lgc = new MSBGB_BillCl();
		lgc.initBillCl_Upd01();
		return lgc.aBillCl_Upd01;
	}

	protected void paramBillCl_Upd01(MCParam p) {
		if (this.aBillCl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillCl_Upd01.up0());
	}

	protected void doBillCl_Upd01() {
		aBillCl_Upd01.call();
	};

	/**
	 * BillCl_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR createBillCl_Upd01_CndR(){
		return mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BillCl_Upd01オペレーション.<p>
	 *
	 */
	abstract public class BillCl_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillCl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected BillCl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR.create();

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
			invoke((MSBGB_BillCl)MSBGB_BillCl_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BillCl_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR createBillCl_Upd01_CndR(){
			return mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR
		 */
		public mcframe.serverMSBG.MSBGB0010.BillCl_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGB_BillCl)MSBGB_BillCl_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}