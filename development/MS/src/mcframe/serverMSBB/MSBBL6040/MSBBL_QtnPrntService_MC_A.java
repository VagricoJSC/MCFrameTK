package mcframe.serverMSBB.MSBBL6040;

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
 * "MSBBL_QtnPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_QtnPrntService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBBL6040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_QtnPrntService.Qtn_Prnt01 aQtn_Prnt01;

	protected void initQtn_Prnt01() {
		this.info = PDef.MS_MSBBL6040_Qtn_Prnt01_INFO;
		this.aQtn_Prnt01 = ((MSBBL_QtnPrntService)this).new Qtn_Prnt01();
	}

	public static MSBBL_QtnPrntService.Qtn_Prnt01 crtQtn_Prnt01() {
		MSBBL_QtnPrntService lgc = new MSBBL_QtnPrntService();
		lgc.initQtn_Prnt01();
		return lgc.aQtn_Prnt01;
	}

	protected void paramQtn_Prnt01(MCParam p) {
		if (this.aQtn_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aQtn_Prnt01.up0());
		p.addUpBlock(aQtn_Prnt01.up1());
		p.addDownBlock(aQtn_Prnt01.down0());
	}

	protected void doQtn_Prnt01() {
		aQtn_Prnt01.call();
	};

	/**
	 * Qtn_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR createQtn_Prnt01_HdrR(){
		return mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR.create();
	}

	/**
	 * Qtn_Prnt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR> createQtn_Prnt01_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR.class);
	}

	/**
	 * Qtn_Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR createQtn_Prnt01_CndR(){
		return mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Qtn_Prnt01オペレーション.<p>
	 *
	 * 見積書を発行します。<br>
	 */
	abstract public class Qtn_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Qtn_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR> down0;
		
		
		// コンストラクタ
		protected Qtn_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR.class);
			up1 = mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_QtnPrntService)MSBBL_QtnPrntService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Qtn_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR createQtn_Prnt01_HdrR(){
			return mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR.create();
		}

		/**
		 * Qtn_Prnt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR> createQtn_Prnt01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR.class);
		}

		/**
		 * Qtn_Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR createQtn_Prnt01_CndR(){
			return mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_prnt_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR
		 */
		public mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6040.Qtn_Prnt01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_QtnPrntService)MSBBL_QtnPrntService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}