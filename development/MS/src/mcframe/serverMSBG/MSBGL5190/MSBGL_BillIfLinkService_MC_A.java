package mcframe.serverMSBG.MSBGL5190;

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
 * "MSBGL_BillIfLinkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_BillIfLinkService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBGL5190";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_BillIfLinkService.Send_Chk01 aSend_Chk01;

	protected void initSend_Chk01() {
		this.info = PDef.MS_MSBGL5190_Send_Chk01_INFO;
		this.aSend_Chk01 = ((MSBGL_BillIfLinkService)this).new Send_Chk01();
	}

	public static MSBGL_BillIfLinkService.Send_Chk01 crtSend_Chk01() {
		MSBGL_BillIfLinkService lgc = new MSBGL_BillIfLinkService();
		lgc.initSend_Chk01();
		return lgc.aSend_Chk01;
	}

	protected void paramSend_Chk01(MCParam p) {
		if (this.aSend_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSend_Chk01.up0());
		p.addDownBlock(aSend_Chk01.down0());
	}

	protected void doSend_Chk01() {
		aSend_Chk01.call();
	};

	/**
	 * Send_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5190.Send_DtlR createSend_DtlR(){
		return mcframe.serverMSBG.MSBGL5190.Send_DtlR.create();
	}
	protected MSBGL_BillIfLinkService.Send_Upd01 aSend_Upd01;

	protected void initSend_Upd01() {
		this.info = PDef.MS_MSBGL5190_Send_Upd01_INFO;
		this.aSend_Upd01 = ((MSBGL_BillIfLinkService)this).new Send_Upd01();
	}

	public static MSBGL_BillIfLinkService.Send_Upd01 crtSend_Upd01() {
		MSBGL_BillIfLinkService lgc = new MSBGL_BillIfLinkService();
		lgc.initSend_Upd01();
		return lgc.aSend_Upd01;
	}

	protected void paramSend_Upd01(MCParam p) {
		if (this.aSend_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSend_Upd01.up0());
	}

	protected void doSend_Upd01() {
		aSend_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Send_Chk01オペレーション.<p>
	 *
	 * 送信前チェック<br>
	 */
	abstract public class Send_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Send_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5190.Send_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5190.Send_DtlR down0;
		
		
		// コンストラクタ
		protected Send_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL5190.Send_DtlR.create();
			down0 = mcframe.serverMSBG.MSBGL5190.Send_DtlR.create();

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
			invoke((MSBGL_BillIfLinkService)MSBGL_BillIfLinkService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Send_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5190.Send_DtlR createSend_DtlR(){
			return mcframe.serverMSBG.MSBGL5190.Send_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5190.Send_DtlR
		 */
		public mcframe.serverMSBG.MSBGL5190.Send_DtlR up0() {
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
		 * @see mcframe.serverMSBG.MSBGL5190.Send_DtlR
		 */
		public mcframe.serverMSBG.MSBGL5190.Send_DtlR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_BillIfLinkService)MSBGL_BillIfLinkService_MC_A.this).info;
		}


	}
	/**
	 * Send_Upd01オペレーション.<p>
	 *
	 * 請求ＩＦ送信サービスを実行する<br>
	 */
	abstract public class Send_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Send_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5190.Send_DtlR up0;
		
		
		// コンストラクタ
		protected Send_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL5190.Send_DtlR.create();

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
			invoke((MSBGL_BillIfLinkService)MSBGL_BillIfLinkService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Send_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5190.Send_DtlR createSend_DtlR(){
			return mcframe.serverMSBG.MSBGL5190.Send_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5190.Send_DtlR
		 */
		public mcframe.serverMSBG.MSBGL5190.Send_DtlR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_BillIfLinkService)MSBGL_BillIfLinkService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}