package mcframe.serverMBBB.MBBBL5020;

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
 * "MBBBL_AcIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBL_AcIfService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String LOGIC_ID = "MBBBL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBL_AcIfService.AcIf_Chk01 aAcIf_Chk01;

	protected void initAcIf_Chk01() {
		this.info = PDef.MB_MBBBL5020_AcIf_Chk01_INFO;
		this.aAcIf_Chk01 = ((MBBBL_AcIfService)this).new AcIf_Chk01();
	}

	public static MBBBL_AcIfService.AcIf_Chk01 crtAcIf_Chk01() {
		MBBBL_AcIfService lgc = new MBBBL_AcIfService();
		lgc.initAcIf_Chk01();
		return lgc.aAcIf_Chk01;
	}

	protected void paramAcIf_Chk01(MCParam p) {
		if (this.aAcIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcIf_Chk01.up0());
		p.addDownBlock(aAcIf_Chk01.down0());
	}

	protected void doAcIf_Chk01() {
		aAcIf_Chk01.call();
	};

	/**
	 * AcIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR createAcIf_Chk01_CndR(){
		return mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();
	}
	protected MBBBL_AcIfService.AcIf_Upd01 aAcIf_Upd01;

	protected void initAcIf_Upd01() {
		this.info = PDef.MB_MBBBL5020_AcIf_Upd01_INFO;
		this.aAcIf_Upd01 = ((MBBBL_AcIfService)this).new AcIf_Upd01();
	}

	public static MBBBL_AcIfService.AcIf_Upd01 crtAcIf_Upd01() {
		MBBBL_AcIfService lgc = new MBBBL_AcIfService();
		lgc.initAcIf_Upd01();
		return lgc.aAcIf_Upd01;
	}

	protected void paramAcIf_Upd01(MCParam p) {
		if (this.aAcIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcIf_Upd01.up0());
		p.addDownBlock(aAcIf_Upd01.down0());
	}

	protected void doAcIf_Upd01() {
		aAcIf_Upd01.call();
	};

	/**
	 * AcIf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR createAcIf_Upd01_CndR(){
		return mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AcIf_Chk01オペレーション.<p>
	 *
	 * 会計ＩＦデータ取込前チェック<br>
	 */
	abstract public class AcIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected AcIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();

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
			invoke((MBBBL_AcIfService)MBBBL_AcIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AcIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR createAcIf_Chk01_CndR(){
			return mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();
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
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_flg</td></tr>
		 * 	<tr><td><br></td><td>schdpay_flg</td></tr>
		 * 	<tr><td><br></td><td>note_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>reget_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_flg</td></tr>
		 * 	<tr><td><br></td><td>schdpay_flg</td></tr>
		 * 	<tr><td><br></td><td>note_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>reget_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_AcIfService)MBBBL_AcIfService_MC_A.this).info;
		}


	}
	/**
	 * AcIf_Upd01オペレーション.<p>
	 *
	 * 会計ＩＦデータを取り込む。<br>
	 */
	abstract public class AcIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected AcIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();

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
			invoke((MBBBL_AcIfService)MBBBL_AcIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AcIf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR createAcIf_Upd01_CndR(){
			return mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR.create();
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
		 * 	<tr><td><br></td><td>io_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_flg</td></tr>
		 * 	<tr><td><br></td><td>schdpay_flg</td></tr>
		 * 	<tr><td><br></td><td>note_flg</td></tr>
		 * 	<tr><td><br></td><td>rerun_flg</td></tr>
		 * 	<tr><td><br></td><td>reget_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR up0() {
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
		 * @see mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5020.AcIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_AcIfService)MBBBL_AcIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}