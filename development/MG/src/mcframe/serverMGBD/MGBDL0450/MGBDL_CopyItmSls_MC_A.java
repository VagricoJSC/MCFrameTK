package mcframe.serverMGBD.MGBDL0450;

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
 * "MGBDL_CopyItmSls"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CopyItmSls_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBDL0450";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CopyItmSls.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBDL0450_Srch01_INFO;
		this.aSrch01 = ((MGBDL_CopyItmSls)this).new Srch01();
	}

	public static MGBDL_CopyItmSls.Srch01 crtSrch01() {
		MGBDL_CopyItmSls lgc = new MGBDL_CopyItmSls();
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
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBD.MGBDL0450.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBD.MGBDL0450.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0450.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0450.Srch01_RsltR.class);
	}
	protected MGBDL_CopyItmSls.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBDL0450_Chk01_INFO;
		this.aChk01 = ((MGBDL_CopyItmSls)this).new Chk01();
	}

	public static MGBDL_CopyItmSls.Chk01 crtChk01() {
		MGBDL_CopyItmSls lgc = new MGBDL_CopyItmSls();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk01_CndR createChk01_CndR(){
		return mcframe.serverMGBD.MGBDL0450.Chk01_CndR.create();
	}
	protected MGBDL_CopyItmSls.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBDL0450_Ins01_INFO;
		this.aIns01 = ((MGBDL_CopyItmSls)this).new Ins01();
	}

	public static MGBDL_CopyItmSls.Ins01 crtIns01() {
		MGBDL_CopyItmSls lgc = new MGBDL_CopyItmSls();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk01_CndR createIns01_CndR(){
		return mcframe.serverMGBD.MGBDL0450.Chk01_CndR.create();
	}
	protected MGBDL_CopyItmSls.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBDL0450_Chk02_INFO;
		this.aChk02 = ((MGBDL_CopyItmSls)this).new Chk02();
	}

	public static MGBDL_CopyItmSls.Chk02 crtChk02() {
		MGBDL_CopyItmSls lgc = new MGBDL_CopyItmSls();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
		p.addDownBlock(aChk02.down0());
		p.addDownBlock(aChk02.down1());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMGBD.MGBDL0450.Chk02_HdrR.create();
	}

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.class);
	}
	protected MGBDL_CopyItmSls.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MG_MGBDL0450_Upd01_INFO;
		this.aUpd01 = ((MGBDL_CopyItmSls)this).new Upd01();
	}

	public static MGBDL_CopyItmSls.Upd01 crtUpd01() {
		MGBDL_CopyItmSls lgc = new MGBDL_CopyItmSls();
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
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk02_HdrR createUpd01_HdrR(){
		return mcframe.serverMGBD.MGBDL0450.Chk02_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk02_DtlR createUpd01_DtlR(){
		return mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.class);
	}
	protected MGBDL_CopyItmSls.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MG_MGBDL0450_Chk03_INFO;
		this.aChk03 = ((MGBDL_CopyItmSls)this).new Chk03();
	}

	public static MGBDL_CopyItmSls.Chk03 crtChk03() {
		MGBDL_CopyItmSls lgc = new MGBDL_CopyItmSls();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
		p.addDownBlock(aChk03.down0());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk03_CndR createChk03_CndR(){
		return mcframe.serverMGBD.MGBDL0450.Chk03_CndR.create();
	}
	protected MGBDL_CopyItmSls.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MG_MGBDL0450_Upd02_INFO;
		this.aUpd02 = ((MGBDL_CopyItmSls)this).new Upd02();
	}

	public static MGBDL_CopyItmSls.Upd02 crtUpd02() {
		MGBDL_CopyItmSls lgc = new MGBDL_CopyItmSls();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0450.Chk03_CndR createUpd02_CndR(){
		return mcframe.serverMGBD.MGBDL0450.Chk03_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL0450.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0450.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0450.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0450.Srch01_RsltR.class);

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
			invoke((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBD.MGBDL0450.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBD.MGBDL0450.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0450.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0450.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>no_exist_flg</td></tr>
		 * 	<tr><td><br></td><td>change_flg</td></tr>
		 * 	<tr><td><br></td><td>exist_flg</td></tr>
		 * 	<tr><td><br></td><td>imp_err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Srch01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0450.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>imp_err_flg</td></tr>
		 * 	<tr><td><br></td><td>change_flg</td></tr>
		 * 	<tr><td><br></td><td>no_exist_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>alc_val1</td></tr>
		 * 	<tr><td><br></td><td>alc_val2</td></tr>
		 * 	<tr><td><br></td><td>alc_val3</td></tr>
		 * 	<tr><td><br></td><td>alc_val4</td></tr>
		 * 	<tr><td><br></td><td>alc_val5</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>non_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0450.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 作成する前のチェックを行う<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk01_CndR down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0450.Chk01_CndR.create();
			down0 = mcframe.serverMGBD.MGBDL0450.Chk01_CndR.create();

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
			invoke((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk01_CndR createChk01_CndR(){
			return mcframe.serverMGBD.MGBDL0450.Chk01_CndR.create();
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk01_CndR up0() {
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 作成処理をする<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk01_CndR up0;
		
		/**
		 * 連携情報 CID<p>
		 *
		 * 連携先 mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Ins01 （{@link #ins}）<br>
		 */
		public final String CID = "CID";

		/**
		 * 連携オペレーション ins<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Ins01}<br>
		 * 第1 上りブロッククラス mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR （{@link #ins_up0}）<br>
		 */
		public final mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Ins01 ins;
		// 連携ロジック上り
		public final mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR ins_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0450.Chk01_CndR.create();

			// 連携オペレーションの初期化
			ins = mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.crtCopyItmSls_Ins01();
			
			// 連携オペレーションのコンテナ取得
			ins_up0 = (mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR)ins.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CID, ins);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CID<br>
		 * up0() => mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR （{@link #ins_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CID)) {
				up_CID(ins_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CID<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CID)) {
				down_CID();
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
			invoke((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk01_CndR createIns01_CndR(){
			return mcframe.serverMGBD.MGBDL0450.Chk01_CndR.create();
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this).info;
		}

		//-----------------------CID専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCIDの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CID(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR dest0_0, mcframe.serverMGBD.MGBDL0450.Chk01_CndR src_Ins01_Cnd){
			up_CID_ins_0(dest0_0, src_Ins01_Cnd);
		}
		
		/**
		 * 連携処理CID_insの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CID_ins_0() {
			MCRowMapper map = new Map_up_CID_ins_0();
			return map;
		}

		/**
		 * 連携処理CID_insの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CID_ins_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("term", "term");
				addColumnPathMap("dt", "dt");
				addColumnPathMap("sls_upri_imp_typ", "sls_upri_imp_typ");
				addColumnPathMap("lump_flg", "lump_flg");
			}
		}

		/**
		 * 連携処理CID_insの上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CID_ins_0(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR dest, mcframe.serverMGBD.MGBDL0450.Chk01_CndR src) {
			createMap_up_CID_ins_0().copy(dest, src);
		}

		//-----------------------CID専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCIDの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CID(){
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 取込する前のチェックを行う<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk02_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0450.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.class);
			down0 = mcframe.serverMGBD.MGBDL0450.Chk02_HdrR.create();
			down1 = MCList.create(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMGBD.MGBDL0450.Chk02_HdrR.create();
		}

		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.class);
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk02_HdrR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk02_HdrR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk02_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取込処理をする<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		private final mcframe.serverMGBD.MGBDL0450.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> up1;
		
		/**
		 * 連携情報 CID<p>
		 *
		 * 連携先 mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Upd01 （{@link #upd}）<br>
		 */
		public final String CID = "CID";

		/**
		 * 連携オペレーション upd<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Upd01}<br>
		 * 第1 上りブロッククラス mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL&lt;mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR&gt; （{@link #upd_up0}）<br>
		 */
		public final mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Upd01 upd;
		// 連携ロジック上り
		public final mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR> upd_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0450.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.class);

			// 連携オペレーションの初期化
			upd = mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.crtCopyItmSls_Upd01();
			
			// 連携オペレーションのコンテナ取得
			upd_up0 = (mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR>)upd.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CID, upd);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CID<br>
		 * up1() => mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL&lt;mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR&gt; （{@link #upd_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CID)) {
				up_CID(upd_up0, up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CID<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CID)) {
				down_CID();
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
			invoke((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk02_HdrR createUpd01_HdrR(){
			return mcframe.serverMGBD.MGBDL0450.Chk02_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk02_DtlR createUpd01_DtlR(){
			return mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR.class);
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk02_HdrR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this).info;
		}

		//-----------------------CID専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCIDの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CID(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR> dest0_0, MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> src_Upd01_Dtl){
			up_CID_upd_0(dest0_0, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理CID_updの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CID_upd_0() {
			MCRowMapper map = new Map_up_CID_upd_0();
			return map;
		}

		/**
		 * 連携処理CID_updの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CID_upd_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("term", "term");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理CID_updの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CID_upd_0(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR r_dest, mcframe.serverMGBD.MGBDL0450.Chk02_DtlR r_src) {
		}

		/**
		 * 連携処理CID_updの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CID_upd_0(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR> dest, MCList<mcframe.serverMGBD.MGBDL0450.Chk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_CID_upd_0();
			for(mcframe.serverMGBD.MGBDL0450.Chk02_DtlR r_src : src){
				mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CID_upd_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CID専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCIDの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CID(){
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 一括取込する前のチェックを行う<br>
	 */
	abstract public class Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk03_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk03_CndR down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0450.Chk03_CndR.create();
			down0 = mcframe.serverMGBD.MGBDL0450.Chk03_CndR.create();

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
			invoke((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk03_CndR createChk03_CndR(){
			return mcframe.serverMGBD.MGBDL0450.Chk03_CndR.create();
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk03_CndR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk03_CndR up0() {
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk03_CndR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk03_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 一括取込処理をする<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0450.Chk03_CndR up0;
		
		/**
		 * 連携情報 CID<p>
		 *
		 * 連携先 mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Upd02 （{@link #upd}）<br>
		 */
		public final String CID = "CID";

		/**
		 * 連携オペレーション upd<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Upd02}<br>
		 * 第1 上りブロッククラス mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR （{@link #upd_up0}）<br>
		 */
		public final mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.CopyItmSls_Upd02 upd;
		// 連携ロジック上り
		public final mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR upd_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0450.Chk03_CndR.create();

			// 連携オペレーションの初期化
			upd = mcframe.serverMGBD.MGBDL5450.MGBDL_CopyItmSlsService.crtCopyItmSls_Upd02();
			
			// 連携オペレーションのコンテナ取得
			upd_up0 = (mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR)upd.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CID, upd);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CID<br>
		 * up0() => mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR （{@link #upd_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CID)) {
				up_CID(upd_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CID<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CID)) {
				down_CID();
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
			invoke((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk03_CndR createUpd02_CndR(){
			return mcframe.serverMGBD.MGBDL0450.Chk03_CndR.create();
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0450.Chk03_CndR
		 */
		public mcframe.serverMGBD.MGBDL0450.Chk03_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSls)MGBDL_CopyItmSls_MC_A.this).info;
		}

		//-----------------------CID専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCIDの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CID(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR dest0_0, mcframe.serverMGBD.MGBDL0450.Chk03_CndR src_Upd02_Cnd){
			up_CID_upd_0(dest0_0, src_Upd02_Cnd);
		}
		
		/**
		 * 連携処理CID_updの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CID_upd_0() {
			MCRowMapper map = new Map_up_CID_upd_0();
			return map;
		}

		/**
		 * 連携処理CID_updの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CID_upd_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("term", "term");
			}
		}

		/**
		 * 連携処理CID_updの上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CID_upd_0(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR dest, mcframe.serverMGBD.MGBDL0450.Chk03_CndR src) {
			createMap_up_CID_upd_0().copy(dest, src);
		}

		//-----------------------CID専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCIDの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CID(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}