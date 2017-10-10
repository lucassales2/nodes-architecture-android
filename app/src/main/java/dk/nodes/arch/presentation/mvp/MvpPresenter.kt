package dk.nodes.arch.presentation.mvp


/**
 * Created by joso on 06/09/16.
 */
interface MvpPresenter<V : MvpView> {
    fun attachView(view: V)
    fun detachView()
    fun onPresenterDestroyed()
}
