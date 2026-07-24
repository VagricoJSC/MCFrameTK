package mcframe.serverMABC.MABCL1020;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_AccountReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_AccountReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL1020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_AccountReg.Account_UpdChk01 aAccount_UpdChk01;

	protected void initAccount_UpdChk01() {
		this.info = PDef.MA_MABCL1020_Account_UpdChk01_INFO;
		this.aAccount_UpdChk01 = ((MABCL_AccountReg)this).new Account_UpdChk01();
	}

	public static MABCL_AccountReg.Account_UpdChk01 crtAccount_UpdChk01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initAccount_UpdChk01();
		return lgc.aAccount_UpdChk01;
	}

	protected void paramAccount_UpdChk01(MCParam p) {
		if (this.aAccount_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccount_UpdChk01.up0());
	}

	protected void doAccount_UpdChk01() {
		aAccount_UpdChk01.call();
	};

	/**
	 * Account_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR createAccount_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.create();
	}

	/**
	 * Account_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> createAccount_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);
	}
	protected MABCL_AccountReg.Account_Upd01 aAccount_Upd01;

	protected void initAccount_Upd01() {
		this.info = PDef.MA_MABCL1020_Account_Upd01_INFO;
		this.aAccount_Upd01 = ((MABCL_AccountReg)this).new Account_Upd01();
	}

	public static MABCL_AccountReg.Account_Upd01 crtAccount_Upd01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initAccount_Upd01();
		return lgc.aAccount_Upd01;
	}

	protected void paramAccount_Upd01(MCParam p) {
		if (this.aAccount_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccount_Upd01.up0());
	}

	protected void doAccount_Upd01() {
		aAccount_Upd01.call();
	};

	/**
	 * Account_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR createAccount_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.create();
	}

	/**
	 * Account_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> createAccount_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);
	}
	protected MABCL_AccountReg.AccountLcl_UpdChk01 aAccountLcl_UpdChk01;

	protected void initAccountLcl_UpdChk01() {
		this.info = PDef.MA_MABCL1020_AccountLcl_UpdChk01_INFO;
		this.aAccountLcl_UpdChk01 = ((MABCL_AccountReg)this).new AccountLcl_UpdChk01();
	}

	public static MABCL_AccountReg.AccountLcl_UpdChk01 crtAccountLcl_UpdChk01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initAccountLcl_UpdChk01();
		return lgc.aAccountLcl_UpdChk01;
	}

	protected void paramAccountLcl_UpdChk01(MCParam p) {
		if (this.aAccountLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccountLcl_UpdChk01.up0());
	}

	protected void doAccountLcl_UpdChk01() {
		aAccountLcl_UpdChk01.call();
	};

	/**
	 * AccountLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR createAccountLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AccountLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> createAccountLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_AccountReg.AccountLcl_Upd01 aAccountLcl_Upd01;

	protected void initAccountLcl_Upd01() {
		this.info = PDef.MA_MABCL1020_AccountLcl_Upd01_INFO;
		this.aAccountLcl_Upd01 = ((MABCL_AccountReg)this).new AccountLcl_Upd01();
	}

	public static MABCL_AccountReg.AccountLcl_Upd01 crtAccountLcl_Upd01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initAccountLcl_Upd01();
		return lgc.aAccountLcl_Upd01;
	}

	protected void paramAccountLcl_Upd01(MCParam p) {
		if (this.aAccountLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccountLcl_Upd01.up0());
	}

	protected void doAccountLcl_Upd01() {
		aAccountLcl_Upd01.call();
	};

	/**
	 * AccountLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR createAccountLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AccountLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> createAccountLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_AccountReg.Account_DelChk01 aAccount_DelChk01;

	protected void initAccount_DelChk01() {
		this.info = PDef.MA_MABCL1020_Account_DelChk01_INFO;
		this.aAccount_DelChk01 = ((MABCL_AccountReg)this).new Account_DelChk01();
	}

	public static MABCL_AccountReg.Account_DelChk01 crtAccount_DelChk01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initAccount_DelChk01();
		return lgc.aAccount_DelChk01;
	}

	protected void paramAccount_DelChk01(MCParam p) {
		if (this.aAccount_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccount_DelChk01.up0());
	}

	protected void doAccount_DelChk01() {
		aAccount_DelChk01.call();
	};

	/**
	 * Account_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR createAccount_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.create();
	}

	/**
	 * Account_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> createAccount_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);
	}
	protected MABCL_AccountReg.Account_Del01 aAccount_Del01;

	protected void initAccount_Del01() {
		this.info = PDef.MA_MABCL1020_Account_Del01_INFO;
		this.aAccount_Del01 = ((MABCL_AccountReg)this).new Account_Del01();
	}

	public static MABCL_AccountReg.Account_Del01 crtAccount_Del01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initAccount_Del01();
		return lgc.aAccount_Del01;
	}

	protected void paramAccount_Del01(MCParam p) {
		if (this.aAccount_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccount_Del01.up0());
	}

	protected void doAccount_Del01() {
		aAccount_Del01.call();
	};

	/**
	 * Account_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR createAccount_Del01_DtlR(){
		return mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.create();
	}

	/**
	 * Account_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> createAccount_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);
	}
	protected MABCL_AccountReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL1020_Srch01_INFO;
		this.aSrch01 = ((MABCL_AccountReg)this).new Srch01();
	}

	public static MABCL_AccountReg.Srch01 crtSrch01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
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
		p.addDownBlock(aSrch01.down1());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL1020.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL1020.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL1020.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Srch01_Rslt2R.class);
	}
	protected MABCL_AccountReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL1020_Upd01_INFO;
		this.aUpd01 = ((MABCL_AccountReg)this).new Upd01();
	}

	public static MABCL_AccountReg.Upd01 crtUpd01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_AccountReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL1020_Del01_INFO;
		this.aDel01 = ((MABCL_AccountReg)this).new Del01();
	}

	public static MABCL_AccountReg.Del01 crtDel01() {
		MABCL_AccountReg lgc = new MABCL_AccountReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Account_UpdChk01オペレーション.<p>
	 *
	 * 勘定科目マスタを登録する前のチェックを行う<br>
	 */
	abstract public class Account_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Account_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Account_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);

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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Account_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR createAccount_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.create();
		}

		/**
		 * Account_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> createAccount_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>dc_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_typ</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>sum0_flg</td></tr>
		 * 	<tr><td><br></td><td>sum1_flg</td></tr>
		 * 	<tr><td><br></td><td>sum2_flg</td></tr>
		 * 	<tr><td><br></td><td>sum3_flg</td></tr>
		 * 	<tr><td><br></td><td>sum4_flg</td></tr>
		 * 	<tr><td><br></td><td>sum5_flg</td></tr>
		 * 	<tr><td><br></td><td>project_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_typ1</td></tr>
		 * 	<tr><td><br></td><td>ac_typ2</td></tr>
		 * 	<tr><td><br></td><td>ac_typ3</td></tr>
		 * 	<tr><td><br></td><td>ac_typ4</td></tr>
		 * 	<tr><td><br></td><td>ac_typ5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}


	}
	/**
	 * Account_Upd01オペレーション.<p>
	 *
	 * 勘定科目マスタを登録する<br>
	 */
	abstract public class Account_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Account_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACCOUNT_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACCOUNT_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACCOUNT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACCOUNT_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Account_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ACCOUNT_R.create("T1"));
			chkMaster = MCController.create(MAM_ACCOUNT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ACCOUNT_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ACCOUNT_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ACCOUNT_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ACCOUNT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Account_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR createAccount_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.create();
		}

		/**
		 * Account_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> createAccount_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>dc_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_typ</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>sum0_flg</td></tr>
		 * 	<tr><td><br></td><td>sum1_flg</td></tr>
		 * 	<tr><td><br></td><td>sum2_flg</td></tr>
		 * 	<tr><td><br></td><td>sum3_flg</td></tr>
		 * 	<tr><td><br></td><td>sum4_flg</td></tr>
		 * 	<tr><td><br></td><td>sum5_flg</td></tr>
		 * 	<tr><td><br></td><td>project_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_typ1</td></tr>
		 * 	<tr><td><br></td><td>ac_typ2</td></tr>
		 * 	<tr><td><br></td><td>ac_typ3</td></tr>
		 * 	<tr><td><br></td><td>ac_typ4</td></tr>
		 * 	<tr><td><br></td><td>ac_typ5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ACCOUNT_R> dest0_0, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> src_Account_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Account_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("ac_nm", "ac_nm");
				addColumnPathMap("ac_nm2", "ac_nm2");
				addColumnPathMap("dc_typ", "dc_typ");
				addColumnPathMap("sub_flg", "sub_flg");
				addColumnPathMap("ac_typ", "ac_typ");
				addColumnPathMap("ac_tax_cd", "ac_tax_cd");
				addColumnPathMap("ac_tax_typ", "ac_tax_typ");
				addColumnPathMap("foreign_flg", "foreign_flg");
				addColumnPathMap("sum0_flg", "sum0_flg");
				addColumnPathMap("sum1_flg", "sum1_flg");
				addColumnPathMap("sum2_flg", "sum2_flg");
				addColumnPathMap("sum3_flg", "sum3_flg");
				addColumnPathMap("sum4_flg", "sum4_flg");
				addColumnPathMap("sum5_flg", "sum5_flg");
				addColumnPathMap("project_flg", "project_flg");
				addColumnPathMap("bp_flg", "bp_flg");
				addColumnPathMap("usr_flg", "usr_flg");
				addColumnPathMap("bank_ac_flg", "bank_ac_flg");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("ar_typ", "ar_typ");
				addColumnPathMap("ac_typ1", "ac_typ1");
				addColumnPathMap("ac_typ2", "ac_typ2");
				addColumnPathMap("ac_typ3", "ac_typ3");
				addColumnPathMap("ac_typ4", "ac_typ4");
				addColumnPathMap("ac_typ5", "ac_typ5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_ACCOUNT_R r_dest, mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ACCOUNT_R> dest, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src : src){
				MAM_ACCOUNT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ACCOUNT_R> dest0_0, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> src_Account_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Account_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ACCOUNT_R r_dest, mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ACCOUNT_R> dest, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src : src){
				MAM_ACCOUNT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * AccountLcl_UpdChk01オペレーション.<p>
	 *
	 * 勘定科目マスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class AccountLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccountLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACCOUNT_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ACCOUNT_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AccountLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ACCOUNT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ACCOUNT_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ACCOUNT_R&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(EXISTS)) {
				up_EXISTS(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * EXISTS<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(EXISTS)) {
				down_EXISTS();
			}
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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AccountLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR createAccountLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AccountLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> createAccountLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_ACCOUNT_R> dest0_0, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src_AccountLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_AccountLcl_UpdChk01_Dtl);
		}
		
		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_EXISTS_chk01_0() {
			MCRowMapper map = new Map_up_EXISTS_chk01_0();
			return map;
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_EXISTS_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ACCOUNT_R r_dest, mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ACCOUNT_R> dest, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src : src){
				MAM_ACCOUNT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_EXISTS_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------EXISTS専用down関連メソッド--------------------------

		/**
		 * オペレーショングループEXISTSの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_EXISTS(){
		}
	}
	/**
	 * AccountLcl_Upd01オペレーション.<p>
	 *
	 * 勘定科目マスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class AccountLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccountLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACCOUNT_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACCOUNT_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AccountLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ACCOUNT_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_ACCOUNT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ACCOUNT_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ACCOUNT_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AccountLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR createAccountLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AccountLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> createAccountLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ACCOUNT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src_AccountLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AccountLcl_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ac_nm", "ac_nm");
				addColumnPathMap("ac_nm2", "ac_nm2");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_ACCOUNT_LCL_R r_dest, mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ACCOUNT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src : src){
				MAM_ACCOUNT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ACCOUNT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src_AccountLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AccountLcl_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ACCOUNT_LCL_R r_dest, mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ACCOUNT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src : src){
				MAM_ACCOUNT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Account_DelChk01オペレーション.<p>
	 *
	 * 勘定科目マスタ、勘定科目マスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	abstract public class Account_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Account_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Account_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);

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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Account_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR createAccount_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.create();
		}

		/**
		 * Account_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> createAccount_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}


	}
	/**
	 * Account_Del01オペレーション.<p>
	 *
	 * 勘定科目マスタ、勘定科目マスタ(ロケール別情報)を削除する<br>
	 */
	abstract public class Account_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Account_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACCOUNT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ACCOUNT_R> updMaster1_up0;
		public final MCList<MAM_ACCOUNT_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Account_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ACCOUNT_R.create("T1"));
			updMaster2 = MCController.create(MAM_ACCOUNT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ACCOUNT_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ACCOUNT_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ACCOUNT_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Account_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR createAccount_Del01_DtlR(){
			return mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.create();
		}

		/**
		 * Account_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> createAccount_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ACCOUNT_R> dest0_0, MCList<MAM_ACCOUNT_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> src_Account_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Account_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Account_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ACCOUNT_R r_dest, mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ACCOUNT_R> dest, MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src : src){
				MAM_ACCOUNT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster2_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster2_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ACCOUNT_LCL_R r_dest, mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ACCOUNT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src : src){
				MAM_ACCOUNT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLSearcher {
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
		private final mcframe.serverMABC.MABCL1020.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ACCOUNT_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ACCOUNT_R> c0_down0;
		/**
		 * 連携情報 SELECT_LCL<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_LCL = "SELECT_LCL";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACCOUNT_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ACCOUNT_LCL_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACCOUNT_LCL_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ACCOUNT_LCL_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL1020.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL1020.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL1020.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ACCOUNT_R.create("T1"));
			c1 = MCController.create(MAM_ACCOUNT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ACCOUNT_R>)c0.down(0);
			c1_down0 = (MCList<MAM_ACCOUNT_LCL_R>)c1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_LCL, c1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_LCL)) {
				up_SELECT_LCL();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ACCOUNT_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_LCL<br>
		 * MCList&lt;MAM_ACCOUNT_LCL_R&gt;（{@link #c1_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_LCL)) {
				down_SELECT_LCL(down1(), c1_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL1020.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL1020.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL1020.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>dc_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_typ1</td></tr>
		 * 	<tr><td><br></td><td>ac_typ2</td></tr>
		 * 	<tr><td><br></td><td>ac_typ3</td></tr>
		 * 	<tr><td><br></td><td>ac_typ4</td></tr>
		 * 	<tr><td><br></td><td>ac_typ5</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL1020.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL1020.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2_lcl</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>dc_typ</td></tr>
		 * 	<tr><td><br></td><td>dc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_typ</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>sum0_flg</td></tr>
		 * 	<tr><td><br></td><td>sum1_flg</td></tr>
		 * 	<tr><td><br></td><td>sum2_flg</td></tr>
		 * 	<tr><td><br></td><td>sum3_flg</td></tr>
		 * 	<tr><td><br></td><td>sum4_flg</td></tr>
		 * 	<tr><td><br></td><td>sum5_flg</td></tr>
		 * 	<tr><td><br></td><td>project_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_typ1</td></tr>
		 * 	<tr><td><br></td><td>ac_typ_nm1</td></tr>
		 * 	<tr><td><br></td><td>ac_typ2</td></tr>
		 * 	<tr><td><br></td><td>ac_typ_nm2</td></tr>
		 * 	<tr><td><br></td><td>ac_typ3</td></tr>
		 * 	<tr><td><br></td><td>ac_typ_nm3</td></tr>
		 * 	<tr><td><br></td><td>ac_typ4</td></tr>
		 * 	<tr><td><br></td><td>ac_typ_nm4</td></tr>
		 * 	<tr><td><br></td><td>ac_typ5</td></tr>
		 * 	<tr><td><br></td><td>ac_typ_nm5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_LCL専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCLの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_ACCOUNT_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("ac_nm_lcl", "ac_nm");
				addColumnPathMap("ac_nm", "base_ac_nm");
				addColumnPathMap("ac_nm2_lcl", "ac_nm2");
				addColumnPathMap("ac_nm2", "base_ac_nm2");
				addColumnPathMap("dc_typ", "dc_typ");
				addColumnPathMap("sub_flg", "sub_flg");
				addColumnPathMap("ac_typ", "ac_typ");
				addColumnPathMap("ac_tax_cd", "ac_tax_cd");
				addColumnPathMap("ac_tax_nm", "ac_tax_nm");
				addColumnPathMap("ac_tax_typ", "ac_tax_typ");
				addColumnPathMap("foreign_flg", "foreign_flg");
				addColumnPathMap("sum0_flg", "sum0_flg");
				addColumnPathMap("sum1_flg", "sum1_flg");
				addColumnPathMap("sum2_flg", "sum2_flg");
				addColumnPathMap("sum3_flg", "sum3_flg");
				addColumnPathMap("sum4_flg", "sum4_flg");
				addColumnPathMap("sum5_flg", "sum5_flg");
				addColumnPathMap("project_flg", "project_flg");
				addColumnPathMap("bp_flg", "bp_flg");
				addColumnPathMap("usr_flg", "usr_flg");
				addColumnPathMap("bank_ac_flg", "bank_ac_flg");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("ar_typ", "ar_typ");
				addColumnPathMap("ac_typ1", "ac_typ1");
				addColumnPathMap("ac_typ2", "ac_typ2");
				addColumnPathMap("ac_typ3", "ac_typ3");
				addColumnPathMap("ac_typ4", "ac_typ4");
				addColumnPathMap("ac_typ5", "ac_typ5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL1020.Srch01_Rslt1R r_dest, MAM_ACCOUNT_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt1R> dest, MCList<MAM_ACCOUNT_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ACCOUNT_R r_src : src){
				mcframe.serverMABC.MABCL1020.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCLの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL(MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_ACCOUNT_LCL_R> src0_0){
			down_SELECT_LCL_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL_c1_0() {
			MCRowMapper map = new Map_down_SELECT_LCL_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ac_nm", "ac_nm");
				addColumnPathMap("ac_nm2", "ac_nm2");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
			}
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL_c1_0(mcframe.serverMABC.MABCL1020.Srch01_Rslt2R r_dest, MAM_ACCOUNT_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL_c1_0(MCList<mcframe.serverMABC.MABCL1020.Srch01_Rslt2R> dest, MCList<MAM_ACCOUNT_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL_c1_0();
			for(MAM_ACCOUNT_LCL_R r_src : src){
				mcframe.serverMABC.MABCL1020.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1020.MABCL_AccountReg.AccountLcl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1020.MABCL_AccountReg.AccountLcl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1020.MABCL_AccountReg.AccountLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1020.MABCL_AccountReg.AccountLcl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1020.MABCL_AccountReg.AccountLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1020.MABCL_AccountReg.AccountLcl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL1020.MABCL_AccountReg.crtAccount_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL1020.MABCL_AccountReg.crtAccount_Upd01();
			chk02 = mcframe.serverMABC.MABCL1020.MABCL_AccountReg.crtAccountLcl_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL1020.MABCL_AccountReg.crtAccountLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR>)upd02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>dc_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_tax_typ</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>sum0_flg</td></tr>
		 * 	<tr><td><br></td><td>sum1_flg</td></tr>
		 * 	<tr><td><br></td><td>sum2_flg</td></tr>
		 * 	<tr><td><br></td><td>sum3_flg</td></tr>
		 * 	<tr><td><br></td><td>sum4_flg</td></tr>
		 * 	<tr><td><br></td><td>sum5_flg</td></tr>
		 * 	<tr><td><br></td><td>project_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_flg</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_typ1</td></tr>
		 * 	<tr><td><br></td><td>ac_typ2</td></tr>
		 * 	<tr><td><br></td><td>ac_typ3</td></tr>
		 * 	<tr><td><br></td><td>ac_typ4</td></tr>
		 * 	<tr><td><br></td><td>ac_typ5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_nm2</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("ac_nm", "ac_nm");
				addColumnPathMap("ac_nm2", "ac_nm2");
				addColumnPathMap("dc_typ", "dc_typ");
				addColumnPathMap("sub_flg", "sub_flg");
				addColumnPathMap("ac_typ", "ac_typ");
				addColumnPathMap("ac_tax_cd", "ac_tax_cd");
				addColumnPathMap("ac_tax_typ", "ac_tax_typ");
				addColumnPathMap("foreign_flg", "foreign_flg");
				addColumnPathMap("sum0_flg", "sum0_flg");
				addColumnPathMap("sum1_flg", "sum1_flg");
				addColumnPathMap("sum2_flg", "sum2_flg");
				addColumnPathMap("sum3_flg", "sum3_flg");
				addColumnPathMap("sum4_flg", "sum4_flg");
				addColumnPathMap("sum5_flg", "sum5_flg");
				addColumnPathMap("project_flg", "project_flg");
				addColumnPathMap("bp_flg", "bp_flg");
				addColumnPathMap("usr_flg", "usr_flg");
				addColumnPathMap("bank_ac_flg", "bank_ac_flg");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("ar_typ", "ar_typ");
				addColumnPathMap("ac_typ1", "ac_typ1");
				addColumnPathMap("ac_typ2", "ac_typ2");
				addColumnPathMap("ac_typ3", "ac_typ3");
				addColumnPathMap("ac_typ4", "ac_typ4");
				addColumnPathMap("ac_typ5", "ac_typ5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("ac_nm", "ac_nm");
				addColumnPathMap("ac_nm2", "ac_nm2");
				addColumnPathMap("dc_typ", "dc_typ");
				addColumnPathMap("sub_flg", "sub_flg");
				addColumnPathMap("ac_typ", "ac_typ");
				addColumnPathMap("ac_tax_cd", "ac_tax_cd");
				addColumnPathMap("ac_tax_typ", "ac_tax_typ");
				addColumnPathMap("foreign_flg", "foreign_flg");
				addColumnPathMap("sum0_flg", "sum0_flg");
				addColumnPathMap("sum1_flg", "sum1_flg");
				addColumnPathMap("sum2_flg", "sum2_flg");
				addColumnPathMap("sum3_flg", "sum3_flg");
				addColumnPathMap("sum4_flg", "sum4_flg");
				addColumnPathMap("sum5_flg", "sum5_flg");
				addColumnPathMap("project_flg", "project_flg");
				addColumnPathMap("bp_flg", "bp_flg");
				addColumnPathMap("usr_flg", "usr_flg");
				addColumnPathMap("bank_ac_flg", "bank_ac_flg");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("ar_typ", "ar_typ");
				addColumnPathMap("ac_typ1", "ac_typ1");
				addColumnPathMap("ac_typ2", "ac_typ2");
				addColumnPathMap("ac_typ3", "ac_typ3");
				addColumnPathMap("ac_typ4", "ac_typ4");
				addColumnPathMap("ac_typ5", "ac_typ5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1020.Account_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ac_nm", "ac_nm");
				addColumnPathMap("ac_nm2", "ac_nm2");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ac_nm", "ac_nm");
				addColumnPathMap("ac_nm2", "ac_nm2");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1020.AccountLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1020.MABCL_AccountReg.Account_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL1020.MABCL_AccountReg.crtAccount_DelChk01();
			del01 = mcframe.serverMABC.MABCL1020.MABCL_AccountReg.crtAccount_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MABCL_AccountReg)MABCL_AccountReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_AccountReg)MABCL_AccountReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> src_Del01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl1);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_cd", "ac_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1020.Account_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}