package mcframe.serverMBBE.MBBEL5030;

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
 * "MBBEL_RecvExtMstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEL_RecvExtMstService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBEL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBEL_RecvExtMstService.RecvExtMst_Chk01 aRecvExtMst_Chk01;

	protected void initRecvExtMst_Chk01() {
		this.info = PDef.MB_MBBEL5030_RecvExtMst_Chk01_INFO;
		this.aRecvExtMst_Chk01 = ((MBBEL_RecvExtMstService)this).new RecvExtMst_Chk01();
	}

	public static MBBEL_RecvExtMstService.RecvExtMst_Chk01 crtRecvExtMst_Chk01() {
		MBBEL_RecvExtMstService lgc = new MBBEL_RecvExtMstService();
		lgc.initRecvExtMst_Chk01();
		return lgc.aRecvExtMst_Chk01;
	}

	protected void paramRecvExtMst_Chk01(MCParam p) {
		if (this.aRecvExtMst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRecvExtMst_Chk01.up0());
		p.addUpBlock(aRecvExtMst_Chk01.up1());
		p.addDownBlock(aRecvExtMst_Chk01.down0());
	}

	protected void doRecvExtMst_Chk01() {
		aRecvExtMst_Chk01.call();
	};

	/**
	 * RecvExtMst_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR createRecvExtMst_Chk01_CndR(){
		return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR.create();
	}

	/**
	 * RecvExtMst_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR createRecvExtMst_Chk01_DtlR(){
		return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.create();
	}

	/**
	 * RecvExtMst_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> createRecvExtMst_Chk01_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.class);
	}
	protected MBBEL_RecvExtMstService.RecvExtMst_Upd01 aRecvExtMst_Upd01;

	protected void initRecvExtMst_Upd01() {
		this.info = PDef.MB_MBBEL5030_RecvExtMst_Upd01_INFO;
		this.aRecvExtMst_Upd01 = ((MBBEL_RecvExtMstService)this).new RecvExtMst_Upd01();
	}

	public static MBBEL_RecvExtMstService.RecvExtMst_Upd01 crtRecvExtMst_Upd01() {
		MBBEL_RecvExtMstService lgc = new MBBEL_RecvExtMstService();
		lgc.initRecvExtMst_Upd01();
		return lgc.aRecvExtMst_Upd01;
	}

	protected void paramRecvExtMst_Upd01(MCParam p) {
		if (this.aRecvExtMst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRecvExtMst_Upd01.up0());
		p.addUpBlock(aRecvExtMst_Upd01.up1());
	}

	protected void doRecvExtMst_Upd01() {
		aRecvExtMst_Upd01.call();
	};

	/**
	 * RecvExtMst_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR createRecvExtMst_Upd01_CndR(){
		return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR.create();
	}

	/**
	 * RecvExtMst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR createRecvExtMst_Upd01_DtlR(){
		return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.create();
	}

	/**
	 * RecvExtMst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> createRecvExtMst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.class);
	}
	protected MBBEL_RecvExtMstService.RecvExtMst_Upd02 aRecvExtMst_Upd02;

	protected void initRecvExtMst_Upd02() {
		this.info = PDef.MB_MBBEL5030_RecvExtMst_Upd02_INFO;
		this.aRecvExtMst_Upd02 = ((MBBEL_RecvExtMstService)this).new RecvExtMst_Upd02();
	}

	public static MBBEL_RecvExtMstService.RecvExtMst_Upd02 crtRecvExtMst_Upd02() {
		MBBEL_RecvExtMstService lgc = new MBBEL_RecvExtMstService();
		lgc.initRecvExtMst_Upd02();
		return lgc.aRecvExtMst_Upd02;
	}

	protected void paramRecvExtMst_Upd02(MCParam p) {
		if (this.aRecvExtMst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRecvExtMst_Upd02.up0());
		p.addUpBlock(aRecvExtMst_Upd02.up1());
		p.addDownBlock(aRecvExtMst_Upd02.down0());
	}

	protected void doRecvExtMst_Upd02() {
		aRecvExtMst_Upd02.call();
	};

	/**
	 * RecvExtMst_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createRecvExtMst_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * RecvExtMst_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createRecvExtMst_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * RecvExtMst_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createRecvExtMst_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * RecvExtMst_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRecvExtMst_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RecvExtMst_Chk01オペレーション.<p>
	 *
	 * 外部マスタ取込を行う前のチェック処理<br>
	 */
	abstract public class RecvExtMst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RecvExtMst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected RecvExtMst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.class);
			down0 = mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR.create();

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
			invoke((MBBEL_RecvExtMstService)MBBEL_RecvExtMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RecvExtMst_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR createRecvExtMst_Chk01_CndR(){
			return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR.create();
		}

		/**
		 * RecvExtMst_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR createRecvExtMst_Chk01_DtlR(){
			return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.create();
		}

		/**
		 * RecvExtMst_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> createRecvExtMst_Chk01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>master_check_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>master_check_dt</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_RecvExtMstService)MBBEL_RecvExtMstService_MC_A.this).info;
		}


	}
	/**
	 * RecvExtMst_Upd01オペレーション.<p>
	 *
	 * 外部マスタ取込を行う。（メイン処理）<br>
	 */
	abstract public class RecvExtMst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RecvExtMst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> up1;
		
		
		// コンストラクタ
		protected RecvExtMst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBEL_RecvExtMstService)MBBEL_RecvExtMstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RecvExtMst_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR createRecvExtMst_Upd01_CndR(){
			return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR.create();
		}

		/**
		 * RecvExtMst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR createRecvExtMst_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.create();
		}

		/**
		 * RecvExtMst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> createRecvExtMst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_master_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>master_check_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5030.RecvExtMst_Chk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_RecvExtMstService)MBBEL_RecvExtMstService_MC_A.this).info;
		}


	}
	/**
	 * RecvExtMst_Upd02オペレーション.<p>
	 *
	 * 外部マスタ取込を行う。（ＩＦデータ確認から呼び出される）<br>
	 */
	abstract public class RecvExtMst_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RecvExtMst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected RecvExtMst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			invoke((MBBEL_RecvExtMstService)MBBEL_RecvExtMstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RecvExtMst_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createRecvExtMst_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * RecvExtMst_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createRecvExtMst_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * RecvExtMst_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createRecvExtMst_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * RecvExtMst_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRecvExtMst_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_RecvExtMstService)MBBEL_RecvExtMstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}