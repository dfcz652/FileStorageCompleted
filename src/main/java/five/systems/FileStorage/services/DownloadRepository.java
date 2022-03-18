package five.systems.FileStorage.services;

import five.systems.FileStorage.entity.Links;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface DownloadRepository extends JpaRepository<Links,Long> {

    /**
     *Saving a file and entering data about it in DB
     * @param links
     * @return Links
     */
    Links save(Links links);
}
