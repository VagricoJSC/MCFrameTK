package mcframe.serverMBBB.MBBBL5040;

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
 * "MBBBL_SendAcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBL_SendAcService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String LOGIC_ID = "MBBBL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBL_SendAcService.SendAc_Chk01 aSendAc_Chk01;

	protected void initSendAc_Chk01() {
		this.info = PDef.MB_MBBBL5040_SendAc_Chk01_INFO;
		this.aSendAc_Chk01 = ((MBBBL_SendAcService)this).new SendAc_Chk01();
	}

	public static MBBBL_SendAcService.SendAc_Chk01 crtSendAc_Chk01() {
		MBBBL_SendAcService lgc = new MBBBL_SendAcService();
		lgc.initSendAc_Chk01();
		return lgc.aSendAc_Chk01;
	}

	protected void paramSendAc_Chk01(MCParam p) {
		if (this.aSendAc_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAc_Chk01.up0());
		p.addDownBlock(aSendAc_Chk01.down0());
	}

	protected void doSendAc_Chk01() {
		aSendAc_Chk01.call();
	};

	/**
	 * SendAc_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR createSendAc_Chk01_DtlR(){
		return mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.create();
	}

	/**
	 * SendAc_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> createSendAc_Chk01_DtlL(){
		return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);
	}
	protected MBBBL_SendAcService.SendAc_Chk02 aSendAc_Chk02;

	protected void initSendAc_Chk02() {
		this.info = PDef.MB_MBBBL5040_SendAc_Chk02_INFO;
		this.aSendAc_Chk02 = ((MBBBL_SendAcService)this).new SendAc_Chk02();
	}

	public static MBBBL_SendAcService.SendAc_Chk02 crtSendAc_Chk02() {
		MBBBL_SendAcService lgc = new MBBBL_SendAcService();
		lgc.initSendAc_Chk02();
		return lgc.aSendAc_Chk02;
	}

	protected void paramSendAc_Chk02(MCParam p) {
		if (this.aSendAc_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAc_Chk02.up0());
		p.addDownBlock(aSendAc_Chk02.down0());
	}

	protected void doSendAc_Chk02() {
		aSendAc_Chk02.call();
	};

	/**
	 * SendAc_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR createSendAc_Chk02_DtlR(){
		return mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.create();
	}

	/**
	 * SendAc_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> createSendAc_Chk02_DtlL(){
		return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);
	}
	protected MBBBL_SendAcService.SendAc_Ins01 aSendAc_Ins01;

	protected void initSendAc_Ins01() {
		this.info = PDef.MB_MBBBL5040_SendAc_Ins01_INFO;
		this.aSendAc_Ins01 = ((MBBBL_SendAcService)this).new SendAc_Ins01();
	}

	public static MBBBL_SendAcService.SendAc_Ins01 crtSendAc_Ins01() {
		MBBBL_SendAcService lgc = new MBBBL_SendAcService();
		lgc.initSendAc_Ins01();
		return lgc.aSendAc_Ins01;
	}

	protected void paramSendAc_Ins01(MCParam p) {
		if (this.aSendAc_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAc_Ins01.up0());
		p.addDownBlock(aSendAc_Ins01.down0());
	}

	protected void doSendAc_Ins01() {
		aSendAc_Ins01.call();
	};

	/**
	 * SendAc_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR createSendAc_Ins01_DtlR(){
		return mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.create();
	}

	/**
	 * SendAc_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> createSendAc_Ins01_DtlL(){
		return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);
	}
	protected MBBBL_SendAcService.SendAc_Del01 aSendAc_Del01;

	protected void initSendAc_Del01() {
		this.info = PDef.MB_MBBBL5040_SendAc_Del01_INFO;
		this.aSendAc_Del01 = ((MBBBL_SendAcService)this).new SendAc_Del01();
	}

	public static MBBBL_SendAcService.SendAc_Del01 crtSendAc_Del01() {
		MBBBL_SendAcService lgc = new MBBBL_SendAcService();
		lgc.initSendAc_Del01();
		return lgc.aSendAc_Del01;
	}

	protected void paramSendAc_Del01(MCParam p) {
		if (this.aSendAc_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendAc_Del01.up0());
		p.addDownBlock(aSendAc_Del01.down0());
	}

	protected void doSendAc_Del01() {
		aSendAc_Del01.call();
	};

	/**
	 * SendAc_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR createSendAc_Del01_DtlR(){
		return mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.create();
	}

	/**
	 * SendAc_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> createSendAc_Del01_DtlL(){
		return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendAc_Chk01オペレーション.<p>
	 *
	 * 会計データの送信前チェック<br>
	 */
	abstract public class SendAc_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAc_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected SendAc_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);

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
			invoke((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAc_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR createSendAc_Chk01_DtlR(){
			return mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.create();
		}

		/**
		 * SendAc_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> createSendAc_Chk01_DtlL(){
			return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.data_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.data_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this).info;
		}


	}
	/**
	 * SendAc_Chk02オペレーション.<p>
	 *
	 * 送信済み会計データの取消前チェック<br>
	 */
	abstract public class SendAc_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAc_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected SendAc_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);

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
			invoke((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAc_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR createSendAc_Chk02_DtlR(){
			return mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.create();
		}

		/**
		 * SendAc_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> createSendAc_Chk02_DtlL(){
			return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.data_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.data_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this).info;
		}


	}
	/**
	 * SendAc_Ins01オペレーション.<p>
	 *
	 * 会計データを送信する。<br>
	 */
	abstract public class SendAc_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAc_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected SendAc_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);

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
			invoke((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAc_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR createSendAc_Ins01_DtlR(){
			return mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.create();
		}

		/**
		 * SendAc_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> createSendAc_Ins01_DtlL(){
			return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.data_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this).info;
		}


	}
	/**
	 * SendAc_Del01オペレーション.<p>
	 *
	 * 送信済み会計データを取り消す。<br>
	 */
	abstract public class SendAc_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendAc_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected SendAc_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);

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
			invoke((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SendAc_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR createSendAc_Del01_DtlR(){
			return mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.create();
		}

		/**
		 * SendAc_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> createSendAc_Del01_DtlL(){
			return MCList.create(mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_grp_no</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.data_typ</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.jnl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>jnl_his.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL5040.SendAc_Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_SendAcService)MBBBL_SendAcService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}