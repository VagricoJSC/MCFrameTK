package mcframe.serverMSBB.MSBBLA0020;

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
 * "MSBBLA_ShipItmCompSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBLA_ShipItmCompSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBBLA0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBLA_ShipItmCompSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBLA0020_Srch01_INFO;
		this.aSrch01 = ((MSBBLA_ShipItmCompSrch)this).new Srch01();
	}

	public static MSBBLA_ShipItmCompSrch.Srch01 crtSrch01() {
		MSBBLA_ShipItmCompSrch lgc = new MSBBLA_ShipItmCompSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBLA0020.CndR createCndR(){
		return mcframe.serverMSBB.MSBBLA0020.CndR.create();
	}

	/**
	 * RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBLA0020.RsltR createRsltR(){
		return mcframe.serverMSBB.MSBBLA0020.RsltR.create();
	}

	/**
	 * RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBLA0020.RsltR> createRsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBLA0020.RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製品出荷構成の検索を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBLA0020.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBLA0020.RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBLA0020.CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBLA0020.RsltR.class);

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
			invoke((MSBBLA_ShipItmCompSrch)MSBBLA_ShipItmCompSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBLA0020.CndR createCndR(){
			return mcframe.serverMSBB.MSBBLA0020.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBLA0020.RsltR createRsltR(){
			return mcframe.serverMSBB.MSBBLA0020.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBLA0020.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBLA0020.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prod_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>surv_line_qty</td></tr>
		 * 	<tr><td><br></td><td>diameter</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBLA0020.CndR
		 */
		public mcframe.serverMSBB.MSBBLA0020.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prod_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>prod_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>surv_line_qty</td></tr>
		 * 	<tr><td><br></td><td>diameter</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>body_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBLA0020.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBLA_ShipItmCompSrch)MSBBLA_ShipItmCompSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}