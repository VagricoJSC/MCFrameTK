package mcframe.serverMSBE.MSBEL5710;

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
 * "MSBEL_ExActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ExActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5710";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ExActService.ExAct_Upd01 aExAct_Upd01;

	protected void initExAct_Upd01() {
		this.info = PDef.MS_MSBEL5710_ExAct_Upd01_INFO;
		this.aExAct_Upd01 = ((MSBEL_ExActService)this).new ExAct_Upd01();
	}

	public static MSBEL_ExActService.ExAct_Upd01 crtExAct_Upd01() {
		MSBEL_ExActService lgc = new MSBEL_ExActService();
		lgc.initExAct_Upd01();
		return lgc.aExAct_Upd01;
	}

	protected void paramExAct_Upd01(MCParam p) {
		if (this.aExAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExAct_Upd01.up0());
		p.addUpBlock(aExAct_Upd01.up1());
	}

	protected void doExAct_Upd01() {
		aExAct_Upd01.call();
	};

	/**
	 * ExAct_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR createExAct_Upd01_HdrR(){
		return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR.create();
	}

	/**
	 * ExAct_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR createExAct_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.create();
	}

	/**
	 * ExAct_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> createExAct_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.class);
	}

	/**
	 * ExAct_Upd01_SrcブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR createExAct_Upd01_SrcR(){
		return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.create();
	}

	/**
	 * ExAct_Upd01_SrcブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> createExAct_Upd01_SrcL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.class);
	}
	protected MSBEL_ExActService.ExAct_Del01 aExAct_Del01;

	protected void initExAct_Del01() {
		this.info = PDef.MS_MSBEL5710_ExAct_Del01_INFO;
		this.aExAct_Del01 = ((MSBEL_ExActService)this).new ExAct_Del01();
	}

	public static MSBEL_ExActService.ExAct_Del01 crtExAct_Del01() {
		MSBEL_ExActService lgc = new MSBEL_ExActService();
		lgc.initExAct_Del01();
		return lgc.aExAct_Del01;
	}

	protected void paramExAct_Del01(MCParam p) {
		if (this.aExAct_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExAct_Del01.up0());
	}

	protected void doExAct_Del01() {
		aExAct_Del01.call();
	};

	/**
	 * ExAct_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR createExAct_Del01_DtlR(){
		return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.create();
	}

	/**
	 * ExAct_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> createExAct_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.class);
	}

	/**
	 * ExAct_Del01_SrcブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR createExAct_Del01_SrcR(){
		return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.create();
	}

	/**
	 * ExAct_Del01_SrcブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> createExAct_Del01_SrcL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.class);
	}
	protected MSBEL_ExActService.ExAct_Upd02 aExAct_Upd02;

	protected void initExAct_Upd02() {
		this.info = PDef.MS_MSBEL5710_ExAct_Upd02_INFO;
		this.aExAct_Upd02 = ((MSBEL_ExActService)this).new ExAct_Upd02();
	}

	public static MSBEL_ExActService.ExAct_Upd02 crtExAct_Upd02() {
		MSBEL_ExActService lgc = new MSBEL_ExActService();
		lgc.initExAct_Upd02();
		return lgc.aExAct_Upd02;
	}

	protected void paramExAct_Upd02(MCParam p) {
		if (this.aExAct_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExAct_Upd02.up0());
		p.addDownBlock(aExAct_Upd02.down0());
	}

	protected void doExAct_Upd02() {
		aExAct_Upd02.call();
	};

	/**
	 * ExAct_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR createExAct_Upd02_DtlR(){
		return mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.create();
	}

	/**
	 * ExAct_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> createExAct_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);
	}
	protected MSBEL_ExActService.ExAct_Chk02 aExAct_Chk02;

	protected void initExAct_Chk02() {
		this.info = PDef.MS_MSBEL5710_ExAct_Chk02_INFO;
		this.aExAct_Chk02 = ((MSBEL_ExActService)this).new ExAct_Chk02();
	}

	public static MSBEL_ExActService.ExAct_Chk02 crtExAct_Chk02() {
		MSBEL_ExActService lgc = new MSBEL_ExActService();
		lgc.initExAct_Chk02();
		return lgc.aExAct_Chk02;
	}

	protected void paramExAct_Chk02(MCParam p) {
		if (this.aExAct_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExAct_Chk02.up0());
		p.addDownBlock(aExAct_Chk02.down0());
	}

	protected void doExAct_Chk02() {
		aExAct_Chk02.call();
	};

	/**
	 * ExAct_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR createExAct_Chk02_DtlR(){
		return mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.create();
	}

	/**
	 * ExAct_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> createExAct_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ExAct_Upd01オペレーション.<p>
	 *
	 * 輸出実績を登録・更新する。<br>
	 */
	abstract public class ExAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> up1;
		/** [ExAct_Upd01_Src]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> aExAct_Upd01_Src;
		
		
		// コンストラクタ
		protected ExAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.class);
			aExAct_Upd01_Src = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.class);

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
			invoke((MSBEL_ExActService)MSBEL_ExActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExAct_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR createExAct_Upd01_HdrR(){
			return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR.create();
		}

		/**
		 * ExAct_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR createExAct_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.create();
		}

		/**
		 * ExAct_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> createExAct_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.class);
		}

		/**
		 * ExAct_Upd01_SrcブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR createExAct_Upd01_SrcR(){
			return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.create();
		}

		/**
		 * ExAct_Upd01_SrcブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> createExAct_Upd01_SrcL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> up1() {
			return up1;
		}



		/**
		 * [ExAct_Upd01_Src]ブロックのコンテナaExAct_Upd01_SrcLを返します。
		 *
		 * @return ExAct_Upd01_SrcL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> ExAct_Upd01_Src() {
			return aExAct_Upd01_Src;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActService)MSBEL_ExActService_MC_A.this).info;
		}


	}
	/**
	 * ExAct_Del01オペレーション.<p>
	 *
	 * 輸出実績を削除する。<br>
	 */
	abstract public class ExAct_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExAct_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> up0;
		/** [ExAct_Del01_Src]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> aExAct_Del01_Src;
		
		
		// コンストラクタ
		protected ExAct_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.class);
			aExAct_Del01_Src = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.class);

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
			invoke((MSBEL_ExActService)MSBEL_ExActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExAct_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR createExAct_Del01_DtlR(){
			return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.create();
		}

		/**
		 * ExAct_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> createExAct_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR.class);
		}

		/**
		 * ExAct_Del01_SrcブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR createExAct_Del01_SrcR(){
			return mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.create();
		}

		/**
		 * ExAct_Del01_SrcブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> createExAct_Del01_SrcL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_DtlR> up0() {
			return up0;
		}



		/**
		 * [ExAct_Del01_Src]ブロックのコンテナaExAct_Del01_SrcLを返します。
		 *
		 * @return ExAct_Del01_SrcL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd01_SrcR> ExAct_Del01_Src() {
			return aExAct_Del01_Src;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActService)MSBEL_ExActService_MC_A.this).info;
		}


	}
	/**
	 * ExAct_Upd02オペレーション.<p>
	 *
	 * 輸出実績対象外のインボイスを完了更新する。<br>
	 */
	abstract public class ExAct_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExAct_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> down0;
		
		
		// コンストラクタ
		protected ExAct_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);

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
			invoke((MSBEL_ExActService)MSBEL_ExActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExAct_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR createExAct_Upd02_DtlR(){
			return mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.create();
		}

		/**
		 * ExAct_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> createExAct_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActService)MSBEL_ExActService_MC_A.this).info;
		}


	}
	/**
	 * ExAct_Chk02オペレーション.<p>
	 *
	 * 輸出実績対象外のインボイスを完了更新する前のチェック処理を行う。<br>
	 */
	abstract public class ExAct_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExAct_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> down0;
		
		
		// コンストラクタ
		protected ExAct_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);

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
			invoke((MSBEL_ExActService)MSBEL_ExActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExAct_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR createExAct_Chk02_DtlR(){
			return mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.create();
		}

		/**
		 * ExAct_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> createExAct_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5710.ExAct_Upd02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ExActService)MSBEL_ExActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}