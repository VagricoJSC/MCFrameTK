package mcframe.serverMGBB.MGBBL5020;

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
 * "MGBBL_PcmActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBL_PcmActService_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBBL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBBL_PcmActService.PcmAct_Chk01 aPcmAct_Chk01;

	protected void initPcmAct_Chk01() {
		this.info = PDef.MG_MGBBL5020_PcmAct_Chk01_INFO;
		this.aPcmAct_Chk01 = ((MGBBL_PcmActService)this).new PcmAct_Chk01();
	}

	public static MGBBL_PcmActService.PcmAct_Chk01 crtPcmAct_Chk01() {
		MGBBL_PcmActService lgc = new MGBBL_PcmActService();
		lgc.initPcmAct_Chk01();
		return lgc.aPcmAct_Chk01;
	}

	protected void paramPcmAct_Chk01(MCParam p) {
		if (this.aPcmAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmAct_Chk01.up0());
		p.addDownBlock(aPcmAct_Chk01.down0());
	}

	protected void doPcmAct_Chk01() {
		aPcmAct_Chk01.call();
	};

	/**
	 * PcmAct_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR createPcmAct_Chk01_CndR(){
		return mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();
	}
	protected MGBBL_PcmActService.PcmAct_Upd01 aPcmAct_Upd01;

	protected void initPcmAct_Upd01() {
		this.info = PDef.MG_MGBBL5020_PcmAct_Upd01_INFO;
		this.aPcmAct_Upd01 = ((MGBBL_PcmActService)this).new PcmAct_Upd01();
	}

	public static MGBBL_PcmActService.PcmAct_Upd01 crtPcmAct_Upd01() {
		MGBBL_PcmActService lgc = new MGBBL_PcmActService();
		lgc.initPcmAct_Upd01();
		return lgc.aPcmAct_Upd01;
	}

	protected void paramPcmAct_Upd01(MCParam p) {
		if (this.aPcmAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPcmAct_Upd01.up0());
		p.addDownBlock(aPcmAct_Upd01.down0());
	}

	protected void doPcmAct_Upd01() {
		aPcmAct_Upd01.call();
	};

	/**
	 * PcmAct_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR createPcmAct_Upd01_CndR(){
		return mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PcmAct_Chk01オペレーション.<p>
	 *
	 * 原価実績データ作成前チェック<br>
	 */
	abstract public class PcmAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();

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
			invoke((MGBBL_PcmActService)MGBBL_PcmActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmAct_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR createPcmAct_Chk01_CndR(){
			return mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmActService)MGBBL_PcmActService_MC_A.this).info;
		}


	}
	/**
	 * PcmAct_Upd01オペレーション.<p>
	 *
	 * 原価実績データを作成する。<br>
	 */
	abstract public class PcmAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PcmAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PcmAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();
			down0 = mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();

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
			invoke((MGBBL_PcmActService)MGBBL_PcmActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PcmAct_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR createPcmAct_Upd01_CndR(){
			return mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR up0() {
			return up0;
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
		 * @see mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR
		 */
		public mcframe.serverMGBB.MGBBL5020.PcmAct_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_PcmActService)MGBBL_PcmActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}