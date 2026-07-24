package mcframe.serverMBBB.MBBBL5060;

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
 * "MBBBL_SendAcMstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBL_SendAcMstService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String LOGIC_ID = "MBBBL5060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBL_SendAcMstService.SendAcMst_Chk01 aSendAcMst_Chk01;

	protected void initSendAcMst_Chk01() {
		this.info = PDef.MB_MBBBL5060_SendAcMst_Chk01_INFO;
		this.aSendAcMst_Chk01 = ((MBBBL_SendAcMstService)this).new SendAcMst_Chk01();
	}

	public static MBBBL_SendAcMstService.SendAcMst_Chk01 crtSendAcMst_Chk01() {
		MBBBL_SendAcMstService lgc = new MBBBL_SendAcMstService();
		lgc.initSendAcMst_Chk01();
		return lgc.aSendAcMst_Chk01;
	}

	protected void paramSendAcMst_Chk01(MCParam p) {
		if (this.aSendAcMst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAcMst_Chk01.up0());
		p.addDownBlock(aSendAcMst_Chk01.down0());
	}

	protected void doSendAcMst_Chk01() {
		aSendAcMst_Chk01.call();
	};

	/**
	 * SendAcMst_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR createSendAcMst_Chk01_CndR(){
		return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();
	}
	protected MBBBL_SendAcMstService.SendAcMst_Chk02 aSendAcMst_Chk02;

	protected void initSendAcMst_Chk02() {
		this.info = PDef.MB_MBBBL5060_SendAcMst_Chk02_INFO;
		this.aSendAcMst_Chk02 = ((MBBBL_SendAcMstService)this).new SendAcMst_Chk02();
	}

	public static MBBBL_SendAcMstService.SendAcMst_Chk02 crtSendAcMst_Chk02() {
		MBBBL_SendAcMstService lgc = new MBBBL_SendAcMstService();
		lgc.initSendAcMst_Chk02();
		return lgc.aSendAcMst_Chk02;
	}

	protected void paramSendAcMst_Chk02(MCParam p) {
		if (this.aSendAcMst_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAcMst_Chk02.up0());
		p.addDownBlock(aSendAcMst_Chk02.down0());
	}

	protected void doSendAcMst_Chk02() {
		aSendAcMst_Chk02.call();
	};

	/**
	 * SendAcMst_Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR createSendAcMst_Chk02_CndR(){
		return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();
	}
	protected MBBBL_SendAcMstService.SendAcMst_Upd01 aSendAcMst_Upd01;

	protected void initSendAcMst_Upd01() {
		this.info = PDef.MB_MBBBL5060_SendAcMst_Upd01_INFO;
		this.aSendAcMst_Upd01 = ((MBBBL_SendAcMstService)this).new SendAcMst_Upd01();
	}

	public static MBBBL_SendAcMstService.SendAcMst_Upd01 crtSendAcMst_Upd01() {
		MBBBL_SendAcMstService lgc = new MBBBL_SendAcMstService();
		lgc.initSendAcMst_Upd01();
		return lgc.aSendAcMst_Upd01;
	}

	protected void paramSendAcMst_Upd01(MCParam p) {
		if (this.aSendAcMst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAcMst_Upd01.up0());
		p.addDownBlock(aSendAcMst_Upd01.down0());
	}

	protected void doSendAcMst_Upd01() {
		aSendAcMst_Upd01.call();
	};

	/**
	 * SendAcMst_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR createSendAcMst_Upd01_CndR(){
		return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();
	}
	protected MBBBL_SendAcMstService.SendAcMst_Del01 aSendAcMst_Del01;

	protected void initSendAcMst_Del01() {
		this.info = PDef.MB_MBBBL5060_SendAcMst_Del01_INFO;
		this.aSendAcMst_Del01 = ((MBBBL_SendAcMstService)this).new SendAcMst_Del01();
	}

	public static MBBBL_SendAcMstService.SendAcMst_Del01 crtSendAcMst_Del01() {
		MBBBL_SendAcMstService lgc = new MBBBL_SendAcMstService();
		lgc.initSendAcMst_Del01();
		return lgc.aSendAcMst_Del01;
	}

	protected void paramSendAcMst_Del01(MCParam p) {
		if (this.aSendAcMst_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAcMst_Del01.up0());
		p.addDownBlock(aSendAcMst_Del01.down0());
	}

	protected void doSendAcMst_Del01() {
		aSendAcMst_Del01.call();
	};

	/**
	 * SendAcMst_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR createSendAcMst_Del01_CndR(){
		return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendAcMst_Chk01オペレーション.<p>
	 *
	 * 会計マスタ情報送信前チェック<br>
	 */
	abstract public class SendAcMst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAcMst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected SendAcMst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();

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
			invoke((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAcMst_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR createSendAcMst_Chk01_CndR(){
			return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this).info;
		}


	}
	/**
	 * SendAcMst_Chk02オペレーション.<p>
	 *
	 * 会計マスタ情報送信取消前チェック<br>
	 */
	abstract public class SendAcMst_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAcMst_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR down0;
		
		
		// コンストラクタ
		protected SendAcMst_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();

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
			invoke((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAcMst_Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR createSendAcMst_Chk02_CndR(){
			return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this).info;
		}


	}
	/**
	 * SendAcMst_Upd01オペレーション.<p>
	 *
	 * 会計マスタ情報を送信する。<br>
	 */
	abstract public class SendAcMst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAcMst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected SendAcMst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();

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
			invoke((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAcMst_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR createSendAcMst_Upd01_CndR(){
			return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR up0() {
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
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this).info;
		}


	}
	/**
	 * SendAcMst_Del01オペレーション.<p>
	 *
	 * 会計マスタ情報の送信を取り消す。<br>
	 */
	abstract public class SendAcMst_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAcMst_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR down0;
		
		
		// コンストラクタ
		protected SendAcMst_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();
			down0 = mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();

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
			invoke((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAcMst_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR createSendAcMst_Del01_CndR(){
			return mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR up0() {
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
		 * @see mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR
		 */
		public mcframe.serverMBBB.MBBBL5060.SendAcMst_Chk02_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcMstService)MBBBL_SendAcMstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}